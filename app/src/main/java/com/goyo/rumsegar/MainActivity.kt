package com.goyo.rumsegar

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.LinearLayout
import android.content.Intent
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnKeluar = findViewById<LinearLayout>(R.id.btnKeluar)
        btnKeluar.setOnClickListener {
            finishAffinity()
        }

        val btnProfil = findViewById<LinearLayout>(R.id.btnProfil)
        btnProfil.setOnClickListener {
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }

        val btnBugar = findViewById<CardView>(R.id.btnBugar)
        btnBugar.setOnClickListener {
            val intent = Intent(this, BugarSehatActivity::class.java)
            startActivity(intent)
        }

        val btnPanduan = findViewById<CardView>(R.id.btnPanduan)
        btnPanduan.setOnClickListener {
            val intent = Intent(this, PanduanSehatActivity::class.java)
            startActivity(intent)
        }

        val btnKatering = findViewById<CardView>(R.id.btnKatering)
        btnKatering.setOnClickListener {
            val intent = Intent(this, KateringActivity::class.java)
            startActivity(intent)
        }
    }

}