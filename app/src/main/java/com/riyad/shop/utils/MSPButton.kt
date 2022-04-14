package com.riyad.shop.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText

class MSPButton (context: Context, attributeSet: AttributeSet): AppCompatEditText(context,attributeSet) {



init {
    applyButton()
}

    // test the color and confrim that every thing is good
    private fun applyButton()
    {
        // create a font from assets
        val typeface: Typeface = Typeface.createFromAsset(context.assets,"Montserrat-Bold.ttf")
        setTypeface(typeface)
    }
}

