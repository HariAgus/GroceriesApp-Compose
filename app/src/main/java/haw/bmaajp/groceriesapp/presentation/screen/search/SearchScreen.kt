package haw.bmaajp.groceriesapp.presentation.screen.search

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.rememberNavController
import haw.bmaajp.groceriesapp.R
import haw.bmaajp.groceriesapp.presentation.common.content.EmptyContent
import haw.bmaajp.groceriesapp.presentation.common.content.ListContentProduct
import haw.bmaajp.groceriesapp.presentation.component.SearchViewBar
import haw.bmaajp.groceriesapp.ui.theme.DIMENS_16dp

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SearchScreen(
    modifier: Modifier = Modifier,
    searchViewModel: SearchViewModel = hiltViewModel()
) {
    val searchQuery by searchViewModel.searchQuery
    val productsList by searchViewModel.searchProductList.collectAsState()

    Scaffold {
        Column(
            modifier = modifier.fillMaxSize()
        ) {
            SearchViewBar(
                query = searchQuery,
                hint = stringResource(id = R.string.search_store),
                onValueChange = {
                    searchViewModel.apply {
                        updateSearchQuery(query = it)
                        searchProduct(query = it)
                    }
                },
                onClickSearch = {
                    searchViewModel.searchProduct(query = it)
                }
            )

            Spacer(modifier = Modifier.height(DIMENS_16dp))

            if (searchQuery.isNotEmpty()) ListContentProduct(
                title = "",
                products = productsList,
                navController = rememberNavController(),
                onClickToCart = {}
            )
            else EmptyContent()
        }
    }

}