package com.example.jochichessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_res_final.*

class ResFinal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_res_final)

        val objetoIntent: Intent = intent
        var nPar=objetoIntent.getStringExtra("nParticipantesEnTorneo")
        var nRondas=objetoIntent.getStringExtra("nRondasEnTorneo")
        var nTorneo=objetoIntent.getStringExtra("nTorneo")

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


        //-------------------------------------------------------------------------------------

        var lugar = arrayOf(l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,
            l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32)

        var name = arrayOf(n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15,n16,n17,
        n18,n19,n20,n21,n22,n23,n24,n25,n26,n27,n28,n29,n30,n31,n32)

        var ps = arrayOf(ps1, ps2, ps3, ps4, ps5, ps6, ps7, ps8, ps9, ps10, ps11, ps12, ps13, ps14,
            ps15, ps16, ps17, ps18, ps19, ps20, ps21, ps22, ps23, ps24, ps25, ps26,
            ps27, ps28, ps29, ps30, ps31, ps32)

        var bh = arrayOf(bh1,bh2,bh3,bh4,bh5,bh6,bh7,bh8,bh9,bh10,bh11,bh12,bh13,bh14,bh15,bh16,
            bh17, bh18,bh19,bh20,bh21,bh22,bh23,bh24,bh25,bh26,bh27,bh28,bh29,bh30,bh31,bh32)

        var tr = arrayOf(tr1, tr2, tr3, tr4, tr5, tr6, tr7, tr8, tr9, tr10,
            tr11, tr12, tr13, tr14, tr15, tr16, tr17, tr18, tr19, tr20,
            tr21, tr22, tr23, tr24, tr25, tr26, tr27, tr28, tr29, tr30, tr31, tr32 )


        // ---------------------------------------------------------------------------------------------
        //VARIABLE QUE CONTROLA EL NÚMERO DE PARTICIPANTES REALES
        var cPar=3
        //VARIABLE QUE AYUDA A DARLE VALOR INT A NPAR HACIENDOLA CPAR
        var numx= arrayOf("4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20",
            "21","22","23","24","25","26","27","28","29","30","31","32")

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


        //Poner los nombres en los radios y en los xtv
        for(j in 10 downTo 0){
            for(i in 0..cParX){
                if(puntos[i] == j){
                    name[k].text = nJ[i]
                    ps[k].text = puntos[i].toString()
                    k += 1
                }
            }
        }

        //MOSTRAR Y OCULTAR MESAS Y PARTICIPANTES NECESARIOS
        for (i in 0..31 ) {
            if (cPar== i) break
            else {
                tr[i].visibility = View.VISIBLE

            }
            }
        }


    }
