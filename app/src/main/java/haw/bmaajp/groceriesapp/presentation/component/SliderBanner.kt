package haw.bmaajp.groceriesapp.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.util.lerp
import com.google.accompanist.pager.*
import haw.bmaajp.groceriesapp.R
import haw.bmaajp.groceriesapp.ui.theme.DIMENS_114dp
import haw.bmaajp.groceriesapp.ui.theme.DIMENS_12dp
import haw.bmaajp.groceriesapp.ui.theme.DIMENS_16dp
import kotlinx.coroutines.delay
import kotlinx.coroutines.yield
import kotlin.math.absoluteValue

@ExperimentalPagerApi
@Composable
fun SliderBanner(
    modifier: Modifier = Modifier
) {
    val pagerState = rememberPagerState(initialPage = 0)
    val imageSlider = listOf(
        painterResource(id = R.drawable.img_banner1),
        painterResource(id = R.drawable.img_banner2),
        painterResource(id = R.drawable.img_banner3)
    )

    LaunchedEffect(Unit) {
        while (true) {
            yield()
            delay(2600)
            pagerState.animateScrollToPage(
                page = (pagerState.currentPage + 1) % (pagerState.pageCount)
            )
        }
    }

    Column {
        HorizontalPager(
            count = imageSlider.size,
            state = pagerState,
            contentPadding = PaddingValues(horizontal = DIMENS_16dp),
            modifier = modifier
                .height(DIMENS_114dp)
                .fillMaxWidth()
        ) { page ->
            Card(
                shape = RoundedCornerShape(DIMENS_12dp),
                modifier = Modifier
                    .graphicsLayer {
                        val pageOffset = calculateCurrentOffsetForPage(page).absoluteValue

                        lerp(
                            start = 0.85f,
                            stop = 1f,
                            fraction = 1f - pageOffset.coerceIn(0f, 1f)
                        ).also { scale ->
                            scaleX = scale
                            scaleY = scale
                        }

                        alpha = lerp(
                            start = 0.5f,
                            stop = 1f,
                            fraction = 1f - pageOffset.coerceIn(0f, 1f)
                        )
                    }
            ) {
                Image(
                    painter = imageSlider[page],
                    contentDescription = stringResource(R.string.image_slider),
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }

        HorizontalPagerIndicator(
            pagerState = pagerState,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(DIMENS_16dp)
        )
    }
}

@ExperimentalPagerApi
@Preview
@Composable
fun SliderBannerPreview() {
    SliderBanner()
}