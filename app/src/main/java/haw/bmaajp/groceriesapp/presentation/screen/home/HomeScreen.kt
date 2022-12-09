package haw.bmaajp.groceriesapp.presentation.screen.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import haw.bmaajp.groceriesapp.presentation.component.BottomBaGroceries


@Composable
fun HomeScreen() {
    Home(modifier = Modifier)
}

@Composable
fun Home(
    modifier: Modifier
) {
    Scaffold(
        bottomBar = { BottomBaGroceries() }
    ) { innerPadding ->
        Column(
            modifier = modifier
                .verticalScroll((rememberScrollState()))
                .padding(innerPadding)
        ) {

        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}