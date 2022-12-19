package haw.bmaajp.groceriesapp.presentation.common.content

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import haw.bmaajp.groceriesapp.R
import haw.bmaajp.groceriesapp.domain.model.ProductItem
import haw.bmaajp.groceriesapp.ui.theme.*
import haw.bmaajp.groceriesapp.utils.DataDummy

@Composable
fun ListContentCart(
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier.fillMaxWidth(),
        contentPadding = PaddingValues(top = DIMENS_32dp),
        verticalArrangement = Arrangement.spacedBy(DIMENS_8dp)
    ) {
        items(DataDummy.generateDummyProduct()) { items ->
            ContentCart(productItem = items)
        }
    }
}

@Composable
fun ContentCart(
    modifier: Modifier = Modifier,
    productItem: ProductItem
) {
    Column {
        Divider(modifier = Modifier.height(DIMENS_1dp), color = GrayBorderStroke)

        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(top = DIMENS_8dp)
        ) {
            Image(
                modifier = Modifier
                    .size(width = DIMENS_64dp, height = DIMENS_64dp)
                    .padding(start = DIMENS_8dp),
                painter = painterResource(id = productItem.image),
                contentDescription = stringResource(id = R.string.image_product)
            )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .align(Alignment.CenterVertically)
                    .padding(start = DIMENS_16dp),
            ) {
                Text(
                    text = productItem.title,
                    fontFamily = GilroyFontFamily,
                    fontWeight = FontWeight.Bold,
                    color = Black,
                    fontSize = TEXT_SIZE_16sp
                )

                Spacer(modifier = Modifier.height(DIMENS_4dp))

                Text(
                    text = productItem.unit,
                    fontFamily = GilroyFontFamily,
                    fontWeight = FontWeight.Medium,
                    color = GraySecondTextColor,
                    fontSize = TEXT_SIZE_12sp,
                )
            }

            Text(
                modifier = Modifier.align(Alignment.CenterVertically),
                text = "$${productItem.price}",
                fontFamily = GilroyFontFamily,
                fontWeight = FontWeight.Bold,
                color = Black,
                fontSize = TEXT_SIZE_18sp,
            )

            Image(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = DIMENS_16dp, end = DIMENS_16dp),
                imageVector = Icons.Default.Delete,
                contentDescription = stringResource(R.string.image_delete),
                colorFilter = ColorFilter.tint(color = Color.DarkGray)
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun ContentCartPreview() {
    ContentCart(
        productItem = ProductItem(
            id = 1,
            title = "Organic Bananas",
            description = "Apples are nutritious. Apples may be good for weight loss. apples may be good for your heart. As part of a healtful and varied diet.",
            image = R.drawable.product2,
            unit = "7pcs, Priceg",
            price = 4.99,
            nutritions = "100gr",
            review = 4.0
        )
    )
}