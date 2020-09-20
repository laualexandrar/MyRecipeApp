package com.lroap.myrecipeapp.view.ui.activities

import android.content.Context
import android.os.Bundle
import com.lroap.myrecipeapp.R
import kotlinx.android.synthetic.main.activity_recipes_detail.*

class RecipesDetailActivity: AddRecipeMenu() {

    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipes_detail)

        val sharedPref = getSharedPreferences("Adding Recipes", Context.MODE_PRIVATE)
        tvAddRecipeName.text = sharedPref.getString("NEW_NAME", "")
        tvDetailRecipeIngredients.text = sharedPref.getString("ADD_INGREDIENTS", "")
        tvDetailRecipeDescription.text =sharedPref.getString("ADD_STEPS", "")
    }

}