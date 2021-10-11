package com.android.perros.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.perros.R
import com.android.perros.beans.Perro

class PerrosAdapter(private val listPerros: List<Perro>):
    RecyclerView.Adapter<PerrosAdapter.PerroViewHolder>() {

    class PerroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var namePerro: TextView = itemView.findViewById(R.id.perroNombre)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PerroViewHolder {
        return PerroViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_perros,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: PerroViewHolder, position: Int) {
        holder.namePerro.text = listPerros[position].description
        holder.namePerro.setOnClickListener{

        }
    }

    override fun getItemCount(): Int {
        return listPerros.size
    }

}