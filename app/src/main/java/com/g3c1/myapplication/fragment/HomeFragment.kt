package com.g3c1.myapplication.fragment

import com.g3c1.myapplication.BaseFragment
import com.g3c1.myapplication.R
import com.g3c1.myapplication.databinding.FragmentHomeBinding

class HomeFragment: BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {
    override fun init() {
        binding.fragment = this
    }

}