package com.example.jochichessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EjerciciosMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicios_menu)

        val b1 = findViewById<Button>(R.id.b1)
        b1.setOnClickListener {
            val intent1 = Intent(this, Mates1_menu ::class.java)
            startActivity(intent1)
        }

        val b2 = findViewById<Button>(R.id.b2)
        b2.setOnClickListener {
            val intent2 = Intent(this, Mates2_menu::class.java)
            startActivity(intent2)
        }
        val b3 = findViewById<Button>(R.id.b3)
        b3.setOnClickListener {
            val intent3 = Intent(this, Mates3_menu ::class.java)
            startActivity(intent3)
        }
        val b4 = findViewById<Button>(R.id.b4)
        b4.setOnClickListener {
            val intent4 = Intent(this, Ventaja_des ::class.java)
            startActivity(intent4)
        }






    }




}
