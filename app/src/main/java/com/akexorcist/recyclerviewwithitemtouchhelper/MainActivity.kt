package com.akexorcist.recyclerviewwithitemtouchhelper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ItemTouchHelper
import com.akexorcist.recyclerviewwithitemtouchhelper.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        val adapter = AndroidInfoAdapter(InfoGenerator.createAndroidVersionInfo())
        binding.rvAndroidVersion.layoutManager = LinearLayoutManager(this)
        binding.rvAndroidVersion.adapter = adapter
        val callback = CustomItemTouchHelperCallback(adapter)
        val itemTouchHelper = ItemTouchHelper(callback)
        itemTouchHelper.attachToRecyclerView(binding.rvAndroidVersion)
    }
}
