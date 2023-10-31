package com.mgvbottomtabbar.provider
import GroupScreen
import HomeScreen
import MessageScreen
import NotificationScreen
import ProfileScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

/**
 * Created by Mahesh Gubbi on 30-10-2023.
 * Bengaluru.
 */


@Composable
fun Navigation(
    navController: NavHostController
) {
    NavHost(navController, startDestination = NavigationItem.Home.route) {
        composable(NavigationItem.Message.route) {
            MessageScreen()
        }
        composable(NavigationItem.Group.route) {
            GroupScreen()
        }
        composable(NavigationItem.Home.route) {
            HomeScreen()
        }
        composable(NavigationItem.Notification.route) {
            NotificationScreen()
        }
        composable(NavigationItem.Profile.route) {
            ProfileScreen()
        }
    }
}