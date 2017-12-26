package com.akexorcist.recyclerviewwithitemtouchhelper

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.helper.ItemTouchHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        val adapter = AndroidInfoAdapter(InfoGenerator.createAndroidVersionInfo())
        rvAndroidVersion.layoutManager = LinearLayoutManager(this)
        rvAndroidVersion.adapter = adapter
        val callback = CustomItemTouchHelperCallback(adapter)
        val itemTouchHelper = ItemTouchHelper(callback)
        itemTouchHelper.attachToRecyclerView(rvAndroidVersion)
    }
}
