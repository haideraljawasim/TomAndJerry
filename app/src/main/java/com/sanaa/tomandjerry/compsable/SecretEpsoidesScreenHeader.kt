package com.sanaa.tomandjerry.compsable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sanaa.Composable.layout.Spacer12Height
import com.sanaa.tomandjerry.R
import com.sanaa.tomandjerry.ui.theme.Roboto

@Composable
fun SecretEpisodesScreenHeader(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .background(color = Color(0xFFA3DCFF))
            .padding(top = 16.dp)

    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .height(220.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(R.drawable.tom_and_jerry_profile),
                    contentDescription = null,
                    modifier = Modifier.size(40.dp)
                )
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .background(
                            brush = Brush.linearGradient(
                                listOf(
                                    Color(0xFF0085E3),
                                    Color(0xFF00497D)
                                )
                            ), shape = RoundedCornerShape(12.dp)
                        ),
                    contentAlignment = Alignment.Center,

                    ) {
                    Image(
                        painter = painterResource(R.drawable.search_status),
                        contentDescription = null,
                    )
                }
            }

            Spacer(modifier = Modifier.height(height = 8.dp))
            Row(
                modifier = Modifier
                    .height(180.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,

                ) {
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = "Deleted episodes of Tom and Jerry!",
                        color = Color(0xDE1F1F1E),
                        fontFamily = Roboto,
                        fontSize = 18.sp,
                        lineHeight = 20.sp,
                        letterSpacing = 0.25.sp,
                        fontWeight = FontWeight.SemiBold

                    )
                    Spacer12Height()
                    Text(
                        text = "Scenes that were canceled for..." +
                                " mysterious (and sometimes embarrassing)" +
                                " reasons.",
                        color = Color(0x991F1F1E),
                        fontFamily = Roboto,
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                        letterSpacing = 0.25.sp,
                    )
                }
                Image(
                    modifier = Modifier.weight(.4f),
                    painter = painterResource(R.drawable.tom_holding_jerry),
                    contentDescription = null,
                    contentScale = ContentScale.FillWidth

                )
            }
        }
    }

}