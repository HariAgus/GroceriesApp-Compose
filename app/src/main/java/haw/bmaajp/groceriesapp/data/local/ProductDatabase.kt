package haw.bmaajp.groceriesapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import haw.bmaajp.groceriesapp.data.local.dao.ProductDao
import haw.bmaajp.groceriesapp.domain.model.ProductItem

@Database(entities = [ProductItem::class], version = 2)
abstract class ProductDatabase : RoomDatabase() {

    abstract fun productDao(): ProductDao

}