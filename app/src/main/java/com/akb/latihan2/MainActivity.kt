package com.akb.latihan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private lateinit var register: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        register = findViewById(R.id.textregister)
        register.setOnClickListener {
            startActivity(Intent(this, Register::class.java))
        }
    }
}

/*
    15 April 2020 mengerjakan layout beserta code
    10117154
    Andi Muhammad Ivan M
    IF4
*/
