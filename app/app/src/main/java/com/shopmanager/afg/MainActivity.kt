package com.shopmanager.afg

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ShopApp()
        }
    }
}

@Composable
fun ShopApp() {

    var screen by remember { mutableStateOf("home") }

    if (screen == "home") {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "پلورنځی",
                fontSize = 36.sp
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "د خوراکي توکو مدیریت سیستم",
                fontSize = 18.sp
            )

            Spacer(modifier = Modifier.height(30.dp))

            Button(
                onClick = { screen = "add" },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("➕ نوی جنس اضافه کړه")
            }

            Spacer(modifier = Modifier.height(15.dp))

            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("📦 ذخیره")
            }

            Spacer(modifier = Modifier.height(15.dp))

            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("🛒 خرڅلاو")
            }

            Spacer(modifier = Modifier.height(15.dp))

            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("💰 ګټه او حساب")
            }

        }

    } else {

        AddProductScreen()

    }
}
