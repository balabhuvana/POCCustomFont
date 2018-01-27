package app.mysecond.com.poc_customfont

import android.content.Context
import android.graphics.Typeface

/**
 * Created by bala on 27/1/18.
 */
class FontCache {

    companion object {
        val fontCache: HashMap<String, Typeface> = HashMap()
        fun getTypeFace(context: Context, fontName: String): Typeface? {
            var typeFace: Typeface? = fontCache.get(fontName)
            if (typeFace == null) {
                typeFace = Typeface.createFromAsset(context.assets, fontName)
                fontCache.put(fontName, typeFace)
            }
            return typeFace
        }
    }

}