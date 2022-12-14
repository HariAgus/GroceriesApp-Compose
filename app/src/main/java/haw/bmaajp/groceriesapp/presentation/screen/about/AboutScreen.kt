package haw.bmaajp.groceriesapp.presentation.screen.about

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import haw.bmaajp.groceriesapp.presentation.common.card.ProfileCard
import haw.bmaajp.groceriesapp.presentation.common.content.ListContentAbout
import haw.bmaajp.groceriesapp.ui.theme.DIMENS_24dp

@Composable
fun AboutScreen() {
    Column(
        modifier = Modifier
            .padding(top = DIMENS_24dp)
            .fillMaxSize()
    ) {
        ProfileCard()

        ListContentAbout()
    }
}

@Preview(showBackground = true)
@Composable
fun AboutScreenPreview() {
    AboutScreen()
}