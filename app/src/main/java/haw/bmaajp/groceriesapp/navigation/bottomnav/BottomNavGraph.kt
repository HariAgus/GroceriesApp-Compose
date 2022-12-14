package haw.bmaajp.groceriesapp.navigation.bottomnav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.google.accompanist.pager.ExperimentalPagerApi
import haw.bmaajp.groceriesapp.presentation.screen.about.AboutScreen
import haw.bmaajp.groceriesapp.presentation.screen.cart.CartScreen
import haw.bmaajp.groceriesapp.presentation.screen.explore.ExploreScreen
import haw.bmaajp.groceriesapp.presentation.screen.home.HomeScreen

@ExperimentalPagerApi
@Composable
fun BottomNavigationGraph(navController: NavHostController) {

    NavHost(navController = navController, startDestination = BottomNavItem.Home.route) {
        composable(BottomNavItem.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(BottomNavItem.Explore.route) {
            ExploreScreen()
        }
        composable(BottomNavItem.Cart.route) {
            CartScreen()
        }
        composable(BottomNavItem.About.route) {
            AboutScreen()
        }
    }

}