package haw.bmaajp.groceriesapp.presentation.screen.cart

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import haw.bmaajp.groceriesapp.domain.model.ProductItem
import haw.bmaajp.groceriesapp.domain.usecase.UseCases
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CartViewModel @Inject constructor(
    private val useCases: UseCases
) : ViewModel() {

    private val isCart = true

    private val _productCartList = MutableStateFlow<List<ProductItem>>(emptyList())
    val productCartList = _productCartList.asStateFlow()

    init {
        getAllProductCartList()
    }

    private fun getAllProductCartList() {
        viewModelScope.launch(Dispatchers.IO) {
            useCases.getAllCartUseCase.invoke(isCart).collect { values ->
                _productCartList.value = values
            }
        }
    }

    fun deleteCart(productItem: ProductItem) {
        viewModelScope.launch(Dispatchers.IO) {
            useCases.deleteCart.invoke(productItem)
        }
    }

}