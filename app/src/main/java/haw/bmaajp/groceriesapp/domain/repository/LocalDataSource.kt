package haw.bmaajp.groceriesapp.domain.repository

import haw.bmaajp.groceriesapp.domain.model.ProductItem

interface LocalDataSource {
    suspend fun getSelectedProduct(productId: Int): ProductItem
}