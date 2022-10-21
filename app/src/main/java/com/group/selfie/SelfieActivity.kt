package com.group.selfie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.group.selfie.databinding.ActivitySelfieBinding
import timber.log.Timber

class SelfieActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySelfieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelfieBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        Timber.i("Show  navController $navController")
    }
}