package com.example.loginsignupauth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

class OthersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_others)

        val prevoiusact = findViewById<View>(R.id.prevoiusact)

        prevoiusact.setOnClickListener {

            val aboutIntent = Intent(this, MainActivity::class.java)
            startActivity(aboutIntent)
        }

        val back = findViewById<Button>(R.id.dnt_button)

        back.setOnClickListener {
            val dtbt = Intent(this, MainActivity::class.java)
            Toast.makeText(this, "Thanks for your gratitude", Toast.LENGTH_SHORT).show()

            startActivity(dtbt)
        }

        val locationSpinner = findViewById<Spinner>(R.id.location_spinner)
        val locations = resources.getStringArray(R.array.locations)
        val locationAdapter = LocationAdapter(this, android.R.layout.simple_spinner_item, locations)
        locationAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        locationSpinner.adapter = locationAdapter


    }
}