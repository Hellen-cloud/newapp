package com.hellena.onlineapp.ui.theme.screens.intent

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.provider.MediaStore
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.core.content.ContextCompat
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.hellena.onlineapp.R
import com.hellena.onlineapp.ui.theme.Purple80
import com.hellena.onlineapp.ui.theme.newone
import androidx.core.net.toUri

@Composable
fun Intent_Screen(navController: NavHostController) {
    val context= LocalContext.current

    Column (verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)){
        Image(painterResource(id = R.drawable.int1),
            contentDescription = "int2",
            modifier = Modifier.width(300.dp))

        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick ={
            val intent = Intent(Intent.ACTION_CALL, ("tel:" + "+254646879").toUri())

            if (ContextCompat.checkSelfPermission(
                    context,
                    android.Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    context as Activity,
                    arrayOf(android.Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                context.startActivity(intent)
            }
        },
            colors = ButtonDefaults.buttonColors(newone),
            modifier = Modifier
                .width(300.dp)) {

            Text("CALL",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.White)
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick ={
            val uri = "smsto:0734667162".toUri()

            val intent = Intent(Intent.ACTION_SENDTO, uri)

            intent.putExtra("Hello", "How is todays weather")

            context.startActivity(intent)
        },
            colors = ButtonDefaults.buttonColors(newone),
            modifier = Modifier.width(300.dp)) {

            Text("SMS",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.White)
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick ={
            val phone = "+2547346578"

            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

            context.startActivity(intent)
        },
            colors = ButtonDefaults.buttonColors(newone),
            modifier = Modifier.width(300.dp)) {

            Text("DIAL",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.White)
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick ={
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            startActivityForResult(context as Activity,takePictureIntent,1,null)
        },
            colors = ButtonDefaults.buttonColors(newone),
            modifier = Modifier.width(300.dp)) {

            Text("CAMERA",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.White)
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick ={
            val simToolKitLaunchIntent =
                context.packageManager.getLaunchIntentForPackage("com.android.stk")

            simToolKitLaunchIntent?.let { context.startActivity(it) }
        },
            colors = ButtonDefaults.buttonColors(newone),
            modifier = Modifier.width(300.dp)) {

            Text("STK",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.White)
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick ={
            val shareIntent = Intent(Intent.ACTION_SEND)

            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

            shareIntent.type = "text/plain"

            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")

            context.startActivity(shareIntent)
        },
            colors = ButtonDefaults.buttonColors(newone),
            modifier = Modifier.width(300.dp)) {

            Text("SHARE",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.White)
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick ={
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "ghg@gmail.com", null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")

            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")
            context.startActivity(emailIntent)
        },
            colors = ButtonDefaults.buttonColors(newone),
            modifier = Modifier.width(300.dp)) {

            Text("EMAIL",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.White)
        }

    }
    
}

@Preview
@Composable
private fun Intentprev() {
    Intent_Screen(rememberNavController())

}