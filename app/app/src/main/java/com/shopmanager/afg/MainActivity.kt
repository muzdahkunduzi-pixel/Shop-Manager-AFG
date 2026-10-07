package com.shopmanager.afg
import androidx.compose.runtime.*
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
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
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = com.shopmanager.afg.R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier.size(180.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "پلورنځی",
            fontSize = 36.sp
        )

        Text(
            text = "د خوراکي توکو مدیریت سیستم",
            fontSize = 18.sp
        )

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = { screen = "add" }
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
}
