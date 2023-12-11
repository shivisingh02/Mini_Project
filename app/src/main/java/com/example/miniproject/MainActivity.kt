package com.example.miniproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.miniproject.ui.theme.MiniProjectTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiniProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
Column {
    Registration()
}
                }
            }
        }
    }
}

@Composable
fun Registration() {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primary,
        ),
        modifier = Modifier
            .size(width = 400.dp, height = 600.dp)
            .padding(top = 200.dp, start = 10.dp)
    ) {
        Text(
            text = "User Registration",
            modifier = Modifier.padding( start = 70.dp , top = 5.dp),
fontSize = 30.sp
        )
        RegistrationBox()

    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegistrationBox() {
    var text by remember { mutableStateOf("Enter Your Text") }

    Column(modifier = Modifier.padding(top = 10.dp)) {
        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Full Name") },
            leadingIcon = {
                Icon(imageVector = Icons.Default.AccountCircle, contentDescription = null)
            },
            modifier = Modifier.padding(start = 20.dp, top = 20.dp)
        )
        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Address") },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Home, contentDescription = null)
            },
            modifier = Modifier.padding(start = 20.dp, top = 20.dp)
        )
        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Email") },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Email, contentDescription = null)
            },
            modifier = Modifier.padding(start = 20.dp, top = 20.dp)
        )
        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Contact No.") },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Call, contentDescription = null)
            },
            modifier = Modifier.padding(start = 20.dp, top = 20.dp)
        )
    }
}


