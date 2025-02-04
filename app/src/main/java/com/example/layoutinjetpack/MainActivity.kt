package com.example.layoutinjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.layoutinjetpack.ui.theme.LayoutInJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layout()
        }
    }

    @Composable
    private fun Layout() {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
//                .horizontalScroll(rememberScrollState())
                .background(color = Color.Black),
                horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Layout2()
            for(i in 1..330){
                Text(text = "$i. Jetpack Compose".repeat(5), color = Color.Green, fontWeight = FontWeight.Bold, modifier = Modifier.padding(10.dp))
            }
        }
    }
    @Composable
    private fun Layout2(){
        Row(modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
            .horizontalScroll(rememberScrollState())
        ) {
            for(i in 1..330){
                Text(text = "$i. Jetpack Compose", color = Color.Green, fontWeight = FontWeight.Bold, modifier = Modifier.padding(10.dp))
            }
        }
    }
}
