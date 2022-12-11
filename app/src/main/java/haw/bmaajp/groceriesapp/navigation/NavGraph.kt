package haw.bmaajp.groceriesapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import haw.bmaajp.groceriesapp.presentation.screen.home.HomeScreen
import haw.bmaajp.groceriesapp.presentation.screen.onboarding.OnBoardingScreen
import haw.bmaajp.groceriesapp.presentation.screen.splash.SplashScreen


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
        composable(route = Screen.Home.route) {
            HomeScreen(navController = navController)
        }
    }
}