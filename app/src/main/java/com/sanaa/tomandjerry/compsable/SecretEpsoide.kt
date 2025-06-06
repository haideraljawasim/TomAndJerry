package com.sanaa.tomandjerry.compsable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sanaa.tomandjerry.R
import com.sanaa.tomandjerry.ui.theme.Roboto

@Composable
fun SecretEpisode(
    title: String,
    image: Int,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.width(210.dp)

    ) {

        Image(
            painter = painterResource(image),
            contentDescription = "first episode tom",
            modifier = Modifier
                .fillMaxHeight()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color(0x00000000),
                            Color(0xCC000000)
                        )
                    ), shape = RoundedCornerShape(16.dp)
                )
                .clip(
                    shape = RoundedCornerShape(16.dp)
                )
                .border(
                    width = 1.dp,
                    color = Color(0x1F1F1E26),

                    ),
            contentScale = ContentScale.FillBounds,


            )
        Box(
            modifier = Modifier.fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color(0x00000000),
                            Color(0xCC000000)
                        )
                    ), shape = RoundedCornerShape(16.dp)
                )
        )
        Box(
            modifier = Modifier
                .padding(8.dp)
                .size(40.dp)
                .border(
                    width = 1.dp,
                    color = Color(0x3DFFFFFF),
                    shape = RoundedCornerShape(12.dp)

                )
                .align(Alignment.TopEnd)
                .background(
                    color = Color(0x3DFFFFFF),
                    shape = RoundedCornerShape(12.dp)
                ),
            contentAlignment = Alignment.Center

        ) {
            Image(
                painter = painterResource(R.drawable.cheese),
                contentDescription = null,
            )
        }
        Text(
            text = title,
            color = Color.White,
            fontFamily = Roboto,
            fontSize = 14.sp,
            lineHeight = 20.sp,
            letterSpacing = 0.25.sp,
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(8.dp)
        )

    }
}