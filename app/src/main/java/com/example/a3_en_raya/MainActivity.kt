package com.example.a3_en_raya

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

     fun obtenerAleatorio():Int{
        val aleatorio = (0..8).random()
        return aleatorio
    }

    fun obtenerAleatorioLibre(array: ArrayList<Int>):Int{
        var aleatorio = obtenerAleatorio()
        while ( array[aleatorio] < 0){
            aleatorio = obtenerAleatorio()
        }
        return aleatorio
    }


    fun haylibres(array: ArrayList<Int>): Boolean{
        var response = false

        for(item in array){
            if(item > 0){
                response = true
            }
        }

        return response
    }


    fun jugadorGano(array: ArrayList<Int>):Boolean{
        var response =false


        if(
            (array[0] == -1 && array[1] == -1 && array[2] == -1 ) ||
            (array[3] == -1 && array[4] == -1 && array[5] == -1 ) ||
            (array[6] == -1 && array[7] == -1 && array[8] == -1 ) ||
            (array[0] == -1 && array[3] == -1 && array[6] == -1 ) ||
            (array[1] == -1 && array[4] == -1 && array[7] == -1 ) ||
            (array[2] == -1 && array[5] == -1 && array[8] == -1 ) ||
            (array[0] == -1 && array[4] == -1 && array[8] == -1 ) ||
            (array[2] == -1 && array[4] == -1 && array[6] == -1 )
        ){
            response = true
        }




        return response
    }


    fun computadoraGano(array: ArrayList<Int>):Boolean{
        var response =false


        if(
            (array[0] == -2 && array[1] == -2 && array[2] == -2 ) ||
            (array[3] == -2 && array[4] == -2 && array[5] == -2 ) ||
            (array[6] == -2 && array[7] == -2 && array[8] == -2 ) ||
            (array[0] == -2 && array[3] == -2 && array[6] == -2 ) ||
            (array[1] == -2 && array[4] == -2 && array[7] == -2 ) ||
            (array[2] == -2 && array[5] == -2 && array[8] == -2 ) ||
            (array[0] == -2 && array[4] == -2 && array[8] == -2 ) ||
            (array[2] == -2 && array[4] == -2 && array[6] == -2 )
        ){
            response = true
        }



        return response
    }

    fun alguienGano(array: ArrayList<Int>):Boolean{

        print(array)
        var response = false
        if( computadoraGano(array) || jugadorGano(array)){
            response = true
        }
        return response
    }


    fun jugarPC(array: ArrayList<Int>){
        var aleatorio = obtenerAleatorioLibre(array)




        when(aleatorio) {
            0 -> {
                x1.setBackgroundColor(Color.BLUE)
                array[0] = -2
            }
            1 -> {
                x2.setBackgroundColor(Color.BLUE)
                array[1] = -2
            }
            2 -> {
                x3.setBackgroundColor(Color.BLUE)
                array[2] = -2
            }
            3 -> {
                y1.setBackgroundColor(Color.BLUE)
                array[3] = -2
            }
            4 -> {
                y2.setBackgroundColor(Color.BLUE)
                array[4] = -2
            }
            5 -> {
                y3.setBackgroundColor(Color.BLUE)
                array[5] = -2
            }
            6 -> {
                z1.setBackgroundColor(Color.BLUE)
                array[6] = -2
            }
            7 -> {
                z2.setBackgroundColor(Color.BLUE)
                array[7] = -2
            }
            8 -> {
                z3.setBackgroundColor(Color.BLUE)
                array[8] = -2
            }
        }

    }


    fun crearAlerta(context: Context){

        println("ALERTA")


    }

//    fun selected(view: View)
//    {
//        println("ALERTA")
//
//        val builder = AlertDialog.Builder(view.context)
//        builder.setTitle("Android Alert")
//        builder.setMessage("We have a message")
//
//        builder.setPositiveButton("Ok") { _, _ ->
//            Toast.makeText(view.context, "Okey", Toast.LENGTH_LONG).show()
//        }
//
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val array = arrayListOf(1,2,3,4,5,6,7,8,9)







        x1.setOnClickListener(){
            x1.setBackgroundColor(Color.RED)
            array[0] = -1

            if(alguienGano(array)){
                crearAlerta(it.context)
            }

            if(haylibres(array)){
                jugarPC(array)
            }

        }

        x2.setOnClickListener(){
            x2.setBackgroundColor(Color.RED)
            array[1] = -1

            if(alguienGano(array)){
                crearAlerta(it.context)
            }


            if(haylibres(array)){
                jugarPC(array)
            }

        }

        x3.setOnClickListener(){
            x3.setBackgroundColor(Color.RED)
            array[2] = -1

            if(alguienGano(array)){
                crearAlerta(it.context)
            }

            if(haylibres(array)){
                jugarPC(array)
            }
        }

        y1.setOnClickListener(){
            y1.setBackgroundColor(Color.RED)
            array[3] = -1

            if(alguienGano(array)){
                crearAlerta(it.context)
            }

            if(haylibres(array)){
                jugarPC(array)
            }
        }

        y2.setOnClickListener(){
            y2.setBackgroundColor(Color.RED)
            array[4] = -1

            if(alguienGano(array)){
                crearAlerta(it.context)
            }

            if(haylibres(array)){
                jugarPC(array)
            }
        }

        y3.setOnClickListener(){
            y3.setBackgroundColor(Color.RED)
            array[5] = -1

            if(alguienGano(array)){
                crearAlerta(it.context)
            }

            if(haylibres(array)){
                jugarPC(array)
            }
        }

        z1.setOnClickListener(){
            z1.setBackgroundColor(Color.RED)
            array[6] = -1

            if(alguienGano(array)){
                crearAlerta(it.context)
            }


            if(haylibres(array)){
                jugarPC(array)
            }
        }

        z2.setOnClickListener(){
            z2.setBackgroundColor(Color.RED)
            array[7] = -1

            if(alguienGano(array)){
                crearAlerta(it.context)
            }

            if(haylibres(array)){
                jugarPC(array)
            }
        }

        z3.setOnClickListener(){
            z3.setBackgroundColor(Color.RED)
            array[8] = -2

            if(alguienGano(array)){
                crearAlerta(it.context)
            }


            if(haylibres(array)){
                jugarPC(array)
            }
        }


    }
}
