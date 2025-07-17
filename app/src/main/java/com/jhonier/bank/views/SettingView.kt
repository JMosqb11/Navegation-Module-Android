package com.jhonier.bank.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.leanback.widget.TitleView
import androidx.navigation.NavController
import com.jhonier.bank.components.MainButton
import com.jhonier.bank.components.Space

@Composable
fun SettingView(navController: NavController, id: Int?, opcional: String?){
    ContentSettingView(navController, id, opcional)
}


@Composable
fun ContentSettingView(navController: NavController, id: Int?, opcional: String?){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = id.toString())
        Space()

        Space()
        MainButton(name = "Volver a Home") {
            navController.popBackStack()
        }
    }
}