package com.example.question1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.content.Intent
import android.net.Uri


class PhoneNumber : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_number)

        val phone = findViewById<EditText>(R.id.inPhone)
        val btnPhone = findViewById<Button>(R.id.btnSubmitPhone)

        btnPhone.setOnClickListener() {
            val number = phone.text;
            val intent = Intent(Intent.ACTION_CALL);
            intent.data = Uri.parse("tel:$number") //change the number

            startActivity(intent)
        }
    }
}