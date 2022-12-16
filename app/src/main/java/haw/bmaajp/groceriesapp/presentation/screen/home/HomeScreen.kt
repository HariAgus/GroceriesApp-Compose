package haw.bmaajp.groceriesapp.presentation.screen.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.google.accompanist.pager.ExperimentalPagerApi
import haw.bmaajp.groceriesapp.R
import haw.bmaajp.groceriesapp.presentation.common.content.ListContentProduct
import haw.bmaajp.groceriesapp.presentation.component.SearchViewBar
import haw.bmaajp.groceriesapp.presentation.component.SliderBanner
import haw.bmaajp.groceriesapp.ui.theme.*
import haw.bmaajp.groceriesapp.utils.DataDummy

@ExperimentalPagerApi
@Composable
fun HomeScreen(navController: NavHostController) {
    Scaffold { padding ->
        val stateScroll = rememberScrollState()

        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(padding)
        ) {
            HeaderLocationHome()

            SearchViewBar()

            SliderBanner()

            ListContentProduct(
                title = stringResource(id = R.string.exclusive_offer),
                products = DataDummy.generateDummyProduct().shuffled(),
                navController = navController
            )

            Spacer(modifier = Modifier.height(DIMENS_24dp))

            ListContentProduct(
                title = stringResource(id = R.string.best_selling),
                products = DataDummy.generateDummyProduct().shuffled(),
                navController = navController
            )
        }
    }
}

@Composable
fun HeaderLocationHome() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(DIMENS_24dp))

        Icon(
            modifier = Modifier
                .size(DIMENS_24dp)
                .align(Alignment.CenterHorizontally),
            painter = painterResource(id = R.drawable.ic_nectar),
            contentDescription = stringResource(id = R.string.logo_app),
            tint = Color.Unspecified
        )

        Spacer(modifier = Modifier.height(DIMENS_8dp))

        Row {
            Icon(
                imageVector = Icons.Default.LocationOn,
                contentDescription = stringResource(R.string.image_location),
                tint = GrayThirdTextColor
            )
            Text(
                modifier = Modifier.align(Alignment.CenterVertically),
                text = stringResource(R.string.sample_country),
                fontFamily = GilroyFontFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = TEXT_SIZE_12sp,
                color = GrayThirdTextColor
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HeaderLocationHomePreview() {
    HeaderLocationHome()
}