package com.lroap.myrecipeapp.view.ui.activities

import android.content.Intent
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.lroap.myrecipeapp.R
import kotlinx.android.synthetic.main.activity_splashscreen.*

class SplashscreenActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        val animation = AnimationUtils.loadAnimation(this, R.anim.animation)
        ivSplashScreenBook.startAnimation(animation)


        val intent = Intent(this, MainActivity::class.java )

        animation.setAnimationListener(object : Animation.AnimationListener{
            override fun onAnimationRepeat(animation: Animation?) {

            }

            override fun onAnimationEnd(animation: Animation?) {
                startActivity(intent)
                finish()
            }

            override fun onAnimationStart(animation: Animation?) {

            }

        })
    }

}