package com.tariq.basicnavigationcompose.navgraph

import androidx.navigation.*
import androidx.navigation.compose.composable
import com.tariq.basicnavigationcompose.screens.*


fun NavGraphBuilder.mainNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screens.HomeScreen.route,
        route = MAIN_ROUTE
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