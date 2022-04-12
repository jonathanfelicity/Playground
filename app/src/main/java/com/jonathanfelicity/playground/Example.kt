package com.jonathanfelicity.playground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Example : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example)
        val msg = findViewById<TextView>(R.id.txt)
        val email = intent.getStringExtra("EXTRA_MAIL")
        val message = "$email is now a hacker. (:)"
        msg.text = message
    }
}