package app.mysecond.com.poc_customfont

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvSecond = findViewById<TextView>(R.id.tvSecond)
        val typeFace = Typeface.createFromAsset(assets,"Amazing Kids.ttf")
        tvSecond.setTypeface(typeFace)


        val tvThree = findViewById<TextView>(R.id.tvThree)
        tvThree.setTypeface(FontCache.getTypeFace(this,"Amazing Kids.ttf"))

    }
}
