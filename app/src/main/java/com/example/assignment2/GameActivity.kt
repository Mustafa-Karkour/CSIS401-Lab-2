package com.example.assignment2

import android.R.attr.button
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.RippleDrawable
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_game.*


class GameActivity : AppCompatActivity() {

    var currPlayer = "Player X"
    var counter =0 //needed for winning function
    var allowPlaying = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
    }

    fun spotClicked(v: View){

        if(allowPlaying) {
            counter++


            var currentSpot = v.id

            when (currentSpot) {

                top_l_btn.id -> {

                    top_l_btn.isClickable = false
                    if (currPlayer.equals("Player X")) {
                        top_l_btn.setBackgroundColor(resources.getColor(R.color.red))
                        top_l_btn.text = "X"
                    } else {
                        top_l_btn.setBackgroundColor(resources.getColor(R.color.blue))
                        top_l_btn.text = "O"
                    }

                }
                top_m_btn.id -> {

                    top_m_btn.isClickable = false
                    if (currPlayer.equals("Player X")) {
                        top_m_btn.setBackgroundColor(resources.getColor(R.color.red))
                        top_m_btn.text = "X"
                    } else {
                        top_m_btn.setBackgroundColor(resources.getColor(R.color.blue))
                        top_m_btn.text = "O"
                    }

                }
                top_r_btn.id -> {

                    top_r_btn.isClickable = false
                    if (currPlayer.equals("Player X")) {
                        top_r_btn.setBackgroundColor(resources.getColor(R.color.red))
                        top_r_btn.text = "X"
                    } else {
                        top_r_btn.setBackgroundColor(resources.getColor(R.color.blue))
                        top_r_btn.text = "O"
                    }

                }
                mid_l_btn.id -> {

                    mid_l_btn.isClickable = false
                    if (currPlayer.equals("Player X")) {
                        mid_l_btn.setBackgroundColor(resources.getColor(R.color.red))
                        mid_l_btn.text = "X"
                    } else {
                        mid_l_btn.setBackgroundColor(resources.getColor(R.color.blue))
                        mid_l_btn.text = "O"
                    }

                }
                mid_m_btn.id -> {

                    mid_m_btn.isClickable = false
                    if (currPlayer.equals("Player X")) {
                        mid_m_btn.setBackgroundColor(resources.getColor(R.color.red))
                        mid_m_btn.text = "X"
                    } else {
                        mid_m_btn.setBackgroundColor(resources.getColor(R.color.blue))
                        mid_m_btn.text = "O"
                    }

                }
                mid_r_btn.id -> {

                    mid_r_btn.isClickable = false
                    if (currPlayer.equals("Player X")) {
                        mid_r_btn.setBackgroundColor(resources.getColor(R.color.red))
                        mid_r_btn.text = "X"
                    } else {
                        mid_r_btn.setBackgroundColor(resources.getColor(R.color.blue))
                        mid_r_btn.text = "O"
                    }

                }
                bottom_l_btn.id -> {

                    bottom_l_btn.isClickable = false
                    if (currPlayer.equals("Player X")) {
                        bottom_l_btn.setBackgroundColor(resources.getColor(R.color.red))
                        bottom_l_btn.text = "X"
                    } else {
                        bottom_l_btn.setBackgroundColor(resources.getColor(R.color.blue))
                        bottom_l_btn.text = "O"
                    }

                }
                bottom_m_btn.id -> {

                    bottom_m_btn.isClickable = false
                    if (currPlayer.equals("Player X")) {
                        bottom_m_btn.setBackgroundColor(resources.getColor(R.color.red))
                        bottom_m_btn.text = "X"
                    } else {
                        bottom_m_btn.setBackgroundColor(resources.getColor(R.color.blue))
                        bottom_m_btn.text = "O"
                    }

                }
                bottom_r_btn.id -> {

                    bottom_r_btn.isClickable = false
                    if (currPlayer.equals("Player X")) {
                        bottom_r_btn.setBackgroundColor(resources.getColor(R.color.red))
                        bottom_r_btn.text = "X"
                    } else {
                        bottom_r_btn.setBackgroundColor(resources.getColor(R.color.blue))
                        bottom_r_btn.text = "O"
                    }

                }

            }

            if (currPlayer.equals("Player O")) {
                currPlayer = "Player X"
                pl_turn_tv.text = currPlayer + "'s turn"


            } else {
                currPlayer = "Player O"
                pl_turn_tv.text = currPlayer + "'s turn"

            }

            if (counter >= 5) {
                //there is a change of winning
                Log.d("counter", counter.toString())
                checkWinner()

            }
        }

    }



    private fun checkWinner() {

        if(!top_l_btn.isClickable && top_l_btn.text.equals(top_m_btn.text) && top_m_btn.text.equals(top_r_btn.text)){

            if(currPlayer.equals("Player O")){
                pl_win_tv.text = "Player X wins"
            }else{

                pl_win_tv.text = "Player O wins"


            }
            //disable all buttons
            allowPlaying = false
            pl_turn_tv.text = ""

        }
        else if(!mid_l_btn.isClickable && mid_l_btn.text.equals(mid_m_btn.text) && mid_m_btn.text.equals(mid_r_btn.text)){

            if(currPlayer.equals("Player O")){
                pl_win_tv.text = "Player X wins"
            }else{

                pl_win_tv.text = "Player O wins"


            }
            //disable all buttons
            allowPlaying = false
            pl_turn_tv.text = ""

        }
        else if(!bottom_l_btn.isClickable && bottom_l_btn.text.equals(bottom_m_btn.text) && bottom_m_btn.text.equals(bottom_r_btn.text)){

            if(currPlayer.equals("Player O")){
                pl_win_tv.text = "Player X wins"
            }else{

                pl_win_tv.text = "Player O wins"


            }
            //disable all buttons
            allowPlaying = false
            pl_turn_tv.text = ""

        }
        else if(!top_l_btn.isClickable && top_l_btn.text.equals(mid_l_btn.text) && mid_l_btn.text.equals(bottom_l_btn.text)){

            if(currPlayer.equals("Player O")){
                pl_win_tv.text = "Player X wins"
            }else{

                pl_win_tv.text = "Player O wins"


            }
            //disable all buttons
            allowPlaying = false
            pl_turn_tv.text = ""

        }
        else if(!top_m_btn.isClickable && top_m_btn.text.equals(mid_m_btn.text) && mid_m_btn.text.equals(bottom_m_btn.text)){

            if(currPlayer.equals("Player O")){
                pl_win_tv.text = "Player X wins"
            }else{

                pl_win_tv.text = "Player O wins"


            }
            //disable all buttons
            allowPlaying = false
            pl_turn_tv.text = ""

        }
        else if(!top_r_btn.isClickable && top_r_btn.text.equals(mid_r_btn.text) && mid_r_btn.text.equals(bottom_r_btn.text)){

            if(currPlayer.equals("Player O")){
                pl_win_tv.text = "Player X wins"
            }else{

                pl_win_tv.text = "Player O wins"


            }
            //disable all buttons
            allowPlaying = false
            pl_turn_tv.text = ""

        }
        else if(!top_l_btn.isClickable && top_l_btn.text.equals(mid_m_btn.text) && mid_m_btn.text.equals(bottom_r_btn.text)){

            if(currPlayer.equals("Player O")){
                pl_win_tv.text = "Player X wins"
            }else{

                pl_win_tv.text = "Player O wins"


            }
            //disable all buttons
            allowPlaying = false
            pl_turn_tv.text = ""


        }
        else if(!top_r_btn.isClickable && top_r_btn.text.equals(mid_m_btn.text) && mid_m_btn.text.equals(bottom_l_btn.text)){

            if(currPlayer.equals("Player O")){
                pl_win_tv.text = "Player X wins"
            }else{

                pl_win_tv.text = "Player O wins"


            }
            //disable all buttons
            allowPlaying = false
            pl_turn_tv.text = ""

        }


    }

    fun restGame(v:View){

        currPlayer = "Player X"
        counter=0
        allowPlaying = true
        pl_turn_tv.text = currPlayer+"'s turn"
        pl_win_tv.text = ""

        top_l_btn.setBackgroundColor(resources.getColor(R.color.grey))
        top_l_btn.text=""
        top_l_btn.isClickable = true

        top_m_btn.setBackgroundColor(resources.getColor(R.color.grey))
        top_m_btn.text=""
        top_m_btn.isClickable = true

        top_r_btn.setBackgroundColor(resources.getColor(R.color.grey))
        top_r_btn.text=""
        top_r_btn.isClickable = true

        mid_l_btn.setBackgroundColor(resources.getColor(R.color.grey))
        mid_l_btn.text=""
        mid_l_btn.isClickable = true

        mid_m_btn.setBackgroundColor(resources.getColor(R.color.grey))
        mid_m_btn.text=""
        mid_m_btn.isClickable = true

        mid_r_btn.setBackgroundColor(resources.getColor(R.color.grey))
        mid_r_btn.text=""
        mid_r_btn.isClickable = true

        bottom_l_btn.setBackgroundColor(resources.getColor(R.color.grey))
        bottom_l_btn.text=""
        bottom_l_btn.isClickable = true

        bottom_m_btn.setBackgroundColor(resources.getColor(R.color.grey))
        bottom_m_btn.text=""
        bottom_m_btn.isClickable = true

        bottom_r_btn.setBackgroundColor(resources.getColor(R.color.grey))
        bottom_r_btn.text=""
        bottom_r_btn.isClickable = true



    }
}