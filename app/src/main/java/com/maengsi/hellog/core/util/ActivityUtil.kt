package com.maengsi.hellog.core.util

import android.app.Activity
import android.content.Intent
import com.maengsi.hellog.screen.chart.ChartActivity

class ActivityUtil {

    fun startChartActivity(activity : Activity) {
        val intent = Intent(activity, ChartActivity::class.java)
        activity.startActivity(intent)
    }


}