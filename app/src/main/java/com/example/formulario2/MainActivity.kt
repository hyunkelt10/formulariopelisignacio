package com.example.formulario2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.formulario2.databinding.ActivityMain2Binding
import com.example.formulario2.databinding.ActivityMainBinding
import android.content.Intent
import android.view.View
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    private var year = arrayOf("")
    private var tipo = ""
    private var cat = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)


        b.btnEnviar.setOnClickListener { getAndSend() }
        b.rdbpelicula.setOnClickListener { tipo = "Pelicula" }
        b.rdbSerie.setOnClickListener { tipo = "Serie" }

        b.cbAccion.setOnClickListener {

        }

        getSpinner(this,b.spinner, year, R.array.año )

    }

    fun getAndSend(){
        val myIntent = Intent (this, MainActivity2::class.java)
        myIntent.putExtra("TIPO" , tipo)
        myIntent.putExtra("TITULO", b.tvTitulo.text.toString())
        myIntent.putExtra("Spiner", year[0])
        myIntent.putExtra("CATEGORIA", cat.toString())

        startActivity(myIntent)

    }

    fun onCheckBoxClicked(view: View){
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked

            when (view.id) {
                R.id.cbHumor -> { if (checked) {
                    checkCategory(b.cbHumor.text.toString())
                } else {
                    unCheckCategory(b.cbHumor.text.toString())
                }
                }
                R.id.cbAccion -> { if (checked) {
                    checkCategory(b.cbAccion.text.toString())
                } else {
                    unCheckCategory(b.cbAccion.text.toString())
                }
                }
                R.id.cbTrhiller -> { if (checked) {
                    checkCategory(b.cbTrhiller.text.toString())
                } else {
                    unCheckCategory(b.cbTrhiller.text.toString())
                }
                }
                R.id.cbRomantica -> { if (checked) {
                    checkCategory(b.cbRomantica.text.toString())
                } else {
                    unCheckCategory(b.cbRomantica.text.toString())
                }
                }
                R.id.cbTerror -> { if (checked) {
                    checkCategory(b.cbTerror.text.toString())
                } else {
                    unCheckCategory(b.cbTerror.text.toString())
                }
                }
                R.id.cbInfantil -> { if (checked) {
                    checkCategory(b.cbInfantil.text.toString())
                } else {
                    unCheckCategory(b.cbInfantil.text.toString())
                }
                }


            }
        }
    }
    fun checkCategory(str:String){
        if (!cat.contains(str)) { cat.add(str) }
    }
    fun unCheckCategory(str:String){
        if (cat.contains(str)) { cat.remove(str) }
    }


}