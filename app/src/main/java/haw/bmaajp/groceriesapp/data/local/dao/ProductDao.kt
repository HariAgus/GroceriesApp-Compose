package haw.bmaajp.groceriesapp.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import haw.bmaajp.groceriesapp.domain.model.ProductItem
import haw.bmaajp.groceriesapp.utils.DataDummy

@Dao
interface ProductDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProducts(products: List<ProductItem>)

    @Query("SELECT * FROM product_table")
    fun getAllProducts(): List<ProductItem> = DataDummy.generateDummyProduct()

    @Query("SELECT * FROM product_table WHERE id=:productId")
    fun getSelectedProduct(productId: Int): ProductItem

}