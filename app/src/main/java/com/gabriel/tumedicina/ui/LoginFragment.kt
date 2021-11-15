package com.gabriel.tumedicina.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.gabriel.tumedicina.R




class LoginFragment : Fragment(R.layout.fragment_login) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val buttonLongin = view.findViewById<Button>(R.id.Btn_login)
        val buttonRegistro = view.findViewById<Button>(R.id.Btn_registro)

        buttonRegistro.setOnClickListener {
            Toast.makeText(context, "entro al listener", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_loginFragment_to_registroFragment)
        }
    }


}