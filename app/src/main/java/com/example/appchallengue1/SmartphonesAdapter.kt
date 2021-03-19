package com.example.appchallengue1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class SmartphonesAdapter (private val smartphones: List <Smartphone>): RecyclerView.Adapter<SmartphonesAdapter.SmartphoneViewHolder>()  {
    inner class SmartphoneViewHolder(renglon: View): RecyclerView.ViewHolder(renglon){
        var modelo = renglon.findViewById<TextView>(R.id.modelo)
        var marca = renglon.findViewById<TextView>(R.id.marca)
        var anio = renglon.findViewById<TextView>(R.id.anio)
        var foto = renglon.findViewById<ImageView>(R.id.photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SmartphoneViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.renglon_smartphone,parent, false)
        return SmartphoneViewHolder(renglon_vista)
    }

    override fun onBindViewHolder(holder: SmartphoneViewHolder, position: Int) {
        val smartphone= smartphones[position]
        holder.foto.setImageResource(smartphone.picture)
        holder.modelo.text = smartphone.modelo
        holder.anio.text = smartphone.anio
        holder.marca.text = smartphone.marca
        holder.itemView.setOnClickListener {
            val action = SmartphonesFragmentDirections.actionSmartphonesFragmentToSmartphoneFragment(smartphone)
            holder.itemView.findNavController().navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return smartphones.size
    }
}