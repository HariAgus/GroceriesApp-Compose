package haw.bmaajp.groceriesapp.model

data class ProductItem(
    val id: Int,
    val title: String,
    val description: String,
    val image: Int,
    val unit: String,
    val price: Double,
    val nutritions: String,
    val review: Double
)