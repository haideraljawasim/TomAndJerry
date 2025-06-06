package com.sanaa.tomandjerry

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SectionHeader(
    title: String,
    viewAllOnClick: () -> Unit,
    fontFamily: FontFamily
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    )
    {
        Text(
            text = title,
            fontWeight = FontWeight.SemiBold,
            fontFamily = fontFamily,
            color = Color(0xFF1F1F1E),
            fontSize = 20.sp,
        )
        Spacer(modifier = Modifier.weight(1f))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) {
                viewAllOnClick()
            }
        ) {
            Text(
                text = "View all",
                fontWeight = FontWeight.Medium,
                fontFamily = fontFamily,
                color = Color(0xFF03578A),
                fontSize = 14.sp
            )
            Image(
                modifier = Modifier.padding(start = 4.dp),
                painter = painterResource(R.drawable.arrow_right_04),
                contentDescription = null,
            )
        }

    }
}