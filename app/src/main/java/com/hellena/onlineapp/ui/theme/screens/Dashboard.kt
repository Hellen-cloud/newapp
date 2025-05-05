package com.hellena.onlineapp.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.hellena.onlineapp.R
import com.hellena.onlineapp.ui.theme.dash
import com.hellena.onlineapp.ui.theme.newone
import com.hellena.onlineapp.ui.theme.opt1
import com.hellena.onlineapp.ui.theme.opt2
import com.hellena.onlineapp.ui.theme.opt3

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Dash_Screen(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(opt1)
        .verticalScroll(rememberScrollState()),
        )
        {
//        Start of box

        Box(){
//            start of card
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
                shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp),
                colors = CardDefaults.cardColors(opt2)

            ) {
                TopAppBar(
                    title = { Text("My Dashboard") },
                    navigationIcon = {
                        IconButton(onClick = {}) {
                            Icon(imageVector = Icons.Default.Menu, contentDescription = "menu")
                        }
                    },
                )

                Text(
                    text = "This App is a user-friendly app designed to help you organize your daily" +
                            " tasks and boost productivity. With a clean interface and powerful" +
                            " features, it makes managing your to-do list easier, faster, " +
                            "and more enjoyable.",
                    fontSize = 21.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Cursive,


                )

            }
            Spacer(modifier = Modifier.height(20.dp))
//            END of card

            Card(modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .align(alignment = Alignment.BottomCenter)
                .padding(start = 20.dp,end=20.dp)
                .offset(y = 90.dp)
            ) {

                Image(
                    painter = painterResource(R.drawable.starts),
                    contentDescription = "starts",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds

                )

                Spacer(modifier = Modifier.width(10.dp))

                Column {
                    Text(
                        text = "",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                }
//                END OF COLUMN


            }
        }
            Spacer(modifier = Modifier.height(100.dp))

            Row (modifier = Modifier.padding(20.dp)){
//                Card1
                Card (
                    modifier = Modifier
                        .width(150.dp)
                        .height(180.dp)
                        .clickable{},
                    elevation = CardDefaults.cardElevation()
                ){
                    Column (
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.White),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ){
                        Image(
                            painter = painterResource(R.drawable.home),
                            contentDescription = "home",
                            modifier = Modifier
                                .size(100.dp)


                        )
                        Text(text = "Home", fontSize = 15.sp)
                    }



                }

//                end of card1
                Spacer(modifier = Modifier.width(20.dp))

//                Card2
                Card (
                    modifier = Modifier
                        .width(150.dp)
                        .height(180.dp)
                        .clickable { },
                    elevation = CardDefaults.cardElevation()

                ){

                    Column (
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.White),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ){
                        Image(
                            painter = painterResource(R.drawable.abtus),
                            contentDescription = "abt",
                            modifier = Modifier.size(100.dp)


                        )
                        Text("About", fontSize = 15.sp)
                    }

                }
//                end of card 2



            }
//            end of row
            Spacer(modifier = Modifier.height(20.dp))


            Row(modifier = Modifier.padding(20.dp)){
                Card (modifier = Modifier
                    .width(150.dp)
                    .height(180.dp)
                    .clickable{},
                    elevation = CardDefaults.cardElevation()
                ){
                    Column (
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.White),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ){
                        Image(
                            painter = painterResource(R.drawable.contactus),
                            contentDescription = "contact",
                            modifier = Modifier.size(100.dp)
                        )
                        Text(text = "Contact us", fontSize = 15.sp)
                    }


                }
//                end of card1

                Spacer(modifier = Modifier.width(20.dp))

                Card (
                    modifier = Modifier
                        .width(150.dp)
                        .height(180.dp)
                        .clickable { },
                    elevation = CardDefaults.cardElevation()
                ){
                    Column (
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.White),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ){
                        Image(
                            painter = painterResource(R.drawable.prdct),
                            contentDescription = "duct",
                            modifier = Modifier.size(100.dp)
                        )
                        Text(text = "Products", fontSize = 15.sp)
                    }


                }
//                end of card 2



            }
//            end of row

            }
















    }




@Preview
@Composable
private fun Dash_Prev() {
    Dash_Screen(rememberNavController())

}