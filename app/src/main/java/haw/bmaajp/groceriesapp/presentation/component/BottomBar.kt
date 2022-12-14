package haw.bmaajp.groceriesapp.presentation.component

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import haw.bmaajp.groceriesapp.navigation.bottomnav.BottomNavItem
import haw.bmaajp.groceriesapp.ui.theme.Green

@Composable
fun BottomBar(
    modifier: Modifier = Modifier,
    navController: NavController,
) {
    val navigationItems = listOf(
        BottomNavItem.Home,
        BottomNavItem.Explore,
        BottomNavItem.Cart,
        BottomNavItem.About
    )

    BottomNavigation(
        backgroundColor = Color.White,
        contentColor = Color.Black,
        modifier = modifier
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        navigationItems.forEach { item ->
            BottomNavigationItem(
                icon = {
                    Icon(imageVector = item.icon, contentDescription = item.title)
                },
                label = {
                    Text(
                        text = item.title,
                        fontWeight = FontWeight.SemiBold,
                        color = if (currentRoute == item.route) {
                            Green
                        } else Color.Black.copy(0.4f)
                    )
                },
                selectedContentColor = Green,
                unselectedContentColor = Color.Black.copy(0.4f),
                selected = currentRoute == item.route,
                onClick = {
                    navController.navigate(item.route) {
                        navController.graph.startDestinationRoute?.let { screen_route ->
                            popUpTo(screen_route) { saveState = true }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }

    }
}

@Preview
@Composable
fun BottomBarPreview() {
    // BottomBar()
}