package com.example.linearlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.linearlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)

        with(binding){
            submitBtn.setOnClickListener{
                Toast.makeText(this@MainActivity,name.editableText.toString() +"\n"+ phone.editableText +"\n"+ address
                    .editableText +"\n"+ massage.editableText  ,Toast.LENGTH_LONG).show()

            }
        }

    }



}

