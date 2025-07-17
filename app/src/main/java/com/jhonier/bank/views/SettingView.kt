package com.jhonier.bank.views

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.jhonier.bank.components.MainButton

@Composable
fun SettingView(navController: NavController){
    Text(text = "Hola")
    MainButton(name = "Volver a Home") {
        navController.popBackStack()
    }
}
