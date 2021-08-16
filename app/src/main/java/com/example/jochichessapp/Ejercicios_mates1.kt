package com.example.jochichessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_ejercicios_mates1.*

class Ejercicios_mates1 : AppCompatActivity() {

    var controlControl = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicios_mates1)

        val objetoIntent: Intent = intent
        //Variables que guardan el valor de las variables del activity anterior.
        val control = objetoIntent.getStringExtra("Control")

        tv1xxx.text = "df"
        controlControl = control

        if(control == "1"){
            tv1xxx.text = "Ejercicio 1"
            iv1.setImageResource(R.drawable.m1_mate_1_1)
        }

        if(control == "2"){
            tv1xxx.text = "Ejercicio 2"
            iv1.setImageResource(R.drawable.m1_mate_2_1)
        }

        if(control == "3"){
            tv1xxx.text = "Ejercicio 3"
            iv1.setImageResource(R.drawable.m1_mate_3_1)
        }

        if(control == "4"){
            tv1xxx.text = "Ejercicio 4"
            iv1.setImageResource(R.drawable.m1_mate_4_1)
        }

        if(control == "5"){
            tv1xxx.text = "Ejercicio 5"
            iv1.setImageResource(R.drawable.m1_mate_5_1)
        }

        if(control == "6"){
            tv1xxx.text = "Ejercicio 6"
            iv1.setImageResource(R.drawable.m1_mate_6_1)
        }

        if(control == "7"){
            tv1xxx.text = "Ejercicio 7"
            iv1.setImageResource(R.drawable.m1_mate_7_1)
        }

        if(control == "8"){
            tv1xxx.text = "Ejercicio 8"
            iv1.setImageResource(R.drawable.m1_mate_8_1)
        }

        if(control == "9"){
            tv1xxx.text = "Ejercicio 9"
            iv1.setImageResource(R.drawable.m1_mate_9_1)
        }

        if(control == "10"){
            tv1xxx.text = "Ejercicio 10"
            iv1.setImageResource(R.drawable.m1_mate_10_1)
        }



        }

    fun onButtonClick1(view: View) {
        when (controlControl){


            "1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() =="Dg2" || et1.text.toString()== "Dg2#" ||
                        et1.text.toString()== "Dg2++") {
                        iv1.setImageResource(R.drawable.m1_mate_1_2)
                        //TERMINA
                        tv2.setVisibility(View.VISIBLE)
                        //OCULTA LA ENTRADA DE MAS DATOS
                        et1.setVisibility(View.GONE)
                        tv1.setVisibility(View.GONE)
                        btr1.setVisibility(View.GONE)


                    }
                    else{
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT).show()
                    }
                }

            }
