package app.mysecond.com.poc_customfont

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.widget.TextView

/**
 * Created by bala on 27/1/18.
 */
class CustomTextView : TextView {

    private var ANDROID_SCHEMA: String = "http://schemas.android.com/apk/res/android"

    constructor(context: Context, attr: AttributeSet) : super(context, attr) {
        applyCustomFont(context, attr)
    }

    constructor(context: Context, attr: AttributeSet, defStyle: Int) : super(context, attr, defStyle) {
        applyCustomFont(context, attr)
    }

    private fun applyCustomFont(context: Context, attr: AttributeSet) {

        var typeStyle: Int = attr.getAttributeIntValue(ANDROID_SCHEMA, "textStyle", Typeface.NORMAL)

        setTypeface(applyTypeStyle(context, typeStyle))
    }

    private fun applyTypeStyle(context: Context, typeStyle: Int): Typeface? {

        when (typeStyle) {

            Typeface.BOLD -> // bold
                return FontCache.getTypeFace(context, "SourceSansPro-Bold.ttf");

            Typeface.ITALIC -> // italic
                return FontCache.getTypeFace(context, "SourceSansPro-Italic.ttf");

            Typeface.NORMAL -> // regular
                return FontCache.getTypeFace(context, "SourceSansPro-Regular.ttf");
        }
        return FontCache.getTypeFace(context, "SourceSansPro-Regular.ttf");
    }
}