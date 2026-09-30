package cl.duoc.aplicacionmovil.navigation

sealed class Routes(val route: String) {

    data object Login : Routes("login")

    data object Dashboard : Routes("dashboard")

    data object Clientes : Routes("clientes")

    data object Pedidos : Routes("pedidos")

    data object Ventas : Routes("ventas")

    data object Entregas : Routes("entregas")

    data object Perfil : Routes("perfil")
}