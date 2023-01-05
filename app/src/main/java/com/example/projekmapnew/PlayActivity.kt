package com.example.projekmapnew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent

import android.widget.ImageButton

class PlayActivity : AppCompatActivity() {
    lateinit var HomeButtonplay : ImageButton
    lateinit var iccbuttonplay : ImageButton
    lateinit var amatirbuttonplay : ImageButton
    lateinit var ojekbuttonplay : ImageButton
    lateinit var rusunbuttonplay : ImageButton
    lateinit var kurirbuttonplay : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        HomeButtonplay = findViewById(R.id.HomeButtonplay)
        iccbuttonplay = findViewById(R.id.iccbuttonplay)
        amatirbuttonplay = findViewById(R.id.amatirplay)
        ojekbuttonplay = findViewById(R.id.ojekplay)
        rusunbuttonplay = findViewById(R.id.rusunplay)
        kurirbuttonplay = findViewById(R.id.kurirplay)


        HomeButtonplay.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        iccbuttonplay.setOnClickListener {
            val intent = Intent(this, InformationActivity::class.java)
            startActivity(intent)
        }
        amatirbuttonplay.setOnClickListener {
            val intent = Intent(this, AmatirPlayActivity::class.java)
            startActivity(intent)
        }
        ojekbuttonplay.setOnClickListener {
            val intent = Intent(this, OjekPlayActivity::class.java)
            startActivity(intent)
        }
        rusunbuttonplay.setOnClickListener {
            val intent = Intent(this, RusunPlayActivity::class.java)
            startActivity(intent)
        }
        kurirbuttonplay.setOnClickListener {
            val intent = Intent(this, KurirPlayActivity::class.java)
            startActivity(intent)
        }
    }
}