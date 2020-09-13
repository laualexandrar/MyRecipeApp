package com.lroap.myrecipeapp.view.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lroap.myrecipeapp.R
import kotlinx.android.synthetic.main.activity_add_recipe.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.chooseRecipeBtn
import kotlinx.android.synthetic.main.activity_main.selectedRecipeTxt
import java.util.*

class AddRecipe : AppCompatActivity() {

    val recipesList = arrayListOf("Rice with chicken", "Muffins", "Tacos", "Pasta")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_recipe)


        addNewRecipeBtn.setOnClickListener {
            val newRecipe = addRecipesTxt.text.toString()
            recipesList.add(newRecipe)
            addRecipesTxt.text.clear()
            print(recipesList)
        }
    }
}
