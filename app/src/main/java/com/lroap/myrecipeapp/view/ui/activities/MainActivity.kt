package com.lroap.myrecipeapp.view.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lroap.myrecipeapp.R
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val recipesList = arrayListOf("Rice with chicken", "Muffins", "Tacos", "Pasta")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chooseRecipeBtn.setOnClickListener {
            val random = Random()
            val randomRecipe = random.nextInt(recipesList.count())
            selectedRecipeTxt.text = recipesList[randomRecipe]
        }

        addNewRecipeBtn.setOnClickListener {
            val newRecipe = addRecipesTxt.text.toString()

            recipesList.add(newRecipe)
            addRecipesTxt.text.clear()

            print(recipesList)
        }
    }
}

//        Toolbar toolbar = findViewById(R.id.toolbar)
//        setSupportActionBar(toolbar)