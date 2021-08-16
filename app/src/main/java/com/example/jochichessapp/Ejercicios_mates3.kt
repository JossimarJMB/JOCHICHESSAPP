package com.example.jochichessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_ejercicios_mates1.*

class Ejercicios_mates3 : AppCompatActivity() {
    var controlControl = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicios_mates3)

        val objetoIntent: Intent = intent
        //Variables que guardan el valor de las variables del activity anterior.
        val control = objetoIntent.getStringExtra("Control3")
        controlControl = control
        tv1xxx.text = "df"

        if(control == "1"){
            tv1xxx.text = "Ejercicio 1"
            iv1.setImageResource(R.drawable.m3_mate_1_1)

        }

        if(control == "2"){
            tv1xxx.text = "Ejercicio 2"
            iv1.setImageResource(R.drawable.m3_mate_2_1)
        }

        if(control == "3"){
            tv1xxx.text = "Ejercicio 3"
            iv1.setImageResource(R.drawable.m3_mate_3_1)
        }

        if(control == "4"){
            tv1xxx.text = "Ejercicio 4"
            iv1.setImageResource(R.drawable.m3_mate_4_1)
        }

        if(control == "5"){
            tv1xxx.text = "Ejercicio 5"
            iv1.setImageResource(R.drawable.m3_mate_5_1)
        }

        if(control == "6"){
            tv1xxx.text = "Ejercicio 6"
            iv1.setImageResource(R.drawable.m3_mate_6_1)
        }

        if(control == "7"){
            tv1xxx.text = "Ejercicio 7"
            iv1.setImageResource(R.drawable.m3_mate_7_1)
        }

        if(control == "8"){
            tv1xxx.text = "Ejercicio 8"
            iv1.setImageResource(R.drawable.m3_mate_8_1)
        }

        if(control == "9"){
            tv1xxx.text = "Ejercicio 9"
            iv1.setImageResource(R.drawable.m3_mate_9_1)
        }

        if(control == "10"){
            tv1xxx.text = "Ejercicio 10"
            iv1.setImageResource(R.drawable.m3_mate_10_1)
        }
    }
    fun onButtonClick3(view: View) {
        var flagans = 0


        when (controlControl) {


            "1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Ce7" || et1.text.toString() == "Ce7+") {
                        iv1.setImageResource(R.drawable.m3_mate_1_2)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "1.1"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "1.1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Txh7" || et1.text.toString() == "Txh7+") {
                        iv1.setImageResource(R.drawable.m3_mate_1_3)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "1.2"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "1.2" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Th5" || et1.text.toString() == "Th5#" ||
                        et1.text.toString() == "Th5++"
                    ) {
                        iv1.setImageResource(R.drawable.m3_mate_1_4)
                        //TERMINA
                        tv2.visibility = View.VISIBLE
                        //OCULTA LA ENTRADA DE MAS DATOS
                        et1.visibility = View.GONE
                        tv1.visibility = View.GONE
                        btr1.setVisibility(View.GONE)


                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            //--------------------------------------------------------------------------

            "2" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Tf8" || et1.text.toString() == "Tf8+") {
                        iv1.setImageResource(R.drawable.m3_mate_2_2)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "2.1"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "2.1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Da8" || et1.text.toString() == "Da8+") {
                        iv1.setImageResource(R.drawable.m3_mate_2_3)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "2.2"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "2.2" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "De8" || et1.text.toString() == "De8#" ||
                        et1.text.toString() == "De8++"
                    ) {
                        iv1.setImageResource(R.drawable.m3_mate_2_4)
                        //TERMINA
                        tv2.visibility = View.VISIBLE
                        //OCULTA LA ENTRADA DE MAS DATOS
                        et1.visibility = View.GONE
                        tv1.visibility = View.GONE
                        btr1.setVisibility(View.GONE)


                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            //--------------------------------------------------------------------------

            "3" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Dxb8" || et1.text.toString() == "Dxb8+") {
                        iv1.setImageResource(R.drawable.m3_mate_3_2)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "3.1"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "3.1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Td8" || et1.text.toString() == "Td8+") {
                        iv1.setImageResource(R.drawable.m3_mate_3_3)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "3.2"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "3.2" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Tb8" || et1.text.toString() == "Tb8#" ||
                        et1.text.toString() == "Tb8++"
                    ) {
                        iv1.setImageResource(R.drawable.m3_mate_3_4)
                        //TERMINA
                        tv2.visibility = View.VISIBLE
                        //OCULTA LA ENTRADA DE MAS DATOS
                        et1.visibility = View.GONE
                        tv1.visibility = View.GONE
                        btr1.setVisibility(View.GONE)


                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            //--------------------------------------------------------------------------

            "4" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Af6") {
                        iv1.setImageResource(R.drawable.m3_mate_4_2)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "4.1"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "4.1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Rf8") {
                        iv1.setImageResource(R.drawable.m3_mate_4_3)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "4.2"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "4.2" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Cf7" || et1.text.toString() == "Cf7#" ||
                        et1.text.toString() == "Cf7++"
                    ) {
                        iv1.setImageResource(R.drawable.m3_mate_4_4)
                        //TERMINA
                        tv2.visibility = View.VISIBLE
                        //OCULTA LA ENTRADA DE MAS DATOS
                        et1.visibility = View.GONE
                        tv1.visibility = View.GONE
                        btr1.setVisibility(View.GONE)


                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            //--------------------------------------------------------------------------

            "5" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Dh8" || et1.text.toString() == "Dh8+") {
                        iv1.setImageResource(R.drawable.m3_mate_5_2)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "5.1"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "5.1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Tf8" || et1.text.toString() == "Tf8+") {
                        iv1.setImageResource(R.drawable.m3_mate_5_3)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "5.2"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "5.2" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Ce6" || et1.text.toString() == "Ce6#" ||
                        et1.text.toString() == "Ce6++"
                    ) {
                        iv1.setImageResource(R.drawable.m3_mate_5_4)
                        //TERMINA
                        tv2.visibility = View.VISIBLE
                        //OCULTA LA ENTRADA DE MAS DATOS
                        et1.visibility = View.GONE
                        tv1.visibility = View.GONE
                        btr1.setVisibility(View.GONE)


                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            //--------------------------------------------------------------------------

            "6" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Cxf6" || et1.text.toString() == "Cxf6+") {
                        iv1.setImageResource(R.drawable.m3_mate_6_2)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "6.1"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "6.1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Th6" || et1.text.toString() == "Th6+") {
                        iv1.setImageResource(R.drawable.m3_mate_6_3)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "6.2"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "6.2" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Th7" || et1.text.toString() == "Th7#" ||
                        et1.text.toString() == "Th7++"
                    ) {
                        iv1.setImageResource(R.drawable.m3_mate_6_4)
                        //TERMINA
                        tv2.visibility = View.VISIBLE
                        //OCULTA LA ENTRADA DE MAS DATOS
                        et1.visibility = View.GONE
                        tv1.visibility = View.GONE
                        btr1.setVisibility(View.GONE)


                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            //--------------------------------------------------------------------------

            "7" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Af5" || et1.text.toString() == "Af5+") {
                        iv1.setImageResource(R.drawable.m3_mate_7_2)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "7.1"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "7.1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Cg7") {
                        iv1.setImageResource(R.drawable.m3_mate_7_3)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "7.2"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "7.2" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "gxh5" || et1.text.toString() == "gxh5#" ||
                        et1.text.toString() == "gxh5++"
                    ) {
                        iv1.setImageResource(R.drawable.m3_mate_7_4)
                        //TERMINA
                        tv2.visibility = View.VISIBLE
                        //OCULTA LA ENTRADA DE MAS DATOS
                        et1.visibility = View.GONE
                        tv1.visibility = View.GONE
                        btr1.setVisibility(View.GONE)


                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            //--------------------------------------------------------------------------

            "8" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Dc4" || et1.text.toString() == "Dc4+") {
                        iv1.setImageResource(R.drawable.m3_mate_8_2)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "8.1"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "8.1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Dc1" || et1.text.toString() == "Dc1+") {
                        iv1.setImageResource(R.drawable.m3_mate_8_3)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "8.2"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "8.2" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Cb3" || et1.text.toString() == "Cb3#" ||
                        et1.text.toString() == "Cb3++"
                    ) {
                        iv1.setImageResource(R.drawable.m3_mate_8_4)
                        //TERMINA
                        tv2.visibility = View.VISIBLE
                        //OCULTA LA ENTRADA DE MAS DATOS
                        et1.visibility = View.GONE
                        tv1.visibility = View.GONE
                        btr1.setVisibility(View.GONE)


                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            //--------------------------------------------------------------------------

            "9" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Dh6" || et1.text.toString() == "Dh6+") {
                        iv1.setImageResource(R.drawable.m3_mate_9_2)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "9.1"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "9.1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Ae5" || et1.text.toString() == "Ae5+") {
                        iv1.setImageResource(R.drawable.m3_mate_9_3)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "9.2"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "9.2" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Axf6" || et1.text.toString() == "Axf6#" ||
                        et1.text.toString() == "Axf6++"
                    ) {
                        iv1.setImageResource(R.drawable.m3_mate_9_4)
                        //TERMINA
                        tv2.visibility = View.VISIBLE
                        //OCULTA LA ENTRADA DE MAS DATOS
                        et1.visibility = View.GONE
                        tv1.visibility = View.GONE
                        btr1.setVisibility(View.GONE)


                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            //--------------------------------------------------------------------------

            "10" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Cf7" || et1.text.toString() == "Cf7+") {
                        iv1.setImageResource(R.drawable.m3_mate_10_2)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "10.1"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "10.1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Dh4" || et1.text.toString() == "Dh4+") {
                        iv1.setImageResource(R.drawable.m3_mate_10_3)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "10.2"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "10.2" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Dh5" || et1.text.toString() == "Dh5#" ||
                        et1.text.toString() == "Dh5++"
                    ) {
                        iv1.setImageResource(R.drawable.m3_mate_10_4)
                        //TERMINA
                        tv2.visibility = View.VISIBLE
                        //OCULTA LA ENTRADA DE MAS DATOS
                        et1.visibility = View.GONE
                        tv1.visibility = View.GONE
                        btr1.setVisibility(View.GONE)


                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            //--------------------------------------------------------------------------


        }
    }
}