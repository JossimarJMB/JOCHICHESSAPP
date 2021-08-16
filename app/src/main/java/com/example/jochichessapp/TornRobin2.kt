package com.example.jochichessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_torn_robin2.*
import kotlinx.android.synthetic.main.activity_torn_rondas2.*
import kotlinx.android.synthetic.main.activity_torn_rondas2.btr1
import kotlinx.android.synthetic.main.activity_torn_rondas2.et_par1
import kotlinx.android.synthetic.main.activity_torn_rondas2.et_par2
import kotlinx.android.synthetic.main.activity_torn_rondas2.et_par3
import kotlinx.android.synthetic.main.activity_torn_rondas2.et_par4
import kotlinx.android.synthetic.main.activity_torn_rondas2.et_par5
import kotlinx.android.synthetic.main.activity_torn_rondas2.et_par6
import kotlinx.android.synthetic.main.activity_torn_rondas2.tv_par1
import kotlinx.android.synthetic.main.activity_torn_rondas2.tv_par2
import kotlinx.android.synthetic.main.activity_torn_rondas2.tv_par3
import kotlinx.android.synthetic.main.activity_torn_rondas2.tv_par4
import kotlinx.android.synthetic.main.activity_torn_rondas2.tv_par5
import kotlinx.android.synthetic.main.activity_torn_rondas2.tv_par6

class TornRobin2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_torn_robin2)

        //Variable que ayuda a traer los valores del aterior activity.
        val objetoIntent: Intent = intent
        //Variables que guardan el valor de las variables del activity anterior.
        val nTorneo = objetoIntent.getStringExtra("Nombre")
        var nPar = objetoIntent.getStringExtra("Participantes")
        val nRondas = objetoIntent.getStringExtra("Rondas")

        //Variable que controla los TEXTVIEW del nombre del jugador. (?)
        var cNJugadores_tv = arrayOf(
            tv_par1,
            tv_par2,
            tv_par3,
            tv_par4,
            tv_par5,
            tv_par6)
        //Variable que controla loa EDITTEXT de los jugadores
        var cNJugadores_et = arrayOf(
            et_par1,
            et_par2,
            et_par3,
            et_par4,
            et_par5,
            et_par6)

        //Variable que controla el número de participantes.
        var cPar = 3
        //Array que guarda el número de participantes en juego
        var numx = arrayOf(
            "4",
            "5",
            "6")

        var cParDentro = 0
        var cParDentro2 = 0

        //ID de jugadores.
        var njugador1 = "j1"
        var njugador2 = "j2"
        var njugador3 = "j3"
        var njugador4 = "j4"
        var njugador5 = "j5"
        var njugador6 = "j6"

        //Array de ID de jugadores
        var nControlJ = arrayOf(
            njugador1,
            njugador2,
            njugador3,
            njugador4,
            njugador5,
            njugador6)

        //Dar valor int a cPar. Recuerda que cPar empieza en 3
        for (numy in 0..2) {
            if (nPar == numx[numy]) {
                cPar += 1
                break
            } else {
                cPar += 1
            }
        }

        tv_xd.text = "Torneo $nTorneo con $nPar Participantes"

        //Con esto se muestran los tv y et necesarios.
        for (num1 in 0..5) {
            if (cPar == num1) break
            else {
                cNJugadores_tv[num1].setVisibility(View.VISIBLE)
                cNJugadores_et[num1].setVisibility(View.VISIBLE)
                cParDentro += 1
            }
        }
        cParDentro2 = cParDentro - 1

        //Click en el botón abre el siguiente activity
        btr1.setOnClickListener() {
            val intent = Intent(this, Pareo1::class.java)

//Exportar valores
            primer@ for (num1 in 0..cParDentro2) {
                intent.putExtra(nControlJ[num1], cNJugadores_et[num1].text.toString())
                //Comprobar si está lleno. Si no, se manda mensaje de error y se rompe el for
                if (cNJugadores_et[num1].text.toString().isEmpty()) {
                    Toast.makeText(this, "Falta nombrar a algunos participantes", Toast.LENGTH_LONG)
                        .show();
                    break
                }
                //Si sí está lleno, se comprueba que sea el último y se mandan valores de nPar, nRondas y nTorneo.
                else {

                    if (num1 == cParDentro2) {
                        intent.putExtra("nParticipantesEnTorneo", nPar)
                        intent.putExtra("nRondasEnTorneo", nRondas)
                        intent.putExtra("nTorneo", nTorneo)
                        startActivity(intent)
                    }
                }


            }
        }


    }
}