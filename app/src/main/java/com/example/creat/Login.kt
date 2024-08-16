package com.example.creat

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable

fun Login() {
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Box(modifier = Modifier.fillMaxSize()) {

        Row(modifier = Modifier.fillMaxWidth()) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.padding(start = 5.dp, top = 30.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White)
            ) {
                Icon(
                    imageVector = Icons.Rounded.ArrowBack,
                    contentDescription = null,
                    tint = Color.Black,
                    modifier = Modifier.size(30.dp)

                )
            }
            Text(
                text = "Continue as Guest",
                modifier = Modifier
                    .padding(top = 40.dp, start = 120.dp),

                fontSize = 20.sp,
            )
        }

        Text(
            text = "Login",
            modifier = Modifier.padding(start = 20.dp, top = 100.dp),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Welcome back again!",
            modifier = Modifier.padding(start = 20.dp, top = 150.dp),
            fontSize = 15.sp,
            color = Color.Blue

        )
        Column(
            modifier = Modifier
                .padding(top = 200.dp, start = 30.dp)
                .fillMaxWidth()
        ) {
            OutlinedTextField(value = email, onValueChange = { email = it }, label = {
                Text(text = "Email ID")
            })
            Spacer(modifier = Modifier.height(30.dp))
            OutlinedTextField(value = password, onValueChange = { password = it }, label = {
                Text(text = "Password")
            })

        }
        Row(modifier = Modifier.padding(top = 365.dp)) {
            Button(
                onClick = { }, modifier = Modifier
                    .padding(start = 20.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Blue
                ), shape = RoundedCornerShape(10.dp),

            ) {
                Text(text = "Login with Email OTP")

            }
            Button(
                onClick = { }, modifier = Modifier
                    .padding(start = 20.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Blue
                ),
                shape = RoundedCornerShape(10.dp),

            ) {
                Text(text = "Forgot Password?")

            }
        }
        Button(
            onClick = { }, modifier = Modifier
                .padding(start = 5.dp, top = 450.dp)
                .width(300.dp)
                .align(Alignment.TopCenter),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor =Color.Blue)


        ) {
            Text(text = "LOGIN")

        }
        Text(
            text = "or, login with....",
            modifier = Modifier
                .padding(top = 400.dp)
                .align(Alignment.Center)
        )
        Row(modifier = Modifier.padding(top = 650.dp)) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(start = 60.dp)
                    .size(80.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,

                )
            ) {
                Image(painter = painterResource(id = R.drawable.google), contentDescription = null)

            }
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(start = 100.dp)
                    .size(80.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,

                )
            ) {
                Image(painter = painterResource(id = R.drawable.apple), contentDescription = null)

            }



        }
        Button(
            onClick = { }, modifier = Modifier
                .padding(start = 5.dp, top = 750.dp)
                .width(300.dp)
                .align(Alignment.TopCenter),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor =Color.White)


        ) {
            Text(text = "New to Trendlyne? Create Account ", color = Color.Black)

        }


    }


}