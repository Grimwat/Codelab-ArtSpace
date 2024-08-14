package com.example.artapp.ui

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.artapp.R
import com.example.artapp.ui.theme.ArtAppTheme
import com.example.artapp.ui.theme.Artapp

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
        ){
    Box(modifier = Modifier.fillMaxSize() ){
    Column (
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
        ){
            Text(text = stringResource(titleLabelResourceId))
            Text(text = stringResource(textLabelResourceId))
        }
        Spacer(
            modifier = Modifier
        )
        buttonRow(
            nextImageClick = { /*TODO*/ }) {

        }
    }
    }
}

@Composable
fun buttonRow(
    nextImageClick: () -> Unit,
    lastImageClick: () -> Unit,
){
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier){
        Button(onClick = lastImageClick){
            Image(
                painter = painterResource(R.drawable.back),
                contentDescription = null,
                modifier = Modifier)
        }
        Button(onClick = nextImageClick,){
            Image(

                painter = painterResource(R.drawable.next),
                contentDescription = null,
                modifier = Modifier)

        }
    }

}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtAppTheme {
        buttonRow()
    }
}