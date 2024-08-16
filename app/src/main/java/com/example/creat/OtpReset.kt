package com.example.creat

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun OtpReset() {
    var otpText by remember {
        mutableStateOf("")
    }
    Box(modifier = Modifier.fillMaxSize())
    Row(
        modifier = Modifier
            .padding(top = 40.dp)
            .fillMaxWidth()
            .background(color = Color.Blue)
            .height(70.dp)
    ) {
        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.padding(start = 20.dp, top = 10.dp)
        ) {
            Icon(
                imageVector = Icons.Rounded.KeyboardArrowLeft,
                contentDescription = null,
                Modifier.size(35.dp), Color.White
            )
        }
        Text(
            text = "Back",
            modifier = Modifier.padding(top = 20.dp, start = 15.dp),
            fontSize = 25.sp, color = Color.White
        )

    }
    Column(modifier = Modifier.padding(top = 350.dp, start = 30.dp, end = 30.dp)) {
        Text(
            text = "Reset your passwoed",
            modifier = Modifier,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "A 6 digit email OTP was to nasir.perwez@gmial.com Enter that code here to proseed",
            modifier = Modifier.padding(end = 2.dp), fontSize = 15.sp
        )
        BasicTextField(
            value = otpText, onValueChange = { otpText = it }
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                repeat(6) { index ->
                    val number = when {
                        index >= otpText.length -> ""
                        else -> otpText[index]
                    }
                    Column(
                        modifier = Modifier.padding(top = 20.dp),
                        verticalArrangement = Arrangement.spacedBy(6.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = number.toString(),
                            style = MaterialTheme.typography.titleLarge
                        )
                        Box(
                            modifier = Modifier
                                .width(40.dp)
                                .height(2.dp)
                                .background(Color.Black)

                        )
                    }

                }
            }
        }
        Row {
            Text(text = "Didn't get OTP?-", modifier = Modifier.padding(top = 20.dp))
            TextButton(onClick = { /*TODO*/ },modifier = Modifier.padding(top =10.dp)) {
                Text(text = "Resend email OTP")
            }
        }
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding( top = 20.dp)
                .width(330.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
        ) {
            Text(text = "SEND EMAIL OTP")
        }

    }
}