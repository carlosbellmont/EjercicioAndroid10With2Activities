package com.cbellmont.ejercicioandroid10

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.cbellmont.ejercicioandroid10.databinding.ActivityMainBinding
import com.cbellmont.ejercicioandroid10.databinding.ItemLayoutBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val personaje1 = Personaje("Aragorn", "Humano", R.mipmap.aragorn, true)
        val personaje2 = Personaje("Gandalf", "Mago", R.mipmap.gandalf, true)
        val personaje3 = Personaje("Boromir", "Humano", R.mipmap.boromir, true)
        val personaje4 = Personaje("Legolas", "Elfo", R.mipmap.legolas, true)
        val personaje5 = Personaje("Orco Feo", "Orco", R.mipmap.orco, false)
        val personaje6 = Personaje("Smagu", "Dragon", R.mipmap.smagu, false)

        fillView(binding.layoutPersonaje1, personaje1)
        fillView(binding.layoutPersonaje2, personaje2)
        fillView(binding.layoutPersonaje3, personaje3)
        fillView(binding.layoutPersonaje4, personaje4)
        fillView(binding.layoutPersonaje5, personaje5)
        fillView(binding.layoutPersonaje6, personaje6)
    }

    private fun fillView(item: ItemLayoutBinding, personaje: Personaje) {
        val colorId = if (personaje.esBueno) R.color.colorBgBueno else R.color.colorBgMalo
        // Utilizamos ContextCompat.getColor(this, color) para obtener un color, hasta ahora solo
        // teníamos un id del color
        val color = ContextCompat.getColor(this, colorId)
        item.root.setBackgroundColor(color)
        item.iwFoto.setImageResource(personaje.image)
        item.tvNombre.text = personaje.nombre
        item.tvRaza.text = personaje.raza
    }

}