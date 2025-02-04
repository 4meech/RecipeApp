package com.practicum.recipeapp

import android.graphics.drawable.Drawable
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.practicum.recipeapp.databinding.ItemCategoryBinding


class CategoriesListAdapter(private val dataSet: List<Category>) :
    RecyclerView.Adapter<CategoriesListAdapter.ViewHolder>() {

    class ViewHolder(binding: ItemCategoryBinding) : RecyclerView.ViewHolder(binding.root) {

        val imageView: ImageView = binding.ivCategory
        val titleTextView: TextView = binding.tvCardCategoryName
        val descriptionTextView: TextView = binding.tvCardCategoryDescription
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {

        val binding =
            ItemCategoryBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val category: Category = dataSet[position]
        viewHolder.titleTextView.text = category.title
        viewHolder.descriptionTextView.text = category.description

        val drawable =
            try {
                Drawable.createFromStream(
                    viewHolder.itemView.context.assets.open(category.imageUrl),
                    null
                )
            } catch (e: Exception) {
                Log.e("!!!", "Image load error: ${e.message}")
                null
            }
        viewHolder.imageView.setImageDrawable(drawable)
    }

    override fun getItemCount() = dataSet.size
}