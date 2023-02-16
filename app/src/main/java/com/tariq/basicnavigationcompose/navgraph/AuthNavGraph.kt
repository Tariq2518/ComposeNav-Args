package com.tariq.basicnavigationcompose.navgraph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.tariq.basicnavigationcompose.screens.AUTH_ROUTE
import com.tariq.basicnavigationcompose.screens.LoginScreen
import com.tariq.basicnavigationcompose.screens.Screens
import com.tariq.basicnavigationcompose.screens.SignUpScreen

fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screens.LoginScreen.route,
        route = AUTH_ROUTE
    ) {
        composable(
            route = Screens.LoginScreen.route
        ) {
            LoginScreen(navController = navController)
        }

        composable(
            route = Screens.SignUpScreen.route
        ) {
            SignUpScreen(navController = navController)
        }
    }
}