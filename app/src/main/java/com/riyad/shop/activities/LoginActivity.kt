package com.riyad.shop.activities

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.Toast
import com.riyad.shop.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        //- to make full screen
        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }



    }

    fun forgetPasswordFunction(view: View) {

        Toast.makeText(this.applicationContext,"Did you forget your password? ",Toast.LENGTH_SHORT).show()

    }

    fun registerOnClick(view: View) {

        // start another activity and go to register activity
        val intent=Intent(this.applicationContext,RegisterActivity::class.java)

        startActivity(intent)
    }
}