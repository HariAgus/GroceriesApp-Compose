package haw.bmaajp.groceriesapp.data.local.dao

import androidx.room.*
import haw.bmaajp.groceriesapp.domain.model.ProductItem
import kotlinx.coroutines.flow.Flow

@Dao
interface ProductDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProducts(products: List<ProductItem>)

    @Query("SELECT * FROM product_table")
    fun getAllProducts(): Flow<List<ProductItem>>

    @Query("SELECT * FROM product_table WHERE id=:productId")
    fun getSelectedProduct(productId: Int): ProductItem

    @Query("SELECT * FROM product_table WHERE isCart=:isCart")
    fun getAllProductCart(isCart: Boolean): Flow<List<ProductItem>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addCart(productItem: ProductItem)

    @Update
    suspend fun deleteCart(productItem: ProductItem)

    @Query("SELECT * FROM product_table WHERE title LIKE '%' || :query || '%'")
    fun searchProduct(query: String): Flow<List<ProductItem>>

}