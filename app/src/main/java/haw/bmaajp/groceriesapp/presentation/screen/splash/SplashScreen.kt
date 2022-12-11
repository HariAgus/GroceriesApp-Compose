package haw.bmaajp.groceriesapp.presentation.screen.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import haw.bmaajp.groceriesapp.R
import haw.bmaajp.groceriesapp.ui.theme.Green

@Composable
fun SplashScreen(navController: NavHostController) {
    Splash()
}

@Composable
fun Splash(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .background(Green)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            modifier = Modifier.padding(all = 64.dp),
            painter = painterResource(id = R.drawable.img_logo_app),
            contentDescription = stringResource(R.string.logo_app)
        )
    }
}

@Preview
@Composable
fun SplashScreenPreview() {
    Splash()
}