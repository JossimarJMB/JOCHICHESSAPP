 package com.example.jochichessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_ejercicios_mates1.*

class Ejercicios_ventaja : AppCompatActivity() {
    var controlControl = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicios_ventaja)

        val objetoIntent: Intent = intent
        //Variables que guardan el valor de las variables del activity anterior.
        val control = objetoIntent.getStringExtra("Control4")
        controlControl = control

        tv1xxx.text = "df"

        if(control == "1"){
            tv1xxx.text = "Ejercicio 1"
            iv1.setImageResource(R.drawable.des_1_1)

        }

        if(control == "2"){
            tv1xxx.text = "Ejercicio 2"
            iv1.setImageResource(R.drawable.des_2_1)

        }

        if(control == "3"){
            tv1xxx.text = "Ejercicio 3"
            iv1.setImageResource(R.drawable.des_3_1)

        }

        if(control == "4"){
            tv1xxx.text = "Ejercicio 4"
            iv1.setImageResource(R.drawable.des_4_1)
        }

        if(control == "5"){
            tv1xxx.text = "Ejercicio 5"
            iv1.setImageResource(R.drawable.des_5_1)
        }

        if(control == "6"){
            tv1xxx.text = "Ejercicio 6"
            iv1.setImageResource(R.drawable.des_6_1)
        }

        if(control == "7"){
            tv1xxx.text = "Ejercicio 7"
            iv1.setImageResource(R.drawable.des_7_1)
        }

        if(control == "8"){
            tv1xxx.text = "Ejercicio 8"
            iv1.setImageResource(R.drawable.des_8_1)
        }

        if(control == "9"){
            tv1xxx.text = "Ejercicio 9"
            iv1.setImageResource(R.drawable.des_9_1)
        }

        if(control == "10"){
            tv1xxx.text = "Ejercicio 10"
            iv1.setImageResource(R.drawable.des_10_1)
        }
        if(control == "11"){
            tv1xxx.text = "Ejercicio 11"
            iv1.setImageResource(R.drawable.des_11_1)
        }

        if(control == "12"){
            tv1xxx.text = "Ejercicio 12"
            iv1.setImageResource(R.drawable.des_12_1)
        }

        if(control == "13"){
            tv1xxx.text = "Ejercicio 13"
            iv1.setImageResource(R.drawable.des_13_1)
        }

        if(control == "14"){
            tv1xxx.text = "Ejercicio 14"
            iv1.setImageResource(R.drawable.des_14_1)
        }

        if(control == "15"){
            tv1xxx.text = "Ejercicio 15"
            iv1.setImageResource(R.drawable.des_15_1)
        }

        if(control == "16"){
            tv1xxx.text = "Ejercicio 16"
            iv1.setImageResource(R.drawable.des_16_1)
        }

        if(control == "17"){
            tv1xxx.text = "Ejercicio 17"
            iv1.setImageResource(R.drawable.des_17_1)
        }

        if(control == "18"){
            tv1xxx.text = "Ejercicio 18"
            iv1.setImageResource(R.drawable.des_18_1)
        }

        if(control == "19"){
            tv1xxx.text = "Ejercicio 19"
            iv1.setImageResource(R.drawable.des_19_1)
        }

        if(control == "20"){
            tv1xxx.text = "Ejercicio 20"
            iv1.setImageResource(R.drawable.des_20_1)
        }
    }

    fun onButtonClick4(view: View) {
        var flagans = 0


        when (controlControl) {

            //--------------------------------------------------------------------------


            "1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Ab5") {
                        iv1.setImageResource(R.drawable.des_1_2)
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
                    if (et1.text.toString() == "Axc6"
                    ) {
                        iv1.setImageResource(R.drawable.des_1_3)
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
                    if (et1.text.toString() == "Cf5" || et1.text.toString() == "Cf5+") {
                        iv1.setImageResource(R.drawable.des_2_x)
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
                    if (et1.text.toString() == "Cxd4") {
                        iv1.setImageResource(R.drawable.des_2_2)
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
                    if (et1.text.toString() == "Db5") {
                        iv1.setImageResource(R.drawable.des_3_2)
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
                    if (et1.text.toString() == "Dxb4"
                    ) {
                        iv1.setImageResource(R.drawable.des_3_3)
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
                    if (et1.text.toString() == "Dd4" || et1.text.toString() == "Dd4+") {
                        iv1.setImageResource(R.drawable.des_4_2)
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
                    if (et1.text.toString() == "Dxe3"
                    ) {
                        iv1.setImageResource(R.drawable.des_4_3)
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
                    if (et1.text.toString() == "Af4" ) {
                        iv1.setImageResource(R.drawable.des_5_2)
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
                    if (et1.text.toString() == "Axd6"
                    ) {
                        iv1.setImageResource(R.drawable.des_5_3)
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
                    if (et1.text.toString() == "Tf8" || et1.text.toString() == "Tf8+") {
                        iv1.setImageResource(R.drawable.des_6_2)
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
                    if (et1.text.toString() == "Dxg4"
                    ) {
                        iv1.setImageResource(R.drawable.des_6_3)
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
                    if (et1.text.toString() == "Dxg5") {
                        iv1.setImageResource(R.drawable.des_7_2)
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
                    if (et1.text.toString() == "Cf7" || et1.text.toString() == "Cf7+") {
                        iv1.setImageResource(R.drawable.des_7_3)
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
                    if (et1.text.toString() == "Cxg5"
                    ) {
                        iv1.setImageResource(R.drawable.des_7_4)
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
                    if (et1.text.toString() == "Cc5") {
                        iv1.setImageResource(R.drawable.des_8_2)
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
                    if (et1.text.toString() == "e4"
                    ) {
                        iv1.setImageResource(R.drawable.des_8_3)
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
                    if (et1.text.toString() == "Axb7" || et1.text.toString() == "Axb7+") {
                        iv1.setImageResource(R.drawable.des_9_2)
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
                    if (et1.text.toString() == "Cxd7"
                    ) {
                        iv1.setImageResource(R.drawable.des_9_3)
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
                    if (et1.text.toString() == "Txg7" || et1.text.toString() == "Txg7+") {
                        iv1.setImageResource(R.drawable.des_10_2)
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
                    if (et1.text.toString() == "Txe7"
                    ) {
                        iv1.setImageResource(R.drawable.des_10_3)
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

            "11" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Cxe5" ) {
                        iv1.setImageResource(R.drawable.des_11_2)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "11.1"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "11.1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Dxe3"
                    ) {
                        iv1.setImageResource(R.drawable.des_11_3)
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

            "12" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Af3") {
                        iv1.setImageResource(R.drawable.des_12_2)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "12.1"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "12.1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Dxc6" || et1.text.toString() == "Dxc6+") {
                        iv1.setImageResource(R.drawable.des_12_3)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "12.2"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "12.2" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Dxa8"
                    ) {
                        iv1.setImageResource(R.drawable.des_12_4)
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

            "13" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Af5"
                    ) {
                        iv1.setImageResource(R.drawable.des_13_2)
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

            "14" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Dd5" || et1.text.toString() == "Dd5+") {
                        iv1.setImageResource(R.drawable.des_14_2)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "14.1"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "14.1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Dxc6"
                    ) {
                        iv1.setImageResource(R.drawable.des_14_3)
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

            "15" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Dd5" || et1.text.toString() == "Dd5+") {
                        iv1.setImageResource(R.drawable.des_15_2)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "15.1"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "15.1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Dxa8"
                    ) {
                        iv1.setImageResource(R.drawable.des_15_3)
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

            "16" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Cxd5") {
                        iv1.setImageResource(R.drawable.des_16_2)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "16.1"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "16.1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "c6") {
                        iv1.setImageResource(R.drawable.des_16_3)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "16.2"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "16.2" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "b5"
                    ) {
                        iv1.setImageResource(R.drawable.des_16_4)
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

            "17" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Dc7" || et1.text.toString() == "Dc7+") {
                        iv1.setImageResource(R.drawable.des_17_2)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "17.1"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "17.1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Dxd8" || et1.text.toString() == "Dxd8+") {
                        iv1.setImageResource(R.drawable.des_17_3)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "17.2"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "17.2" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Cc7" || et1.text.toString() == "Cc7+") {
                        iv1.setImageResource(R.drawable.des_17_4)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "17.3"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "17.3" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Cxe6"
                    ) {
                        iv1.setImageResource(R.drawable.des_17_5)
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

            "18" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Ta7" ) {
                        iv1.setImageResource(R.drawable.des_18_2)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "18.1"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "18.1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Txd7" || et1.text.toString() == "Txd7+") {
                        iv1.setImageResource(R.drawable.des_18_3)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "18.2"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "18.2" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Dxd7" || et1.text.toString() == "Dxd7+") {
                        iv1.setImageResource(R.drawable.des_18_4)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "18.3"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "18.3" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Cf6+"
                    ) {
                        iv1.setImageResource(R.drawable.des_18_5)
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

            "19" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Axb7" ) {
                        iv1.setImageResource(R.drawable.des_19_2)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "19.1"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "19.1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Dc6" || et1.text.toString() == "Dc6+") {
                        iv1.setImageResource(R.drawable.des_19_3)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "19.2"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "19.2" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Dxf6"
                    ) {
                        iv1.setImageResource(R.drawable.des_19_4)
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

            "20" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Cxd5" ) {
                        iv1.setImageResource(R.drawable.des_20_2)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "20.1"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }


            "20.1" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Cb6" || et1.text.toString() == "Cb6+") {
                        iv1.setImageResource(R.drawable.des_20_3)
                        Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                        et1.setText("")
                        controlControl = "20.2"

                    } else {
                        Toast.makeText(this, "Intenta con otra respuesta", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

            "20.2" -> {
                if (et1.text.toString().isEmpty()) {
                    et1.error = "Inserta una respuesta, por favor"
                } else {
                    if (et1.text.toString() == "Dxa8"
                    ) {
                        iv1.setImageResource(R.drawable.des_20_4)
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