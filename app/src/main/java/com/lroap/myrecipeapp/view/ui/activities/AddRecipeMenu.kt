package com.lroap.myrecipeapp.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lroap.myrecipeapp.R
import com.lroap.myrecipeapp.view.ui.fragments.RecipeDetailDialogFragment
import kotlinx.android.synthetic.main.activity_add_recipe_menu.*

class AddRecipeMenu : AppCompatActivity() {

    val recipesList = arrayListOf("Rice with chicken", "Muffins", "Tacos", "Pasta")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_recipe_menu)


        addNewRecipeBtn.setOnClickListener {
            val addNewRecipeIntent = Intent(this, AddRecipesInfo::class.java)
            startActivity(addNewRecipeIntent)
        }

        myRecipesBtn.setOnClickListener {
            val myRecipesIntent = Intent(this, RecipeCategories::class.java)
            startActivity(myRecipesIntent)
        }
    }
}
