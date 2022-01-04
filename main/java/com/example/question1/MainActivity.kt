package com.example.question1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun GoToWebAddress(view: View){
        val intent = Intent(this, WebAddress::class.java).apply {

        }
        startActivity(intent)
    }

    fun GoToPhone(view: View){
        val intent = Intent(this, PhoneNumber::class.java).apply {

        }
        startActivity(intent)
    }
}