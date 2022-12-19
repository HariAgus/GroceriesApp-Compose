package haw.bmaajp.groceriesapp.navigation.screen

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItemScreen(val route: String, val icon: ImageVector, val title: String) {

    object Home : BottomNavItemScreen("home_screen", Icons.Default.Home, "Shop")

    object Explore : BottomNavItemScreen("explore_screen", Icons.Default.Search, "Explore")

    object Cart : BottomNavItemScreen("cart_screen", Icons.Default.ShoppingCart, "Cart")

    object About : BottomNavItemScreen("about_screen", Icons.Default.Person, "About")

}
