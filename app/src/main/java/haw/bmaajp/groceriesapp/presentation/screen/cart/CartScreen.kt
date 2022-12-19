package haw.bmaajp.groceriesapp.presentation.screen.cart

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import haw.bmaajp.groceriesapp.R
import haw.bmaajp.groceriesapp.presentation.common.content.ListContentCart
import haw.bmaajp.groceriesapp.ui.theme.*

@Composable
fun CartScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = DIMENS_8dp),
            text = stringResource(R.string.my_cart),
            fontFamily = GilroyFontFamily,
            fontWeight = FontWeight.Bold,
            fontSize = TEXT_SIZE_18sp,
            color = Black
        )

        Spacer(modifier = Modifier.height(DIMENS_16dp))

        ListContentCart()
    }
}