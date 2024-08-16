package com.example.creat

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AddCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable

fun FirstPage() {
    @DrawableRes var imageRes: Int


    Box(
        modifier = Modifier
            .padding(top = 20.dp)
            .background(MaterialTheme.colorScheme.background)
            .fillMaxSize()

    ) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .alpha(.2f)

                .background(
                    color = Color.White, shape = CircleShape
                )
        )
        Text(
            text = "Welcome to " +
                    "Mobirizer ",
            modifier = Modifier
                .padding(top = 20.dp)
                .align(Alignment.TopCenter), fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
        Image(
            painter = painterResource(id = R.drawable.mobi),
            contentDescription = null,
            modifier = Modifier
                .size(width = 300.dp, height = 300.dp) // Adjust size if needed
                .align(Alignment.TopCenter)
                .padding(top = 80.dp)
        )
        Text(
            text = "DVM and SWOT Analysis",
            modifier = Modifier
                .padding(top = 400.dp)
                .align(Alignment.TopCenter), fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Get durabillit, valuation, and momentum scores for each stock with SWOT analysis",
            modifier = Modifier
                .padding(top = 450.dp, start = 20.dp, end = 20.dp)
                .align(Alignment.TopCenter), fontSize = 20.sp,
            fontWeight = FontWeight.W400
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 24.dp)
                .padding(horizontal = 18.dp)
                .padding(top = 600.dp),

            ) {

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier

                    .width(150.dp)
                    .height(48.dp)
                    .padding(start = 2.dp, end = 5.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Unspecified)
            )
            {
                Text(text = "SIGN IN", color = Color.White)
            }
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier

                    .width(200.dp)
                    .height(48.dp)
                    .padding(end = 1.dp, start = 8.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Unspecified)
            )
            {
                Text(text = "CREATE ACCOUNT", color = Color.White)
            }


        }
        Text(
            text = "Or continue Sign in with",
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 680.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 24.dp)
                .padding(horizontal = 18.dp)
                .padding(top = 720.dp)
        )
        {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .width(170.dp)
                    .height(48.dp)
                    .padding(start = 2.dp, end = 15.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Unspecified)
            ) {
                Icon(imageVector = Icons.Rounded.AddCircle, contentDescription = null)
                Text(text = "Google")


            }
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .width(170.dp)
                    .height(48.dp)
                    .padding(start = 12.dp, end = 5.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Unspecified)
            ) {
                Icon(imageVector = Icons.Rounded.AddCircle, contentDescription = null)
                Text(text = "Apple")


            }

        }

    }


}


