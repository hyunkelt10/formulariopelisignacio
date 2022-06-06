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
        val str = """   Datos introducidos
            Título: ${datos?.get("TITULO")}
            Año: ${datos?.get("Spiner")}
            Tipo: ${datos?.get("TIPO")}
             Categorías: ${datos?.get("CATEGORIA")}
        """.trimIndent()
        msj(this,str,false)
        b.tvDatos.text = str
        b.btnVolver.setOnClickListener { onBackPressed() }









    }
}