package com.example.program_38_39

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<EditText>(R.id.etUsername)
        val password = findViewById<EditText>(R.id.etPassword)
        val loginBtn = findViewById<Button>(R.id.btnLogin)
        val regLayout = findViewById<LinearLayout>(R.id.registrationLayout)

        loginBtn.setOnClickListener {
            if (username.text.toString() == "admin" &&
                password.text.toString() == "admin") {

                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
                regLayout.visibility = View.VISIBLE
            } else {
                Toast.makeText(this, "Invalid Username or Password", Toast.LENGTH_SHORT).show()
            }
        }

        val name = findViewById<EditText>(R.id.etName)
        val mobile = findViewById<EditText>(R.id.etMobile)
        val address = findViewById<EditText>(R.id.etAddress)
        val genderGroup = findViewById<RadioGroup>(R.id.rgGender)
        val reading = findViewById<CheckBox>(R.id.cbReading)
        val music = findViewById<CheckBox>(R.id.cbMusic)
        val sports = findViewById<CheckBox>(R.id.cbSports)
        val submit = findViewById<Button>(R.id.btnSubmit)
        val result = findViewById<TextView>(R.id.tvResult)

        submit.setOnClickListener {
            val genderId = genderGroup.checkedRadioButtonId
            val gender = if (genderId != -1)
                findViewById<RadioButton>(genderId).text
            else "Not Selected"

            val hobbies = StringBuilder()
            if (reading.isChecked) hobbies.append("Reading ")
            if (music.isChecked) hobbies.append("Music ")
            if (sports.isChecked) hobbies.append("Sports ")

            result.text = """
                Name: ${name.text}
                Gender: $gender
                Mobile: ${mobile.text}
                Address: ${address.text}
                Hobbies: $hobbies
            """.trimIndent()
        }
    }
}
