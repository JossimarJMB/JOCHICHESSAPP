  package com.example.jochichessapp

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


  class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent=Intent(this,TorneoMenu ::class.java)
            startActivity(intent)
        }

        val button2=findViewById<Button>(R.id.button2)
            button2.setOnClickListener {
                val intent2=Intent(this,LeccionesMenu ::class.java)
                startActivity(intent2)
            }

        val button3=findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val intent3=Intent(this,EjerciciosMenu ::class.java)
            startActivity(intent3)
        }

    }
}
