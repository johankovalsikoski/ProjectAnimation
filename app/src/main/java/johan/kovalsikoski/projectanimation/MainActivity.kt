package johan.kovalsikoski.projectanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_animate.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.animation)
            iv_plane.startAnimation(animation)
        }
    }
}
