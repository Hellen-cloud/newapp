package com.hellena.onlineapp.ui.theme.screens.register

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.hellena.onlineapp.navigation.ROUTE_lOGIN
import com.hellena.onlineapp.ui.theme.Mynewcolor
import com.hellena.onlineapp.ui.theme.Pink80
import com.hellena.onlineapp.ui.theme.button

@Composable
fun Register_Screen(navController: NavHostController) {
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    var fname by remember { mutableStateOf(TextFieldValue("")) }
    var lname by remember { mutableStateOf(TextFieldValue("")) }



    Column (verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Mynewcolor)) {
        Text("Register Screen",
            color = Pink80,
            fontSize = 35.sp,
            fontFamily = FontFamily.Serif,
        )
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedTextField(value = fname,
            onValueChange = {fname=it},
            label = {Text("Enter Firstname",
                color = Pink80,
                fontSize = 25.sp,
                fontFamily = FontFamily.Monospace,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp),
            ) }



        )
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedTextField(value = lname,
            onValueChange = {lname=it},
            label = {Text("Enter Lastname",
                color = Pink80,
                fontSize = 25.sp,
                fontFamily = FontFamily.Monospace,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp),
            ) }



        )
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedTextField(value = email,
            onValueChange = {email=it},
            label = {Text("Enter email",
                color = Pink80,
                fontSize = 25.sp,
                fontFamily = FontFamily.Monospace,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp),
            ) }



        )
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedTextField(value = password,
            onValueChange = {password=it},
            label = {Text("Enter password",
                color = Pink80,
                fontSize = 25.sp,
                fontFamily = FontFamily.Monospace,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp),

                ) }
        )

        Spacer(modifier = Modifier.height(50.dp))
        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(button),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Click here to Sign Up ",
                color = Color.Black,
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive)
        }

        Spacer(modifier = Modifier.height(20.dp))
        Text("Got an account?Click to LOGIN",
            fontSize = 20.sp,
            modifier = Modifier.clickable{navController.navigate(ROUTE_lOGIN)},
            color = Color.Cyan



        )









    }





}


@Preview
@Composable
private fun Registerprev() {

    Register_Screen(rememberNavController())

}
