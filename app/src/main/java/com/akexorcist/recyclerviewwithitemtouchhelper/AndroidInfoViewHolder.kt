package com.akexorcist.recyclerviewwithitemtouchhelper

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view_android_info.view.*

/**
 * Created by Akexorcist on 26/12/2017 AD.
 */

class AndroidInfoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun codeName(codeName: String) {
        itemView.tvCodeName.text = codeName
    }

    fun version(version: String) {
        itemView.tvVersion.text = itemView.resources.getString(R.string.android_version, version)
    }

    fun apiLevel(apiLevel: Int) {
        itemView.tvApiLevel.text = itemView.resources.getString(R.string.api_level, apiLevel)
    }

    fun releaseDate(date: String) {
        itemView.tvReleaseDate.text = itemView.resources.getString(R.string.release_date, date)
    }
}
