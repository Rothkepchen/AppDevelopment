package com.example.tedotest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tedotest.ui.theme.TedoTestTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TedoTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SeeDocuments()
                }
            }
        }
    }
}

@Composable
fun SeeDocuments() {
    var inputValue by remember { mutableStateOf("") }
    var expanded by remember { mutableStateOf(false)}

    val costumer = mutableListOf("Kunde 1", "Kunde 2", "Kunde 3")

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Se Dokumenter")

        Spacer(modifier = Modifier.height(16.dp))
        Row {
            Box {
                Button(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(8.dp)
                        .background(color = MaterialTheme.colorScheme.background)

                )
                {
                    Text("Vælg Kunde")
                    Icon(Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow Down")
                }

                DropdownMenu(expanded = false, onDismissRequest = {}) {
                    DropdownMenuItem(
                        text = { Text("Centimeters") },
                        onClick = { /*TODO*/ }
                    )


                }
            }
        }


        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = inputValue,
            onValueChange = { newValue ->
                inputValue = newValue
            },
            label = { Text("") },
            leadingIcon = {

            }
        )
        /*Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = inputValue,
            onValueChange = { newValue ->
                inputValue = newValue
            },
            label = { Text("") },
            leadingIcon = {

            }
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = inputValue,
            onValueChange = { newValue ->
                inputValue = newValue
            },
            label = { Text("") },
            leadingIcon = {

            }
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = inputValue,
            onValueChange = { newValue ->
                inputValue = newValue
            },
            label = { Text("") },
            leadingIcon = {

            }
        )*/
    }
    }
    @Preview(showBackground = true)
    @Composable
    fun SeeDocumentsPreview() {
        SeeDocuments()
}