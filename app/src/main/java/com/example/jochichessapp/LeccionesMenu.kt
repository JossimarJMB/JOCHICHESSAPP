package com.example.jochichessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LeccionesMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lecciones_menu)

        val buttonL1 = findViewById<Button>(R.id.buttonL1)
        buttonL1.setOnClickListener {
            val intentL1 = Intent(this, lecc_intro::class.java)
            startActivity(intentL1)
        }

        val buttonL2 = findViewById<Button>(R.id.buttonL2)
        buttonL2.setOnClickListener {
            val intentL2 = Intent(this, Lecc_conceptos::class.java)
            startActivity(intentL2)
        }

        val buttonL3 = findViewById<Button>(R.id.buttonL3)
        buttonL3.setOnClickListener {
            val intentL3 = Intent(this, Lecc_resp_amenazas::class.java)
            startActivity(intentL3)
        }

        val buttonL4 = findViewById<Button>(R.id.buttonL4)
        buttonL4.setOnClickListener {
            val intentL4 = Intent(this, LeccAtqDoble::class.java)
            startActivity(intentL4)
        }

        val buttonL5 = findViewById<Button>(R.id.buttonL5)
        buttonL5.setOnClickListener {
            val intentL5 = Intent(this, LeccAtqDesc::class.java)
            startActivity(intentL5)
        }

        val buttonL6 = findViewById<Button>(R.id.buttonL6)
        buttonL6.setOnClickListener {
            val intentL6 = Intent(this, LeccClavada::class.java)
            startActivity(intentL6)
        }

        val buttonL7 = findViewById<Button>(R.id.buttonL7)
        buttonL7.setOnClickListener {
            val intentL7 = Intent(this, LeccAtqRayX::class.java)
            startActivity(intentL7)
        }

        val buttonL8 = findViewById<Button>(R.id.buttonL8)
        buttonL8.setOnClickListener {
            val intentL8 = Intent(this, LeccDesviacion::class.java)
            startActivity(intentL8)
        }

        val buttonL9 = findViewById<Button>(R.id.buttonL9)
        buttonL9.setOnClickListener {
            val intentL9 = Intent(this, LeccAtraccion::class.java)
            startActivity(intentL9)
        }
    }
}
