package com.example.botsad.PlantsView

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.botsad.FlowerPage
import com.example.botsad.R
import kotlinx.android.synthetic.main.plant_recycler_view.view.*

class PlantsItemAdapter(private val categoryList:List<PlantsItem>): RecyclerView.Adapter<PlantsItemAdapter.PlantsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantsViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.plant_recycler_view, parent, false)
        return PlantsViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: PlantsViewHolder, position: Int) {
        val currentItem = categoryList[position]
        holder.imageView.setImageResource(currentItem.imageSource)
        holder.PlantName.text = currentItem.plantName
        holder.PlantLatinName.text = currentItem.plantLatin
        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, FlowerPage::class.java)
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = categoryList.size

    class PlantsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.plantImage
        val PlantName: TextView = itemView.plantName
        val PlantLatinName: TextView = itemView.plantLatin
    }
}