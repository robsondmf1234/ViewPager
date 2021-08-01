package com.example.tablayout2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_view_pager.view.*

class ViewPagerAdapter(val listaImages: List<Int>) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {
    inner class ViewPagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val viewCriada =
            LayoutInflater.from(parent.context).inflate(R.layout.item_view_pager, parent, false)
        return ViewPagerViewHolder(viewCriada)
    }

    override fun getItemCount(): Int {
        return    listaImages.size
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val imagemAtual = listaImages[position]

        holder.itemView.image_capa.setImageResource(imagemAtual)
    }

}