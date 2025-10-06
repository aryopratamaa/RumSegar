package com.goyo.rumsegar

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KateringActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_katering)

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

        val recyclerView = findViewById<RecyclerView>(R.id.rvKatering)
        val paketkatering = listOf(
            DataClassKatering(
            R.drawable.gambar_bugar1,
            "Baby and Kids Meal",
            "Memberikan makanan sehat, organik, bebas MSG, dan pengawet",
            "Membantu anak anda menyukai sayuran",
            "Rp. 150.000,- / hari"
        ),
            DataClassKatering(
                R.drawable.gambar_bugar2,
                "Paket 2",
                "Info Paket 2",
                "Layanan Paket 2",
                "Rp. 200.000"
            )
        )

        recyclerView.layoutManager= LinearLayoutManager(this)

        recyclerView.adapter = KateringAdapter(paketkatering) { item ->
            val intent = Intent(this, DetailKateringActivity::class.java)
            intent.putExtra("imgPaket", item.imgPaket)
            intent.putExtra("tvPaket", item.tvPaket)
            intent.putExtra("tvInfo", item.tvInfo)
            intent.putExtra("tvLayanan", item.tvLayanan)
            intent.putExtra("tvHarga", item.tvHarga)
            startActivity(intent)
        }


    }
}