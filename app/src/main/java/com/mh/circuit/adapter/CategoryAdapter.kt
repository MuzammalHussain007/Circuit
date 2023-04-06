package com.mh.circuit.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mh.circuit.databinding.CustomCategoryItemBinding
import com.mh.circuit.modal.CategoryItem


class CategoryAdapter(
    private val list: ArrayList<CategoryItem>,
    val context: Context,
   private val moveTo: (Int) -> Unit,
    ) : RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: CustomCategoryItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            CustomCategoryItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            moveTo(position)
        }

        with(holder)
        {
            with(list[position])
            {
                binding.categoryImage.setImageDrawable(context.getDrawable(this.itemImage))
                binding.itemName.text = this.itemName
            }

        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

}