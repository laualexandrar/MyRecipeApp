package com.lroap.myrecipeapp.view.ui.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.lroap.myrecipeapp.R
import com.lroap.myrecipeapp.view.EXTRA_CAREGORIE
import kotlinx.android.synthetic.main.activity_recipe_categories.*

open class RecipeCategories : AddRecipeMenu() {

    var selectedRecipe = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_categories)
    }

    fun onLunchClicked(view: View) {
        DinnerRecipesBtn.isChecked = false
        DessertsRecipesBtn.isChecked = false

        selectedRecipe = "lunch"

    }

    fun onDinnerClicked (view: View){
        lunchRecipesBtn.isChecked = false
        DessertsRecipesBtn.isChecked = false

        selectedRecipe = "dinner"

    }

    fun onDessertsClicked (view: View){
        DinnerRecipesBtn.isChecked = false
        lunchRecipesBtn.isChecked = false

        selectedRecipe = "dessert"
    }

    fun categoriesNextClicked (view: View){
        if (selectedRecipe != ""){
            val lunchRecipesFragment = Intent(this, LunchRecipesActivity::class.java)
            lunchRecipesFragment.putExtra(EXTRA_CAREGORIE, selectedRecipe )
            startActivity(lunchRecipesFragment)
        } else {
            Toast.makeText(this, "Please select one categorie", Toast.LENGTH_SHORT).show()
        }

    }

//    nextCategoriesBtn.setOnClickListener {
//        val nextCategoriesIntent = Intent(this, RecipeDetailDialogFragment::class.java)
//        startActivity(nextCategoriesIntent)
//    }


}
