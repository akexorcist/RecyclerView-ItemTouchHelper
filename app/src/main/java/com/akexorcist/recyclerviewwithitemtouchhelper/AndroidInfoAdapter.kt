package com.akexorcist.recyclerviewwithitemtouchhelper

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import java.util.*

/**
 * Created by Akexorcist on 26/12/2017 AD.
 */
class AndroidInfoAdapter(private val androidList: MutableList<Android>?) : RecyclerView.Adapter<AndroidInfoViewHolder>(), CustomItemTouchHelperListener {
    override fun getItemCount(): Int {
        return androidList?.size ?: 0
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): AndroidInfoViewHolder {
        return AndroidInfoViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.view_android_info, parent, false))
    }

    override fun onBindViewHolder(holder: AndroidInfoViewHolder?, position: Int) {
        holder?.let {
            val android = androidList?.get(position)
            val unknownInfo = it.itemView?.context?.getString(R.string.unknown) ?: "Unknown"
            it.codeName(android?.codeName ?: unknownInfo)
            it.version(android?.version ?: unknownInfo)
            it.apiLevel(android?.apiLevel ?: 0)
            it.releaseDate(android?.releaseDate ?: unknownInfo)
        }
    }

    override fun onItemMove(fromPosition: Int, toPosition: Int): Boolean {
        Collections.swap(androidList, fromPosition, toPosition)
        notifyItemMoved(fromPosition, toPosition)
        return true
    }

    override fun onItemDismiss(position: Int) {
        androidList?.removeAt(position)
        notifyItemRemoved(position)
    }
}