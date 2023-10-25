package com.maengsi.hellog.screen.main

import android.os.Bundle
import android.widget.Toast
import com.maengsi.hellog.BR
import com.maengsi.hellog.BaseActivity
import com.maengsi.hellog.R
import com.maengsi.hellog.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(
    resourceId = R.layout.activity_main,
    clazz = MainViewModel::class,
    viewModelId = BR.vmMain
) {
    override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState) }

    override fun init(savedInstanceState: Bundle?) {
        super.init(savedInstanceState)
        Toast.makeText(this@MainActivity, "Hello World", Toast.LENGTH_SHORT).show()

    }
}