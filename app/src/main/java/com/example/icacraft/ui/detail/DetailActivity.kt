package com.example.icacraft.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.icacraft.R
import kotlinx.android.synthetic.main.layout_toolbar.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }

    fun toolbarPayment(){
        toolbar.visibility = View.VISIBLE
        toolbar.title       = "Pembayaran"
        toolbar.subtitle    = "Pembayaran 24 jam"
        toolbar.navigationIcon = resources.getDrawable(R.drawable.arrow_back_ios_24px_outlined, null)
        toolbar.setNavigationOnClickListener { onBackPressed() }
    }

    fun toolbarDetail() {
        toolbar.visibility = View.GONE
    }
}