package com.example.jochichessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Ventaja_des : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventaja_des)

        val b1 = findViewById<Button>(R.id.b1)
        b1.setOnClickListener {

            val intent = Intent(this, Ejercicios_ventaja ::class.java)
            intent.putExtra("Control4", "1")
            startActivity(intent)

        }

        val b2 = findViewById<Button>(R.id.b2)
        b2.setOnClickListener {

            val intent = Intent(this, Ejercicios_ventaja ::class.java)
            intent.putExtra("Control4", "2")
            startActivity(intent)
        }

        val b3 = findViewById<Button>(R.id.b3)
        b3.setOnClickListener {
            val intent = Intent(this, Ejercicios_ventaja ::class.java)
            intent.putExtra("Control4", "3")
            startActivity(intent)

        }

        val b4 = findViewById<Button>(R.id.b4)
        b4.setOnClickListener {
            val intent = Intent(this, Ejercicios_ventaja ::class.java)
            intent.putExtra("Control4", "4")
            startActivity(intent)

        }

        val b5 = findViewById<Button>(R.id.b5)
        b5.setOnClickListener {
            val intent = Intent(this, Ejercicios_ventaja ::class.java)
            intent.putExtra("Control4", "5")

            startActivity(intent)
        }

        val b6 = findViewById<Button>(R.id.b6)
        b6.setOnClickListener {

            val intent = Intent(this, Ejercicios_ventaja ::class.java)
            intent.putExtra("Control4", "6")
            startActivity(intent)
        }

        val b7 = findViewById<Button>(R.id.b7)
        b7.setOnClickListener {
            val intent = Intent(this, Ejercicios_ventaja ::class.java)
            intent.putExtra("Control4", "7")
            startActivity(intent)

        }

        val b8 = findViewById<Button>(R.id.b8)
        b8.setOnClickListener {
            val intent = Intent(this, Ejercicios_ventaja ::class.java)
            intent.putExtra("Control4", "8")
            startActivity(intent)

        }

        val b9 = findViewById<Button>(R.id.b9)
        b9.setOnClickListener {
            val intent = Intent(this, Ejercicios_ventaja ::class.java)
            intent.putExtra("Control4", "9")
            startActivity(intent)

        }

        val b10 = findViewById<Button>(R.id.b10)
        b10.setOnClickListener {
            val intent = Intent(this, Ejercicios_ventaja::class.java)
            intent.putExtra("Control4", "10")
            startActivity(intent)

        }

        val b11 = findViewById<Button>(R.id.b11)
        b11.setOnClickListener {

            val intent = Intent(this, Ejercicios_ventaja ::class.java)
            intent.putExtra("Control4", "11")
            startActivity(intent)

        }

        val b12 = findViewById<Button>(R.id.b12)
        b12.setOnClickListener {

            val intent = Intent(this, Ejercicios_ventaja ::class.java)
            intent.putExtra("Control4", "12")
            startActivity(intent)
        }

        val b13 = findViewById<Button>(R.id.b13)
        b13.setOnClickListener {
            val intent = Intent(this, Ejercicios_ventaja ::class.java)
            intent.putExtra("Control4", "13")
            startActivity(intent)

        }

        val b14 = findViewById<Button>(R.id.b14)
        b14.setOnClickListener {
            val intent = Intent(this, Ejercicios_ventaja ::class.java)
            intent.putExtra("Control4", "14")
            startActivity(intent)

        }

        val b15 = findViewById<Button>(R.id.b15)
        b15.setOnClickListener {
            val intent = Intent(this, Ejercicios_ventaja ::class.java)
            intent.putExtra("Control4", "15")

            startActivity(intent)
        }

        val b16 = findViewById<Button>(R.id.b16)
        b16.setOnClickListener {

            val intent = Intent(this, Ejercicios_ventaja ::class.java)
            intent.putExtra("Control4", "16")
            startActivity(intent)
        }

        val b17 = findViewById<Button>(R.id.b17)
        b17.setOnClickListener {
            val intent = Intent(this, Ejercicios_ventaja ::class.java)
            intent.putExtra("Control4", "17")
            startActivity(intent)

        }

        val b18 = findViewById<Button>(R.id.b18)
        b18.setOnClickListener {
            val intent = Intent(this, Ejercicios_ventaja ::class.java)
            intent.putExtra("Control4", "18")
            startActivity(intent)

        }

        val b19 = findViewById<Button>(R.id.b19)
        b19.setOnClickListener {
            val intent = Intent(this, Ejercicios_ventaja ::class.java)
            intent.putExtra("Control4", "19")
            startActivity(intent)

        }

        val b20 = findViewById<Button>(R.id.b20)
        b20.setOnClickListener {
            val intent = Intent(this, Ejercicios_ventaja::class.java)
            intent.putExtra("Control4", "20")
            startActivity(intent)

        }
    }
}