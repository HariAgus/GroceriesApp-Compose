package haw.bmaajp.groceriesapp.domain.repository

import haw.bmaajp.groceriesapp.domain.model.ProductItem

interface LocalDataSource {
    fun getAllProduct(): List<ProductItem>
    suspend fun getSelectedProduct(productId: Int): ProductItem
}