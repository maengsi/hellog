package com.maengsi.hellog

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import kotlin.reflect.KClass

abstract class BaseActivity<T : ViewDataBinding, VM : BaseViewModel> (
    @LayoutRes private val resourceId : Int,
    clazz : KClass<VM>,
    private val viewModelId : Int
) : AppCompatActivity() , BaseViewInterface{

    val viewDataBinding : T by lazy {
        DataBindingUtil.setContentView(this,resourceId)
    }
    private val viewModel : VM by lazy {
        ViewModelProvider(this)[clazz.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initDataBinding()
        init(savedInstanceState)
        initListener()
    }

    override fun init(savedInstanceState: Bundle?) {
    }

    override fun initDataBinding() {
        viewDataBinding.also {
            if(viewModelId > 0) {
                it.setVariable(viewModelId, viewModel)
            }
            it.lifecycleOwner = this
        }
    }

    /*********/
    fun showAlert(title : String, message : String) {

    }
}