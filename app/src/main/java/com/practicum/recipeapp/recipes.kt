package com.practicum.recipeapp

import android.content.Context

object STUB {
    private var categories: List<Category>? = null

    fun categoriesInit(context: Context) {
        if (categories == null) {
            categories = listOf(
                Category(
                    id = 0,
                    title = context.getString(R.string.cat_burgers_name),
                    description = context.getString(R.string.cat_burgers_description),
                    imageUrl = "burger.png"
                ),
                Category(
                    id = 1,
                    title = context.getString(R.string.cat_dessert_name),
                    description = context.getString(R.string.cat_dessert_description),
                    imageUrl = "dessert.png"
                ),
                Category(
                    id = 2,
                    title = context.getString(R.string.cat_pizza_name),
                    description = context.getString(R.string.cat_pizza_description),
                    imageUrl = "pizza.png"
                ),
                Category(
                    id = 3,
                    title = context.getString(R.string.cat_fish_name),
                    description = context.getString(R.string.cat_fish_description),
                    imageUrl = "fish.png"
                ),
                Category(
                    id = 4,
                    title = context.getString(R.string.cat_soup_name),
                    description = context.getString(R.string.cat_soup_description),
                    imageUrl = "soup.png"
                ),
                Category(
                    id = 5,
                    title = context.getString(R.string.cat_salad_name),
                    description = context.getString(R.string.cat_salad_description),
                    imageUrl = "salad.png"
                ),
            )
        }
    }

    fun getCategories(): List<Category>? {
        return categories ?: emptyList()
    }
}

data class Category(
    val id: Int,
    val title: String,
    val description: String,
    val imageUrl: String
)

data class Recipe(
    val id: Int,
    val title: String,
    val ingredients: List<Ingredient>,
    val method: String,
    val imageUrl: String
)

data class Ingredient(
    val quantity: Double,
    val unitOfMeasure: String,
    val description: String
)