package com.example.projekmapnew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class DeskripsiActivity3 : AppCompatActivity() {

    lateinit var backbuttoninfo : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deskripsi3)

        backbuttoninfo = findViewById(R.id.Backbutton)

        backbuttoninfo.setOnClickListener {
            val intent = Intent(this, InformationActivity::class.java)
            startActivity(intent)
        }
    }
}