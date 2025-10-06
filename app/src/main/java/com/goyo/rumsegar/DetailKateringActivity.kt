package com.goyo.rumsegar

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.goyo.rumsegar.R

class DetailKateringActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_katering)

        findViewById<LinearLayout>(R.id.btnHome).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        findViewById<LinearLayout>(R.id.btnProfil).setOnClickListener {
            startActivity(Intent(this, ProfilActivity::class.java))
        }

        val tampilGambar = findViewById<ImageView>(R.id.imgPaket)
        val tampilPaket = findViewById<TextView>(R.id.tvPaket)
        val tampilInfo = findViewById<TextView>(R.id.tvInfo)
        val tampilLayanan = findViewById<TextView>(R.id.tvLayanan)
        val tampilHarga = findViewById<TextView>(R.id.tvHarga)

        val gambar = intent.getIntExtra("imgPaket", 0)
        val paket = intent.getStringExtra("tvPaket")
        val info = intent.getStringExtra("tvInfo")
        val layanan = intent.getStringExtra("tvLayanan")
        val harga = intent.getStringExtra("tvHarga")

        tampilGambar.setImageResource(gambar)
        tampilPaket.text = paket
        tampilInfo.text = info
        tampilLayanan.text = layanan
        tampilHarga.text = harga
    }
}
