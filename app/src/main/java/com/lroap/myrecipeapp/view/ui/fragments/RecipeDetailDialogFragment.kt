package com.lroap.myrecipeapp.view.ui.fragments

import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.lroap.myrecipeapp.R
import com.lroap.myrecipeapp.view.EXTRA_CAREGORIE
import com.lroap.myrecipeapp.view.ui.activities.AddRecipeMenu
import com.lroap.myrecipeapp.view.ui.activities.RecipeCategories

class RecipeDetailDialogFragment: AddRecipeMenu() {

    var category = ""

    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_recipe_detail_dialog)
        category = intent.getStringExtra(EXTRA_CAREGORIE)

        println(category)
    }



}