package com.g3c1.myapplication.fragment

import com.g3c1.myapplication.BaseFragment
import com.g3c1.myapplication.R
import com.g3c1.myapplication.databinding.FragmentCategoryBinding

class CategoryFragment : BaseFragment<FragmentCategoryBinding>(R.layout.fragment_category) {
    override fun init() {
        binding.fragment = this
    }
}