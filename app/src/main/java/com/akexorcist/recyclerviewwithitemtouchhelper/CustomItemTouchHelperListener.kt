package com.akexorcist.recyclerviewwithitemtouchhelper

/**
 * Created by Akexorcist on 26/12/2017 AD.
 */
interface CustomItemTouchHelperListener {
    fun onItemMove(fromPosition: Int, toPosition: Int): Boolean

    fun onItemDismiss(position: Int)
}