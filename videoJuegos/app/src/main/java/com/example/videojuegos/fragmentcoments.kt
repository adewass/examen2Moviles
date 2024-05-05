package com.example.videojuegos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

class fragmentcoments : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_fragmentcoments, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonEnviar = view.findViewById<Button>(R.id.buttonEnviar)
        buttonEnviar.setOnClickListener {
            enviarComentario()
        }
    }

    private fun enviarComentario() {
        val editTextComment = view?.findViewById<EditText>(R.id.editTextComment)
        val comentario = editTextComment?.text.toString()

        if (comentario.isNotEmpty()) {
            mostrarToast("¡Gracias por tu comentario!")
        } else {
            Toast.makeText(activity, "Por favor, escribe un comentario", Toast.LENGTH_SHORT).show()
        }
    }

    private fun mostrarToast(mensaje: String) {
        Toast.makeText(activity, mensaje, Toast.LENGTH_SHORT).show()
    }
}
