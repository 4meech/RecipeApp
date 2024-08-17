package com.practicum.recipeapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.practicum.recipeapp.databinding.FragmentListCategoriesBinding

class CategoriesListFragment : Fragment(R.layout.fragment_list_categories){
    private var _binding: FragmentListCategoriesBinding? = null
    private val binding
        get() = _binding ?: throw IllegalStateException("CatList Fragment binding can not be null")

    override fun onCreateView(
        i: LayoutInflater,
        c: ViewGroup?,
        s: Bundle?
    ): View? {
        _binding = FragmentListCategoriesBinding.inflate(i, c, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}