package com.jhonier.bank.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jhonier.bank.views.HomeView
import com.jhonier.bank.views.SettingView

@Composable
fun NavManeger(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home"){
        composable("Home") {
            HomeView(navController)
        }
        composable("Setting"){
            SettingView(navController)
        }
    }
}
