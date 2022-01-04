package com.example.question1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class WebAddress : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_address)

    }

    fun getUrl(view: View) {

        val web = findViewById<EditText>(R.id.inWebAddress)
        val btnWeb = findViewById<Button>(R.id.btnSubmitWeb)
        btnWeb.setOnClickListener(){
            val address = web.text;
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("$address"))
            startActivity(browserIntent)
        }
    }
}