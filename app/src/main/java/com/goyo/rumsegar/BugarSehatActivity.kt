package com.goyo.rumsegar

import android.os.Bundle
import android.widget.LinearLayout
import android.content.Intent
import android.net.Uri
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BugarSehatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bugar_sehat)

        val btnHome = findViewById<LinearLayout>(R.id.btnHome)
        btnHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val btnProfil = findViewById<LinearLayout>(R.id.btnProfil)
        btnProfil.setOnClickListener {
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }

        val btnInfoKelas = findViewById<Button>(R.id.btnInfoKelas)
        btnInfoKelas.setOnClickListener {
            val noHp ="6282161965317"
            val pesan = "Halo, saya berminat join kelas Anda. Tolong info kelasnya!"
            val url = "https://api.whatsapp.com/send?phone=$noHp&text=$pesan"
            val intent = Intent(Intent.ACTION_VIEW).setData(Uri.parse(url))
            startActivity(intent)
        }

        val btnMaps = findViewById<Button>(R.id.btnMaps)
        btnMaps.setOnClickListener {
            val gmmIntentUri = Uri.parse("geo:0,0?q=Jl. Setia Budi No.75, Helvetia, Kec. Medan Helvetia, Kota Medan, Sumatera Utara 20117, Indonesia")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }


    }
}