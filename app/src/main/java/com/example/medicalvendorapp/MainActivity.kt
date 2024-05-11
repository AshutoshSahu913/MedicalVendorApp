package com.example.medicalvendorapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.medicalvendorapp.Screens.ForgetScreen.ForgetScreen
import com.example.medicalvendorapp.Screens.LoginScreen.LoginScreen
import com.example.medicalvendorapp.Screens.SignUpScreen.SignUpScreen
import com.example.medicalvendorapp.Screens.SignUpScreen.SignUpViewModel
import com.example.medicalvendorapp.ui.theme.MedicalVendorAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            MedicalVendorAppTheme {

                VendorNavigation()
            }
        }
    }
}


sealed class DestinationScreen(var route: String) {
    data object SignUp : DestinationScreen("signUp")
    data object Login : DestinationScreen("login")

    data object Forget:DestinationScreen("forget")
}


@Composable
fun VendorNavigation() {
    val navController = rememberNavController()
    var navHost = NavHost(
        navController = navController,
        startDestination = DestinationScreen.SignUp.route
    ) {

        composable(DestinationScreen.SignUp.route) {
            SignUpScreen(navController)
        }
        composable(DestinationScreen.Login.route) {
            LoginScreen(navController)
        }


        composable(DestinationScreen.Forget.route) {
            ForgetScreen(navController)
        }
    }
}
