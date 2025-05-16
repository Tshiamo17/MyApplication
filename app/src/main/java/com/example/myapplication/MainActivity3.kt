package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //array for question

            val question = arrayOf(
                "Q1-the great wall of china was build around the same time as the Roman Empire ?",
                "Q2-Nelson mandel was the first black president in south africa",
                "Q3-South africa was the British colony",
                "Q4-World II was ended in 2000",
                "Q5-Nelson mandela was the presidant in 1994"
            )

            val answers = arrayOf("False", "True", "True", "False", "True")

            var score = 0


            var user_response = arrayOf("")

            Column {
                for (i in 0..4)
                    for (Q1 in question) {

                        Text(
                            text = " History quiz",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Black
                        )

                    }
                Column {


                    Column {

                        Text(text = "score: $score")
                        Row {
                            Button(onClick = {/*TODO*/ }) {
                                Text(text = "true")//make button respond when clicked
                                Button(onClick = {/*TODO*/ }) {
                                    Text(text = "False")//make button respond when clicked }
                                }
                            }
                        }
                        Text(text = "score: $score")
                    }

                }
            }
        }

    }
}