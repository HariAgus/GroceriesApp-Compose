package haw.bmaajp.groceriesapp.presentation.screen.about

import android.app.Activity
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import haw.bmaajp.groceriesapp.R
import haw.bmaajp.groceriesapp.presentation.common.card.ProfileCard
import haw.bmaajp.groceriesapp.presentation.common.content.ListContentAbout
import haw.bmaajp.groceriesapp.ui.theme.*

@Composable
fun AboutScreen(
    modifier: Modifier = Modifier
) {
    val activity = LocalContext.current as Activity

    Column(
        modifier = modifier
            .padding(top = DIMENS_24dp)
            .fillMaxSize()
    ) {
        ProfileCard()

        ListContentAbout()

        Spacer(modifier = Modifier.height(DIMENS_32dp))

        ButtonLogout { activity.finish() }

    }
}

@Composable
fun ButtonLogout(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier
            .padding(DIMENS_16dp)
            .height(DIMENS_48dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(DIMENS_16dp),
        elevation = ButtonDefaults.elevation(DIMENS_2dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = GrayBackground),
        onClick = { onClick.invoke() }
    ) {
        Icon(
            imageVector = Icons.Default.ExitToApp,
            contentDescription = stringResource(R.string.logout),
            tint = Green
        )

        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = stringResource(id = R.string.logout),
            color = Green,
            textAlign = TextAlign.Center,
            fontFamily = GilroyFontFamily,
            fontWeight = FontWeight.SemiBold,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AboutScreenPreview() {
    AboutScreen()
}