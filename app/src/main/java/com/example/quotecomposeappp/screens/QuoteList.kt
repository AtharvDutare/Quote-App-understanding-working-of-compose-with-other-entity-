package com.example.quotecomposeappp.screens

import android.util.Log
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.quotecomposeappp.models.Quote

@Composable
fun QuoteList(data:Array<Quote>, onClick:()->Unit){

    LazyColumn(
        content = {
            items(data) {
                QuoteListItem(quote = it) {
                    onClick()
                }
            }
        }


    )
    Log.i("Debug","quote list is working")

}