/**
 * Created by Mahesh Gubbi on 30-10-2023.
 * Bengaluru.
 */

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun MessageScreen() {
    Column {
        CenterText(text = "Message")
    }
}
@Composable
fun GroupScreen() {
    CenterText(text = "Group")
}
@Composable
fun HomeScreen() {
    CenterText(text = "Home")
}

@Composable
fun NotificationScreen() {
    CenterText(text = "History")
}

@Composable
fun ProfileScreen() {
    CenterText(text = "Profile")
}

@Composable
fun CenterText(text: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = text, fontSize = 32.sp)
    }
}