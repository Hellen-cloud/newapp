package com.hellena.onlineapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hellena.onlineapp.ui.theme.screens.home.Home_screen
import com.hellena.onlineapp.ui.theme.screens.login.Login_Screen
import com.hellena.onlineapp.ui.theme.screens.myapp.My_app_screen
import com.hellena.onlineapp.ui.theme.screens.register.Register_Screen
import com.hellena.onlineapp.ui.theme.screens.splash.SplashScreen

@Composable
fun Appnavhost(modifier: Modifier = Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination: String=ROUTE_SPLASH
) {
    NavHost(navController=navController,
        modifier=modifier,
        startDestination = startDestination){
        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }
        composable (ROUTE_REGISTER){
            Register_Screen(navController)

        }
        composable (ROUTE_HOME){
            Home_screen(navController)

        }
        composable (ROUTE_lOGIN){
            Login_Screen(navController)
        }

        composable(ROUTE_MYAPP) {
            My_app_screen(navController)
        }

    }


}

