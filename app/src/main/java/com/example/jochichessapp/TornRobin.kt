package com.example.jochichessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_torn_rondas.*

class TornRobin : AppCompatActivity() {
    var nParticipantesG = 0
    var nRondasG = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_torn_robin)

        var spinner = findViewById<Spinner>(R.id.spinner1)

        //Un Array en recursos con valor de 4 a 32. (Selección de número de participantes)
        val lista = resources.getStringArray(R.array.arrayPart2)

        //Se llena el spinner con los valores de la variable "lista"
        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, lista)
        spinner.adapter = adaptador
        spinner.onItemSelectedListener = object :

            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                //Mostrar selección de rondas si son 4 JUGADORES
                if (p2 == 0) {
                    nRondasG = 3
                    nParticipantesG = 4
                }
                if (p2 == 1) {
                    nRondasG = 4
                    nParticipantesG = 5

                }
                if (p2 == 2) {
                    nRondasG = 5
                    nParticipantesG = 6

                }



            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

    }




    //Función que se ejecuta cuando se selecciona un botón.
    fun onButtonClicked(view: View) {
        //Se le da el valor a nombreTorneo del Edit Text 1
        var nombreTorneo: String = et_tr1.text.toString()
        //Variables de control
        var flagTorneo: Int = 0
        // la variable local nParticipantes, toma el valor del número de participantes.
        var nParticipantes: Int = nParticipantesG
        //Variable que hereda número de rondas seleccionadas.
        var nRondas = nRondasG

        //Imprime un error si no se ha escrito el nombre del torneo.
        if (et_tr1.text.toString().isEmpty()) {
            et_tr1.error = "Dale nombre a tu torneo, por favor"
        } else {
            flagTorneo = 1
        }

        //Si el Nombre del torneo está lleno y las rondas seleccionadas, se toman los valores del
        //nombre del torneo, el número de participantes y el número de rondas.
        if (flagTorneo == 1) {
            val intent = Intent(this, TornRobin2::class.java)
            intent.putExtra("Nombre", et_tr1.text.toString())
            intent.putExtra("Participantes", nParticipantes.toString())
            intent.putExtra("Rondas", nRondas.toString())
            startActivity(intent)
        }


    }

}