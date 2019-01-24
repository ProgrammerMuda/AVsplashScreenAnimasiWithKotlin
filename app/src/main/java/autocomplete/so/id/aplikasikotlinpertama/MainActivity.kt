package autocomplete.so.id.aplikasikotlinpertama

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.wang.avi.AVLoadingIndicatorView

class MainActivity : AppCompatActivity() {

    private var mDelayHandler: Handler? = null
    private val SPLASH_DELAY: Long = 10000 //10 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val avi  = findViewById<View>(R.id.avi) as AVLoadingIndicatorView
        avi.setIndicator("PacmanIndicator")

        mDelayHandler = Handler()

        //Navigate with delay
        mDelayHandler!!.postDelayed(mRunnable, SPLASH_DELAY)

    }

    internal val mRunnable: Runnable = Runnable {

        val intent = Intent(applicationContext, MenuActivity::class.java)
        startActivity(intent)
        finish()
    }



}
