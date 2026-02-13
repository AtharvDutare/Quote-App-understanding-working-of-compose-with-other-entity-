package com.example.quotecomposeappp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.quotecomposeappp.screens.QuoteList
import com.example.quotecomposeappp.screens.QuoteListItem

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuoteList(DataManager.data, onClick = {})
        }
    }
}