//-------------------------------------------------------------------------------
            "2" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() =="Cd6" || et1.text.toString()== "Cd6#" ||
                        et1.text.toString()== "Cd6++") {
                        iv1.setImageResource(R.drawable.m1_mate_2_2)
                        //TERMINA
                        tv2.setVisibility(View.VISIBLE)
                        //OCULTA LA ENTRADA DE MAS DATOS
                        et1.setVisibility(View.GONE)
                        tv1.setVisibility(View.GONE)
                        btr1.setVisibility(View.GONE)

                    }
                    else{
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT).show()
                    }
                }

            }

            //--------------------------------------------------------------------------
            "3" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() =="Tg8" || et1.text.toString()== "Tg8#" ||
                        et1.text.toString()== "Tg8++") {
                        iv1.setImageResource(R.drawable.m1_mate_3_2)
                        //TERMINA
                        tv2.setVisibility(View.VISIBLE)
                        //OCULTA LA ENTRADA DE MAS DATOS
                        et1.setVisibility(View.GONE)
                        tv1.setVisibility(View.GONE)
                        btr1.setVisibility(View.GONE)

                    }
                    else{
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT).show()
                    }
                }

            }
            //--------------------------------------------------------------------------
            "4" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() =="Dg8" || et1.text.toString()== "Dg8#" ||
                        et1.text.toString()== "Dg8++") {
                        iv1.setImageResource(R.drawable.m1_mate_4_2)
                        //TERMINA
                        tv2.setVisibility(View.VISIBLE)
                        //OCULTA LA ENTRADA DE MAS DATOS
                        et1.setVisibility(View.GONE)
                        tv1.setVisibility(View.GONE)
                        btr1.setVisibility(View.GONE)

                    }
                    else{
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT).show()
                    }
                }

            }
            //--------------------------------------------------------------------------
            "5" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() =="Cc6" || et1.text.toString()== "Cc6#" ||
                        et1.text.toString()== "Cc6++") {
                        iv1.setImageResource(R.drawable.m1_mate_5_2)
                        //TERMINA
                        tv2.setVisibility(View.VISIBLE)
                        //OCULTA LA ENTRADA DE MAS DATOS
                        et1.setVisibility(View.GONE)
                        btr1.setVisibility(View.GONE)
                        tv1.setVisibility(View.GONE)
                    }
                    else{
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT).show()
                    }
                }

            }
            //--------------------------------------------------------------------------
            "6" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() =="Tc8" || et1.text.toString()== "Tc8#" ||
                        et1.text.toString()== "Tc8++") {
                        iv1.setImageResource(R.drawable.m1_mate_6_2)
                        //TERMINA
                        tv2.setVisibility(View.VISIBLE)
                        //OCULTA LA ENTRADA DE MAS DATOS
                        et1.setVisibility(View.GONE)
                        tv1.setVisibility(View.GONE)
                        btr1.setVisibility(View.GONE)

                    }
                    else{
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT).show()
                    }
                }

            }
            //--------------------------------------------------------------------------
            "7" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() =="De5" || et1.text.toString()== "De5#" ||
                        et1.text.toString()== "De5++") {
                        iv1.setImageResource(R.drawable.m1_mate_7_2)
                        //TERMINA
                        tv2.setVisibility(View.VISIBLE)
                        //OCULTA LA ENTRADA DE MAS DATOS
                        et1.setVisibility(View.GONE)
                        tv1.setVisibility(View.GONE)
                        btr1.setVisibility(View.GONE)

                    }
                    else{
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT).show()
                    }
                }

            }
            //--------------------------------------------------------------------------
            "8" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() =="Da4" || et1.text.toString()== "Da4#" ||
                        et1.text.toString()== "Da4++") {
                        iv1.setImageResource(R.drawable.m1_mate_8_2)
                        //TERMINA
                        tv2.setVisibility(View.VISIBLE)
                        //OCULTA LA ENTRADA DE MAS DATOS
                        et1.setVisibility(View.GONE)
                        tv1.setVisibility(View.GONE)
                        btr1.setVisibility(View.GONE)

                    }
                    else{
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT).show()
                    }
                }

            }
            //--------------------------------------------------------------------------
            "9" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() =="c6" || et1.text.toString()== "c6#" ||
                        et1.text.toString()== "c6++") {
                        iv1.setImageResource(R.drawable.m1_mate_9_2)
                        //TERMINA
                        tv2.setVisibility(View.VISIBLE)
                        //OCULTA LA ENTRADA DE MAS DATOS
                        et1.setVisibility(View.GONE)
                        tv1.setVisibility(View.GONE)
                        btr1.setVisibility(View.GONE)

                    }
                    else{
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT).show()
                    }
                }

            }
            //--------------------------------------------------------------------------
            "10" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() =="Dg7" || et1.text.toString()== "Dg7#" ||
                        et1.text.toString()== "Dg7++") {
                        iv1.setImageResource(R.drawable.m1_mate_10_2)
                        //TERMINA
                        tv2.setVisibility(View.VISIBLE)
                        //OCULTA LA ENTRADA DE MAS DATOS
                        et1.setVisibility(View.GONE)
                        tv1.setVisibility(View.GONE)
                        btr1.setVisibility(View.GONE)

                    }
                    else{
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT).show()
                    }
                }

            }
            //--------------------------------------------------------------------------

            //--------------------------------------------------------------------------





        }





    }
}