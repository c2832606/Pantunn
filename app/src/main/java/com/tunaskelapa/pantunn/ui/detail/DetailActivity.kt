package com.tunaskelapa.pantunn.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tunaskelapa.pantunn.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}