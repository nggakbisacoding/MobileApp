package com.example.activityintent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.activityintent.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataIntent = intent

        val username = dataIntent.getStringExtra("EXT_USERNAME")
        val email = dataIntent.getStringExtra("EXT_EMAIL")
        val phone = dataIntent.getStringExtra("EXT_PHONE")

        with(binding) {
            val activated_email = "Your "+ email +" has ben Activated!"
            val activated_phone = "Your "+ phone +" has ben Registered!"
            textViewUsername.text = username
            textViewEmail.text = email
            textViewPhone.text = phone
        }
    }
}