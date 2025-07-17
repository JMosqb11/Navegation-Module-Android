package com.jhonier.bank.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.jhonier.bank.views.HomeView
import com.jhonier.bank.views.SettingView

@Composable
fun NavManeger(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home"){
        composable("Home") {
            HomeView(navController)
        }
        composable("Setting/{id}/?{opcional}", arguments = listOf(
            navArgument("id"){
                type = NavType.IntType
            }
        )){
            val id = it.arguments?.getInt("id") ?: 0
            val opcional = it.arguments?.getString("opcional")
            SettingView(navController, id, opcional)
        }
    }
}
