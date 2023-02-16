package com.tariq.basicnavigationcompose.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun LoginScreen(
    navController: NavController
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Column() {
            Text(
                modifier = Modifier.clickable {
                    navController.navigate(route = Screens.SignUpScreen.route)
                },
                text = "Login Screen",
                color = MaterialTheme.colors.primary,
                fontSize = MaterialTheme.typography.h3.fontSize,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.size(34.dp))
            Text(
                modifier = Modifier.clickable {
                    navController.navigate(MAIN_ROUTE) {
                        popUpTo(MAIN_ROUTE)
                    }
                },
                text = "Go back",
                color = MaterialTheme.colors.primary,
                fontSize = MaterialTheme.typography.h3.fontSize,
                fontWeight = FontWeight.Bold
            )
        }

    }
}

@Composable
@Preview(showSystemUi = true, showBackground = true)
fun LoginScreenPreview() {
    LoginScreen(navController = rememberNavController())
}