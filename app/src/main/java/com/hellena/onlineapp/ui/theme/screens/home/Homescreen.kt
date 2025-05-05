package com.hellena.onlineapp.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.hellena.onlineapp.R
import com.hellena.onlineapp.navigation.ROUTE_MYAPP
import com.hellena.onlineapp.navigation.ROUTE_REGISTER
import com.hellena.onlineapp.navigation.ROUTE_lOGIN

@Composable
fun Home_screen(navController: NavHostController) {

    Column(verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)) {
        Text("Hellen's App",
            color = Color.Red,
            fontSize = 30.sp,
            fontFamily = FontFamily.Serif
            )
        Spacer(modifier = Modifier.height(30.dp))
        Text("Welcome to Hellen's App",
            color = Color.Black,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.ExtraBold
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {navController.navigate(ROUTE_lOGIN)},
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier.width(300.dp)
        ) {
            Text("Click to log in",
                color = Color.Red,
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
            )
        }
        Spacer(modifier= Modifier.height(30.dp))
        Button(onClick = {navController.navigate(ROUTE_REGISTER)},
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier.width(300.dp)
        ) {
            Text("Click to register",
                color = Color.Red,
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick ={navController.navigate(ROUTE_MYAPP)},
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier.width(300.dp)) {

            Text("My App",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Red)
        }



        Spacer(modifier = Modifier.height(30.dp))
        Image(painter = painterResource(id = R.drawable.welcome),
            contentDescription = "well",
            modifier = Modifier
                .size(300.dp)
             )



    }



}

@Preview
@Composable
private fun Homeprev() {
    Home_screen(rememberNavController())

}