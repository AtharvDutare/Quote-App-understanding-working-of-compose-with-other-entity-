package com.example.quotecomposeappp

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.example.quotecomposeappp.models.Quote
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName

object DataManager {

    var data = emptyArray<Quote>()
    var isDataLoaded= mutableStateOf(false)
    private class QuotesWrapper(
        @SerializedName("quotes") val quotes: Array<Quote>
    )

    fun loadAssetsFromFile(context: Context) {
        try {
            val inputStream = context.assets.open("quotes.json")
            val size = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()
            val json = String(buffer, Charsets.UTF_8)
            val gson = Gson()
            val wrapper = gson.fromJson(json, QuotesWrapper::class.java)
            data = wrapper?.quotes ?: emptyArray()
            isDataLoaded.value=true
        } catch (e: Exception) {
            data = emptyArray()
            isDataLoaded.value=false
        }
    }
}