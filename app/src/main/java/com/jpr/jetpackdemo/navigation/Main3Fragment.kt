package com.jpr.jetpackdemo.navigation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.jpr.jetpackdemo.R
import kotlinx.android.synthetic.main.fragment_page1.*
import kotlinx.android.synthetic.main.fragment_page3.*

/**
 * 类描述：
 * 创建日期：2019/9/25.
 * 作者：jiaopeirog
 */
class Main3Fragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_page3, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        up2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_page2)
        }
    }
}