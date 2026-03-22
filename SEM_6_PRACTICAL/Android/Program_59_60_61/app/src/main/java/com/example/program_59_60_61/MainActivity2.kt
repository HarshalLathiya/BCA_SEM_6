package com.example.program_59_60_61

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)   // ✅ correct layout

        val txtHello = findViewById<TextView>(R.id.txtHello)
        val txtName = findViewById<TextView>(R.id.txtName)

        val name = intent.getStringExtra("username")

        txtHello.text = "Hello"
        txtName.text = name
    }
}
