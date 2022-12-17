package haw.bmaajp.groceriesapp.navigation.screen

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import haw.bmaajp.groceriesapp.presentation.screen.MainScreen
import haw.bmaajp.groceriesapp.presentation.screen.detail.DetailScreen
import haw.bmaajp.groceriesapp.presentation.screen.onboarding.OnBoardingScreen
import haw.bmaajp.groceriesapp.presentation.screen.splash.SplashScreen
import haw.bmaajp.groceriesapp.utils.Constants.PRODUCT_ARGUMENT_KEY


@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        composable(route = Screen.Splash.route) {
            SplashScreen(navController = navController)
        }
        composable(route = Screen.OnBoarding.route) {
            OnBoardingScreen(navController = navController)
        }
        composable(route = Screen.Main.route) {
            MainScreen()
        }
        composable(
            route = Screen.Details.route,
            arguments = listOf(navArgument(PRODUCT_ARGUMENT_KEY) {
                type = NavType.IntType
            })
        ) {
            DetailScreen()
        }
    }
}