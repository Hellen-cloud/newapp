package com.hellena.onlineapp.ui.theme.screens.myapp

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.hellena.onlineapp.R
import com.hellena.onlineapp.navigation.ROUTE_CALC
import com.hellena.onlineapp.navigation.ROUTE_INTENT
import com.hellena.onlineapp.ui.theme.Purple80

@Composable
fun My_app_screen(navController: NavHostController) {
    Column (verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)){
        Image(painterResource(id =R.drawable.opt3),
            contentDescription = "appimage3",
            modifier = Modifier.size(200.dp))



        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick ={navController.navigate(ROUTE_CALC)},
            colors = ButtonDefaults.buttonColors(Purple80),
            modifier = Modifier.width(300.dp)) {

            Text("CALCULATOR",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.White)
        }

        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick ={navController.navigate(ROUTE_INTENT)},
            colors = ButtonDefaults.buttonColors(Purple80),
            modifier = Modifier.width(300.dp)) {

            Text("INTENT",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.White)
        }

    }


}


@Preview
@Composable
private fun My_app_prev() {
    My_app_screen(rememberNavController())

}