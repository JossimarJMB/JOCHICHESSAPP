package com.example.jochichessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_pareo1.*

class Pareo3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pareo3)

        val objetoIntent: Intent = intent
        var nPar=objetoIntent.getStringExtra("nParticipantesEnTorneo")
        var nRondas=objetoIntent.getStringExtra("nRondasEnTorneo")
        var nTorneo=objetoIntent.getStringExtra("nTorneo")
        tv1x.text = "Ronda 3 de $nRondas, del torneo $nTorneo con $nPar Participantes"

        if(nRondas == "3"){
            b1.text = "Finalizar torneo"
        }


        //AGUJERO NEGRO DE VARIABLES DE CONTROL DE JUGADORES
        //--------------------------------------------------------------
        //--------------------------------------------------------------

        //NOMBRE DE JUGADORES
        val nJ1=""
        val nJ2=""
        val nJ3=""
        val nJ4=""
        val nJ5=""
        val nJ6=""
        val nJ7=""
        val nJ8=""
        val nJ9=""
        val nJ10=""
        val nJ11=""
        val nJ12=""
        val nJ13=""
        val nJ14=""
        val nJ15=""
        val nJ16=""
        val nJ17=""
        val nJ18=""
        val nJ19=""
        val nJ20=""
        val nJ21=""
        val nJ22=""
        val nJ23=""
        val nJ24=""
        val nJ25=""
        val nJ26=""
        val nJ27=""
        val nJ28=""
        val nJ29=""
        val nJ30=""
        val nJ31=""
        val nJ32=""
        var nJ = arrayOf(nJ1,nJ2,nJ3,nJ4,nJ5,nJ6,nJ7,nJ8,nJ9,nJ10,nJ11,nJ12,nJ13,nJ14,nJ15,nJ16,nJ17,nJ18,nJ19,nJ20,
            nJ21,nJ22,nJ23,nJ24,nJ25,nJ26,nJ27,nJ28,nJ29,nJ30,nJ31,nJ32)

        var p1 = ""
        var p2 = ""
        var p3 = ""
        var p4 = ""
        var p5 = ""
        var p6 = ""
        var p7 = ""
        var p8 = ""
        var p9 = ""
        var p10 = ""
        var p11 = ""
        var p12 = ""
        var p13 = ""
        var p14 = ""
        var p15 = ""
        var p16 = ""
        var p17 = ""
        var p18 = ""
        var p19 = ""
        var p20 = ""
        var p21 = ""
        var p22 = ""
        var p23 = ""
        var p24 = ""
        var p25 = ""
        var p26 = ""
        var p27 = ""
        var p28 = ""
        var p29 = ""
        var p30 = ""
        var p31 = ""
        var p32 = ""

        var p = arrayOf(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16,
            p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32)

        var pun1 = 0
        var pun2 = 0
        var pun3 = 0
        var pun4 = 0
        var pun5 = 0
        var pun6 = 0
        var pun7 = 0
        var pun8 = 0
        var pun9 = 0
        var pun10 = 0
        var pun11 = 0
        var pun12 = 0
        var pun13 = 0
        var pun14 = 0
        var pun15 = 0
        var pun16 = 0
        var pun17 = 0
        var pun18 = 0
        var pun19 = 0
        var pun20 = 0
        var pun21 = 0
        var pun22 = 0
        var pun23 = 0
        var pun24 = 0
        var pun25 = 0
        var pun26 = 0
        var pun27 = 0
        var pun28 = 0
        var pun29 = 0
        var pun30 = 0
        var pun31 = 0
        var pun32 = 0

        var puntos = arrayOf(pun1, pun2, pun3, pun4, pun5, pun6, pun7, pun8, pun9, pun10,
            pun11, pun12, pun13, pun14, pun15, pun16, pun17, pun18, pun19, pun20, pun21,
            pun22, pun23, pun24, pun25, pun26, pun27, pun28, pun29, pun30, pun31, pun32)


        //TERMINA AGUJERO OSCURO DE VARIABLES DE CONTROL DE JUGADORES
        //--------------------------------------------------------------
        //--------------------------------------------------------------

        //REFERENCIAAAAS DE CONTROL QUE SON LAS MISMAS QUE EN EL ACTIVITY ANTERIOR

        var njugador1="j1"
        var njugador2="j2"
        var njugador3="j3"
        var njugador4="j4"
        var njugador5="j5"
        var njugador6="j6"
        var njugador7="j7"
        var njugador8="j8"
        var njugador9="j9"
        var njugador10="j10"
        var njugador11="j11"
        var njugador12="j12"
        var njugador13="j13"
        var njugador14="j14"
        var njugador15="j15"
        var njugador16="j16"
        var njugador17="j17"
        var njugador18="j18"
        var njugador19="j19"
        var njugador20="j20"
        var njugador21="j21"
        var njugador22="j22"
        var njugador23="j23"
        var njugador24="j24"
        var njugador25="j25"
        var njugador26="j26"
        var njugador27="j27"
        var njugador28="j28"
        var njugador29="j29"
        var njugador30="j30"
        var njugador31="j31"
        var njugador32="j32"

        var nJRef = arrayOf(njugador1, njugador2, njugador3, njugador4,njugador5, njugador6, njugador7, njugador8,
            njugador9, njugador10, njugador11, njugador12, njugador13, njugador14, njugador15, njugador16, njugador17,
            njugador18, njugador19, njugador20, njugador21, njugador21, njugador22,njugador23,njugador24,njugador25,
            njugador26,njugador27,njugador28,njugador29,njugador30,njugador31,njugador32)

        var punRef1 = "p1"
        var punRef2 = "p2"
        var punRef3 = "p3"
        var punRef4 = "p4"
        var punRef5 = "p5"
        var punRef6 = "p6"
        var punRef7 = "p7"
        var punRef8 = "p8"
        var punRef9 = "p9"
        var punRef10 = "p10"
        var punRef11 = "p11"
        var punRef12 = "p12"
        var punRef13 = "p13"
        var punRef14 = "p14"
        var punRef15 = "p15"
        var punRef16 = "p16"
        var punRef17 = "p17"
        var punRef18 = "p18"
        var punRef19 = "p19"
        var punRef20 = "p20"
        var punRef21 = "p21"
        var punRef22 = "p22"
        var punRef23 = "p23"
        var punRef24 = "p24"
        var punRef25 = "p25"
        var punRef26 = "p26"
        var punRef27 = "p27"
        var punRef28 = "p28"
        var punRef29 = "p29"
        var punRef30 = "p30"
        var punRef31 = "p31"
        var punRef32 = "p32"

        var punRef = arrayOf(punRef1, punRef2, punRef3, punRef4, punRef5, punRef6, punRef7,
            punRef8, punRef9, punRef10, punRef11, punRef12, punRef13, punRef14,
            punRef15, punRef16, punRef17, punRef18, punRef19, punRef20, punRef21,
            punRef22, punRef23, punRef24, punRef25, punRef26, punRef27, punRef28,
            punRef29, punRef30, punRef31, punRef32)


        // ---------------------------------------------------------------------------------------------

        //VARIABLE QUE CONTROLA EL NÚMERO DE PARTICIPANTES REALES
        var cPar=3
        //VARIABLE QUE AYUDA A DARLE VALOR INT A NPAR HACIENDOLA CPAR
        var numx= arrayOf("4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20",
            "21","22","23","24","25","26","27","28","29","30","31","32")

        //____________________________________________________________________________________________

        var nMesas= arrayOf(tv_mesa1,tv_mesa1,tv_mesa2,tv_mesa2,tv_mesa3,tv_mesa3,tv_mesa4,tv_mesa4,tv_mesa5,tv_mesa5,
            tv_mesa6,tv_mesa6,tv_mesa7,tv_mesa7,tv_mesa8,tv_mesa8,tv_mesa9,tv_mesa9,tv_mesa10,tv_mesa10,
            tv_mesa11,tv_mesa11,tv_mesa12,tv_mesa12,tv_mesa13,tv_mesa13,tv_mesa14,tv_mesa14,tv_mesa15,tv_mesa15,
            tv_mesa16,tv_mesa16)

        //____________________________________________________________________________________________

        var tab= arrayOf(rb_Tm1,rb_Tm1,rb_Tm1,rb_Tm2,rb_Tm1,rb_Tm3,rb_Tm1,rb_Tm4,rb_Tm1,rb_Tm5,rb_Tm1,rb_Tm6,
            rb_Tm1,rb_Tm7,rb_Tm1,rb_Tm8,rb_Tm1,rb_Tm9,rb_Tm1,rb_Tm10,rb_Tm1,rb_Tm11,rb_Tm1,rb_Tm12,
            rb_Tm1,rb_Tm13,rb_Tm1,rb_Tm14,rb_Tm1,rb_Tm15,rb_Tm1,rb_Tm16)

        //____________________________________________________________________________________________

        var radioBPar= arrayOf(rb_J1,rb_J2,rb_J3,rb_J4,rb_J5,rb_J6,rb_J7,rb_J8,rb_J9,rb_J10,rb_J11,rb_J12,rb_J13,
            rb_J14,rb_J15,rb_J16,rb_J17,rb_J18,rb_J19,rb_J20,rb_J21,rb_J22,rb_J23,rb_J24,rb_J25,rb_J26,rb_J27,
            rb_J28,rb_J29,rb_J30,rb_J31,rb_J32)

        //--------------------------------------------------------------------------

        var rGroup = arrayOf(rg_m1,rg_m2,rg_m3,rg_m4,rg_m5,rg_m6,rg_m7,rg_m8,rg_m9,
            rg_m10,rg_m11,rg_m12,rg_m13,rg_m14,rg_m15,rg_m16)
        //-------------------------------------------------------------------------------

        var xtv= arrayOf(xtv1, xtv2, xtv3, xtv4, xtv5, xtv6, xtv7, xtv8, xtv9, xtv10,
            xtv11, xtv12, xtv13, xtv14, xtv15, xtv16, xtv17, xtv18, xtv19, xtv20,
            xtv21, xtv22, xtv23, xtv24, xtv25, xtv26, xtv27, xtv28, xtv29,
            xtv30, xtv31, xtv32)

        var cParDentro=0

        //DARLE UN VALOR INT A NPAR
        for(i in 0..28){
            if(nPar== numx[i]){
                cPar+=1
                break
            }
            else{
                cPar += 1
            }
        }

        //DEFINIR EL NÚMERO DE PARTICIPANTES Y TRAER VALORES DE NOMBRE de los participantes

        for(i in 0..31){
            if(cPar==i) break
            else{
                nJ[i]=objetoIntent.getStringExtra(nJRef[i])
                p[i] = objetoIntent.getStringExtra(punRef[i])
                cParDentro +=1
            }
        }
        var cParX: Int = cParDentro -1

        //Convertir puntos String a Int
        for(i in 0..cParX){
            for(j in 0..10){
                if(p[i] == j.toString()){
                    puntos[i]=j
                    break
                }
            }
        }

        var k = 0


        //Poner los nombres en
        for(j in 10 downTo 0){
            for(i in 0..cParX){
                if(puntos[i] == j){
                    radioBPar[k].text = nJ[i]
                    xtv[k].text = "Puntos: " + puntos[i].toString()
                    k += 1
                }
            }
        }

        var blancas = "Blancas"
        var negras = "Negras"

        for(i in 0..cParX step 2){
            if(i == cParX)break
            else{
                xtv[i].text = xtv[i].text.toString() + " Juega con: " + blancas
            }
        }

        for(i in 1..cParX step 2){
            xtv[i].text = xtv[i].text.toString() + " Juega con: " + negras
        }

        //MOSTRAR Y OCULTAR MESAS Y PARTICIPANTES NECESARIOS
        for (num1 in 0..31 ) {
            if (cPar== num1) break
            else {
                nMesas[num1].visibility = View.VISIBLE
                radioBPar[num1].visibility = View.VISIBLE
                xtv[num1].visibility = View.VISIBLE
                //radioBPar[num1].text = nJ[num1]
                for (num2 in 1..31 step 2){
                    if(radioBPar[num2].isVisible){
                        tab[num1].visibility = View.VISIBLE
                    }
                }
            }
        }

        b1.setOnClickListener() {

            var fRadio = 0
            var cRadio = 0

            if(cParDentro in 1..2){
                cRadio =1
            }
            if(cParDentro in 3..4){
                cRadio =2
            }
            if(cParDentro in 5..6){
                cRadio =3
            }
            if(cParDentro in 7..8){
                cRadio =4
            }
            if(cParDentro in 9..10){
                cRadio =5
            }
            if(cParDentro in 11..12){
                cRadio =6
            }
            if(cParDentro in 13..14){
                cRadio =7
            }
            if(cParDentro in 15..16){
                cRadio =8
            }
            if(cParDentro in 17..18){
                cRadio =9
            }
            if(cParDentro in 19..20){
                cRadio =10
            }
            if(cParDentro in 21..22){
                cRadio =11
            }
            if(cParDentro in 23..24){
                cRadio =12
            }
            if(cParDentro in 25..26){
                cRadio =13
            }
            if(cParDentro in 27..28){
                cRadio =14
            }
            if(cParDentro in 29..30){
                cRadio =15
            }
            if(cParDentro in 31..32){
                cRadio =16
            }

            for(i in 0..cRadio){
                if(i == cRadio){
                    break
                    fRadio += 1
                }
                else{
                    if(rGroup[(i)].checkedRadioButtonId == -1){
                        //tv_mesa1.text = "falta llenar"
                        Toast.makeText(this, "Falta seleccionar victorias", Toast.LENGTH_LONG)
                            .show();
                        fRadio = 0
                    }
                    else{
                        fRadio += 1

                    }
                }

            }

            //Cuando todo ha sido llenado...
            if(cRadio == fRadio){
                //Se le asigna una puntuación a los participantes.
                for (j in 0..cParDentro){
                    if (j == cParDentro)break
                    else{
                        for(i in 0..cParX){
                            if(radioBPar[j].isChecked){
                                if (radioBPar[j].text.toString() == nJ[i].toString()){
                                    puntos[i] += 2
                                }
                            }
                        }
                    }
                }

                //Se le asigna un punto a casa jugador de acuerdo a las tablas.
                for(j in 1..cParDentro step 2) {
                    if(j == cParDentro)break
                    else{
                        if (tab[j].isChecked) {
                            for (i in 0..cParX) {
                                if (radioBPar[j-1].text == nJ[i]) {
                                    puntos[i] += 1
                                }
                                if (radioBPar[j].text == nJ[i]) {
                                    puntos[i] += 1
                                }
                            }
                        }
                    }
                }
                var intent = Intent(this, Pareo4::class.java)

                if(b1.text == "Finalizar torneo"){
                    intent = Intent(this, ResFinal::class.java)
                }

                for (i in 0..cParX) {
                    intent.putExtra(nJRef[i], nJ[i])
                    intent.putExtra(punRef[i], puntos[i].toString())
                }

                intent.putExtra("nParticipantesEnTorneo", nPar)
                intent.putExtra("nRondasEnTorneo", nRondas)
                intent.putExtra("nTorneo", nTorneo)
                startActivity(intent)
            }
        }
        //--------------------------------------------------------------------
    }
}