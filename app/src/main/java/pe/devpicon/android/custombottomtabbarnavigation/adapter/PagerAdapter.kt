package pe.devpicon.android.custombottomtabbarnavigation.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import pe.devpicon.android.custombottomtabbarnavigation.fragments.AddFragment
import pe.devpicon.android.custombottomtabbarnavigation.fragments.HomeFragment
import pe.devpicon.android.custombottomtabbarnavigation.fragments.NotificationsFragment
import pe.devpicon.android.custombottomtabbarnavigation.fragments.ProfileFragment
import pe.devpicon.android.custombottomtabbarnavigation.fragments.SearchFragment

internal class PagerAdapter(fm: FragmentManager)
    : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getCount(): Int = 5

    override fun getItem(position: Int): Fragment = when (position) {
        0 -> HomeFragment.newInstance()
        1 -> SearchFragment.newInstance()
        2 -> AddFragment.newInstance()
        3 -> NotificationsFragment.newInstance()
        4 -> ProfileFragment.newInstance()
        else -> HomeFragment.newInstance()
    }
}