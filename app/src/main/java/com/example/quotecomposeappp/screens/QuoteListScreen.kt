package com.example.quotecomposeappp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.quotecomposeappp.R
import com.example.quotecomposeappp.models.Quote


@Composable
fun QuoteListScreen(data:Array<Quote>,onClick:(quote: Quote?)->Unit) {
    Card() {
        Column() {
            Text(
                text = "Quotes App",
                modifier = Modifier
                    .padding(start = 20.dp, top = 50.dp, bottom = 20.dp)
                    .fillMaxWidth(1f),
                style = MaterialTheme.typography.titleLarge
            )
            QuoteList(data=data,onClick)
        }
    }
}