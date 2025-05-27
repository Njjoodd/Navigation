package com.first.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun ParcelNavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(navController)
        }
        composable("details/{name}") { backStackEntry ->
            val name = backStackEntry.arguments?.getString("name") ?: "Customer"
            DetailsScreen(navController, name)
        }
        composable("parcel") {
            ParcelScreen(navController)
        }
    }
}
