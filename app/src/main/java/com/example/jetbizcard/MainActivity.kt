package com.example.jetbizcard

import android.graphics.drawable.shapes.OvalShape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetbizcard.ui.theme.JetBiZCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetBiZCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CreateBizCard()
                }
            }
        }
    }
}

@Composable
fun CreateBizCard() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Card(
            modifier = Modifier
                .width(200.dp)
                .height(390.dp)
                .padding(12.dp),
            shape = RoundedCornerShape(corner = CornerSize(15.dp)),
            backgroundColor = Color.White,
            elevation = 4.dp,
        ) {
            Column(
                modifier = Modifier.height(300.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CreateImageProfile()
                Divider(color = Color.Gray, thickness = 0.2.dp)
                Text(
                    text = "Lynne M.",
                    color = Color.DarkGray,
                    modifier = Modifier.padding(top = 30.dp, bottom = 10.dp),
                    style = MaterialTheme.typography.h1
                )
                Text(
                    text = "Android Engineer",
                    style = MaterialTheme.typography.body1,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
                Text(
                    text = "@LynneMunini",
                    style = MaterialTheme.typography.body1,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.width(120.dp).height(80.dp).padding(top = 40.dp),
                    shape = RoundedCornerShape(corner = CornerSize(10.dp)),
                    border = BorderStroke(0.5.dp, color = Color.LightGray),
                    colors = ButtonDefaults.textButtonColors(backgroundColor = Color.DarkGray, contentColor = Color.White)
                    ) {
                    Text("Contact Me")
                }
            }

        }
    }
}

@Composable
private fun CreateImageProfile() {
    Surface(
        modifier = Modifier
            .size(150.dp)
            .padding(5.dp),
        shape = CircleShape,
        border = BorderStroke(0.5.dp, Color.LightGray),
        elevation = 4.dp,
        color = MaterialTheme.colors.onSurface.copy(alpha = 0.5f)
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile_image),
            contentDescription = "Profile Image", modifier = Modifier.size(135.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetBiZCardTheme {
        CreateBizCard()
    }
}