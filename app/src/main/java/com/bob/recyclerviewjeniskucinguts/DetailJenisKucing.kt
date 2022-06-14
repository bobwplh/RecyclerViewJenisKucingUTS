package com.bob.recyclerviewjeniskucinguts

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailJenisKucing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_jenis_kucing)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val jeniskucing = intent.getParcelableExtra<JenisKucing>(MainActivity.INTENT_PARCELABLE)

        val GambarKucings = findViewById<ImageView>(R.id.img_item_photo)
        val JenisKucings = findViewById<TextView>(R.id.tv_item_name)
        val DeskripsiJenisKucings = findViewById<TextView>(R.id.tv_item_description)

        GambarKucings.setImageResource(jeniskucing?.GambarKucings!!)
        JenisKucings.text = jeniskucing.JenisKucings
        DeskripsiJenisKucings.text = jeniskucing.DeskripsiJenisKucings
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}