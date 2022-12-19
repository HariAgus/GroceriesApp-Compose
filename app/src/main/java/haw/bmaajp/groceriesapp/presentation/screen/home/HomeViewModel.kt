package haw.bmaajp.groceriesapp.presentation.screen.home

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import haw.bmaajp.groceriesapp.domain.usecase.UseCases
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    useCases: UseCases
) : ViewModel() {

    val getAllProducts = useCases.getAllProductUseCase()

}