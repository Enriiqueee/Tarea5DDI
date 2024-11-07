package edu.iesam.tarea5ddi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var texto1: TextView
    private lateinit var texto2: TextView
    private lateinit var boton1: Button
    private lateinit var boton2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        texto1 = findViewById(R.id.texto1)
        texto2 = findViewById(R.id.texto2)
        boton1 = findViewById(R.id.botom1)
        boton2 = findViewById(R.id.botom2)

        // Hace que el botom uno muestre el texto de editText
        boton1.setOnClickListener {
            val inputText = editText.text.toString()
            texto1.text = inputText
            texto2.text = inputText
        }

        // Muestra cuando pulsas boton 2
        boton2.setOnClickListener {
            Toast.makeText(this, "Boton 2 pulsado", Toast.LENGTH_SHORT).show()
        }
    }
}
