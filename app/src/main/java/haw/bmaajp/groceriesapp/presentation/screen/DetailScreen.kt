package haw.bmaajp.groceriesapp.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import haw.bmaajp.groceriesapp.R
import haw.bmaajp.groceriesapp.model.ProductItem
import haw.bmaajp.groceriesapp.presentation.common.SpacerDividerContent
import haw.bmaajp.groceriesapp.ui.theme.*

@Composable
fun DetailScreen(
    productItem: ProductItem,
    modifier: Modifier = Modifier
) {
    Scaffold { padding ->
        Column(
            modifier = modifier.padding(padding)
        ) {
            /* Image Detail */
            DetailContentImageHeader(productItem = productItem)

            Spacer(modifier = Modifier.height(DIMENS_24dp))

            /* Detail Content Description */
            DetailContentDescription(productItem = productItem)

            /* Button Add to Card */
            DetailButtonAddCart()

        }
    }
}

@Composable
fun DetailContentImageHeader(
    productItem: ProductItem
) {
    Card(
        shape = RoundedCornerShape(bottomEnd = DIMENS_24dp, bottomStart = DIMENS_24dp),
        backgroundColor = GrayBackground,
        modifier = Modifier
            .blur(DIMENS_1dp)
            .fillMaxWidth(),
    ) {
        Image(
            painter = painterResource(id = productItem.image),
            contentDescription = stringResource(id = R.string.image_product),
            modifier = Modifier.height(DIMENS_353dp)
        )
    }
}

@Composable
fun DetailContentDescription(
    productItem: ProductItem
) {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .scrollable(state = scrollState, orientation = Orientation.Vertical)
            .padding(start = DIMENS_16dp, end = DIMENS_16dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = productItem.title,
                    fontFamily = GilroyFontFamily,
                    fontWeight = FontWeight.Bold,
                    color = Black,
                    fontSize = TEXT_SIZE_24sp
                )

                Spacer(modifier = Modifier.height(DIMENS_6dp))

                Text(
                    text = productItem.unit,
                    fontFamily = GilroyFontFamily,
                    fontWeight = FontWeight.Medium,
                    color = GraySecondTextColor,
                )
            }
            Icon(
                imageVector = Icons.Outlined.Favorite,
                contentDescription = stringResource(R.string.image_favorite),
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }

        Spacer(modifier = Modifier.height(DIMENS_8dp))

        Text(
            text = "${productItem.price}",
            fontFamily = GilroyFontFamily,
            fontWeight = FontWeight.Bold,
            color = Black,
            modifier = Modifier.align(Alignment.End),
            fontSize = TEXT_SIZE_18sp
        )

        SpacerDividerContent()

        Text(
            text = stringResource(R.string.product_detail),
            fontFamily = GilroyFontFamily,
            fontWeight = FontWeight.SemiBold,
            color = Black,
            fontSize = TEXT_SIZE_16sp,
        )

        Spacer(modifier = Modifier.height(DIMENS_8dp))

        Text(
            text = productItem.description,
            fontFamily = GilroyFontFamily,
            fontWeight = FontWeight.Medium,
            color = GraySecondTextColor,
            fontSize = TEXT_SIZE_12sp,
        )

        Spacer(modifier = Modifier.height(DIMENS_16dp))
        SpacerDividerContent()

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = stringResource(R.string.nutritions),
                fontFamily = GilroyFontFamily,
                fontWeight = FontWeight.SemiBold,
                color = Black,
                fontSize = TEXT_SIZE_16sp,
                modifier = Modifier
                    .weight(1f)
                    .align(Alignment.CenterVertically)
            )

            Card(
                modifier = Modifier
                    .background(color = Color.Transparent)
                    .align(Alignment.CenterVertically)
            ) {
                Text(
                    text = "100gr",
                    fontFamily = GilroyFontFamily,
                    fontWeight = FontWeight.SemiBold,
                    color = GraySecondTextColor,
                    fontSize = TEXT_SIZE_10sp,
                    modifier = Modifier
                        .background(color = GrayBackgroundSecond)
                        .padding(DIMENS_8dp)
                )
            }

            Spacer(modifier = Modifier.width(DIMENS_8dp))

            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = stringResource(id = R.string.arrow_right)
            )
        }

        SpacerDividerContent()

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = stringResource(R.string.review),
                fontFamily = GilroyFontFamily,
                fontWeight = FontWeight.SemiBold,
                color = Black,
                fontSize = TEXT_SIZE_16sp,
                modifier = Modifier
                    .weight(1f)
                    .align(Alignment.CenterVertically)
            )

            Card(
                modifier = Modifier
                    .background(color = Color.Transparent)
                    .align(Alignment.CenterVertically)
            ) {
                // TODO: Create Rating Bar
            }

            Spacer(modifier = Modifier.width(DIMENS_8dp))

            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = stringResource(id = R.string.arrow_right)
            )
        }

    }
}

@Composable
fun DetailButtonAddCart() {
    Button(
        shape = RoundedCornerShape(DIMENS_24dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = Green),
        modifier = Modifier
            .fillMaxWidth()
            .padding(DIMENS_16dp),
        onClick = { /*TODO*/ }
    ) {
        Text(
            text = stringResource(R.string.add_to_basket),
            fontFamily = GilroyFontFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = TEXT_SIZE_18sp,
            color = Color.White,
            modifier = Modifier.padding(top = DIMENS_8dp, bottom = DIMENS_8dp)
        )
    }
}


@Preview
@Composable
fun DetailScreenPreview() {
    DetailScreen(
        ProductItem(
            id = 1,
            title = "Organic Bananas",
            description = "Apples are nutritious. Apples may be good for weight loss. apples may be good for your heart. As part of a healtful and varied diet.",
            image = R.drawable.product2,
            unit = "7pcs, Priceg",
            price = 4.99,
            review = 4.0
        )
    )
}