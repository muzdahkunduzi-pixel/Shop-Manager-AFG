package com.shopmanager.afg

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AddProductScreen() {

    var name by remember { mutableStateOf("") }
    var buyPrice by remember { mutableStateOf("") }
    var sellPrice by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {

        Text(
            text = "نوی جنس اضافه کړه",
            style = MaterialTheme.typography.headlineSmall
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("د جنس نوم") }
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = buyPrice,
            onValueChange = { buyPrice = it },
            label = { Text("د اخیستلو قیمت (افغانی)") }
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = sellPrice,
            onValueChange = { sellPrice = it },
            label = { Text("د خرڅولو قیمت (افغانی)") }
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {}
        ) {
            Text("ذخیره کړه")
        }
    }
}
