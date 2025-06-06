package com.sanaa.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sanaa.Composable.layout.Spacer12Height
import com.sanaa.Composable.layout.Spacer24Height
import com.sanaa.tomandjerry.R
import com.sanaa.tomandjerry.SectionHeader
import com.sanaa.tomandjerry.compsable.PopularCharacters
import com.sanaa.tomandjerry.compsable.SecretEpisode
import com.sanaa.tomandjerry.compsable.SecretEpisodesScreenHeader
import com.sanaa.tomandjerry.ui.theme.Roboto

@Composable
fun SecretEpisodesScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color(0xFFEEF4F6))
    )
    {
        SecretEpisodesScreenHeader()
        Column(
            modifier = Modifier
                .background(Color(0xFFA3DCFF))
        )
        {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color(0x00EEF4F6),
                                Color(0xFFEEF4F6),
                            )
                        )
                    ),
            )
            {
                Spacer12Height()
                Row(
                    modifier = Modifier.padding(horizontal = 16.dp)
                ) {
                    SectionHeader(
                        title = "Most watched",
                        fontFamily = Roboto,
                        viewAllOnClick = {},
                    )
                }
                Spacer12Height()

                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth().heightIn(max = 343.dp),
                    contentPadding = PaddingValues(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)

                ) {

                    item {
                        SecretEpisode(
                            title = "Number 404 - The Cursed Cheese \uD83E\uDDC0",
                            image = R.drawable.first_episode
                        )
                    }
                    item {
                        SecretEpisode(
                            title = "Chase on the moon \uD83C\uDF15\n",
                            image = R.drawable.seccond_epsiode
                        )
                    }
                }

            }
        }
        Spacer24Height()

        Text(
            text = "Popular character",
            color = Color(0xDE1F1F1E),
            fontFamily = Roboto,
            fontSize = 20.sp,
            lineHeight = 20.sp,
            letterSpacing = 0.25.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        Spacer12Height()
        PopularCharacters()
        Spacer(modifier = Modifier.height(16.dp))
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewSecretEpisodesScreen() {
    SecretEpisodesScreen()
}