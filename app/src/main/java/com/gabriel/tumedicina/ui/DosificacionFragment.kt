package com.gabriel.tumedicina.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gabriel.tumedicina.R
import com.gabriel.tumedicina.databinding.FragmentDosificacionBinding
import com.gabriel.tumedicina.databinding.FragmentLoginBinding


class DosificacionFragment : Fragment() {

    private lateinit var binding: FragmentDosificacionBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_dosificacion, container, false)
    }

}