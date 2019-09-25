package com.jpr.jetpackdemo.viewmodel

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.jpr.jetpackdemo.R
import kotlinx.android.synthetic.main.activity_vm.*

/**
 * 类描述：
 * 创建日期：2019/9/25.
 * 作者：jiaopeirog
 */
class VMActivity : AppCompatActivity() {
    var get: MyViewModel? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vm)
        get = ViewModelProviders.of(this).get(MyViewModel::class.java)
        get?.getName()?.observe(this, Observer {
            tv.text = it
        })
    }

    fun btn(v: View) {
        get?.addName("0000")
    }

}