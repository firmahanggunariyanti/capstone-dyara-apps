package com.eternal.dyaraapps.ui.splashscreenactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.eternal.dyaraapps.databinding.ActivitySplashScreenBinding
import com.eternal.dyaraapps.ui.sessionactivtiy.SessionActivity

class SplashScreen : AppCompatActivity() {

    lateinit var handler: Handler

    private val binding: ActivitySplashScreenBinding by lazy { ActivitySplashScreenBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        handler = Handler()
        handler.postDelayed({
            val intent = Intent(this, SessionActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}