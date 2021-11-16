package com.gabriel.tumedicina.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.gabriel.tumedicina.R
import com.gabriel.tumedicina.databinding.FragmentLoginBinding
import com.gabriel.tumedicina.databinding.FragmentRegistroBinding


class RegistroFragment : Fragment() {

    private lateinit var binding: FragmentRegistroBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

        /*
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_registro)

        val arrayAdapter:ArrayAdapter<t>

        val tipoDocumento = mutableListOf("Tarjeta de Identidad", "Cedula de Ciudadania")
        val lvDatos = findViewById<ListView>(R.id.lvDatos)

        arrayAdapter = ArrayAdapter(this.android.R.layout.simple_list_item_l,tipo_Documento)
        lvDatos.adapter = arrayAdapter
        */

    ): View? {
        return inflater.inflate(R.layout.fragment_registro, container, false)
    }




}