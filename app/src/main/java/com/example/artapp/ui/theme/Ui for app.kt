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
fun Artapp(){
    var currentstep by remember { mutableStateOf(1) }
    var backstep by remember { mutableStateOf(5) }

    when (currentstep) {
        1 ->{
         ImageAndText(
             textLabelResourceId = R.string.Danger,
             drawableResourceId = R.drawable.lukla,
             contentDescriptionResourceId = R.string.Plane,
             titleLabelResourceId = R.string.TAirport,
             nextResourceId = R.drawable.next,
             lastResourceId = R.drawable.back,
             nextImageClick = {
                 currentstep = 2 },
             lastImageClick = {
                 backstep = 5
             })
        }
        2 ->{
            ImageAndText(
                textLabelResourceId = R.string.water,
                drawableResourceId = R.drawable.river,
                contentDescriptionResourceId = R.string.Country,
                titleLabelResourceId = R.string.TWater ,
                nextResourceId = R.drawable.next,
                lastResourceId = R.drawable.back,
                nextImageClick = {
                    currentstep = 3 },
                lastImageClick = {
                    backstep = 1
                })
        }
        3 ->{
            ImageAndText(
                textLabelResourceId = R.string.heat,
                drawableResourceId = R.drawable.solar,
                contentDescriptionResourceId = R.string.Hotwater,
                titleLabelResourceId = R.string.THeating ,
                nextResourceId = R.drawable.next,
                lastResourceId = R.drawable.back,
                nextImageClick = {
                    currentstep = 4 },
                lastImageClick = {
                    backstep = 2
                })
        }
        4 ->{
            ImageAndText(
                textLabelResourceId = R.string.zopchock,
                drawableResourceId = R.drawable.zopchock,
                contentDescriptionResourceId = R.string.Trail,
                titleLabelResourceId = R.string.TCow ,
                nextResourceId = R.drawable.next,
                lastResourceId = R.drawable.back,
                nextImageClick = {
                    currentstep = 5 },
                lastImageClick = {
                    backstep = 3
                })
        }
        5 ->{
            ImageAndText(
                textLabelResourceId = R.string.buddhist,
                drawableResourceId = R.drawable.mane,
                contentDescriptionResourceId = R.string.Soul,
                titleLabelResourceId = R.string.TSpirit,
                nextResourceId = R.drawable.next,
                lastResourceId = R.drawable.back,
                nextImageClick = {
                                 currentstep = 1
                },
                lastImageClick = { backstep = 4 })
        }



    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtAppTheme {
        Artapp()
    }
}