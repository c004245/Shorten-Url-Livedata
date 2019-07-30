package com.example.livedata

import android.os.Bundle
import com.example.livedata.databinding.ActivityShortenUrlBinding
import com.example.livedata.view.BaseActivity

class MainActivity : BaseActivity<ActivityShortenUrlBinding> {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shorten_url)
    }
}
