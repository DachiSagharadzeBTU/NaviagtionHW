package com.example.naviatgortest.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.naviatgortest.R

class homeFragment: Fragment (R.layout.fragment_home) {

    private lateinit var calButton: Button
    private lateinit var tiktakButton: Button
    private lateinit var mersoMas: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        calButton = view.findViewById(R.id.calculator)
        tiktakButton = view.findViewById(R.id.TikTakToe)
        mersoMas = view.findViewById(R.id.mersoMas)

        val controller = Navigation.findNavController(view)

        calButton.setOnClickListener {

           val action = homeFragmentDirections.actionHomeFragmentToCalculatorFragment2()

            controller.navigate(action)

        }
        tiktakButton.setOnClickListener {

            val action2 = homeFragmentDirections.actionHomeFragmentToFragmentTiktaktoe2()

            controller.navigate(action2)

        }
        mersoMas.setOnClickListener {

            val action3 = homeFragmentDirections.actionHomeFragmentToFragmentNikoloz()

            controller.navigate(action3)

        }

    }



}