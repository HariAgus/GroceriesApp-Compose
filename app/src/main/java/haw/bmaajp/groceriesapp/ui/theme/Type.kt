package haw.bmaajp.groceriesapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import haw.bmaajp.groceriesapp.R

val GilroyFontFamily = FontFamily(
    Font(R.font.gilroy_black, FontWeight.Black),
    Font(R.font.gilroy_extrabold, FontWeight.ExtraBold),
    Font(R.font.gilroy_bold, FontWeight.Bold),
    Font(R.font.gilroy_semibold, FontWeight.SemiBold),
    Font(R.font.gilroy_medium, FontWeight.Medium),
    Font(R.font.gilroy_regular, FontWeight.W400),
)

val TypographyStyle = Typography(
    h1 = TextStyle(
        fontFamily = GilroyFontFamily,
        fontWeight = FontWeight.Bold,
        color = Color.White,
        fontSize = 49.sp
    ),
    body1 = TextStyle(
        fontFamily = GilroyFontFamily,
        fontWeight = FontWeight.Bold,
        color = Color.White,
        fontSize = 24.sp
    ),
)