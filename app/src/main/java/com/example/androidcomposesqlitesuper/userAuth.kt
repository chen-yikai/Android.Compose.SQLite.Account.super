package com.example.androidcomposesqlitesuper

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class userAuth : ViewModel() {
    var starterScreen = mutableStateOf("signin")

    fun changeStarterScreen(screen: String) {
        starterScreen.value = screen
    }
}
