package com.lroap.myrecipeapp.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lroap.myrecipeapp.R
import kotlinx.android.synthetic.main.activity_add_recipe_menu.*

open class AddRecipeMenu : AppCompatActivity() {

    val recipesList = arrayListOf("Rice with chicken", "Muffins", "Tacos", "Pasta")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_recipe_menu)


        addNewRecipeBtn.setOnClickListener {
            val addNewRecipeIntent = Intent(this, addRecipesInfo::class.java)
            startActivity(addNewRecipeIntent)
        }

        myRecipesBtn.setOnClickListener {
            val myRecipesIntent = Intent(this, RecipeCategories::class.java)
            startActivity(myRecipesIntent)
        }
    }
}
