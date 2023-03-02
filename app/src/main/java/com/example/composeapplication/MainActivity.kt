package com.example.composeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapplication.ui.composable.DropDownView
import com.example.composeapplication.ui.viewModel.LaunchedEffectViewModel

class MainActivity : ComponentActivity() {

    private val viewModel: LaunchedEffectViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            val painter = painterResource(id = R.drawable.ic_birthday)

//            val description = "It's my birthday"

//            val title = "Hello, today is my birthday!!!"
//                ImageCard(
//                    painter = painter,
//                    contentDescription = description,
//                    title = title
//                )
//            }

//            TextStyled(text = "Hello, I'm styled text. I'm glad to see you")

//            ColorBox(Modifier.fillMaxSize())

//            SnackBarView(message = "Please enter your name")

//            ColumnList(size = 30)

//            ConstraintView()

//            LaunchedEffect(key1 = true) {
//                viewModel.sharedFlow.collect {
//                    when (it) {
//                        is ScreenEvents.ShowSnackBar -> {
//
//                        }
//                        is ScreenEvents.Navigate -> {
//
//                        }
//                    }
//                }
//            }

//            BoxAnimation()

//            ProgressBarComposable(percentage = 0.8f, number = 100)

//            DisplayMusic()

//            Surface(color = Color(0xFF101010), modifier = Modifier.fillMaxSize()) {
//                Box(contentAlignment = Alignment.Center) {
//                    TimerView(
//                        totalTime = 100L * 1000L,
//                        handleColor = Color.Green,
//                        activeBarColor = Color(0xFF37B900),
//                        inactiveBarColor = Color.DarkGray,
//                        modifier = Modifier.size(200.dp)
//                    )
//                }
//            }
            Surface(color = Color(0xFF101010), modifier = Modifier.fillMaxSize()) {
                DropDownView(text = "Hello, Mal", modifier = Modifier.padding(15.dp)) {
                    Text(
                        text = "How is your mother, she is fine thanks",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .background(Color.Green)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Greeting("Mama")
}