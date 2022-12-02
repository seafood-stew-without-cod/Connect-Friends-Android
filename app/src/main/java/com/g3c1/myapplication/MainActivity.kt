package com.g3c1.myapplication

import BaseActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.g3c1.myapplication.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun viewSetting() {
        binding.activity = this
    }

    override fun observeEvent() {

    }

}