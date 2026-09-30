package cl.duoc.aplicacionmovil.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocalShipping
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import cl.duoc.aplicacionmovil.navigation.Routes

@Composable
fun BottomNavigationBar(
    navController: NavController
) {

    val currentRoute =
        navController.currentBackStackEntryAsState().value?.destination?.route

    NavigationBar {

        NavigationBarItem(
            selected = currentRoute == Routes.Dashboard.route,
            onClick = {
                navController.navigate(Routes.Dashboard.route) {
                    launchSingleTop = true
                }
            },
            icon = {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Inicio"
                )
            },
            label = {
                Text("Inicio")
            }
        )

        NavigationBarItem(
            selected = currentRoute == Routes.Clientes.route,
            onClick = {
                navController.navigate(Routes.Clientes.route) {
                    launchSingleTop = true
                }
            },
            icon = {
                Icon(
                    imageVector = Icons.Default.People,
                    contentDescription = "Clientes"
                )
            },
            label = {
                Text("Clientes")
            }
        )

        NavigationBarItem(
            selected = currentRoute == Routes.Pedidos.route,
            onClick = {
                navController.navigate(Routes.Pedidos.route) {
                    launchSingleTop = true
                }
            },
            icon = {
                Icon(
                    imageVector = Icons.Default.ShoppingCart,
                    contentDescription = "Pedidos"
                )
            },
            label = {
                Text("Pedidos")
            }
        )

        NavigationBarItem(
            selected = currentRoute == Routes.Entregas.route,
            onClick = {
                navController.navigate(Routes.Entregas.route) {
                    launchSingleTop = true
                }
            },
            icon = {
                Icon(
                    imageVector = Icons.Default.LocalShipping,
                    contentDescription = "Entregas"
                )
            },
            label = {
                Text("Entregas")
            }
        )

        NavigationBarItem(
            selected = currentRoute == Routes.Perfil.route,
            onClick = {
                navController.navigate(Routes.Perfil.route) {
                    launchSingleTop = true
                }
            },
            icon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Perfil"
                )
            },
            label = {
                Text("Perfil")
            }
        )
    }
}