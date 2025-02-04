package com.practicum.recipeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.practicum.recipeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding
        get() = _binding ?: throw IllegalStateException("Main Activity binding can not be null")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<CategoriesListFragment>(binding.mainContainer.id)
            }
        }

        binding.favButton.setOnClickListener {
            supportFragmentManager.commit {
                replace<FavoritesFragment>(binding.mainContainer.id)
            }
        }
        binding.catButton.setOnClickListener {
            supportFragmentManager.commit {
                replace<CategoriesListFragment>(binding.mainContainer.id)
            }
        }
    }
}