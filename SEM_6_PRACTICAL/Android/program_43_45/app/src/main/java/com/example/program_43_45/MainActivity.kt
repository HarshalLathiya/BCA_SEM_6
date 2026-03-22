package com.example.program_43_45

import android.graphics.Color
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainLayout = findViewById<LinearLayout>(R.id.mainLayout)

        // Program 43 - Gender Toast
        val genderGroup = findViewById<RadioGroup>(R.id.genderGroup)
        genderGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.rbMale ->
                    Toast.makeText(this, "Male is Radio Button", Toast.LENGTH_SHORT).show()
                R.id.rbFemale ->
                    Toast.makeText(this, "Female is Radio Button", Toast.LENGTH_SHORT).show()
            }
        }

        // Program 44 - Change Color
        val colorGroup = findViewById<RadioGroup>(R.id.colorGroup)
        colorGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.red -> mainLayout.setBackgroundColor(Color.RED)
                R.id.green -> mainLayout.setBackgroundColor(Color.GREEN)
                R.id.blue -> mainLayout.setBackgroundColor(Color.BLUE)
            }
        }

        // Program 45 - Change Image
        val imageGroup = findViewById<RadioGroup>(R.id.imageGroup)
        imageGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.img1 -> mainLayout.setBackgroundResource(R.drawable.flag)
                R.id.img2 -> mainLayout.setBackgroundResource(R.drawable.bhagat_singh)
                R.id.img3 -> mainLayout.setBackgroundResource(R.drawable.swami_vivekananda)
                R.id.img4 -> mainLayout.setBackgroundResource(R.drawable.virat_kohli)
                R.id.img5 -> mainLayout.setBackgroundResource(R.drawable.hardik_pandya)

            }
        }
    }
}
