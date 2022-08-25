package com.example.aula03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Tipo de Binding 1 - findViewById
        val editValor1: EditText = findViewById(R.id.editValor1)
        val editValor2: EditText = findViewById(R.id.editValor2)
        val buttonSomar: Button = findViewById(R.id.buttonSomar)
        val buttonSubtrair: Button = findViewById(R.id.buttonSubtrair)
        val buttonMult: Button = findViewById(R.id.buttonMult)
        val buttonDiv: Button = findViewById(R.id.buttonDividir)


        buttonSomar.setOnClickListener {
            val valor1 = editValor1.text.toString().toInt()
            val valor2 = editValor2.text.toString().toInt()

            val resultado = valor1 + valor2

            showDialog("A soma é " + resultado)
        }

        buttonSubtrair.setOnClickListener {


            if (!editValor1.text.isEmpty() && !editValor2.text.isEmpty()) {
                val valor1 = editValor1.text.toString().toInt()
                val valor2 = editValor2.text.toString().toInt()
                val resultado = valor1 - valor2
                showDialog("A subtração é " + resultado)
            }
            else {
                
            }
        }

        buttonMult.setOnClickListener {
            val valor1 = editValor1.text.toString().toInt()
            val valor2 = editValor2.text.toString().toInt()

            val resultado = valor1 * valor2

            showDialog("A multiplicação é " + resultado)
        }

        buttonDiv.setOnClickListener {
            val valor1 = editValor1.text.toString().toInt()
            val valor2 = editValor2.text.toString().toInt()

            if (valor2 != 0) {
                val resultado = valor1 / valor2
                showDialog("A divisão é " + resultado)
            }
            else {
                showDialog("O valor 2 não pode ser 0")
            }

        }
    }

    fun showDialog(msg: String) {
        AlertDialog.Builder(this)
            .setMessage(msg)
            .setPositiveButton("OK", null)
            .create()
            .show()
    }
}