package com.example.proyecto


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CreditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credit)

        val userName = intent.getStringExtra("USER_NAME")
        val textViewUserGreeting = findViewById<TextView>(R.id.textViewUserGreeting)
        textViewUserGreeting.text = "$userName estás usando la versión 1 de la App de Steam"
    }

    fun sendEmail(view: View) {
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:your_email@example.com")
            putExtra(Intent.EXTRA_SUBJECT, "Consulta de la app Steam")
        }
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
}

