package com.tariq.basicnavigationcompose.screens

const val ROOT_ROUTE = "root"
const val MAIN_ROUTE = "main_route"
const val AUTH_ROUTE = "auth_route"

sealed class Screens(val route: String) {
    object HomeScreen : Screens(route = "home_screen")
    object LoginScreen : Screens(route = "login_screen")
    object SignUpScreen : Screens(route = "signup_screen")
    object SecondScreen : Screens(route = "details_screen/{id}") {
        fun passId(id: Int): String {
            return this.route.replace("{id}", id.toString())
        }
    }

}
