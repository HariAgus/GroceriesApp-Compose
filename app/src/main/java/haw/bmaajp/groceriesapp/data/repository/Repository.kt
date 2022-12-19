package haw.bmaajp.groceriesapp.data.repository

import haw.bmaajp.groceriesapp.domain.model.ProductItem
import haw.bmaajp.groceriesapp.domain.repository.LocalDataSource
import haw.bmaajp.groceriesapp.domain.repository.OnBoardingOperations
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class Repository @Inject constructor(
    private val dataStore: OnBoardingOperations,
    private val localDataSource: LocalDataSource
) {

    suspend fun saveOnBoardingState(isCompleted: Boolean) {
        dataStore.saveOnBoardingState(isCompleted = isCompleted)
    }

    fun readOnBoardingState(): Flow<Boolean> = dataStore.readOnBoardingState()

    suspend fun insertProducts(products: List<ProductItem>) =
        localDataSource.insertProducts(products)

    fun getAllProduct(): List<ProductItem> = localDataSource.getAllProduct()

    suspend fun getSelectedProduct(productId: Int): ProductItem =
        localDataSource.getSelectedProduct(productId = productId)

}