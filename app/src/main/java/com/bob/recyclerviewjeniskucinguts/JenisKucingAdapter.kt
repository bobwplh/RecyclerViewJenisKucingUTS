package com.bob.recyclerviewjeniskucinguts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class JenisKucingAdapter (private val context: Context, private val jenisKucing: List<JenisKucing>, val listener: (JenisKucing) -> Unit)
    : RecyclerView.Adapter<JenisKucingAdapter.JenisKucingViewholder>(){

    class JenisKucingViewholder(view: View): RecyclerView.ViewHolder(view) {

        val GambarKucings = view.findViewById<ImageView>(R.id.img_item_photo)
        val JenisKucings = view.findViewById<TextView>(R.id.tv_item_name)
        val DeskripsiJenisKucings = view.findViewById<TextView>(R.id.tv_item_description)


        fun bindview (JenisKucing: JenisKucing, listener: (JenisKucing) -> Unit) {
            GambarKucings.setImageResource(JenisKucing.GambarKucings)
            JenisKucings.text = JenisKucing.JenisKucings
            DeskripsiJenisKucings.text = JenisKucing.DeskripsiJenisKucings

            itemView.setOnClickListener {
                listener(JenisKucing)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JenisKucingViewholder {
        return JenisKucingViewholder(
            LayoutInflater.from(context).inflate(R.layout.item_jenis_kucing, parent, false)
        )
    }

    override fun onBindViewHolder(holder: JenisKucingViewholder, position: Int) {
        holder.bindview(jenisKucing[position], listener)
    }

    override fun getItemCount(): Int = jenisKucing.size

}