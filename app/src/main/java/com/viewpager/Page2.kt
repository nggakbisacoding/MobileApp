package com.viewpager

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.viewpager.databinding.FragmentPage2Binding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class Page2 : Fragment() {
    private lateinit var binding: FragmentPage2Binding

    private lateinit var usernameEditText : EditText
    private lateinit var passworEditText: EditText
    private lateinit var loginButton : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPage2Binding.inflate(inflater, container, false)
        val view = binding.root

        usernameEditText = binding.etUsername
        passworEditText = binding.etPassword
        loginButton = binding.btnLogin

        loginButton.setOnClickListener{
            val username = usernameEditText.text.toString()
            val password = passworEditText.text.toString()

            val usncredential = "kaka"
            val passcredential = "123"

            if (username == usncredential && password == passcredential){
                val intenttoHomeActivity = Intent(context, HomeActivity::class.java)
                intenttoHomeActivity.putExtra("EXT_USERNAME", username)
                startActivity(intenttoHomeActivity)
            } else {
                Toast.makeText(context, "Masukkan Kredensial yang Benar!", Toast.LENGTH_LONG).show()
            }
        }
        return view
    }
}