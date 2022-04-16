package com.riyad.shop.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import com.riyad.shop.R

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }


    fun showErrorSnackbar(message: String, errorMessage: Boolean)
    {
     val snackBar=Snackbar.make(findViewById(android.R.id.content),message,Snackbar.LENGTH_SHORT)
     val snackBarView=snackBar.view

        if (errorMessage)
        {
            snackBarView.setBackgroundColor(ContextCompat.getColor(this.applicationContext,R.color.colorSnackBarError))
        }
        else
        {
            snackBarView.setBackgroundColor(ContextCompat.getColor(this.applicationContext,R.color.colorSnackBarSuccess))
        }
     snackBar.show()
    }
}