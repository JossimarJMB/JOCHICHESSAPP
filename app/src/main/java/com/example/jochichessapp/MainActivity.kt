  package com.example.jochichessapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


  class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intento=Intent(this,TorneoMenu ::class.java)
            startActivity(intento)
        }

        val button2=findViewById<Button>(R.id.button2)
            button2.setOnClickListener {
                val intento2=Intent(this,LeccionesMenu ::class.java)
                startActivity(intento2)
            }

        val button3=findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val intento3=Intent(this,EjerciciosMenu ::class.java)
            startActivity(intento3)
        }

    }
}
