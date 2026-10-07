package com.shopmanager.afg

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ShopHome()
        }
    }
}

@Composable
fun ShopHome() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "پلورنځی",
            fontSize = 34.sp,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "د خوراکي توکو مدیریت سیستم",
            fontSize = 18.sp
        )

        Spacer(modifier = Modifier.height(30.dp))


        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("➕ نوی جنس اضافه کړه")
        }


        Spacer(modifier = Modifier.height(15.dp))


        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("📦 ذخیره وګوره")
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


        Spacer(modifier = Modifier.height(15.dp))


        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("⚙️ امستنې")
        }
    }
}
