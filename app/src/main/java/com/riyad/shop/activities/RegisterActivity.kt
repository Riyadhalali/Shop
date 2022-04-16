package com.riyad.shop.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.WindowManager
import com.riyad.shop.R
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

    //Hide status bar and make screen full and it is a depracted api but we will solve it soon

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        //call set action bar
        setupActionBar()

        btn_register.setOnClickListener {
            validateRegisterDetails()
        }



    }


    private fun setupActionBar()
    {

        setSupportActionBar(toolbar_register_activity)

        val actionbar=supportActionBar

        if (actionbar!=null )
        {
           actionbar.setDisplayHomeAsUpEnabled(true )
            actionbar.setHomeAsUpIndicator(R.drawable.ic_black_color_back_24dp)
        }

        toolbar_register_activity.setNavigationOnClickListener {
            onBackPressed()
        }

    }


    // function to validate the user entries

    private fun validateRegisterDetails() :Boolean
    {
     return when {
         TextUtils.isEmpty(et_first_name.text.toString().trim{it<=' '}) -> {
             showErrorSnackbar(resources.getString(R.string.err_msg_enter_first_name),true)
             false
         }
         TextUtils.isEmpty(et_last_name.text.toString().trim() {it<=' '}) -> {
             showErrorSnackbar(resources.getString(R.string.err_msg_enter_last_name),true)
             false
         }
         TextUtils.isEmpty(et_email.text.toString().trim { it <= ' ' }) -> {
             showErrorSnackbar(resources.getString(R.string.err_msg_enter_email), true)
             false
         }

         TextUtils.isEmpty(et_password.text.toString().trim { it <= ' ' }) -> {
             showErrorSnackbar(resources.getString(R.string.err_msg_enter_password), true)
             false
         }

         TextUtils.isEmpty(et_confirm_password.text.toString().trim { it <= ' ' }) -> {
             showErrorSnackbar(resources.getString(R.string.err_msg_enter_confirm_password), true)
             false
         }

         et_password.text.toString().trim { it <= ' ' } != et_confirm_password.text.toString()
             .trim { it <= ' ' } -> {
             showErrorSnackbar(
                 resources.getString(R.string.err_msg_password_and_confirm_password_mismatch),
                 true
             )
             false
         }
         !cb_terms_and_condition.isChecked ->
         {
             showErrorSnackbar(resources.getString(R.string.err_msg_agree_terms_and_condition),true)
             false
         }

         else ->
         {
             showErrorSnackbar("Your Details are valid.",false)
             true
         }

     }



    }




}