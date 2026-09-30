package cl.duoc.aplicacionmovil.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import cl.duoc.aplicacionmovil.ui.screens.DashboardScreen
import cl.duoc.aplicacionmovil.ui.screens.LoginScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.Login.route
    ) {

        composable(Routes.Login.route) {

            LoginScreen(
                onLogin = {
                    navController.navigate(Routes.Dashboard.route) {
                        popUpTo(Routes.Login.route) {
                            inclusive = true
                        }
                    }
                }
            )
        }

        composable(Routes.Dashboard.route) {

            DashboardScreen(
                onCerrarSesion = {
                    navController.navigate(Routes.Login.route) {
                        popUpTo(0)
                    }
                }
            )
        }
    }
}