package com.jhonier.bank.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.jhonier.bank.components.MainButton
import com.jhonier.bank.components.Space

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeView(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Bank") },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Filled.Menu,
                            contentDescription = "Menu"
                        )
                    }
                    IconButton(onClick = {
                        navController.navigate("Setting")
                    }) {
                        Icon(
                            imageVector = Icons.Filled.Settings,
                            contentDescription = "Menu"
                        )
                    }
                }
            )
        },
        bottomBar = {
            NavigationBar(windowInsets = NavigationBarDefaults.windowInsets){
                NavigationBarItem(
                    onClick = {},
                    icon = { Icon(Icons.Filled.Home, contentDescription = "Perfil") },
                    selected = true,
                    label = {Text(text = "Inicio")}
                )
                NavigationBarItem(
                    onClick = {},
                    icon = { Icon(Icons.Filled.Favorite, contentDescription = "Perfil") },
                    selected = true,
                    label = {Text(text = "Actividad")}
                )
                NavigationBarItem(
                    onClick = {},
                    icon = { Icon(Icons.Filled.Place, contentDescription = "Perfil") },
                    selected = true,
                    label = {Text(text = "Ubicación")}
                )
                NavigationBarItem(
                    onClick = {
                        navController.navigate("Setting")
                    },
                    icon = { Icon(Icons.Filled.Person, contentDescription = "Perfil") },
                    selected = true,
                    label = {Text(text = "Perfil")}
                )
            }
        }
    ) {
        ContentHomeView(navController)
    }
}

@Composable
fun ContentHomeView(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Home")
        Space()
        MainButton(
            name = "Más"
        ) {
            navController.navigate("Setting")
        }
    }
}