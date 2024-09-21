package com.example.mycomposepractice.firstPractice

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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

@Preview
@Composable
private fun FirstFunPrev() {
    MyComposePracticeTheme {
        Column {
            FirstFun()
            DynamicFun(name = "User")
        }
    }
}
