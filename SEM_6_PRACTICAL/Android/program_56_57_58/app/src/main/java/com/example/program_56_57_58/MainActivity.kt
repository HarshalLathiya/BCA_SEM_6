package com.example.program_56_57_58

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOk = findViewById<Button>(R.id.btnOk)
        val btnYesNo = findViewById<Button>(R.id.btnYesNo)
        val btnOkCancel = findViewById<Button>(R.id.btnOkCancel)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        // Program 56 - OK only
        btnOk.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
            dialog.setTitle("Alert")
            dialog.setMessage("This is OK only dialog")
            dialog.setNeutralButton("OK") { _, _ ->
                txtResult.text = "Ok button is Clicked"
            }
            dialog.show()
        }

        // Program 57 - Yes / No
        btnYesNo.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
            dialog.setTitle("Alert")
            dialog.setMessage("This is Yes No dialog")
            dialog.setPositiveButton("Yes") { _, _ ->
                txtResult.text = "Yes button is Clicked"
            }
            dialog.setNegativeButton("No") { _, _ ->
                txtResult.text = "No button is Clicked"
            }
            dialog.show()
        }

        // Program 58 - OK / Cancel
        btnOkCancel.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
            dialog.setTitle("Alert")
            dialog.setMessage("This is OK Cancel dialog")
            dialog.setPositiveButton("OK") { _, _ ->
                txtResult.text = "Ok button is Clicked"
            }
            dialog.setNegativeButton("Cancel") { _, _ ->
                txtResult.text = "Cancel button is Clicked"
            }
            dialog.show()
        }
    }
}
