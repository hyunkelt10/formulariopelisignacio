package com.example.formulario2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.formulario2.databinding.ActivityMain2Binding
import com.example.formulario2.databinding.ActivityMainBinding
import android.content.Intent

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        var pelicula = ""

        setContentView(b.root)


        b.btnEnviar.setOnClickListener {
            val myintent = Intent (this, MainActivity2::class.java)
            myintent.putExtra("METRAJE", b.rdbpelicula.text)
            myintent.putExtra("SERIE", b.rdbSerie.text )
            startActivity(myintent)



        }
        b.rdbpelicula.setOnClickListener {
            pelicula = "pelicula"


        }
        b.rdbSerie.setOnClickListener {
            pelicula = "serie"


        }
        b.cbAccion.setOnClickListener {

        }







    }
}