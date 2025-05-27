package com.first.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlin.random.Random


@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Welcome to ParcelTrack Inc!")
        Button(onClick = { navController.navigate("details/Njood") }) {
            Text("Track Parcel")
        }
    }
}


@Composable
fun DetailsScreen(navController: NavController, name: String) {
    val statuses = listOf("In Transit", "Delayed", "Delivered")
    val randomStatus = statuses[Random.nextInt(statuses.size)]

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Hello, $name! Your parcel is on its way.")
        Text("Status: $randomStatus")
        Text("Your parcel is currently in Dubai.")
        Button(onClick = { navController.navigate("parcel") }) {
            Text("View Parcel Info")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { navController.navigate("home") }) {
            Text("Back to Home")
        }
    }
}

@Composable
fun ParcelScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Parcel ID: 123456")
        Text("Delivery Status: On Schedule")
        Text("Estimated Arrival: Tomorrow, 2 PM")
        Button(onClick = { navController.popBackStack() }) {
            Text("Go Back")
        }
    }
}
