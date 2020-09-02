package pe.devpicon.android.custombottomtabbarnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import pe.devpicon.android.custombottomtabbarnavigation.adapter.PagerAdapter
import pe.devpicon.android.custombottomtabbarnavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityMainBinding
    private lateinit var pagerAdapter: PagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        pagerAdapter = PagerAdapter(supportFragmentManager)
        with(viewBinding.viewPager) {
            this.adapter = pagerAdapter
            this.offscreenPageLimit = 5
            this.addOnPageChangeListener(object : OnPageChangeListener {
                override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
                }

                override fun onPageSelected(position: Int) {
                    changingBottomTabs(position)
                }

                override fun onPageScrollStateChanged(state: Int) {
                }

            })
            this.currentItem = 0

            viewBinding.bottomNavigation.setOnNavigationItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.menu_item_home -> {
                        this.currentItem = 0
                        true
                    }
                    R.id.menu_item_search -> {
                        this.currentItem = 1
                        true
                    }
                    R.id.menu_item_add -> {
                        this.currentItem = 2
                        true
                    }
                    R.id.menu_item_notifications -> {
                        this.currentItem = 3
                        true
                    }
                    R.id.menu_item_profile -> {
                        this.currentItem = 4
                        true
                    }
                    else -> false
                }
            }
        }


    }

    private fun changingBottomTabs(position: Int) = with(viewBinding) {
        when (position) {
            0 -> bottomNavigation.selectedItemId = R.id.menu_item_home
            1 -> bottomNavigation.selectedItemId = R.id.menu_item_search
            2 -> bottomNavigation.selectedItemId = R.id.menu_item_add
            3 -> bottomNavigation.selectedItemId = R.id.menu_item_notifications
            4 -> bottomNavigation.selectedItemId = R.id.menu_item_profile
        }
    }
}