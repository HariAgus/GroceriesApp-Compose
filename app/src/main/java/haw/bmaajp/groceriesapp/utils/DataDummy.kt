package haw.bmaajp.groceriesapp.utils

import haw.bmaajp.groceriesapp.R
import haw.bmaajp.groceriesapp.domain.model.AboutItem
import haw.bmaajp.groceriesapp.domain.model.CategoryItem
import haw.bmaajp.groceriesapp.ui.theme.*

object DataDummy {

    fun generateDummyCategories(): List<CategoryItem> {
        return listOf(
            CategoryItem(
                title = "Frash Fruits\n" + "& Vegetable",
                image = R.drawable.category1,
                background = BackgroundCategory1
            ),
            CategoryItem(
                title = "Cooking Oil\n" + "& Ghee",
                image = R.drawable.category2,
                background = BackgroundCategory2
            ),
            CategoryItem(
                title = "Meat & Fish",
                image = R.drawable.category3,
                background = BackgroundCategory3
            ),
            CategoryItem(
                title = "Bakery & Snacks",
                image = R.drawable.category4,
                background = BackgroundCategory4
            ),
            CategoryItem(
                title = "Dairy & Eggs",
                image = R.drawable.category5,
                background = BackgroundCategory5
            ),
            CategoryItem(
                title = "Beverages",
                image = R.drawable.category6,
                background = BackgroundCategory6
            ),

            CategoryItem(
                title = "Beverages",
                image = R.drawable.category6,
                background = BackgroundCategory6
            ),
            CategoryItem(
                title = "Beverages",
                image = R.drawable.category6,
                background = BackgroundCategory6
            )
        )
    }

    fun generateDummyAbout(): List<AboutItem> {
        return listOf(
            AboutItem(
                image = R.drawable.ic_orders,
                title = "Orders"
            ),
            AboutItem(
                image = R.drawable.ic_my_details,
                title = "My Details"
            ),
            AboutItem(
                image = R.drawable.ic_address,
                title = "Delivery Address"
            ),
            AboutItem(
                image = R.drawable.ic_payment,
                title = "Payment"
            ),
            AboutItem(
                image = R.drawable.ic_notification,
                title = "Notification"
            ),
        )
    }

}