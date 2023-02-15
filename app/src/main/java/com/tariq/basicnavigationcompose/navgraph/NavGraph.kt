package com.tariq.basicnavigationcompose.navgraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.tariq.basicnavigationcompose.screens.HomeScreen
import com.tariq.basicnavigationcompose.screens.Screens
import com.tariq.basicnavigationcompose.screens.SecondScreen

@Composable
fun SetUpNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screens.HomeScreen.route
    ) {
        composable(
            route = Screens.HomeScreen.route
        ) {
            HomeScreen(navController = navController)
        }
        composable(
            route = Screens.SecondScreen.route,
            arguments = listOf(navArgument("id") {
                type = NavType.IntType
            })
        ) {
            SecondScreen(navController)
        }
    }

}