package com.example.creat

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable
fun ResetPassword() {
    var email by remember {
        mutableStateOf("")
    }
    Box(
        modifier = Modifier
            .padding(top = 30.dp)
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .background(color = Color.Blue)
                .height(50.dp)
                .fillMaxWidth()
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Rounded.KeyboardArrowLeft,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(50.dp)
                )
            }
            Text(
                text = "Back",
                modifier = Modifier.padding(start = 10.dp, top = 10.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp,
                color = Color.White
            )
        }
        Column(modifier = Modifier.padding(top = 300.dp, start = 50.dp)) {
            Text(text = "Reset your password", fontSize = 22.sp, fontWeight = FontWeight.Bold)
            Text(
                text = "Forgotten Your password? Enter your e-mail address belo, and we'll send an OTP to your email to verify it. OTP is valid for 24hrs only.",
                fontSize = 14.sp,
                modifier = Modifier.padding(end = 40.dp)
            )
            Text(text = "Email", fontSize = 18.sp, modifier = Modifier.padding(top = 10.dp))
            OutlinedTextField(value = email, onValueChange = { email = it }, label = {
                Text(text = "Email")
            })

        }
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(start = 25.dp, top = 510.dp)
                .width(330.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
        ) {
            Text(text = "SEND EMAIL OTP")
        }
        TextButton(onClick = { /*TODO*/ }, modifier = Modifier.padding(top = 550.dp).align(Alignment.TopCenter)) {
            Text(text = "I already have an OTP", color = Color.Blue)
        }

    }
}

