package br.edu.up.start

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.edu.up.start.ui.theme.AppComposeStartTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppComposeStartTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Card("Título do Cartão...")
                }
            }
        }
    }

    @Preview
    @Composable
    fun CardPreview() {
        AppComposeStartTheme {
            Surface(modifier = Modifier.fillMaxSize()) {
                Card("Título do Cartão...")
            }
        }
    }

    @Composable
    fun Card(titulo : String) {

        Row {
            Image(
                painter = painterResource(id = R.drawable.compose),
                contentDescription = "Logo do compose",
                modifier = Modifier.size(40.dp)
            )

            Column {
                Text(
                    text = titulo,
                    color = Color(83, 11, 218, 255),
                    fontSize = 20.sp
                )
                Text("Um outro texto.")
                Text(text = "Mais um texto...")
            }
        }
    }
}