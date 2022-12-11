package haw.bmaajp.groceriesapp.data.repository

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.preferencesDataStore
import haw.bmaajp.groceriesapp.domain.repository.OnBoardingOperations
import haw.bmaajp.groceriesapp.utils.Constants.ON_BOARDING_KEY
import haw.bmaajp.groceriesapp.utils.Constants.ON_BOARDING_NAME
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException

val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = ON_BOARDING_NAME)

class OnBoardingOperationImpl(context: Context) : OnBoardingOperations {

    private object PreferencesKey {
        val onBoardingKey = booleanPreferencesKey(name = ON_BOARDING_KEY)
    }

    private val dataStore = context.dataStore

    override suspend fun saveOnBoardingState(isCompleted: Boolean) {
        dataStore.edit { preferences ->
            preferences[PreferencesKey.onBoardingKey] = isCompleted
        }
    }

    override fun readOnBoardingState(): Flow<Boolean> {
        return dataStore.data
            .catch { exception ->
                if (exception is IOException) emit(emptyPreferences())
                else throw exception
            }
            .map { preferences ->
                val onBoardingState = preferences[PreferencesKey.onBoardingKey] ?: false
                onBoardingState
            }
    }
}