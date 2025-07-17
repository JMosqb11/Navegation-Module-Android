package com.jhonier.bank.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MainButton(name: String, onClick: () -> Unit ){
    Button(
        onClick = onClick,
        modifier = Modifier
    ) {
        Text(text = name)
    }
}

@Composable
fun Space() {
    Spacer(modifier = Modifier.padding(bottom = 20.dp))
}