package haw.bmaajp.groceriesapp.navigation

sealed class Screen(val route: String) {

    object Splash : Screen("splash_screen")

    object OnBoarding : Screen("on_boarding_screen")

    object Home : Screen("home_screen")

    object Details : Screen("details_screen/{productId}") {
        fun passProductId(productId: Int): String = "details_screen/$productId"
    }

}