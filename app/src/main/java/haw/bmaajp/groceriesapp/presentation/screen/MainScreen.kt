package haw.bmaajp.groceriesapp.presentation.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import haw.bmaajp.groceriesapp.navigation.graph.MainNavGraph
import haw.bmaajp.groceriesapp.presentation.component.BottomBar
import haw.bmaajp.groceriesapp.ui.theme.DIMENS_16dp
import haw.bmaajp.groceriesapp.ui.theme.DIMENS_32dp

@Composable
fun MainScreen(
    navController: NavHostController = rememberNavController()
) {
    Scaffold(
        bottomBar = {
            Surface(
                elevation = DIMENS_32dp,
                shape = RoundedCornerShape(topStart = DIMENS_16dp, topEnd = DIMENS_16dp)
            ) {
                BottomBar(navController = navController)
            }
        },
    ) {
        Column(
            modifier = Modifier.padding(it)
        ) {
            MainNavGraph(navController = navController)
        }
    }

}