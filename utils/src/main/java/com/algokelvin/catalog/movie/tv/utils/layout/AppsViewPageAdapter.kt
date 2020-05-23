package com.algokelvin.catalog.movie.tv.utils.layout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class AppsViewPageAdapter(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager) {
    private val pageApps: MutableList<Fragment> = mutableListOf()

    override fun getItem(position: Int): Fragment = pageApps[position]
    override fun getCount(): Int = pageApps.size

    fun addAppsPage(fragment: Array<out Fragment>) {
        for (layout in fragment)
            this.pageApps.add(layout)
    }
}