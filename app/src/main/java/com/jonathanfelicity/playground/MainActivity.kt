package com.jonathanfelicity.playground

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(saveInstanceState: Bundle?){
        super.onCreate(saveInstanceState)
        setContentView(R.layout.activity_main)
        val next: Button = findViewById<Button>(R.id.example)
        val email: TextView = findViewById(R.id.email)

        next.setOnClickListener{
            val mail = email.text.toString()
            Intent(this, Example::class.java).also{
                it.putExtra("EXTRA_MAIL", mail)
                startActivity(it)
            }
        }

    }
}