package com.example.projekmapnew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    lateinit var btnSubmit : Button
    lateinit var etName : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnSubmit = findViewById(R.id.btnLogin)
        etName = findViewById(R.id.etUsername)
        etName = findViewById(R.id.etPassword)

        btnSubmit.setOnClickListener {
            if (etName.text.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Isi Username dan Password dulu bro",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }

            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("result", etName.text.toString())
            startActivity(intent)
        }
    }
}