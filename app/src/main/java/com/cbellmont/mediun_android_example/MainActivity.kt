package com.cbellmont.mediun_android_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.cbellmont.mediun_android_example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    var numero = 1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        configurarTextView()
        configurarBoton()
        configurarBoton2()
        configurarBoton3()

    }


    private fun configurarBoton3() {
        binding.bBoton3.setOnClickListener {
            Toast.makeText(this, "Se ha pulsado en el botón 3",Toast.LENGTH_LONG).show()
        }
    }

    /**
     * EJERCICIO
     */
    // Añadir un segundo botón que cuando hagas click, cambie el texto del textView a "Se ha pulsado el botón 2"
    // Además, cuando pulses en botón 1 otra vez, deberá volver a empezar a contar desde 1.
    private fun configurarBoton2() {
        binding.bBoton2.setOnClickListener {
            binding.tvHello.text = "Se ha pulsado el botón 2"
            numero = 1
        }
    }

    private fun configurarBoton() {
        binding.bBoton.text = "Púlsame"
        binding.bBoton.setOnClickListener {
            binding.tvHello.text = "Has hecho click $numero vez!"
            numero++
        }

        /*
        Esto no funcionaría bien porque la var numero se muere y resucita cada vez que hacemos un click
        binding.bBoton.setOnClickListener {
            var numero = 1
            binding.tvHello.text = "Has hecho click $numero vez!"
            numero++
        }
         */
    }

    private fun configurarTextView() {
        binding.tvHello.text = "Hola que tal"
    }


}