package com.vishal2376.jcquoteapp

import android.content.Context
import com.google.gson.Gson
import com.vishal2376.jcquoteapp.models.Quote

object DataManager {

    var data = emptyArray<Quote>()

    fun loadAssetsFromFile(context: Context) {
        context.assets.open("quotes.json").use { inputStream ->
            val json = inputStream.bufferedReader().use { it.readText() }
            data = Gson().fromJson(json, Array<Quote>::class.java)
        }
    }

}