package com.hellena.onlineapp.ui.theme.screens

import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.hellena.onlineapp.R
import com.hellena.onlineapp.ui.theme.dash
import com.hellena.onlineapp.ui.theme.newone
import com.hellena.onlineapp.ui.theme.opt1
import com.hellena.onlineapp.ui.theme.opt2
import kotlin.math.round


@Composable
fun My_Screen(navController: NavHostController) {
    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(

        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = dash
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("Home") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0

                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.AddCircle, contentDescription = "Home") },
                    label = { Text("Add") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0

                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites") },
                    label = { Text("Favorites") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1

                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    label = { Text("Profile") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )

            }
        },

        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = dash
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },

        //Content
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()

            ) {

                Box () {
                    //Main Contents of the page
                    Card (
                        modifier = Modifier.fillMaxWidth().height(400.dp),
                        shape = RoundedCornerShape(bottomStart = 10.dp, bottomEnd = 10.dp),
                        colors = CardDefaults.cardColors(opt1)

                    ){


                       
                        Spacer(modifier = Modifier.height(20.dp))
                        Text(text = "MY PROJECTS",
                            color = Color.White,
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Cursive,
                            fontWeight = FontWeight.ExtraBold
                        )


                        Spacer(modifier = Modifier.height(20.dp))

                        Column(
                            modifier = Modifier.fillMaxSize()
                                .horizontalScroll(rememberScrollState())
                        ) {

                            //Row
                            Row(modifier = Modifier.padding(20.dp)) {


                                //Card1
                                Card(
                                    modifier = Modifier
                                        .width(150.dp)
                                        .height(300.dp)
                                        .clickable { },
                                    elevation = CardDefaults.cardElevation(),
                                    colors = CardDefaults.cardColors(dash)
                                ) {
                                    Column(
                                        modifier = Modifier.fillMaxSize()
                                            .padding(20.dp),
                                        horizontalAlignment = Alignment.Start,
                                        verticalArrangement = Arrangement.SpaceEvenly
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.slan),
                                            contentDescription = "home",
                                            modifier = Modifier
                                                .size(80.dp)
                                                .clip(shape = RoundedCornerShape(20.dp)))
                                        Text(text = "Analysis App", fontSize = 15.sp,
                                            fontFamily = FontFamily.Serif)
                                        Spacer(modifier = Modifier.height(10.dp))
                                        Text(text = "Landing Page", fontSize = 15.sp,
                                            fontFamily = FontFamily.Serif
                                        )
                                        Spacer(modifier = Modifier.height(20.dp))
                                        Text(text = "12 Links", fontSize = 15.sp,
                                            fontFamily = FontFamily.Serif)


                                    }


                                }

                                //End of Card1
                                Spacer(modifier = Modifier.width(20.dp))

                                //Card2
                                Card(
                                    modifier = Modifier
                                        .width(150.dp)
                                        .height(300.dp)
                                        .clickable {  },
                                    elevation = CardDefaults.cardElevation(),
                                    colors = CardDefaults.cardColors(dash)
                                ) {
                                    Column(
                                        modifier = Modifier.fillMaxSize()
                                            .padding(20.dp),
                                        horizontalAlignment = Alignment.Start,
                                        verticalArrangement = Arrangement.SpaceEvenly
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.comm),
                                            contentDescription = "",
                                            modifier = Modifier
                                                .size(80.dp)
                                                .clip(shape = RoundedCornerShape(20.dp)),


                                            )
                                        Text(text = "Ecommerce App", fontSize = 15.sp,
                                            fontFamily = FontFamily.Serif)
                                        Spacer(modifier = Modifier.height(10.dp))
                                        Text(text = "Dashboard", fontSize = 15.sp,
                                            fontFamily = FontFamily.Serif)
                                        Spacer(modifier = Modifier.height(20.dp))
                                        Text(text = "12 Links", fontSize = 15.sp,
                                            fontFamily = FontFamily.Serif)

                                    }


                                }

                                //End of Card2
                                Spacer(modifier = Modifier.width(20.dp))
                                //Card2
                                Card(
                                    modifier = Modifier
                                        .width(150.dp)
                                        .height(300.dp)
                                        .clickable {  },
                                    elevation = CardDefaults.cardElevation(),
                                    colors = CardDefaults.cardColors(dash)
                                ) {
                                    Column(
                                        modifier = Modifier.fillMaxSize()
                                            .padding(20.dp),
                                        horizontalAlignment = Alignment.Start,
                                        verticalArrangement = Arrangement.SpaceEvenly
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.weather),
                                            contentDescription = "home",
                                            modifier = Modifier
                                                .size(80.dp)
                                                .clip(shape = RoundedCornerShape(20.dp))
                                        )
                                        Spacer(modifier = Modifier.height(10.dp))

                                        Text(text = "Weather App", fontSize = 15.sp,
                                            fontFamily = FontFamily.Serif)
                                        Spacer(modifier = Modifier.height(10.dp))
                                        Text(text = "Dashboard", fontSize = 15.sp,
                                            fontFamily = FontFamily.Serif)
                                        Spacer(modifier = Modifier.height(20.dp))
                                        Text(text = "12 Links", fontSize = 15.sp,
                                            fontFamily = FontFamily.Serif)
                                    }


                                }

                                //End of Card2
                            }
                        }

                        //End of Row

                        Spacer(modifier = Modifier.height(20.dp))

