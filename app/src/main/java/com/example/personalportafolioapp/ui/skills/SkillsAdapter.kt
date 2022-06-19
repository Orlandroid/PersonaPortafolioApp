package com.example.personalportafolioapp.ui.skills

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.personalportafolioapp.databinding.ItemRowBinding

class SkillsAdapter() :
    RecyclerView.Adapter<SkillsAdapter.ViewHolder>() {


    private var listaSkils: List<String> = arrayListOf()

    fun setData(lista: ArrayList<String>) {
        listaSkils = lista
        notifyDataSetChanged()
    }


    class ViewHolder(private val binding: ItemRowBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(skill:String) {
            binding.textView.text=skill
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(viewGroup.context)
        val binding = ItemRowBinding.inflate(layoutInflater,viewGroup,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bind(listaSkils[position])
    }

    override fun getItemCount() = listaSkils.size

}
