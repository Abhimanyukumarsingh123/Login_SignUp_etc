package com.example.creat

import android.widget.ImageButton
import androidx.compose.foundation.Image
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
import androidx.compose.material3.IconButton
import androidx.compose.material3.Label
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.clearCompositionErrors
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable

fun SignUp() {
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    var confirmPassword by remember {
        mutableStateOf("")
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(top = 30.dp, start = 10.dp)
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Rounded.ArrowBack,
                    contentDescription = null
                )
            }
            Text(
                text = "Continue as",
                modifier = Modifier.padding(top = 20.dp, start = 130.dp), fontSize = 20.sp
            )
            TextButton(onClick = { /*TODO*/ }) {
                Text(
                    text = "Guest",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(top = 13.dp),
                    color = Color.Blue
                )

            }

        }
        Text(
            text = "Create Account",
            modifier = Modifier.padding(start = 15.dp, top = 110.dp),
            fontSize = 30.sp, fontWeight = FontWeight.Bold
        )
        Text(
            text = "It only takes a minute to create your account",
            modifier = Modifier.padding(top = 155.dp, start = 15.dp), fontSize = 15.sp
        )
        Column(modifier = Modifier.padding(top = 210.dp, start = 20.dp, end = 20.dp)) {

            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text(text = "Email Id") }, modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(30.dp))

            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text(text = "Password") }, modifier = Modifier.fillMaxWidth()
            )


            Spacer(modifier = Modifier.height(30.dp))

            OutlinedTextField(
                value = confirmPassword,
                onValueChange = { confirmPassword = it },
                label = { Text(text = "Confirm Possword") }, modifier = Modifier.fillMaxWidth()

            )
        }
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(start = 5.dp, top = 470.dp)
                .width(330.dp)
                .align(Alignment.TopCenter),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
        ) {
            Text(text = "SIGN UP")

        }
        Row(modifier = Modifier.padding(start = 20.dp, top = 510.dp)) {
            Text(text = "By signing up, agree to our", modifier = Modifier.padding(top = 15.dp))
            TextButton(onClick = { /*TODO*/ }, modifier = Modifier.padding(top = 2.dp)) {
                Text(text = "Terms & Conditions", color = Color.Blue)

            }
        }
        Row(
            modifier = Modifier
                .padding(top = 540.dp)
                .align(Alignment.TopCenter)
        ) {
            Text(text = "and", modifier = Modifier.padding(top = 15.dp))
            TextButton(onClick = { /*TODO*/ }, modifier = Modifier.padding(top = 2.dp)) {
                Text(text = "Privacy policy", color = Color.Blue)
            }
        }
        Text(
            text = "Or, login with...",
            modifier = Modifier
                .padding(top = 650.dp)
                .align(Alignment.TopCenter)
        )
        Row(modifier = Modifier.padding(top = 690.dp)) {
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

        Row(
            modifier = Modifier
                .padding(top = 790.dp)
                .align(Alignment.TopCenter)
        ) {
            Text(text = "Joined us before?", modifier = Modifier.padding(top = 12.dp))
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "Login", color = Color.Blue)
            }

        }
    }
}