//Card
//End of Card




                    }


                }


                Column (modifier = Modifier.fillMaxSize()
                    .verticalScroll(rememberScrollState()


                    )
                ) {

                    Spacer(modifier = Modifier.height(30.dp))
                    Text(
                        text = "REMINDERS",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Cursive,
                        fontWeight = FontWeight.ExtraBold

                    )


                    //Row
                    Row(modifier = Modifier
                        .padding(20.dp)) {



                        //Card1
                        Card(
                            modifier = Modifier
                                .width(400.dp)
                                .height(80.dp)
                                .clickable { },
                            elevation = CardDefaults.cardElevation()
                        ) {
                            Column(
                                modifier = Modifier.fillMaxSize(),
                                horizontalAlignment = Alignment.Start,
                                verticalArrangement = Arrangement.Center

                            ) {
                                Row (){
                                    Image(
                                        painter = painterResource(R.drawable.bug),
                                        contentDescription = "home",
                                        modifier = Modifier.width(50.dp).padding(start = 10.dp)
                                    )
                                    Spacer(modifier = Modifier.width(10.dp))

                                    Column () {
                                        Text(
                                            text = "Fix a bug in my Code!",
                                            fontSize = 15.sp,
                                            fontWeight = FontWeight.ExtraBold,
                                            fontFamily = FontFamily.Serif

                                        )

                                        Text(
                                            text = "Today .10am",
                                            fontSize = 10.sp
                                        )
                                        Text(
                                            text = "Today .1pm",
                                            fontSize = 10.sp
                                        )
                                    }


                                }




                            }


                        }

                        //End of Card1
                        Spacer(modifier = Modifier.width(8.dp))


                    }

                    //End of Row
                    //Row
                    Row(modifier = Modifier.padding(20.dp)) {

                        //Card1


                        Card(
                            modifier = Modifier
                                .width(400.dp)
                                .height(80.dp)
                                .clickable { },
                            elevation = CardDefaults.cardElevation()
                        ) {
                            Column(
                                modifier = Modifier.fillMaxSize(),
                                horizontalAlignment = Alignment.Start,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Row (){
                                    Image(
                                        painter = painterResource(R.drawable.projj),
                                        contentDescription = "home",
                                        modifier = Modifier.size(50.dp).padding(start = 10.dp)
                                    )
                                    Spacer(modifier = Modifier.width(10.dp))

                                    Column() {
                                        Text(
                                            text = "Finish my Latest Project",
                                            fontSize = 15.sp,
                                            fontWeight = FontWeight.ExtraBold,
                                            fontFamily = FontFamily.Serif

                                        )

                                        Text(
                                            text = "Today .10pm",
                                            fontSize = 10.sp
                                        )
                                    }


                                }
                            }


                        }

                        //End of Card1
                        Spacer(modifier = Modifier.width(20.dp))



                    }

                    //End of Row



                }

            }
        }
    )

    //End of scaffold



}





@Preview
@Composable
private fun My_Screenprev() {
    My_Screen(rememberNavController())

}