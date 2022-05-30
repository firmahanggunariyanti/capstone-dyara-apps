package com.eternal.dyaraapps.ui.sessionactivtiy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eternal.dyaraapps.R
import com.eternal.dyaraapps.databinding.ActivitySessionBinding
import com.eternal.dyaraapps.ui.start.StartFragment

class SessionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_session)

        val mFragmentManager = supportFragmentManager
        val startFragment = StartFragment()
        mFragmentManager.beginTransaction().add(R.id.frame_container, startFragment, StartFragment::class.java.simpleName).commit()
    }


}