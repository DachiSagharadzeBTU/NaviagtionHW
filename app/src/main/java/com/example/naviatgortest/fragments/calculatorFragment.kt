package com.example.naviatgortest.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.naviatgortest.R
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import org.w3c.dom.Text
import kotlin.math.sqrt

class calculatorFragment : Fragment (R.layout.fragment_calculator) {

    private lateinit var textt: TextView
    private var operand:Float = 0F
    private var oper: String = ""

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textt = view.findViewById(R.id.Textt)
    }

    fun clck(clickedView: View) {

        if (clickedView is TextView) {

            var first: String = textt.text.toString()
            var second: String = clickedView.text.toString()
            if (first == "0") first = ""

            textt.text = first + second
        }
    }

    fun clck2(clickedView: View){

        if (clickedView is TextView){

            val result = textt.text.toString()
            if (result.isNotEmpty())  operand = result.toFloat()

            oper = clickedView.text.toString()
            textt.text = ""

        }

    }

    fun UDRIS(clickedView: View){

        val operand2text = textt.text.toString()
        var operand2: Float = 0F

        if (operand2text.isNotEmpty()){
            operand2 =  operand2text.toFloat()
        }

        when(oper){

            "/" -> textt.text = (operand / operand2).toString()
            "+" -> textt.text = (operand + operand2).toString()
            "-" -> textt.text = (operand - operand2).toString()
            "X" -> textt.text = (operand * operand2).toString()


        }

    }

    fun clear(clickedView: View){

        textt.text = ""

    }

    fun SQRT(clickedView: View){
        val numtxt = textt.text.toString()
        var num: Float = 0F
        if (numtxt.isNotEmpty()) num = numtxt.toFloat()

        textt.text = sqrt(num).toString()

    }

    fun kvadrati(clickedView: View){

        val xtxt = textt.text.toString()
        var x: Float = 0F
        if (xtxt.isNotEmpty()){
            x = xtxt.toFloat()
            textt.text = (x*x).toString()
        }

    }

    fun backspace(clickedView: View){
        var x = textt.text.toString()
        textt.text = x.dropLast(1)
    }

}
