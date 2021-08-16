package com.example.jochichessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_ejercicios_mates1.*

class Ejercicios_mates2 : AppCompatActivity() {
    var controlControl = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicios_mates2)

        val objetoIntent: Intent = intent
        //Variables que guardan el valor de las variables del activity anterior.
        val control = objetoIntent.getStringExtra("Control2")

        controlControl = control

        tv1xxx.text = "df"

        if(control == "1"){
            tv1xxx.text = "Ejercicio 1"
            iv1.setImageResource(R.drawable.m2_mate_1_1)
        }

        if(control == "2"){
            tv1xxx.text = "Ejercicio 2"
            iv1.setImageResource(R.drawable.m2_mate_2_1)
        }

        if(control == "3"){
            tv1xxx.text = "Ejercicio 3"
            iv1.setImageResource(R.drawable.m2_mate_3_1)
        }

        if(control == "4"){
            tv1xxx.text = "Ejercicio 4"
            iv1.setImageResource(R.drawable.m2_mate_4_1)
        }

        if(control == "5"){
            tv1xxx.text = "Ejercicio 5"
            iv1.setImageResource(R.drawable.m2_mate_5_1)
        }

        if(control == "6"){
            tv1xxx.text = "Ejercicio 6"
            iv1.setImageResource(R.drawable.m2_mate_6_1)
        }

        if(control == "7"){
            tv1xxx.text = "Ejercicio 7"
            iv1.setImageResource(R.drawable.m2_mate_7_1)
        }

        if(control == "8"){
            tv1xxx.text = "Ejercicio 8"
            iv1.setImageResource(R.drawable.m2_mate_8_1)
        }

        if(control == "9"){
            tv1xxx.text = "Ejercicio 9"
            iv1.setImageResource(R.drawable.m2_mate_9_1)
        }

        if(control == "10"){
            tv1xxx.text = "Ejercicio 10"
            iv1.setImageResource(R.drawable.m2_mate_10_1)
        }

    }

    fun onButtonClick2(view: View) {
        var flagans = 0


        when (controlControl){


            "1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() =="Tc7" ||
                        et1.text.toString()== "Tc7+") {
                        iv1.setImageResource(R.drawable.m2_mate_1_2)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "1.1"

                    }
                    else{
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT).show()
                    }
                }
            }

            "1.1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() =="Td8" || et1.text.toString()== "Td8#" ||
                        et1.text.toString()== "Td8++") {
                        iv1.setImageResource(R.drawable.m2_mate_1_3)
                        //TERMINA
                        tv2.visibility = View.VISIBLE
                        //OCULTA LA ENTRADA DE MAS DATOS
                        et1.visibility = View.GONE
                        tv1.visibility = View.GONE
                        btr1.setVisibility(View.GONE)


                    }
                    else{
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT).show()
                    }
                }
            }

            //--------------------------------------------------------------------------
            "2" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() =="Cc4") {
                        iv1.setImageResource(R.drawable.m2_mate_2_2)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "2.1"

                    }
                    else{
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT).show()
                    }
                }
            }

            "2.1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() =="Db2" || et1.text.toString()== "Db2#" ||
                        et1.text.toString()== "Db2++") {
                        iv1.setImageResource(R.drawable.m2_mate_2_3)
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
                    if (et1.text.toString() =="Ad1" ||
                        et1.text.toString()== "Ad1+") {
                        iv1.setImageResource(R.drawable.m2_mate_3_2)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "3.1"

                    }
                    else{
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT).show()
                    }
                }
            }

            "3.1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() =="g3" || et1.text.toString()== "g3#" ||
                        et1.text.toString()== "g3++") {
                        iv1.setImageResource(R.drawable.m2_mate_3_3)
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
                    if (et1.text.toString() =="Th3") {
                        iv1.setImageResource(R.drawable.m2_mate_4_2)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "4.1"

                    }
                    else{
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT).show()
                    }
                }
            }

            "4.1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() =="Tf3" || et1.text.toString()== "Tf3#" ||
                        et1.text.toString()== "Tf3++") {
                        iv1.setImageResource(R.drawable.m2_mate_4_3)
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
                    if (et1.text.toString() =="Da6" ||
                        et1.text.toString()== "Da6+") {
                        iv1.setImageResource(R.drawable.m2_mate_5_2)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "5.1"

                    }
                    else{
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT).show()
                    }
                }
            }

            "5.1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() =="Txa6" || et1.text.toString()== "Txa6#" ||
                        et1.text.toString()== "Txa6++") {
                        iv1.setImageResource(R.drawable.m2_mate_5_3)
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
            "6" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() =="Txd8" ||
                        et1.text.toString()== "Txd8+") {
                        iv1.setImageResource(R.drawable.m2_mate_6_2)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "6.1"

                    }
                    else{
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT).show()
                    }
                }
            }

            "6.1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() =="Te8" || et1.text.toString()== "Te8#" ||
                        et1.text.toString()== "Te8++") {
                        iv1.setImageResource(R.drawable.m2_mate_6_3)
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
                    if (et1.text.toString() =="Cxd6" ||
                        et1.text.toString()== "Cxd6+") {
                        iv1.setImageResource(R.drawable.m2_mate_7_2)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "7.1"

                    }
                    else{
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT).show()
                    }
                }
            }

            "7.1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() =="Tb8" || et1.text.toString()== "Tb8#" ||
                        et1.text.toString()== "Tb8++") {
                        iv1.setImageResource(R.drawable.m2_mate_7_3)
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
                    if (et1.text.toString() =="Txa6" ||
                        et1.text.toString()== "Txa6+") {
                        iv1.setImageResource(R.drawable.m2_mate_8_2)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "8.1"

                    }
                    else{
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT).show()
                    }
                }
            }

            "8.1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() =="Cc6" || et1.text.toString()== "Cc6#" ||
                        et1.text.toString()== "Cc6++") {
                        iv1.setImageResource(R.drawable.m2_mate_8_3)
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
                    if (et1.text.toString() =="Dh7" ||
                        et1.text.toString()== "Dh7+") {
                        iv1.setImageResource(R.drawable.m2_mate_9_2)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "9.1"

                    }
                    else{
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT).show()
                    }
                }
            }

            "9.1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() =="Txh7" || et1.text.toString()== "Txh7#" ||
                        et1.text.toString()== "Txh7++") {
                        iv1.setImageResource(R.drawable.m2_mate_9_3)
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
                    if (et1.text.toString() =="Dh5" ||
                        et1.text.toString()== "Dh5+") {
                        iv1.setImageResource(R.drawable.m2_mate_10_2)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "10.1"

                    }
                    else{
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT).show()
                    }
                }
            }

            "10.1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() =="Th7" || et1.text.toString()== "Th7#" ||
                        et1.text.toString()== "Th7++") {
                        iv1.setImageResource(R.drawable.m2_mate_10_3)
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

        }

    }


}