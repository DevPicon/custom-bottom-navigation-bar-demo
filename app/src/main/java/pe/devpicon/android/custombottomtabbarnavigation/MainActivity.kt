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
        }
        viewBinding.btnHome.setImageResource(R.drawable.ic_home_blue)


    }

    private fun changingBottomTabs(position: Int) = with(viewBinding) {
        when (position) {
            0 -> {
                btnHome.setImageResource(R.drawable.ic_home_blue)
                btnSearch.setImageResource(R.drawable.ic_search_black)
                btnAdd.setImageResource(R.drawable.ic_add_black)
                btnNotifications.setImageResource(R.drawable.ic_notifications_black)
                btnProfile.setImageResource(R.drawable.ic_person_outline_black)
            }
            1 -> {
                btnHome.setImageResource(R.drawable.ic_home_black)
                btnSearch.setImageResource(R.drawable.ic_search_blue)
                btnAdd.setImageResource(R.drawable.ic_add_black)
                btnNotifications.setImageResource(R.drawable.ic_notifications_black)
                btnProfile.setImageResource(R.drawable.ic_person_outline_black)
            }
            2 -> {
                btnHome.setImageResource(R.drawable.ic_home_black)
                btnSearch.setImageResource(R.drawable.ic_search_black)
                btnAdd.setImageResource(R.drawable.ic_add_blue)
                btnNotifications.setImageResource(R.drawable.ic_notifications_black)
                btnProfile.setImageResource(R.drawable.ic_person_outline_black)
            }
            3 -> {
                btnHome.setImageResource(R.drawable.ic_home_black)
                btnSearch.setImageResource(R.drawable.ic_search_black)
                btnAdd.setImageResource(R.drawable.ic_add_black)
                btnNotifications.setImageResource(R.drawable.ic_notifications_blue)
                btnProfile.setImageResource(R.drawable.ic_person_outline_black)
            }
            4 -> {
                btnHome.setImageResource(R.drawable.ic_home_black)
                btnSearch.setImageResource(R.drawable.ic_search_black)
                btnAdd.setImageResource(R.drawable.ic_add_black)
                btnNotifications.setImageResource(R.drawable.ic_notifications_black)
                btnProfile.setImageResource(R.drawable.ic_person_outline_blue)
            }
        }
    }
}