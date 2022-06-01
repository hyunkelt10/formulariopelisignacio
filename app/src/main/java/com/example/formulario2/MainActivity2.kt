package com.example.formulario2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.formulario2.databinding.ActivityMain2Binding
import com.example.formulario2.databinding.ActivityMainBinding


class MainActivity2 : AppCompatActivity() {
    private lateinit var b: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(b.root)

        val datos = intent.extras
        b.tvDatos.text = datos?.get("METRAJE").toString()
        b.tvDatos.text = datos?.get("SERIE").toString()









    }
}