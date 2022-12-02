package com.g3c1.myapplication.fragment

import com.g3c1.myapplication.BaseFragment
import com.g3c1.myapplication.R
import com.g3c1.myapplication.databinding.FragmentQrScannerBinding

class QRScannerFragment: BaseFragment<FragmentQrScannerBinding>(R.layout.fragment_qr_scanner) {
    override fun init() {
        binding.fragment = this
    }

}