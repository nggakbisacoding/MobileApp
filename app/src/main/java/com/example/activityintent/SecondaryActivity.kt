package com.example.activityintent

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.activityintent.databinding.ActivitySecondaryBinding

class SecondaryActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondaryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondaryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            btnRegister.setOnClickListener() {
                val intent = Intent(this@SecondaryActivity, ThirdActivity::class.java)

                // menambahkan titipan pada intent
                intent.putExtra("EXT_USERNAME", editTextUsername.text.toString())
                intent.putExtra("EXT_EMAIL", editTextEmail.text.toString())
                intent.putExtra("EXT_PHONE", editTextPhone.text.toString())

                // untuk memulai intent
                startActivity(intent)
            }
            btnLogin.setOnClickListener(){
                // untuk membuat intent
                val intent = Intent(this@SecondaryActivity, MainActivity::class.java)
                // untuk memulai intent
                startActivity(intent)
                finish()
            }
        }
    }
}