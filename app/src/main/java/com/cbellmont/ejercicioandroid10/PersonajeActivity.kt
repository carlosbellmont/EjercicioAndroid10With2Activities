package com.cbellmont.ejercicioandroid10

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.cbellmont.ejercicioandroid10.databinding.ActivityPersonajeBinding

class PersonajeActivity : AppCompatActivity() {

    lateinit var binding : ActivityPersonajeBinding

    companion object {
        const val VALOR1 = "VALOR_1"
        const val VALOR2 = "VALOR_2"
        const val VALOR3 = "VALOR_3"
        const val VALOR4 = "VALOR_4"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPersonajeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra(VALOR1)
        val race = intent.getStringExtra(VALOR2)
        val imageId = intent.getIntExtra(VALOR3, R.mipmap.ic_launcher)
        val esBueno = intent.getBooleanExtra(VALOR4, false)

        if (name != null && race != null) {
            val personaje = Personaje(name, race, imageId, esBueno)
            val colorId = if (personaje.esBueno) R.color.colorBgBueno else R.color.colorBgMalo
            binding.root.setBackgroundColor(ContextCompat.getColor(this, colorId))
            binding.ivPhoto.setImageResource(personaje.image)
            binding.tvName.text = personaje.nombre
            binding.tvRace.text = personaje.raza
        }

    }
}