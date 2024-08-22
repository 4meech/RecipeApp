package com.practicum.recipeapp

object STUB {

    private val categories = listOf(
        Category(
            id = 0,
            title = "Бургеры",
            description = "Рецепты всех популярных видов бургеров",
            imageUrl = "burger.png"
        ),
        Category(
            id = 1,
            title = "Десерты",
            description = "Самые вкусные рецепты десертов специально для вас",
            imageUrl = "dessert.png"
        ),
        Category(
            id = 2,
            title = "Пицца",
            description = "Пицца на любой вкус и цвет. Лучшая подборка для тебя",
            imageUrl = "pizza.png"
        ),
        Category(
            id = 3,
            title = "Рыба",
            description = "Печёная, жареная, сушеная, любая рыба на твой вкус",
            imageUrl = "fish.png"
        ),
        Category(
            id = 4,
            title = "Супы",
            description = "От классики до экзотики: мир в одной тарелке",
            imageUrl = "soup.png"
        ),
        Category(
            id = 5,
            title = "Салаты",
            description = "Хрустящий калейдоскоп под соусом вдохновения",
            imageUrl = "salad.png"
        ),
    )

    fun getCategories(): List<Category> {
        return categories
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
    val method: List<String>,
    val imageUrl: String
)

data class Ingredient(
    val quantity: String,
    val unitOfMeasure: String,
    val description: String
)