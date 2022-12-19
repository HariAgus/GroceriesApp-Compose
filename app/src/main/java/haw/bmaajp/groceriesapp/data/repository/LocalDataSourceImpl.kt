package haw.bmaajp.groceriesapp.data.repository

import haw.bmaajp.groceriesapp.data.local.ProductDatabase
import haw.bmaajp.groceriesapp.domain.model.ProductItem
import haw.bmaajp.groceriesapp.domain.repository.LocalDataSource

class LocalDataSourceImpl(
    productDatabase: ProductDatabase
) : LocalDataSource {

    private val productDao = productDatabase.productDao()

    override suspend fun insertProducts(products: List<ProductItem>) =
        productDao.insertProducts(products)

    override fun getAllProduct(): List<ProductItem> = productDao.getAllProducts()

    override suspend fun getSelectedProduct(productId: Int): ProductItem =
        productDao.getSelectedProduct(productId = productId)

}