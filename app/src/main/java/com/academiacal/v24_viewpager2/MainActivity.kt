package com.academiacal.v24_viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf(
            R.drawable.ds1,
            R.drawable.ds2,
            R.drawable.ds3,
            R.drawable.ds4,
            R.drawable.ds5
        )
        val adapter = ViewPagerAdapter(images)
        viewPager.adapter = adapter
        //viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL

        /*
        viewPager.beginFakeDrag()
        viewPager.fakeDragBy(-10f)
        viewPager.endFakeDrag()*/

    }
}
