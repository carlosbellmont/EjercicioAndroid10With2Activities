package com.cbellmont.ejercicioandroid10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val personaje1 = Personaje("Aragorn", "Humano", R.mipmap.aragorn, true)
        val personaje2 = Personaje("Gandalf", "Mago", R.mipmap.gandalf, true)
        val personaje3 = Personaje("Boromir", "Humano", R.mipmap.boromir, true)
        val personaje4 = Personaje("Legolas", "Elfo", R.mipmap.legolas, true)
        val personaje5 = Personaje("Orco Feo", "Orco", R.mipmap.orco, false)
        val personaje6 = Personaje("Smagu", "Dragon", R.mipmap.smagu, false)

        fillView(findViewById(R.id.layoutPersonaje1), personaje1)
        fillView(findViewById(R.id.layoutPersonaje2), personaje2)
        fillView(findViewById(R.id.layoutPersonaje3), personaje3)
        fillView(findViewById(R.id.layoutPersonaje4), personaje4)
        fillView(findViewById(R.id.layoutPersonaje5), personaje5)
        fillView(findViewById(R.id.layoutPersonaje6), personaje6)
    }

    private fun fillView(parent : LinearLayout, personaje: Personaje) {
        val color = if (personaje.esBueno) R.color.colorBgBueno else R.color.colorBgMalo
        parent.setBackgroundColor(ContextCompat.getColor(this, color))
        val iwFoto = parent.findViewById<ImageView>(R.id.iwFoto)
        val twNombre = parent.findViewById<TextView>(R.id.tvNombre)
        val twRaza = parent.findViewById<TextView>(R.id.tvRaza)
        iwFoto.setImageResource(personaje.image)
        twNombre.text = personaje.nombre
        twRaza.text = personaje.raza
    }

}