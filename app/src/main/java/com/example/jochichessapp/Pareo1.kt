package com.example.jochichessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.View
import android.widget.Toast
import androidx.core.view.isNotEmpty
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_pareo1.*
import kotlinx.android.synthetic.main.activity_torn_rondas2.*
import java.util.*
import kotlin.random.Random

class Pareo1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pareo1)


        val objetoIntent: Intent = intent
        var nPar=objetoIntent.getStringExtra("nParticipantesEnTorneo")
        var nRondas=objetoIntent.getStringExtra("nRondasEnTorneo")
        var nTorneo=objetoIntent.getStringExtra("nTorneo")

        tv1x.text = "Ronda 1 de $nRondas, del torneo $nTorneo con $nPar Participantes"

        if(nRondas == "1"){
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

        //VARIABLES DE ID DE JUGADORES
        var ID1= 0
        var ID2= 0
        var ID3= 0
        var ID4= 0
        var ID5= 0
        var ID6= 0
        var ID7= 0
        var ID8= 0
        var ID9= 0
        var ID10= 0
        var ID11= 0
        var ID12= 0
        var ID13= 0
        var ID14= 0
        var ID15= 0
        var ID16= 0
        var ID17= 0
        var ID18= 0
        var ID19= 0
        var ID20= 0
        var ID21= 0
        var ID22= 0
        var ID23= 0
        var ID24= 0
        var ID25= 0
        var ID26= 0
        var ID27= 0
        var ID28= 0
        var ID29= 0
        var ID30= 0
        var ID31= 0
        var ID32= 0

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


        //VARIABLES DE CONTROL QUE SON LAS MISMAS QUE EN EL ACTIVITY ANTERIOR

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
        for(numy in 0..28){
            if(nPar== numx[numy]){
                cPar+=1
                break
            }
            else{
                cPar += 1
            }
        }

        //DEFINIR EL NÚMERO DE PARTICIPANTES Y TRAER VALORES DE NOMBRE de los participantes
        for(num1 in 0..31){
            if(cPar==num1) break
            else{
                nJ[num1]=objetoIntent.getStringExtra(nJRef[num1])
                cParDentro +=1
            }
        }

        //AGUJERO OSCURO DE ASIGNAR ID RANDOM
        //__________________________________________________________
        //__________________________________________________________

        ID1 = (1..cParDentro).random()
        ID2 = (1..cParDentro).random()
        ID3 = (1..cParDentro).random()
        ID4 = (1..cParDentro).random()
        ID5 = (1..cParDentro).random()
        ID6 = (1..cParDentro).random()
        ID7 = (1..cParDentro).random()
        ID8 = (1..cParDentro).random()
        ID9 = (1..cParDentro).random()
        ID10 = (1..cParDentro).random()
        ID11 = (1..cParDentro).random()
        ID12 = (1..cParDentro).random()
        ID13 = (1..cParDentro).random()
        ID14 = (1..cParDentro).random()
        ID15 = (1..cParDentro).random()
        ID16 = (1..cParDentro).random()
        ID17 = (1..cParDentro).random()
        ID18 = (1..cParDentro).random()
        ID19 = (1..cParDentro).random()
        ID20 = (1..cParDentro).random()
        ID21 = (1..cParDentro).random()
        ID22 = (1..cParDentro).random()
        ID23 = (1..cParDentro).random()
        ID24 = (1..cParDentro).random()
        ID25 = (1..cParDentro).random()
        ID26 = (1..cParDentro).random()
        ID27 = (1..cParDentro).random()
        ID28 = (1..cParDentro).random()
        ID29 = (1..cParDentro).random()
        ID30 = (1..cParDentro).random()
        ID31 = (1..cParDentro).random()
        ID32 = (1..cParDentro).random()


        while(ID1== ID2){
            ID2 = (1..cParDentro).random()
        }
        while(ID3== ID1 || ID3== ID2){
            ID3 = (1..cParDentro).random()
        }
        while(ID4== ID1 || ID4== ID2 || ID4== ID3){
            ID4 = (1..cParDentro).random()
        }
        if(cParDentro >= 5)
        while(ID5== ID1 || ID5== ID2 || ID5== ID3 || ID5== ID4){
            ID5= (1..cParDentro).random()
        }
        if (cParDentro >= 6)
        while(ID6== ID1 || ID6== ID2 || ID6== ID3 || ID6== ID4 || ID6== ID5){
            ID6= (1..cParDentro).random()
        }
        if(cParDentro >= 7)
        while(ID7== ID1 || ID7== ID2 || ID7== ID3 || ID7== ID4 || ID7== ID5 || ID7== ID6){
            ID7= (1..cParDentro).random()
        }
        if(cParDentro >=8)
        while(ID8== ID1 || ID8== ID2 || ID8== ID3 || ID8== ID4 || ID8== ID5 || ID8== ID6 || ID8== ID7){
            ID8= (1..cParDentro).random()
        }
        if (cParDentro >=9)
        while(ID9== ID1 || ID9== ID2 || ID9== ID3 || ID9== ID4 || ID9== ID5 || ID9== ID6 || ID9== ID7
            || ID9== ID8){
            ID9= (1..cParDentro).random()
        }
        if (cParDentro >=10)
        while(ID10== ID1 || ID10== ID2 || ID10== ID3 || ID10== ID4 || ID10== ID5 || ID10== ID6
            || ID10== ID7 || ID10== ID8 || ID10== ID9 ){
            ID10= (1..cParDentro).random()
        }
        if (cParDentro >=11)
        while(ID11== ID1 || ID11== ID2 || ID11== ID3 || ID11== ID4 || ID11== ID5 || ID11== ID6
            || ID11== ID7 || ID11== ID8 || ID11== ID9 || ID11== ID10){
            ID11= (1..cParDentro).random()
        }
        if (cParDentro >= 12)
        while(ID12== ID1 || ID12== ID2 || ID12== ID3 || ID12== ID4 || ID12== ID5 || ID12== ID6
            || ID12== ID7 || ID12== ID8 || ID12== ID9 || ID12== ID10 || ID12== ID11){
            ID12= (1..cParDentro).random()
        }
        if (cParDentro >= 13)
            while(ID13== ID1 || ID13== ID2 || ID13== ID3 || ID13== ID4 || ID13== ID5 || ID13== ID6
                || ID13== ID7 || ID13== ID8 || ID13== ID9 || ID13== ID10 || ID13== ID11
                || ID13== ID12){
                ID13= (1..cParDentro).random()
            }
        if (cParDentro >= 14)
            while(ID14== ID1 || ID14== ID2 || ID14== ID3 || ID14== ID4 || ID14== ID5 || ID14== ID6
                || ID14== ID7 || ID14== ID8 || ID14== ID9 || ID14== ID10 || ID14== ID11 || ID14== ID12
                || ID14== ID13){
                ID14= (1..cParDentro).random()
            }
        if (cParDentro >= 15)
            while(ID15== ID1 || ID15== ID2 || ID15== ID3 || ID15== ID4 || ID15== ID5 || ID15== ID6
                || ID15== ID7 || ID15== ID8 || ID15== ID9 || ID15== ID10 || ID15== ID11 || ID15== ID12
                || ID15== ID13 || ID15== ID14){
                ID15= (1..cParDentro).random()
            }
        if (cParDentro >= 16)
            while(ID16== ID1 || ID16== ID2 || ID16== ID3 || ID16== ID4 || ID16== ID5 || ID16== ID6
                || ID16== ID7 || ID16== ID8 || ID16== ID9 || ID16== ID10 || ID16== ID11 || ID16== ID12
                || ID16== ID13 || ID16== ID14 || ID16== ID15 ){
                ID16= (1..cParDentro).random()
            }
        if (cParDentro >= 17)
            while(ID17== ID1 || ID17== ID2 || ID17== ID3 || ID17== ID4 || ID17== ID5 || ID17== ID6
                || ID17== ID7 || ID17== ID8 || ID17== ID9 || ID17== ID10 || ID17== ID11 || ID17== ID12
                || ID17== ID13 || ID17== ID14 || ID17== ID15 || ID17== ID16){
                ID17= (1..cParDentro).random()
            }
        if (cParDentro >= 18)
            while(ID18== ID1 || ID18== ID2 || ID18== ID3 || ID18== ID4 || ID18== ID5 || ID18== ID6
                || ID18== ID7 || ID18== ID8 || ID18== ID9 || ID18== ID10 || ID18== ID11 || ID18== ID12
                || ID18== ID13 || ID18== ID14 || ID18== ID15 || ID18== ID16 || ID18== ID17){
                ID18= (1..cParDentro).random()
            }
        if (cParDentro >= 19)
            while(ID19== ID1 || ID19== ID2 || ID19== ID3 || ID19== ID4 || ID19== ID5 || ID19== ID6
                || ID19== ID7 || ID19== ID8 || ID19== ID9 || ID19== ID10 || ID19== ID11 || ID19== ID12
                || ID19== ID13 || ID19== ID14 || ID19== ID15 || ID19== ID16 || ID19== ID17
                || ID19== ID18){
                ID19= (1..cParDentro).random()
            }
        if (cParDentro >= 20)
            while(ID20== ID1 || ID20== ID2 || ID20== ID3 || ID20== ID4 || ID20== ID5 || ID20== ID6
                || ID20== ID7 || ID20== ID8 || ID20== ID9 || ID20== ID10 || ID20== ID11 || ID20== ID12
                || ID20== ID13 || ID20== ID14 || ID20== ID15 || ID20== ID16 || ID20== ID17
                || ID20== ID18 || ID20== ID19){
                ID20= (1..cParDentro).random()
            }
        if (cParDentro >= 21)
            while(ID21== ID1 || ID21== ID2 || ID21== ID3 || ID21== ID4 || ID21== ID5 || ID21== ID6
                || ID21== ID7 || ID21== ID8 || ID21== ID9 || ID21== ID10 || ID21== ID11 || ID21== ID12
                || ID21== ID13 || ID21== ID14 || ID21== ID15 || ID21== ID16 || ID21== ID17
                || ID21== ID18 || ID21== ID19 || ID21== ID20){
                ID21= (1..cParDentro).random()
            }
        if (cParDentro >= 22)
            while(ID22== ID1 || ID22== ID2 || ID22== ID3 || ID22== ID4 || ID22== ID5 || ID22== ID6
                || ID22== ID7 || ID22== ID8 || ID22== ID9 || ID22== ID10 || ID22== ID11 || ID22== ID12
                || ID22== ID13 || ID22== ID14 || ID22== ID15 || ID22== ID16 || ID22== ID17
                || ID22== ID18 || ID22== ID19 || ID22== ID20 || ID22== ID21){
                ID22= (1..cParDentro).random()
            }
        if (cParDentro >= 23)
            while(ID23== ID1 || ID23== ID2 || ID23== ID3 || ID23== ID4 || ID23== ID5 || ID23== ID6
                || ID23== ID7 || ID23== ID8 || ID23== ID9 || ID23== ID10 || ID23== ID11 || ID23== ID12
                || ID23== ID13 || ID23== ID14 || ID23== ID15 || ID23== ID16 || ID23== ID17
                || ID23== ID18 || ID23== ID19 || ID23== ID20 || ID23== ID21 || ID23== ID22){
                ID23= (1..cParDentro).random()
            }
        if (cParDentro >= 24)
            while(ID24== ID1 || ID24== ID2 || ID24== ID3 || ID24== ID4 || ID24== ID5 || ID24== ID6
                || ID24== ID7 || ID24== ID8 || ID24== ID9 || ID24== ID10 || ID24== ID11 || ID24== ID12
                || ID24== ID13 || ID24== ID14 || ID24== ID15 || ID24== ID16 || ID24== ID17
                || ID24== ID18 || ID24== ID19 || ID24== ID20 || ID24== ID21 || ID24== ID22
                || ID24== ID23){
                ID24= (1..cParDentro).random()
            }
        if (cParDentro >= 25)
            while(ID25== ID1 || ID25== ID2 || ID25== ID3 || ID25== ID4 || ID25== ID5 || ID25== ID6
                || ID25== ID7 || ID25== ID8 || ID25== ID9 || ID25== ID10 || ID25== ID11 || ID25== ID12
                || ID25== ID13 || ID25== ID14 || ID25== ID15 || ID25== ID16 || ID25== ID17
                || ID25== ID18 || ID25== ID19 || ID25== ID20 || ID25== ID21 || ID25== ID22
                || ID25== ID23 || ID25== ID24){
                ID25= (1..cParDentro).random()
            }
        if (cParDentro >= 26)
            while(ID26== ID1 || ID26== ID2 || ID26== ID3 || ID26== ID4 || ID26== ID5 || ID26== ID6
                || ID26== ID7 || ID26== ID8 || ID26== ID9 || ID26== ID10 || ID26== ID11 || ID26== ID12
                || ID26== ID13 || ID26== ID14 || ID26== ID15 || ID26== ID16 || ID26== ID17
                || ID26== ID18 || ID26== ID19 || ID26== ID20 || ID26== ID21 || ID26== ID22
                || ID26== ID23 || ID26== ID24 || ID26== ID25){
                ID26= (1..cParDentro).random()
            }
        if (cParDentro >= 27)
            while(ID27== ID1 || ID27== ID2 || ID27== ID3 || ID27== ID4 || ID27== ID5 || ID27== ID6
                || ID27== ID7 || ID27== ID8 || ID27== ID9 || ID27== ID10 || ID27== ID11 || ID27== ID12
                || ID27== ID13 || ID27== ID14 || ID27== ID15 || ID27== ID16 || ID27== ID17
                || ID27== ID18 || ID27== ID19 || ID27== ID20 || ID27== ID21 || ID27== ID22
                || ID27== ID23 || ID27== ID24 || ID27== ID25 || ID27== ID26){
                ID27= (1..cParDentro).random()
            }
        if (cParDentro >= 28)
            while(ID28== ID1 || ID28== ID2 || ID28== ID3 || ID28== ID4 || ID28== ID5 || ID28== ID6
                || ID28== ID7 || ID28== ID8 || ID28== ID9 || ID28== ID10 || ID28== ID11 || ID28== ID12
                || ID28== ID13 || ID28== ID14 || ID28== ID15 || ID28== ID16 || ID28== ID17
                || ID28== ID18 || ID28== ID19 || ID28== ID20 || ID28== ID21 || ID28== ID22
                || ID28== ID23 || ID28== ID24 || ID28== ID25 || ID28== ID26 || ID28== ID27){
                ID28= (1..cParDentro).random()
            }
        if (cParDentro >= 29)
            while(ID29== ID1 || ID29== ID2 || ID29== ID3 || ID29== ID4 || ID29== ID5 || ID29== ID6
                || ID29== ID7 || ID29== ID8 || ID29== ID9 || ID29== ID10 || ID29== ID11 || ID29== ID12
                || ID29== ID13 || ID29== ID14 || ID29== ID15 || ID29== ID16 || ID29== ID17
                || ID29== ID18 || ID29== ID19 || ID29== ID20 || ID29== ID21 || ID29== ID22
                || ID29== ID23 || ID29== ID24 || ID29== ID25 || ID29== ID26 || ID29== ID27
                || ID29== ID28){
                ID29= (1..cParDentro).random()
            }
        if (cParDentro >= 30)
            while(ID30== ID1 || ID30== ID2 || ID30== ID3 || ID30== ID4 || ID30== ID5 || ID30== ID6
                || ID30== ID7 || ID30== ID8 || ID30== ID9 || ID30== ID10 || ID30== ID11 || ID30== ID12
                || ID30== ID13 || ID30== ID14 || ID30== ID15 || ID30== ID16 || ID30== ID17
                || ID30== ID18 || ID30== ID19 || ID30== ID20 || ID30== ID21 || ID30== ID22
                || ID30== ID23 || ID30== ID24 || ID30== ID25 || ID30== ID26 || ID30== ID27
                || ID30== ID28 || ID30== ID29){
                ID30= (1..cParDentro).random()
            }
        if (cParDentro >= 31)
            while(ID31== ID1 || ID31== ID2 || ID31== ID3 || ID31== ID4 || ID31== ID5 || ID31== ID6
                || ID31== ID7 || ID31== ID8 || ID31== ID9 || ID31== ID10 || ID31== ID11 || ID31== ID12
                || ID31== ID13 || ID31== ID14 || ID31== ID15 || ID31== ID16 || ID31== ID17
                || ID31== ID18 || ID31== ID19 || ID31== ID20 || ID31== ID21 || ID31== ID22
                || ID31== ID23 || ID31== ID24 || ID31== ID25 || ID31== ID26 || ID31== ID27
                || ID31== ID28 || ID31== ID29 || ID31== ID30){
                ID31= (1..cParDentro).random()
            }
        if (cParDentro == 32)
            while(ID32== ID1 || ID32== ID2 || ID32== ID3 || ID32== ID4 || ID32== ID5 || ID32== ID6
                || ID32== ID7 || ID32== ID8 || ID32== ID9 || ID32== ID10 || ID32== ID11 || ID32== ID12
                || ID32== ID13 || ID32== ID14 || ID32== ID15 || ID32== ID16 || ID32== ID17
                || ID32== ID18 || ID32== ID19 || ID32== ID20 || ID32== ID21 || ID32== ID22
                || ID32== ID23 || ID32== ID24 || ID32== ID25 || ID32== ID26 || ID32== ID27
                || ID32== ID28 || ID32== ID29 || ID32== ID30 || ID32== ID31){
                ID32= (1..cParDentro).random()
            }

        var id = arrayOf(ID1, ID2, ID3, ID4, ID5, ID6, ID7, ID8, ID9, ID10, ID11, ID12, ID13, ID14, ID15,
            ID16, ID17, ID18, ID19, ID20, ID21, ID22, ID23, ID24, ID25, ID26, ID27, ID28, ID29,
            ID30, ID31, ID32)

        //TERMINA AGUJERO NEGRO DE ASIGNACIÓN DE ID RANDOM

       var cParX: Int = cParDentro -1
        var k: Int = 0





        //HASTA AQUÍ TENGO EL NÚMERO DE PARTICIPANTES NETOS EN INT Y LOS NOMBRES NECESARIO
            for (j in 1.. cParDentro){
                for(i in 0..cParX){
                    if(id[i]== j){
                        radioBPar[k].text = nJ[i]
                        xtv[i].text = "Puntos: " + puntos[i].toString()
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

                var intent = Intent(this, Pareo2::class.java)

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


    }
}