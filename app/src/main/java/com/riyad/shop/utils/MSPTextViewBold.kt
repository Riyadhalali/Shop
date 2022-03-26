package com.riyad.shop.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import kotlinx.android.synthetic.main.activity_splash_screen.*
import kotlinx.android.synthetic.main.activity_splash_screen.view.*


class MSPTextViewBold(context: Context,attrs:AttributeSet):AppCompatTextView(context,attrs) {


    init {
        applyFont()
    }


    private fun applyFont()
    {
        // create a font from assets
        val typeface: Typeface = Typeface.createFromAsset(context.assets,"Montserrat-Bold.ttf")
        setTypeface(typeface)

    }
}