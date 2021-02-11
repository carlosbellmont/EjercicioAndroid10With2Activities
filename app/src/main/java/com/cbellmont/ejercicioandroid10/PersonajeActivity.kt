package com.cbellmont.ejercicioandroid10

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.cbellmont.ejercicioandroid10.databinding.ActivityPersonajeBinding

class PersonajeActivity : AppCompatActivity() {

    lateinit var binding : ActivityPersonajeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPersonajeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("VALOR1")

        Toast.makeText(this, "El recibido es $name", Toast.LENGTH_LONG).show()
    }
}