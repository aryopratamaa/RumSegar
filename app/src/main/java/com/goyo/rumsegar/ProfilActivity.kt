package com.goyo.rumsegar

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.LinearLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profil)

        val btnHome = findViewById<LinearLayout>(R.id.btnHome)
        btnHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val btnWhatsapp = findViewById<ImageView>(R.id.btnWhatsapp)
        btnWhatsapp.setOnClickListener {
            val noHp ="6282161965317"
            val pesan = "Halo, saya ingin bertanya"
            val url = "https://api.whatsapp.com/send?phone=$noHp&text=$pesan"
            val intent = Intent(Intent.ACTION_VIEW).setData(Uri.parse(url))
            startActivity(intent)
        }

        val btnInstagram = findViewById<ImageView>(R.id.btnInstagram)
        btnInstagram.setOnClickListener {
            val url = "https://www.instagram.com/aryopratamaa"
            val intent = Intent(Intent.ACTION_VIEW).setData(Uri.parse(url))
            startActivity(intent)
        }

        val btnFacebook = findViewById<ImageView>(R.id.btnFacebook)
        btnFacebook.setOnClickListener {
            val url = "https://www.facebook.com/aryopratama04082000"
            val intent = Intent(Intent.ACTION_VIEW).setData(Uri.parse(url))
            startActivity(intent)
        }

    }
}