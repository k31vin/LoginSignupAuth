package com.example.loginsignupauth

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val prevoiusact = findViewById<View>(R.id.prevoiusact)

        prevoiusact.setOnClickListener {

            val aboutIntent = Intent(this, MainActivity::class.java)
            startActivity(aboutIntent)
        }
    }
}