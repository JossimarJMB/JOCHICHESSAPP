package com.example.jochichessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_torn_rondas.*

class TorneoMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_torneo_menu)

        val buttonL1 = findViewById<Button>(R.id.buttonT1)
        buttonL1.setOnClickListener {
            val intentT1 = Intent(this, TornRondas::class.java)
            startActivity(intentT1)
        }

        val buttonL2 = findViewById<Button>(R.id.buttonT2)
        buttonL2.setOnClickListener {
            val intentT2 = Intent(this, TornRobin::class.java)
            startActivity(intentT2)
        }


    }

}
