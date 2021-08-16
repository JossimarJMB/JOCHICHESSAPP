package com.example.jochichessapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_torn_rondas.*
import kotlinx.android.synthetic.main.activity_torn_rondas2.*
import kotlinx.android.synthetic.main.activity_torn_rondas2.btr1
import kotlinx.android.synthetic.main.activity_torn_rondas2.tv_tr1

class TornRondas2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_torn_rondas2)


        //Variable que ayuda a traer los valores del aterior activity.
        val objetoIntent: Intent = intent
        //Variables que guardan el valor de las variables del activity anterior.
        var nPar = objetoIntent.getStringExtra("Participantes")
        val nRondas = objetoIntent.getStringExtra("Rondas")
        val nTorneo = objetoIntent.getStringExtra("Nombre")

        //Variable que controla los TEXTVIEW del nombre del jugador. (?)
        var cNJugadores_tv = arrayOf(
            tv_par1,
            tv_par2,
            tv_par3,
            tv_par4,
            tv_par5,
            tv_par6,
            tv_par7,
            tv_par8,
            tv_par9,
            tv_par10,
            tv_par11,
            tv_par12,
            tv_par13,
            tv_par14,
            tv_par15,
            tv_par16,
            tv_par17,
            tv_par18,
            tv_par19,
            tv_par20,
            tv_par21,
            tv_par22,
            tv_par23,
            tv_par24,
            tv_par25,
            tv_par26,
            tv_par27,
            tv_par28,
            tv_par29,
            tv_par30,
            tv_par31,
            tv_par32
        )



        //Variable que controla loa EDITTEXT de los jugadores
        var cNJugadores_et = arrayOf(
            et_par1,
            et_par2,
            et_par3,
            et_par4,
            et_par5,
            et_par6,
            et_par7,
            et_par8,
            et_par9,
            et_par10,
            et_par11,
            et_par12,
            et_par13,
            et_par14,
            et_par15,
            et_par16,
            et_par17,
            et_par18,
            et_par19,
            et_par20,
            et_par21,
            et_par22,
            et_par23,
            et_par24,
            et_par25,
            et_par26,
            et_par27,
            et_par28,
            et_par29,
            et_par30,
            et_par31,
            et_par32
        )

        //Variable que controla el número de participantes.
        var cPar = 3
        //Array que guarda el número de participantes en juego
        var numx = arrayOf(
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "11",
            "12",
            "13",
            "14",
            "15",
            "16",
            "17",
            "18",
            "19",
            "20",
            "21",
            "22",
            "23",
            "24",
            "25",
            "26",
            "27",
            "28",
            "29",
            "30",
            "31",
            "32"
        )

        var cParDentro = 0
        var cParX = 0

        //ID de jugadores para exportar.
        var njugador1 = "j1"
        var njugador2 = "j2"
        var njugador3 = "j3"
        var njugador4 = "j4"
        var njugador5 = "j5"
        var njugador6 = "j6"
        var njugador7 = "j7"
        var njugador8 = "j8"
        var njugador9 = "j9"
        var njugador10 = "j10"
        var njugador11 = "j11"
        var njugador12 = "j12"
        var njugador13 = "j13"
        var njugador14 = "j14"
        var njugador15 = "j15"
        var njugador16 = "j16"
        var njugador17 = "j17"
        var njugador18 = "j18"
        var njugador19 = "j19"
        var njugador20 = "j20"
        var njugador21 = "j21"
        var njugador22 = "j22"
        var njugador23 = "j23"
        var njugador24 = "j24"
        var njugador25 = "j25"
        var njugador26 = "j26"
        var njugador27 = "j27"
        var njugador28 = "j28"
        var njugador29 = "j29"
        var njugador30 = "j30"
        var njugador31 = "j31"
        var njugador32 = "j32"

        //Array de ID de jugadores
        var nControlJ = arrayOf(
            njugador1,
            njugador2,
            njugador3,
            njugador4,
            njugador5,
            njugador6,
            njugador7,
            njugador8,
            njugador9,
            njugador10,
            njugador11,
            njugador12,
            njugador13,
            njugador14,
            njugador15,
            njugador16,
            njugador17,
            njugador18,
            njugador19,
            njugador20,
            njugador21,
            njugador21,
            njugador22,
            njugador23,
            njugador24,
            njugador25,
            njugador26,
            njugador27,
            njugador28,
            njugador29,
            njugador30,
            njugador31,
            njugador32
        )


        //Dar valor int a cPar
        for (numy in 0..28) {
            if (nPar == numx[numy]) {
                cPar += 1
                break
            } else {
                cPar += 1
            }
        }
        tv_tr1.text = "Torneo $nTorneo con $nPar Participantes a $nRondas Rondas "

//Con esto se muestran los tv y et necesarios.
        for (num1 in 0..31) {
            if (cPar == num1) break
            else {
                cNJugadores_tv[num1].setVisibility(View.VISIBLE)
                cNJugadores_et[num1].setVisibility(View.VISIBLE)
                cParDentro += 1
            }
        }
        cParX = cParDentro - 1
//Termina

//Click en el botón abre el siguiente activity
        btr1.setOnClickListener() {
            //Intento de hacer que no se repitan los nombres

            /*var xD = cParDentro
            for(i in 0..cParX){
                for(j in 0..cParX){
                    if(cNJugadores_et[i]==cNJugadores_et[j] && i!=j) {
                        Toast.makeText(this, "No debe haber nombres repetidos", Toast.LENGTH_LONG).show()
                        xD = 0
                        break

                    }

                }
            }*/
            val intent = Intent(this, Pareo1::class.java)

//Exportar valores
            primer@ for (num1 in 0..cParX) {
                intent.putExtra(nControlJ[num1], cNJugadores_et[num1].text.toString())
        //Comprobar si está lleno. Si no, se manda mensaje de error y se rompe el for
                if (cNJugadores_et[num1].text.toString().isEmpty()) {
                    Toast.makeText(this, "Falta nombrar a algunos participantes", Toast.LENGTH_LONG)
                        .show();
                    break
                }

        //Si sí está lleno, se comprueba que sea el último y se mandan valores de nPar, nRondas y nTorneo.
                else {

                                    if (num1 == cParX) {
                                        intent.putExtra("nParticipantesEnTorneo", nPar)
                                        intent.putExtra("nRondasEnTorneo", nRondas)
                                        intent.putExtra("nTorneo", nTorneo)
                                        startActivity(intent)
                                    }
                                }


                    }
                }

            }
    /*// Si sí es el último, se asegura que no haya repetidos.
    for (pivot in 0..cParDentro2) {
        //Si sí hay repetidos, se manda mensaje de error y se rompe el for.
        if (cNJugadores_et[num1] == cNJugadores_et[pivot]) {
            if (num1 != pivot) {
                if (cNJugadores_et[num1] == cNJugadores_et[pivot]) {
                    Toast.makeText(
                        this,
                        "Existen nombres repetidos",
                        Toast.LENGTH_LONG
                    )
                        .show()
                    break@primer
                }

            }
        }
        else {*/

        }

