package haw.bmaajp.groceriesapp.navigation.bottomnav

sealed class BottomNavItem(val route: String) {

    object Home : BottomNavItem("home_screen")

    object Explore : BottomNavItem("explore_screen")

    object Cart : BottomNavItem("cart_screen")

    object About : BottomNavItem("about_screen")

}
