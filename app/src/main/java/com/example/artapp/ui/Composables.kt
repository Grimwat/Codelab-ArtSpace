package com.example.artapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.artapp.ui.theme.ArtAppTheme

@Composable
fun ImageAndText(
    textLabelResourceId: Int,
    drawableResourceId: Int,
    contentDescriptionResourceId: Int,
    titleLabelResourceId: Int,
    nextResourceId: Int,
    lastResourceId: Int,
    nextImageClick: () -> Unit,
    lastImageClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(drawableResourceId),
                contentDescription = stringResource(contentDescriptionResourceId)
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = stringResource(titleLabelResourceId))
                Text(text = stringResource(textLabelResourceId))
            }
            Spacer(
                modifier = Modifier
            )
            Row(
                modifier = modifier
            ) {
                Button(onClick = lastImageClick) {
                    Image(
                        painter = painterResource(lastResourceId),
                        contentDescription = null,
                        modifier = Modifier
                    )
                }
                Button(onClick = nextImageClick) {
                    Image(

                        painter = painterResource(nextResourceId),
                        contentDescription = null,
                        modifier = Modifier
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtAppTheme {
    }
}