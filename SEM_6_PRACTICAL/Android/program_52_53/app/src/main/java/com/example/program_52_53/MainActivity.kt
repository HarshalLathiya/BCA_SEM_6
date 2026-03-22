package com.example.program_52_53

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.MultiAutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cities = resources.getStringArray(R.array.cities)

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_dropdown_item_1line,
            cities
        )

        // Program 52
        val autoCity = findViewById<AutoCompleteTextView>(R.id.autoCity)
        autoCity.setAdapter(adapter)

        // Program 53
        val multiCity = findViewById<MultiAutoCompleteTextView>(R.id.multiCity)
        multiCity.setAdapter(adapter)
        multiCity.setTokenizer(MultiAutoCompleteTextView.CommaTokenizer())
    }
}
