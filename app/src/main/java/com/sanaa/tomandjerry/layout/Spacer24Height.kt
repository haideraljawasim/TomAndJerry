package com.sanaa.Composable.layout

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Spacer24Height(modifier: Modifier = Modifier) {
    Spacer(modifier.height(24.dp))
}