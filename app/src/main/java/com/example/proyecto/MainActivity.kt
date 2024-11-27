package com.example.proyecto

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToCreditActivity(view: View) {
        val userName = findViewById<EditText>(R.id.editTextUserName).text.toString()
        val intent = Intent(this, CreditActivity::class.java).apply {
            putExtra("USER_NAME", userName)
        }
        startActivity(intent)
    }
}

