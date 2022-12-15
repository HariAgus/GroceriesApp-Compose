package haw.bmaajp.groceriesapp.presentation.common.card

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import haw.bmaajp.groceriesapp.R
import haw.bmaajp.groceriesapp.ui.theme.*

@Composable
fun ProfileCard(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .padding(start = DIMENS_16dp, end = DIMENS_16dp)
            .fillMaxWidth()
    ) {
        Card(
            border = BorderStroke(width = DIMENS_2dp, color = Black),
            shape = RoundedCornerShape(DIMENS_40dp),
        ) {
            Image(
                modifier = Modifier.height(DIMENS_80dp),
                painter = painterResource(id = R.drawable.img_profile),
                contentDescription = stringResource(R.string.image_profile)
            )
        }

        Spacer(modifier = Modifier.width(DIMENS_16dp))

        Column(
            modifier = Modifier
                .weight(1f)
                .align(Alignment.CenterVertically),
        ) {
            Text(
                text = stringResource(R.string.name_profile),
                fontFamily = GilroyFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = TEXT_SIZE_18sp,
                color = Black
            )
            Text(
                text = stringResource(R.string.email_profile),
                fontFamily = GilroyFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = TEXT_SIZE_12sp,
                color = GraySecondTextColor
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileCardPreview() {
    ProfileCard()
}