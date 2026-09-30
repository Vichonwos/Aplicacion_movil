package cl.duoc.aplicacionmovil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import cl.duoc.aplicacionmovil.navigation.AppNavigation
import cl.duoc.aplicacionmovil.ui.theme.Aplicacion_movilTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Aplicacion_movilTheme {
                AppNavigation()
            }
        }
    }
}