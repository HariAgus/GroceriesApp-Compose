package haw.bmaajp.groceriesapp.presentation.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import haw.bmaajp.groceriesapp.R
import haw.bmaajp.groceriesapp.ui.theme.*


@Composable
fun SearchViewBar(
    modifier: Modifier = Modifier
) {
    TextField(
        value = "",
        onValueChange = {},
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
                text = stringResource(id = R.string.search_store),
                fontFamily = GilroyFontFamily,
                fontWeight = FontWeight.SemiBold,
                color = GraySecondTextColor,
                fontSize = TEXT_SIZE_12sp
            )
        },
        modifier = modifier
            .padding(DIMENS_16dp)
            .fillMaxWidth()
            .height(DIMENS_48dp)
            .clip(RoundedCornerShape(DIMENS_16dp))
    )
}

@Preview
@Composable
fun SearchViewBarPreview() {
    SearchViewBar()
}