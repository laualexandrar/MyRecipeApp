package com.lroap.myrecipeapp.view.ui.activities

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import com.lroap.myrecipeapp.R
import kotlinx.android.synthetic.main.activity_add_recipes_info.*

class addRecipesInfo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_recipes_info)

        addRecipeBnt.setOnClickListener {
            val newName = newRecipeNameTxt.text.toString()
            val addIngredients = addIngredientsTxt.text.toString()
            val addSteps = addStepsTxt.text.toString()

            if (newName.isEmpty() || addIngredients.isEmpty() || addSteps.isEmpty()) {
                Toast.makeText(this, "Please complete the fields", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Great! You create a new recipe!", Toast.LENGTH_SHORT).show()
                storeInfo()
                navigateNextActivity()
            }
        }

        newRecipeImageBtn.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent, 123)

        }

    }

    private fun navigateNextActivity() {
        val intent = Intent(this, RecipesDetailActivity::class.java)
        startActivity(intent)
    }


    private fun storeInfo() {
        val sharedPref = getSharedPreferences("Adding Recipes", Context.MODE_PRIVATE)
        val sharedPrefEditor = sharedPref.edit()
        sharedPrefEditor.putString("NEW_NAME", newRecipeNameTxt.text.toString())
        sharedPrefEditor.putString("ADD_INGREDIENTS", addIngredientsTxt.text.toString())
        sharedPrefEditor.putString("ADD_STEPS", addStepsTxt.text.toString())
        sharedPrefEditor.apply()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val photo = data?.extras?.get("data") as? Bitmap
        if (photo != null) {
            newRecipeImageBtn.setImageBitmap(photo)
        }
    }


}

//        val recipesList = arrayListOf("Rice with chicken", "Muffins", "Tacos", "Pasta")
//
//
//            addRecipeBnt.setOnClickListener {
//                val newRecipe = newRecipeNameTxt.text.toString()
//
//                recipesList.add(newRecipe)
//                newRecipeNameTxt.text.clear()
//
//                print(recipesList)
//            }
