package com.example.program_40_42

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Calculator
        val n1 = findViewById<EditText>(R.id.num1)
        val n2 = findViewById<EditText>(R.id.num2)
        val resultCalc = findViewById<TextView>(R.id.resultCalc)

        findViewById<Button>(R.id.btnAdd).setOnClickListener {
            val res = n1.text.toString().toDouble() + n2.text.toString().toDouble()
            resultCalc.text = "Result: $res"
        }

        findViewById<Button>(R.id.btnSub).setOnClickListener {
            val res = n1.text.toString().toDouble() - n2.text.toString().toDouble()
            resultCalc.text = "Result: $res"
        }

        findViewById<Button>(R.id.btnMul).setOnClickListener {
            val res = n1.text.toString().toDouble() * n2.text.toString().toDouble()
            resultCalc.text = "Result: $res"
        }

        findViewById<Button>(R.id.btnDiv).setOnClickListener {
            val res = n1.text.toString().toDouble() / n2.text.toString().toDouble()
            resultCalc.text = "Result: $res"
        }

        // Marks
        val m1 = findViewById<EditText>(R.id.m1)
        val m2 = findViewById<EditText>(R.id.m2)
        val m3 = findViewById<EditText>(R.id.m3)
        val resultMarks = findViewById<TextView>(R.id.resultMarks)

        findViewById<Button>(R.id.btnMarks).setOnClickListener {
            val total = m1.text.toString().toInt() +
                    m2.text.toString().toInt() +
                    m3.text.toString().toInt()
            val per = total / 3.0
            resultMarks.text = "Total: $total\nPercentage: $per"
        }

        // Simple Interest
        val p = findViewById<EditText>(R.id.principal)
        val r = findViewById<EditText>(R.id.rate)
        val t = findViewById<EditText>(R.id.time)
        val resultSI = findViewById<TextView>(R.id.resultSI)

        findViewById<Button>(R.id.btnSI).setOnClickListener {
            val si = (p.text.toString().toDouble() *
                    r.text.toString().toDouble() *
                    t.text.toString().toDouble()) / 100
            resultSI.text = "Simple Interest: $si"
        }
    }
}
