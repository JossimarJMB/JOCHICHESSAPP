package com.example.jochichessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_torn_rondas.*

class Mates1_menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mates1_menu)

        val b1 = findViewById<Button>(R.id.b1)
        b1.setOnClickListener {
            val intent = Intent(this, Ejercicios_mates1 ::class.java)
            intent.putExtra("Control", "1")
            startActivity(intent)
        }
        val b2 = findViewById<Button>(R.id.b2)
        b2.setOnClickListener {
            val intent = Intent(this, Ejercicios_mates1 ::class.java)
            intent.putExtra("Control", "2")
            startActivity(intent)
        }
        val b3 = findViewById<Button>(R.id.b3)
        b3.setOnClickListener {
            val intent = Intent(this, Ejercicios_mates1 ::class.java)
            intent.putExtra("Control", "3")
            startActivity(intent)
        }
        val b4 = findViewById<Button>(R.id.b4)
        b4.setOnClickListener {
            val intent = Intent(this, Ejercicios_mates1 ::class.java)
            intent.putExtra("Control", "4")
            startActivity(intent)
        }

        val b5 = findViewById<Button>(R.id.b5)
        b5.setOnClickListener {
            val intent = Intent(this, Ejercicios_mates1 ::class.java)
            intent.putExtra("Control", "5")

            startActivity(intent)
        }

        val b6 = findViewById<Button>(R.id.b6)
        b6.setOnClickListener {

            val intent = Intent(this, Ejercicios_mates1 ::class.java)
            intent.putExtra("Control", "6")
            startActivity(intent)
        }

        val b7 = findViewById<Button>(R.id.b7)
        b7.setOnClickListener {
            val intent = Intent(this, Ejercicios_mates1 ::class.java)
            intent.putExtra("Control", "7")
            startActivity(intent)

        }

        val b8 = findViewById<Button>(R.id.b8)
        b8.setOnClickListener {
            val intent = Intent(this, Ejercicios_mates1 ::class.java)
            intent.putExtra("Control", "8")
            startActivity(intent)

        }

        val b9 = findViewById<Button>(R.id.b9)
        b9.setOnClickListener {
            val intent = Intent(this, Ejercicios_mates1 ::class.java)
            intent.putExtra("Control", "9")
            startActivity(intent)

        }

        val b10 = findViewById<Button>(R.id.b10)
        b10.setOnClickListener {
            val intent = Intent(this, Ejercicios_mates1::class.java)
            intent.putExtra("Control", "10")
            startActivity(intent)

        }



    }
}