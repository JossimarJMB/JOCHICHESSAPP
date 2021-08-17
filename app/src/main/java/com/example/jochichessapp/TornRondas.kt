package com.example.jochichessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_torn_rondas.*

class TornRondas : AppCompatActivity() {

    //Variable de número de participantes Global (pública)
    var nParticipantesG = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_torn_rondas)

        var spinner = findViewById<Spinner>(R.id.spinner1)
        //Un Array en recursos con valor de 4 a 32. (Selección de número de participantes)
        val lista = resources.getStringArray(R.array.arrayPart)
        //Se llena el spinner con los valores de la variable "lista"
        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, lista)
        spinner.adapter = adaptador
        spinner.onItemSelectedListener = object :

            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                //Mostrar selección de rondas si son 4 JUGADORES
                if (p2 == 0) {
                    tv_torneoRondas4.setVisibility(View.VISIBLE);
                    rb_torneoRondasx4.setVisibility(View.VISIBLE);
                    rb_torneoRondas4.setVisibility(View.VISIBLE);
                    rb_torneoRondas5.setVisibility(View.GONE);
                    rb_torneoRondas6.setVisibility(View.GONE);
                    rb_torneoRondas6.setChecked(false);
                    rb_torneoRondas5.setChecked(false);

                }
                //Mostrar selección de rondas si son 5 JUGADORES
                if (p2 == 1) {
                    tv_torneoRondas4.setVisibility(View.VISIBLE);
                    rb_torneoRondasx4.setVisibility(View.GONE);
                    rb_torneoRondas4.setVisibility(View.VISIBLE);
                    rb_torneoRondas5.setVisibility(View.VISIBLE);
                    rb_torneoRondas6.setVisibility(View.GONE);
                    rb_torneoRondas6.setChecked(false);
                    rb_torneoRondasx4.setChecked(false);

                }
                //Mostrar selección de rondas si son 6- 8 JUGADORES
                if (p2 in 2..4) {
                    tv_torneoRondas4.setVisibility(View.VISIBLE);
                    rb_torneoRondasx4.setVisibility(View.GONE);
                    rb_torneoRondas4.setVisibility(View.VISIBLE);
                    rb_torneoRondas5.setVisibility(View.VISIBLE);
                    rb_torneoRondas6.setVisibility(View.VISIBLE);
                    rb_torneoRondasx4.setChecked(false);
                }
                //Mostrar selección de rondas si son 9- 16 JUGADORES
                if (p2 in 5..12) {
                    tv_torneoRondas4.setVisibility(View.VISIBLE);
                    rb_torneoRondasx4.setVisibility(View.GONE);
                    rb_torneoRondas4.setVisibility(View.GONE);
                    rb_torneoRondas5.setVisibility(View.VISIBLE);
                    rb_torneoRondas6.setVisibility(View.VISIBLE);
                    rb_torneoRondas4.setChecked(false);
                    rb_torneoRondasx4.setChecked(false);
                }
                //Mostrar selección de rondas si son 17- 32 JUGADORES
                if (p2 in 13..28) {
                    tv_torneoRondas4.setVisibility(View.VISIBLE);
                    rb_torneoRondasx4.setVisibility(View.GONE);
                    rb_torneoRondas4.setVisibility(View.GONE);
                    rb_torneoRondas5.setVisibility(View.GONE);
                    rb_torneoRondas6.setVisibility(View.VISIBLE);

                    rb_torneoRondas5.setChecked(false);
                    rb_torneoRondas4.setChecked(false);
                    rb_torneoRondasx4.setChecked(false);
                }

                //For que da el valor de los participantes en el torneo según el spinner.
                for(num1 in 0..28) {
                    var num2=num1+4
                    if(p2==num1){
                        nParticipantesG= num2
                    }
                }
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }
    //Función que se ejecuta cuando se selecciona un RB en cada Grupo de RBs
    fun onRadioButtonClickedVal(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checkedVal = view.isChecked
            var nRondasT = 0

            // Check which radio button was clicked
            when (view.getId()) {

                //Guarda número de rondas en "nRondasT" según el RB seleccionado. (De 2 a 5 rondas)
                R.id.rb_torneoRondasx4 ->
                    if (checkedVal) {
                        nRondasT = 2
                    }
                R.id.rb_torneoRondas4 ->
                    if (checkedVal) {
                        nRondasT = 3
                    }
                R.id.rb_torneoRondas5 ->
                    if (checkedVal) {
                        nRondasT = 4
                    }
                R.id.rb_torneoRondas6 ->
                    if (checkedVal) {
                        nRondasT = 5
                    }

            }
        }
    }

    //Función que se ejecuta cuando se selecciona un botón.
    fun onButtonClicked(view: View) {
        //Variables de control
        var flagRondas: Int = 0
        var flagTorneo: Int = 0
        // la variable local nParticipantes, toma el valor del número de participantes.
        var nParticipantes: Int = nParticipantesG
        //Variable que hereda número de rondas seleccionadas.
        var nRondas: Int = 0
        //Imprime un error si no se ha escrito el nombre del torneo.
        if (et_tr1.text.toString().isEmpty()) {
            et_tr1.error = "Dale nombre a tu torneo, por favor"
        } else {
            flagTorneo = 1
        }
        //Define el número de rondas que se van a jugar.
        if (rb_torneoRondasx4.isChecked) {
            flagRondas = 1
            nRondas = 2
        }

        if (rb_torneoRondas4.isChecked) {
            flagRondas = 1
            nRondas = 3
        }
        if (rb_torneoRondas5.isChecked) {
            flagRondas = 1
            nRondas = 4
        }
        if (rb_torneoRondas6.isChecked) {
            flagRondas = 1
            nRondas = 5
        }

        //Si no se ha seleccionado el número de rondas, se lanza un mensaje de error con Toast
        if (flagRondas == 0) {
            Toast.makeText(this, "Selecciona el número de rondas", Toast.LENGTH_SHORT).show()
        }

        //Si el Nombre del torneo está lleno y las rondas seleccionadas, se toman los valores del
        //nombre del torneo, el número de participantes y el número de rondas.
        if (flagTorneo == 1 && flagRondas == 1) {
            val intent = Intent(this, TornRondas2::class.java)
            intent.putExtra("Nombre", et_tr1.text.toString())
            intent.putExtra("Participantes", nParticipantes.toString())
            intent.putExtra("Rondas", nRondas.toString())
            startActivity(intent)
        }
    }
}