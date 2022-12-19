package haw.bmaajp.groceriesapp.presentation.screen.splash

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import haw.bmaajp.groceriesapp.domain.usecase.UseCases
import haw.bmaajp.groceriesapp.utils.DataDummy
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val useCases: UseCases
) : ViewModel() {

    private val _onBoardingIsCompleted = MutableStateFlow(false)
    val onBoardingIsCompleted: StateFlow<Boolean> = _onBoardingIsCompleted

    init {
        viewModelScope.launch {
            useCases.insertProductsUseCase.invoke(DataDummy.generateDummyProduct())
        }

        viewModelScope.launch(Dispatchers.IO) {
            _onBoardingIsCompleted.value =
                useCases.readOnBoardingUseCase().stateIn(viewModelScope).value
        }
    }

}