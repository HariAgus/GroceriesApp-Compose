package haw.bmaajp.groceriesapp.presentation.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import haw.bmaajp.groceriesapp.R
import haw.bmaajp.groceriesapp.model.BottomBarItem
import haw.bmaajp.groceriesapp.ui.theme.Black
import haw.bmaajp.groceriesapp.ui.theme.DIMENS_10dp
import haw.bmaajp.groceriesapp.ui.theme.DIMENS_12dp
import haw.bmaajp.groceriesapp.ui.theme.Green

@Composable
fun BottomBaGroceries(
    modifier: Modifier = Modifier
) {
    BottomNavigation(
        backgroundColor = MaterialTheme.colors.background,
        contentColor = Green,
        elevation = DIMENS_10dp,
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(topStart = DIMENS_12dp, topEnd = DIMENS_12dp))
    ) {
        val navigationItems = listOf(
            BottomBarItem(
                title = stringResource(id = R.string.menu_shop),
                icon = Icons.Default.Home
            ),
            BottomBarItem(
                title = stringResource(id = R.string.menu_explore),
                icon = Icons.Default.Search
            ),
            BottomBarItem(
                title = stringResource(id = R.string.menu_cart),
                icon = Icons.Default.ShoppingCart
            ),
            BottomBarItem(
                title = stringResource(id = R.string.menu_profile),
                icon = Icons.Default.Person
            )
        )
        navigationItems.map { item ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title
                    )
                },
                label = {
                    Text(text = item.title)
                },
                selected = item.title == navigationItems[0].title,
                unselectedContentColor = Black,
                onClick = {}
            )
        }
    }
}

@Preview
@Composable
fun BottomBarGroceriesPreview() {
    BottomBaGroceries()
}