package haw.bmaajp.groceriesapp.presentation.component

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import haw.bmaajp.groceriesapp.R
import kotlin.math.ceil
import kotlin.math.floor

@Composable
fun RatingBar(
    modifier: Modifier = Modifier,
    rating: Double = 0.0,
    stars: Int = 5,
    starsColor: Color = Color.Yellow
) {

    val filledStars = floor(rating).toInt()
    val unfilledStars = (stars - ceil(rating).toInt())
    val halfStart = !(rating.rem(1).equals(0.0))

    Row(
        modifier = modifier
    ) {
        repeat(filledStars) {
            Icon(
                painter = painterResource(id = R.drawable.ic_star),
                contentDescription = null,
                tint = starsColor
            )
        }

        if (halfStart) {
            Icon(
                painter = painterResource(id = R.drawable.ic_star_half),
                contentDescription = null,
                tint = starsColor
            )
        }

        repeat(unfilledStars) {
            Icon(
                painter = painterResource(id = R.drawable.ic_star_outline),
                contentDescription = null,
                tint = starsColor
            )
        }

    }

}

@Preview
@Composable
fun RatingBarPreview() {
    RatingBar(rating = 3.0)
}