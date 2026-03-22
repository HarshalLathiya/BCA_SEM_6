package com.example.program_32_37

import android.os.Bundle
import android.widget.*
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Program 34: Display Name using Kotlin
        val txtName = findViewById<TextView>(R.id.txtName)
        txtName.text = "My Name is Prof.Nilesh"

        //Program 36: Merge Two Strings
        val edt1 = findViewById<EditText>(R.id.edtString1)
        val edt2 = findViewById<EditText>(R.id.edtString2)
        val btnMerge = findViewById<Button>(R.id.btnMerge)

        btnMerge.setOnClickListener {
            val mergedText = edt1.text.toString() + " " + edt2.text.toString()
            Toast.makeText(this, mergedText, Toast.LENGTH_SHORT).show()
        }

        //Program 35: Toast "Saurashtra University"
        val btnToast = findViewById<Button>(R.id.btnToast)
        btnToast.setOnClickListener {
            Toast.makeText(
                this,
                getString(R.string.university),
                Toast.LENGTH_SHORT
            ).show()
        }

        //Program 37: Button Click Display
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        btn1.setOnClickListener {
            txtResult.text = "Button 1 is Clicked"
        }

        btn2.setOnClickListener {
            txtResult.text = "Button 2 is Clicked"
        }
    }
}
