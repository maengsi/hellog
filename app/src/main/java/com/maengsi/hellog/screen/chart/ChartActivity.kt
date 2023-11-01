package com.maengsi.hellog.screen.chart

import android.os.Bundle
import android.widget.Toast
import com.maengsi.hellog.BR
import com.maengsi.hellog.BaseActivity
import com.maengsi.hellog.R
import com.maengsi.hellog.databinding.ActivityMainBinding
import com.maengsi.hellog.screen.main.MainViewModel

class ChartActivity : BaseActivity<ActivityMainBinding, MainViewModel>(
    resourceId = R.layout.activity_main,
    clazz = MainViewModel::class,
    viewModelId = BR.vmMain
) {
    override fun init(savedInstanceState: Bundle?) {
        super.init(savedInstanceState)
        Toast.makeText(this@ChartActivity, "Hello World", Toast.LENGTH_SHORT).show()

    }
    override fun initListener() {

    }
}