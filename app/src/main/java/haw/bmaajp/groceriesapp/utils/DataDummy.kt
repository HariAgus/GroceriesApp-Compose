package haw.bmaajp.groceriesapp.utils

import haw.bmaajp.groceriesapp.R
import haw.bmaajp.groceriesapp.domain.model.AboutItem
import haw.bmaajp.groceriesapp.domain.model.CategoryItem
import haw.bmaajp.groceriesapp.domain.model.ProductItem
import haw.bmaajp.groceriesapp.ui.theme.*

object DataDummy {

    fun generateDummyProduct(): List<ProductItem> {
        return listOf(
            ProductItem(
                id = 1,
                title = "Macaroni",
                description = "Macaroni is dry pasta shaped like narrow tubes.[2] Made with durum wheat, macaroni is commonly cut in short lengths; curved macaroni may be referred to as elbow macaroni. ",
                image = R.drawable.product1,
                unit = "1pcs, Price",
                price = 6.52,
                nutritions = "50gr",
                review = 3.5,
            ),
            ProductItem(
                id = 2,
                title = "Egg",
                description = "Eggs have a hard shell of calcium carbonate enclosing a liquid white, a single yolk (or an occasional double yolk)and an air cell.",
                image = R.drawable.product2,
                unit = "10pcs, Price",
                price = 2.50,
                nutritions = "150gr",
                review = 5.0
            ),
            ProductItem(
                id = 3,
                title = "Mayonnaise",
                description = "Mayonnaise is the creamy white condiment you use to make tuna salad or spread on your BLT sandwich. Most mayonnaise is made from egg yolks, oil, and lemon juice. Mayonnaise is common in many foods around the world, from fancy French sauces like rémoulade to Japanese okonomiyaki.",
                image = R.drawable.product3,
                unit = "1pcs, Price",
                price = 7.5,
                nutritions = "100gr",
                review = 4.0
            ),
            ProductItem(
                id = 4,
                title = "Egg Noodles",
                description = "A type of flat pasta that differs from regular flour and water pasta in that eggs are added to enrich the dough. Several different widths are produced commercially and the noodles are available fresh or dried.",
                image = R.drawable.product4,
                unit = "1pcs, Price",
                price = 9.5,
                nutritions = "90gr",
                review = 4.7
            ),
            ProductItem(
                id = 5,
                title = "Ginger",
                description = "Ginger is one of the most popular spices in the world and comes from the underground stem of the ginger plant. The aromatic and fiery spice has been a signature ingredient in Asian cuisine since ancient times.",
                image = R.drawable.product5,
                unit = "20pcs, Price",
                price = 2.0,
                nutritions = "50gr",
                review = 4.2
            ),
            ProductItem(
                id = 6,
                title = "Diet Coke",
                description = "Diet coke® is the perfect balance of crisp and refreshing, with no sugar and no calories. enjoy the great diet cola flavour that's fizzing delicious! CARBONATED WATER, CARAMEL COLOUR, PHOSPHORIC AND CITRIC ACID, ASPARTAME (CONTAINS PHENYLALANINE), FLAVOUR, SODIUM BENZOATE, CAFFEINE, ACESULFAME-POTASSIUM.",
                image = R.drawable.product6,
                unit = "1pcs, Price",
                price = 1.5,
                nutritions = "10gr",
                review = 3.8
            ),
            ProductItem(
                id = 7,
                title = "Broilers",
                description = "A broiler is any chicken (Gallus gallus domesticus) that is bred and raised specifically for meat production. Most commercial broilers reach slaughter weight between four and six weeks of age, although slower growing breeds reach slaughter weight at approximately 14 weeks of age.",
                image = R.drawable.product7,
                unit = "1pcs, Price",
                price = 5.0,
                nutritions = "70gr",
                review = 3.0
            ),
            ProductItem(
                id = 8,
                title = "Juice Apple",
                description = "It is a very clear liquid from which the pulp has been removed. This juice is often used to flavor meats, or as an ingredient in dressings and sauces, adding a sweet apple flavor.",
                image = R.drawable.product8,
                unit = "1pcs, Price",
                price = 6.5,
                nutritions = "100gr",
                review = 4.2
            ),
            ProductItem(
                id = 9,
                title = "Juice Orange",
                description = "Orange juice is a fruit juice obtained by squeezing, pressing or otherwise crushing the interior of an orange. Orange juice is a nutrition powerhouse with naturally occurring vitamins and minerals and many antioxidants.",
                image = R.drawable.product9,
                unit = "1pcs, Price",
                price = 5.54,
                nutritions = "100gr",
                review = 4.7
            ),
            ProductItem(
                id = 10,
                title = "Banana",
                description = "A banana is an elongated, edible fruit – botanically a berry – produced by several kinds of large herbaceous flowering plants in the genus Musa. In some countries, bananas used for cooking may be called \"plantains\", distinguishing them from dessert bananas.",
                image = R.drawable.product10,
                unit = "8pcs, Price",
                price = 9.10,
                nutritions = "100gr",
                review = 4.5
            ),
        )
    }

    fun generateDummyCategories(): List<CategoryItem> {
        return listOf(
            CategoryItem(
                title = "Fresh Fruits\n" + "& Vegetable",
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