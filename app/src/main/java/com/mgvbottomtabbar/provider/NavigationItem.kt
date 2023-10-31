package com.mgvbottomtabbar.provider

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Message
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PostAdd
import androidx.compose.material.icons.rounded.GroupWork
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.Message
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Created by Mahesh Gubbi on 30-10-2023.
 * Bengaluru.
 */
sealed class NavigationItem(var route: String, val icon: ImageVector?, var title: String){
    object Message : NavigationItem("Message", Icons.Rounded.Message, "Message")
    object Group : NavigationItem("Group", Icons.Rounded.GroupWork, "Group")
    object Home : NavigationItem("Home", Icons.Rounded.Home, "Home")
    object Notification : NavigationItem("Notification", Icons.Default.Notifications, "Notification")
    object Profile : NavigationItem("Profile", Icons.Default.Person, "Profile")

}
