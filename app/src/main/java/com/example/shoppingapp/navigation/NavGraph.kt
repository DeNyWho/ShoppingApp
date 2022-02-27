package com.example.shoppingapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@Composable
fun SetupNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ){
       composable(route = Screen.Splash.route){

       }

        composable(route = Screen.Welcome.route){
//            WelcomeScreen(navController = navController)
        }
        composable(route = Screen.Home.route){
//            HomeScreen(navController = navController)
        }
        composable(route = Screen.Search.route){

        }


    }

}