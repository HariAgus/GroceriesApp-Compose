package haw.bmaajp.groceriesapp.domain.repository

import haw.bmaajp.groceriesapp.domain.model.ProductItem

interface LocalDataSource {
    suspend fun insertProducts(products: List<ProductItem>)
    fun getAllProduct(): List<ProductItem>
    suspend fun getSelectedProduct(productId: Int): ProductItem
}