package com.akexorcist.recyclerviewwithitemtouchhelper

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.akexorcist.recyclerviewwithitemtouchhelper.databinding.ViewAndroidInfoBinding
import java.util.*

class AndroidInfoAdapter(
    private val androidList: MutableList<Android>?
) : RecyclerView.Adapter<AndroidInfoViewHolder>(), CustomItemTouchHelperListener {
    override fun getItemCount(): Int {
        return androidList?.size ?: 0
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AndroidInfoViewHolder {
        return AndroidInfoViewHolder(ViewAndroidInfoBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: AndroidInfoViewHolder, position: Int) {
        val android = androidList?.get(position)
        val unknownInfo = holder.itemView.context.getString(R.string.unknown)
        holder.codeName(android?.codeName ?: unknownInfo)
        holder.version(android?.version ?: unknownInfo)
        holder.apiLevel(android?.apiLevel ?: 0)
        holder.releaseDate(android?.releaseDate ?: unknownInfo)
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
