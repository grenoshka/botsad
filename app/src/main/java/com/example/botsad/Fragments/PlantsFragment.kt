package com.example.botsad.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.botsad.PlantsView.PlantsItem
import com.example.botsad.PlantsView.PlantsItemAdapter
import com.example.botsad.R
import kotlinx.android.synthetic.main.nav_plants.*

class PlantsFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.nav_plants,container,false)
        view.findViewById<View>(R.id.backButton).setOnClickListener {
            val fragmentManager = fragmentManager
            val fragmentTransaction = fragmentManager!!.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_container, LocationFragment())
            fragmentTransaction.commit()
        }
        return inflater.inflate(R.layout.nav_plants,container,false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val categoryList = generateList()
        plantsList.adapter = PlantsItemAdapter(categoryList)
        plantsList.layoutManager = LinearLayoutManager(activity)
        plantsList.setHasFixedSize(true)
    }
    private fun generateList(): List<PlantsItem> {
        val list = ArrayList<PlantsItem>(4)
        list.add(PlantsItem(R.drawable.flower1, "Гиацинт","Hyacínthus"))
        list.add(PlantsItem(R.drawable.flower2, "Гортензия","Hydrangea"))
        list.add(PlantsItem(R.drawable.flower3, "Ель","Picea abies"))
        list.add(PlantsItem(R.drawable.flower4, "Василек","Centaurea cyanus"))
        list.add(PlantsItem(R.drawable.flower5, "Ирис","Íris"))
        return list
    }
}