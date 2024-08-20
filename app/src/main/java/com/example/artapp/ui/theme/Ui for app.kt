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
    var currentStep by remember { mutableStateOf(1) }

    when (currentStep) {
        1 -> {
            ImageAndText(
                textLabelResourceId = R.string.Danger,
                drawableResourceId = R.drawable.lukla,
                contentDescriptionResourceId = R.string.Plane,
                titleLabelResourceId = R.string.TAirport,
                nextResourceId = R.drawable.next,
                lastResourceId = R.drawable.back,
                nextImageClick = {
                    currentStep =
                    onNextTap(currentStep)
                },
                previousimageclick = {
                    currentStep =
                    onPreviousTap(currentStep)
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
                    currentStep =
                    onNextTap(currentStep)
                },
                previousimageclick = {
                    currentStep =
                    onPreviousTap(currentStep)
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
                    currentStep =
                    onNextTap(currentStep)
                },
                previousimageclick = {
                    currentStep =
                    onPreviousTap(currentStep)
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
                    currentStep =
                    onNextTap(currentStep)
                },
                previousimageclick = {
                    currentStep =
                    onPreviousTap(currentStep)
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
                    currentStep =
                    onNextTap(currentStep)
                },
                previousimageclick = {
                    currentStep =
                    onPreviousTap(currentStep)
                })
        }
    }
}

private fun onNextTap(currentStep: Int): Int {
    return if (currentStep == 5) {
        1
    } else {
        currentStep + 1
    }
}

private fun onPreviousTap(currentStep: Int):Int {
    return if (currentStep == 1) {
        5
    } else {
        currentStep - 1
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtAppTheme {
        Artapp()
    }
}