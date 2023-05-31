package com.codelabs.basicstatecodelab

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier
) {
    StatefulCounter(modifier)
}

@Preview
@Composable
fun WellnessScreenPreview() {
    Surface(modifier = Modifier.fillMaxSize()) {
        WellnessScreen()
    }
}