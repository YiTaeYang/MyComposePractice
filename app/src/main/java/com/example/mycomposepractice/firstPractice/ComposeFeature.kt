package com.example.mycomposepractice.firstPractice

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.mycomposepractice.ui.theme.MyComposePracticeTheme

@Composable
fun FirstFun() {
    Text(text = "Hello Jetpack Compose!")
}

@Composable
fun DynamicFun(name: String) {
    Text(text = "Hello $name")
}

@Composable
fun InteractFun(inputData: Int, outputEvent: ()-> Unit) {
    Button(onClick = outputEvent) {
        Text(text =
        if (inputData == 0)
            "Click me, User"
        else
            "You(User) clicked me $inputData times"
        )
    }
}

@Preview
@Composable
private fun Previews() {
    MyComposePracticeTheme {
        var clickCount by remember { mutableIntStateOf(0) }
        Column {
            FirstFun()
            DynamicFun(name = "User")
            InteractFun(inputData = clickCount, outputEvent = {
                clickCount++
            })
        }
    }
}
