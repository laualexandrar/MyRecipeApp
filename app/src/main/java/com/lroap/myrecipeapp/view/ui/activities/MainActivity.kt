package com.lroap.myrecipeapp.view.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.lroap.myrecipeapp.R
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val TAG = "LifeCycle"

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

    override fun onStart() {
        Log.d(TAG ,"${javaClass.simpleName} OnStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG ,"${javaClass.simpleName} OnResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG ,"${javaClass.simpleName} OnPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG ,"${javaClass.simpleName} OnStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG ,"${javaClass.simpleName} OnDestroy")
        super.onDestroy()
    }
}

//        Toolbar toolbar = findViewById(R.id.toolbar)
//        setSupportActionBar(toolbar)