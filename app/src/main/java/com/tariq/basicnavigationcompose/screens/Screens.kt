package com.tariq.basicnavigationcompose.screens

sealed class Screens(val route: String) {
    object HomeScreen : Screens(route = "home_screen")
    object SecondScreen : Screens(route = "details_screen/{id}") {
        fun passId(id: Int): String {
            return this.route.replace("{id}", id.toString())
        }
    }
}
