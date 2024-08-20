package com.example.artapp.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.artapp.R
import com.example.artapp.ui.ImageAndText

@Composable
fun Artapp() {
    var currentstep by remember { mutableStateOf(1) }

    when (currentstep) {
        1 -> {
            ImageAndText(
                textLabelResourceId = R.string.Danger,
                drawableResourceId = R.drawable.lukla,
                contentDescriptionResourceId = R.string.Plane,
                titleLabelResourceId = R.string.TAirport,
                nextResourceId = R.drawable.next,
                lastResourceId = R.drawable.back,
                nextImageClick = {
                    onnexttap(currentstep)
                },
                previousimageclick = {
                    onprevioustap(currentstep)
                }
            )
        }

        2 -> {
            ImageAndText(
                textLabelResourceId = R.string.water,
                drawableResourceId = R.drawable.river,
                contentDescriptionResourceId = R.string.Country,
                titleLabelResourceId = R.string.TWater,
                nextResourceId = R.drawable.next,
                lastResourceId = R.drawable.back,
                nextImageClick = {
                    onnexttap(currentstep)
                },
                previousimageclick = {
                    onprevioustap(currentstep)
                })
        }

        3 -> {
            ImageAndText(
                textLabelResourceId = R.string.heat,
                drawableResourceId = R.drawable.solar,
                contentDescriptionResourceId = R.string.Hotwater,
                titleLabelResourceId = R.string.THeating,
                nextResourceId = R.drawable.next,
                lastResourceId = R.drawable.back,
                nextImageClick = {
                    onnexttap(currentstep)
                },
                previousimageclick = {
                    onprevioustap(currentstep)
                })
        }

        4 -> {
            ImageAndText(
                textLabelResourceId = R.string.zopchock,
                drawableResourceId = R.drawable.zopchock,
                contentDescriptionResourceId = R.string.Trail,
                titleLabelResourceId = R.string.TCow,
                nextResourceId = R.drawable.next,
                lastResourceId = R.drawable.back,
                nextImageClick = {
                    onnexttap(currentstep)
                },
                previousimageclick = {
                    onprevioustap(currentstep)
                })
        }

        5 -> {
            ImageAndText(
                textLabelResourceId = R.string.buddhist,
                drawableResourceId = R.drawable.mane,
                contentDescriptionResourceId = R.string.Soul,
                titleLabelResourceId = R.string.TSpirit,
                nextResourceId = R.drawable.next,
                lastResourceId = R.drawable.back,
                nextImageClick = {
                    onnexttap(currentstep)
                },
                previousimageclick = {
                    onprevioustap(currentstep)
                })
        }
    }
}

private fun onnexttap(currentstep: Int): Int {
    return if (currentstep == 5) {
        1
    } else {
        currentstep + 1
    }
}

private fun onprevioustap(currentstep: Int) {
    var currentstep1 = currentstep
    if (currentstep1 == 1) {
        currentstep1 = 5
    } else {
        currentstep1 - 1
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtAppTheme {
        Artapp()
    }
}