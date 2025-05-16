package haw.bmaajp.groceriesapp.presentation.component

import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.rememberNavController
import haw.bmaajp.groceriesapp.R
import haw.bmaajp.groceriesapp.presentation.common.content.ListContentProduct
import haw.bmaajp.groceriesapp.presentation.screen.search.SearchViewModel
import haw.bmaajp.groceriesapp.ui.theme.*
import hilt_aggregated_deps._haw_bmaajp_groceriesapp_presentation_screen_search_SearchViewModel_HiltModules_KeyModule


@Composable
fun SearchViewBar(
    modifier: Modifier = Modifier,
    query: String = "",
    hint: String,
    onClickSearch: (String) -> Unit = {},
    onValueChange: (String) -> Unit = {},
    searchViewModel: SearchViewModel = hiltViewModel()
) {

    val searchQuery by searchViewModel.searchQuery
    val productsList by searchViewModel.searchProductList.collectAsState()
    val Query = remember{ mutableStateOf(query) }
    TextField(
        modifier = modifier
            .padding(DIMENS_16dp)
            .fillMaxWidth()
            .height(DIMENS_48dp)
            .clip(RoundedCornerShape(DIMENS_16dp)),
        value = Query.value,
        onValueChange = {
            Query.value = it
            searchViewModel.apply {
                updateSearchQuery(query = it)
                searchProduct(query = it)
            }
        },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null,
                tint = Color.Black
            )
        },
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = GrayBackground,
            disabledIndicatorColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        ),
        placeholder = {
            Text(
                text = hint,
                fontFamily = GilroyFontFamily,
                fontWeight = FontWeight.SemiBold,
                color = GraySecondTextColor,
                fontSize = TEXT_SIZE_12sp
            )
        },
        singleLine = true,
        textStyle = TextStyle(
            fontFamily = GilroyFontFamily,
            fontWeight = FontWeight.SemiBold,
            color = Black,
            fontSize = TEXT_SIZE_12sp
        ),
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Search
        ),
        keyboardActions = KeyboardActions(
            onSearch = {


            }
        ),
    )
    ListContentProduct(
        title = "",
        products = productsList,
        navController = rememberNavController(),
        onClickToCart = {}
    )
}

@Preview
@Composable
fun SearchViewBarPreview() {
    SearchViewBar(
        hint = stringResource(id = R.string.search_category),
    )
}