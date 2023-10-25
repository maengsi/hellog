package com.maengsi.hellog

import android.os.Bundle

interface BaseViewInterface {

    fun initDataBinding()
    fun init(savedInstanceState: Bundle?)
}