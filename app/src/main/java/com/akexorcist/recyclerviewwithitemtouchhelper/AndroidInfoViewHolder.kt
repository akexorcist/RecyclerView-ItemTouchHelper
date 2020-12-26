package com.akexorcist.recyclerviewwithitemtouchhelper

import androidx.recyclerview.widget.RecyclerView
import com.akexorcist.recyclerviewwithitemtouchhelper.databinding.ViewAndroidInfoBinding

class AndroidInfoViewHolder(
    private val binding: ViewAndroidInfoBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun codeName(codeName: String) {
        binding.tvCodeName.text = codeName
    }

    fun version(version: String) {
        binding.tvVersion.text = itemView.resources.getString(R.string.android_version, version)
    }

    fun apiLevel(apiLevel: Int) {
        binding.tvApiLevel.text = itemView.resources.getString(R.string.api_level, apiLevel)
    }

    fun releaseDate(date: String) {
        binding.tvReleaseDate.text = itemView.resources.getString(R.string.release_date, date)
    }
}
