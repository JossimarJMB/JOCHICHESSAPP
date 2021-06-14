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
            val intentoL1 = Intent(this, lecc_intro::class.java)
            startActivity(intentoL1)
        }

        val buttonL2 = findViewById<Button>(R.id.buttonL2)
        buttonL2.setOnClickListener {
            val intentoL2 = Intent(this, Lecc_conceptos::class.java)
            startActivity(intentoL2)
        }

        val buttonL3 = findViewById<Button>(R.id.buttonL3)
        buttonL3.setOnClickListener {
            val intentoL3 = Intent(this, Lecc_resp_amenazas::class.java)
            startActivity(intentoL3)
        }

        val buttonL4 = findViewById<Button>(R.id.buttonL4)
        buttonL4.setOnClickListener {
            val intentoL4 = Intent(this, LeccAtqDoble::class.java)
            startActivity(intentoL4)
        }

        val buttonL5 = findViewById<Button>(R.id.buttonL5)
        buttonL5.setOnClickListener {
            val intentoL5 = Intent(this, LeccAtqDesc::class.java)
            startActivity(intentoL5)
        }

        val buttonL6 = findViewById<Button>(R.id.buttonL6)
        buttonL6.setOnClickListener {
            val intentoL6 = Intent(this, LeccClavada::class.java)
            startActivity(intentoL6)
        }

        val buttonL7 = findViewById<Button>(R.id.buttonL7)
        buttonL7.setOnClickListener {
            val intentoL7 = Intent(this, LeccAtqRayX::class.java)
            startActivity(intentoL7)
        }

        val buttonL8 = findViewById<Button>(R.id.buttonL8)
        buttonL8.setOnClickListener {
            val intentoL8 = Intent(this, LeccDesviacion::class.java)
            startActivity(intentoL8)
        }

        val buttonL9 = findViewById<Button>(R.id.buttonL9)
        buttonL9.setOnClickListener {
            val intentoL9 = Intent(this, LeccAtraccion::class.java)
            startActivity(intentoL9)
        }
    }
}
