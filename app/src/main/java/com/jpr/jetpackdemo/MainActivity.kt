package com.jpr.jetpackdemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.jpr.jetpackdemo.navigation.NavigationActivity
import com.jpr.jetpackdemo.viewmodel.VMActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun navigation(v: View) {
        val intent = Intent()
        intent.setClass(this, NavigationActivity::class.java)
        startActivity(intent)
    }

    fun vm(v:View){
        val intent = Intent()
        intent.setClass(this, VMActivity::class.java)
        startActivity(intent)
    }
}
