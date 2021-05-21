package com.example.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

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
        finish()
        System.exit(0)
    }

}