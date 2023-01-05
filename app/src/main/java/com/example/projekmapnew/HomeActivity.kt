package com.example.projekmapnew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class HomeActivity : AppCompatActivity() {
    lateinit var btnPlay : ImageButton
    lateinit var btnInformation : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnPlay = findViewById(R.id.playButton)
        btnInformation = findViewById(R.id.iccbutton)

        btnPlay.setOnClickListener {
            val intent = Intent(this, PlayActivity::class.java)
            startActivity(intent)
        }
        btnInformation.setOnClickListener {
            val intent = Intent(this, InformationActivity::class.java)
            startActivity(intent)
        }
    }
}