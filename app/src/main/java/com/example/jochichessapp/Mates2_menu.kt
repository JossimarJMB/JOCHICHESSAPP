package com.example.jochichessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Mates2_menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mates2_menu)

        val b1 = findViewById<Button>(R.id.b1)
        b1.setOnClickListener {

            val intent = Intent(this, Ejercicios_mates2 ::class.java)
            intent.putExtra("Control2", "1")
            startActivity(intent)

        }

        val b2 = findViewById<Button>(R.id.b2)
        b2.setOnClickListener {

            val intent = Intent(this, Ejercicios_mates2 ::class.java)
            intent.putExtra("Control2", "2")
            startActivity(intent)
        }

        val b3 = findViewById<Button>(R.id.b3)
        b3.setOnClickListener {
            val intent = Intent(this, Ejercicios_mates2 ::class.java)
            intent.putExtra("Control2", "3")
            startActivity(intent)

        }

        val b4 = findViewById<Button>(R.id.b4)
        b4.setOnClickListener {
            val intent = Intent(this, Ejercicios_mates2 ::class.java)
            intent.putExtra("Control2", "4")
            startActivity(intent)

        }

        val b5 = findViewById<Button>(R.id.b5)
        b5.setOnClickListener {
            val intent = Intent(this, Ejercicios_mates2 ::class.java)
            intent.putExtra("Control2", "5")

            startActivity(intent)
        }

        val b6 = findViewById<Button>(R.id.b6)
        b6.setOnClickListener {

            val intent = Intent(this, Ejercicios_mates2 ::class.java)
            intent.putExtra("Control2", "6")
            startActivity(intent)
        }

        val b7 = findViewById<Button>(R.id.b7)
        b7.setOnClickListener {
            val intent = Intent(this, Ejercicios_mates2 ::class.java)
            intent.putExtra("Control2", "7")
            startActivity(intent)

        }

        val b8 = findViewById<Button>(R.id.b8)
        b8.setOnClickListener {
            val intent = Intent(this, Ejercicios_mates2 ::class.java)
            intent.putExtra("Control2", "8")
            startActivity(intent)

        }

        val b9 = findViewById<Button>(R.id.b9)
        b9.setOnClickListener {
            val intent = Intent(this, Ejercicios_mates2 ::class.java)
            intent.putExtra("Control2", "9")
            startActivity(intent)

        }

        val b10 = findViewById<Button>(R.id.b10)
        b10.setOnClickListener {
            val intent = Intent(this, Ejercicios_mates2::class.java)
            intent.putExtra("Control2", "10")
            startActivity(intent)

        }

    }
}