package com.sanaa.tomandjerry.compsable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sanaa.tomandjerry.R
import com.sanaa.tomandjerry.ui.theme.IBMSansArabicFont

@Composable
fun PopularCharacters(modifier: Modifier = Modifier) {
    LazyRow(
        modifier = Modifier,
        contentPadding = PaddingValues(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item {
            Box(
                modifier = Modifier.height(128.dp)
            )
            {
                Column(
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.CenterHorizontally,

                    modifier = Modifier
                        .width(140.dp)
                        .height(104.dp)
                        .background(
                            color = Color(0xFFFCF2C5),
                            shape = RoundedCornerShape(16.dp)
                        )
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 12.dp)
                ) {
                    Text(
                        text = "Tom",
                        fontFamily = IBMSansArabicFont,
                        fontWeight = FontWeight.Medium,
                        fontSize = 18.sp,
                        lineHeight = 20.sp,
                        letterSpacing = 0.25.sp,
                        color = Color(0xDE1F1F1E)

                    )
                    Spacer(modifier = Modifier.height(height = 4.dp))
                    Text(
                        text = "Failed stalker",
                        fontFamily = IBMSansArabicFont,
                        fontWeight = FontWeight.Normal,
                        fontSize = 12.sp,
                        lineHeight = 20.sp,
                        color = Color(0x991F1F1E)
                    )
                }
                Image(
                    painter = painterResource(R.drawable.tom_head),
                    contentDescription = null,
                    modifier = Modifier
                        .size(64.dp)
                        .align(alignment = Alignment.TopCenter)
                )
            }
        }
        item {
            Box(
                modifier = Modifier.height(128.dp)
            )
            {
                Column(
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.CenterHorizontally,

                    modifier = Modifier
                        .width(140.dp)
                        .height(104.dp)
                        .background(
                            color = Color(0xFFFCC5E4),
                            shape = RoundedCornerShape(16.dp)
                        )
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 12.dp)
                ) {
                    Text(
                        text = "Jerry",
                        fontFamily = IBMSansArabicFont,
                        fontWeight = FontWeight.Medium,
                        fontSize = 18.sp,
                        lineHeight = 20.sp,
                        letterSpacing = 0.25.sp,
                        color = Color(0xDE1F1F1E)

                    )
                    Spacer(modifier = Modifier.height(height = 4.dp))
                    Text(
                        text = "A scammer mouse",
                        fontFamily = IBMSansArabicFont,
                        fontWeight = FontWeight.Normal,
                        fontSize = 12.sp,
                        lineHeight = 20.sp,
                        color = Color(0x991F1F1E)
                    )
                }
                Image(
                    painter = painterResource(R.drawable.jerry_head),
                    contentDescription = null,
                    modifier = Modifier
                        .height(64.dp)
                        .align(alignment = Alignment.TopCenter),
                    contentScale = ContentScale.FillHeight
                )
            }
        }

        item {
            Box(
                modifier = Modifier.height(128.dp)
            )
            {
                Column(
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.CenterHorizontally,

                    modifier = Modifier
                        .width(140.dp)
                        .height(104.dp)
                        .background(
                            color = Color(0xFFC5E7FC),
                            shape = RoundedCornerShape(16.dp)
                        )
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 12.dp)
                ) {
                    Text(
                        text = "Jerry",
                        fontFamily = IBMSansArabicFont,
                        fontWeight = FontWeight.Medium,
                        fontSize = 18.sp,
                        lineHeight = 20.sp,
                        letterSpacing = 0.25.sp,
                        color = Color(0xDE1F1F1E)

                    )
                    Spacer(modifier = Modifier.height(height = 4.dp))
                    Text(
                        text = "Hungry mouse",
                        fontFamily = IBMSansArabicFont,
                        fontWeight = FontWeight.Normal,
                        fontSize = 12.sp,
                        lineHeight = 20.sp,
                        color = Color(0x991F1F1E)
                    )
                }
                Image(
                    painter = painterResource(R.drawable.little_jerry),
                    contentDescription = null,
                    modifier = Modifier
                        .size(64.dp)
                        .align(alignment = Alignment.TopCenter),
                    contentScale = ContentScale.FillWidth
                )
            }
        }

    }
}