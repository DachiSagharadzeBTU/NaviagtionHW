package com.example.naviatgortest.fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import java.util.logging.XMLFormatter
import androidx.fragment.app.Fragment
import com.example.naviatgortest.R


class fragmentTiktaktoe : Fragment (R.layout.fragment_tiktaktoe) , View.OnClickListener {



    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    private lateinit var button7: Button
    private lateinit var button8: Button
    private lateinit var button9: Button
    private lateinit var button10: Button
    private lateinit var Result1 : TextView
    private lateinit var Result2 : TextView
    private var Fplayer = ArrayList<Int>()
    private var Splayer = ArrayList<Int>()
    private var ActivePlayer = 1
    private fun init() {
        Result1 = view?.findViewById(R.id.Result1)!!
        Result2 = view?.findViewById(R.id.Result2)!!
        button1 = view?.findViewById(R.id.button1)!!
        button2 = view?.findViewById(R.id.button2)!!
        button3 = view?.findViewById(R.id.button3)!!
        button4 = view?.findViewById(R.id.button4)!!
        button5 = view?.findViewById(R.id.button5)!!
        button6 = view?.findViewById(R.id.button6)!!
        button7 = view?.findViewById(R.id.button7)!!
        button8 = view?.findViewById(R.id.button8)!!
        button9 = view?.findViewById(R.id.button9)!!
        button10 = view?.findViewById(R.id.button10)!!

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)
        button10.setOnClickListener(this)

    }



        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
            init()
    }


    override fun onClick(clickedView: View?) {
        if (clickedView is Button){
            var Bnumber = 0
            when(clickedView.id){
                R.id.button1 -> Bnumber = 1
                R.id.button2 -> Bnumber = 2
                R.id.button3 -> Bnumber = 3
                R.id.button4 -> Bnumber = 4
                R.id.button5 -> Bnumber = 5
                R.id.button6 -> Bnumber = 6
                R.id.button7 -> Bnumber = 7
                R.id.button8 -> Bnumber = 8
                R.id.button9 -> Bnumber = 9
                R.id.button10 -> Bnumber = 10
            }
            if (Bnumber != 0){
                GamePlay (clickedView, Bnumber)
            }
            if (Bnumber == 10){
                reset()
            }
        }


    }


    private fun GamePlay(clickedView: Button, Bnumber: Int) {
        if ( ActivePlayer == 1){
            ActivePlayer = 2
            clickedView.text = "X"
            clickedView.isEnabled = false
            Fplayer.add(Bnumber)
        }else{
            ActivePlayer = 1
            clickedView.text = "O"
            clickedView.isEnabled = false
            Splayer.add(Bnumber)
        }
        check()
    }

    private fun check() {
        var Winner= 0
        var counter1 = 1
        var counter2 = 1
        if (Fplayer.contains(1) && Fplayer.contains(2) && Fplayer.contains(3))  Winner = 1
        if (Fplayer.contains(4) && Fplayer.contains(5) && Fplayer.contains(6))  Winner = 1
        if (Fplayer.contains(7) && Fplayer.contains(8) && Fplayer.contains(9))  Winner = 1
        if (Fplayer.contains(1) && Fplayer.contains(5) && Fplayer.contains(9))  Winner = 1
        if (Fplayer.contains(3) && Fplayer.contains(5) && Fplayer.contains(7))  Winner = 1
        if (Fplayer.contains(1) && Fplayer.contains(4) && Fplayer.contains(7))  Winner = 1
        if (Fplayer.contains(2) && Fplayer.contains(5) && Fplayer.contains(8))  Winner = 1
        if (Fplayer.contains(3) && Fplayer.contains(6) && Fplayer.contains(9))  Winner = 1


        if (Splayer.contains(1) && Splayer.contains(2) && Splayer.contains(3))  Winner = 2
        if (Splayer.contains(4) && Splayer.contains(5) && Splayer.contains(6))  Winner = 2
        if (Splayer.contains(7) && Splayer.contains(8) && Splayer.contains(9))  Winner = 2
        if (Splayer.contains(1) && Splayer.contains(5) && Splayer.contains(9))  Winner = 2
        if (Splayer.contains(3) && Splayer.contains(5) && Splayer.contains(7))  Winner = 2
        if (Splayer.contains(1) && Splayer.contains(4) && Splayer.contains(7))  Winner = 2
        if (Splayer.contains(2) && Splayer.contains(5) && Splayer.contains(8))  Winner = 2
        if (Splayer.contains(3) && Splayer.contains(6) && Splayer.contains(9))  Winner = 2

        if (Winner == 1){
            Result1.setText("FirstPlayer : " + counter1)
            reset()
        }
        if (Winner == 2){
            Result1.setText("SecondPlayer : " + counter2)
            reset()
        }
    }
    private fun reset() {
        ActivePlayer  = 1
        button1.text = ""
        button2.text = ""
        button3.text = ""
        button4.text = ""
        button5.text = ""
        button6.text = ""
        button7.text = ""
        button8.text = ""
        button9.text = ""
        button1.isEnabled = true
        button2.isEnabled = true
        button3.isEnabled = true
        button4.isEnabled = true
        button5.isEnabled = true
        button6.isEnabled = true
        button7.isEnabled = true
        button8.isEnabled = true
        button9.isEnabled = true
        button10.text = "RESET"
        button10.isEnabled = true
    }



}