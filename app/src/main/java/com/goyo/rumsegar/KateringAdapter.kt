package com.goyo.rumsegar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KateringAdapter(
    private val itemkatering: List<DataClassKatering>,
    private val onClick: (DataClassKatering) -> Unit
) : RecyclerView.Adapter<KateringAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgPaket: ImageView = view.findViewById(R.id.imgPaket)
        val tvPaket: TextView = view.findViewById(R.id.tvPaket)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_katering, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = itemkatering[position]
        holder.imgPaket.setImageResource(data.imgPaket)
        holder.tvPaket.text = data.tvPaket
        holder.itemView.setOnClickListener {
            onClick(data)
        }
    }

    override fun getItemCount(): Int {
        return itemkatering.size
    }

}
