package uz.iskandarbek.textanim

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tashbaqa = findViewById<ImageView>(R.id.toshbaqa)

        tashbaqa.setOnClickListener {
            val ortaga = AnimationUtils.loadAnimation(this, R.anim.anim)
            val pastga = AnimationUtils.loadAnimation(this, R.anim.anim2)

            ortaga.setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(animation: Animation?) {}

                override fun onAnimationEnd(animation: Animation?) {
                    tashbaqa.startAnimation(pastga)
                }

                override fun onAnimationRepeat(animation: Animation?) {}
            })

            tashbaqa.startAnimation(ortaga)
        }
    }
}