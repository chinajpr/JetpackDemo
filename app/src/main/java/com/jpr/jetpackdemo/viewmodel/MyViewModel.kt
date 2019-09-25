package com.jpr.jetpackdemo.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

/**
 * 类描述：
 * 创建日期：2019/9/25.
 * 作者：jiaopeirog
 */
class MyViewModel : ViewModel() {
    private var name: MutableLiveData<String>?=null

    public fun getName(): LiveData<String> {
        if (name == null) {
            name = MutableLiveData()
            addName("Test")
        }
        return name as MutableLiveData<String>
    }

    public fun addName(s:String) {
        name?.value = s
    }
}