package com.example.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startGame(v: View){

        val intent = Intent(this,GameActivity::class.java)
        startActivity(intent)


    }

    fun quitGame(v:View){

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Are you sure you want to quit?")

        builder.setNegativeButton("No",{
            dialogInterface, i ->



        })

        builder.setPositiveButton("Yes",{
            dialogInterface, i ->

            finish()
            System.exit(0)

        })

        builder.show()


    }

}