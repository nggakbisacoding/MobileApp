package com.trpl.app

//noinspection SuspiciousImport
import android.R
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import com.trpl.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private val types = arrayOf(
        "Regular",
        "Bussiness",
        "Executive",
        "VIP"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var selectedType = ""
        var selectedDate = ""
        var selectedTime = ""
        with(binding){
            val adapterTypes = ArrayAdapter(this@MainActivity, R.layout.simple_spinner_item, types)

            adapterTypes.setDropDownViewResource(R.layout.simple_spinner_dropdown_item)
            spinnerTypes.adapter = adapterTypes
            spinnerTypes.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parentView: AdapterView<*>?, selectedItemView: View?, position: Int, id: Long) {
                    selectedType = types[position]
                }
                override fun onNothingSelected(parentView: AdapterView<*>?) {
                    selectedType = types[0]
                }
            }
            datePicker.init(
                datePicker.year,
                datePicker.month,
                datePicker.dayOfMonth
            ){_, year, monthOfYear, dayOfMonth ->
                selectedDate = "$dayOfMonth/${monthOfYear + 1}/$year"
            }
            timePicker.setOnTimeChangedListener{ _, hourOfDay, minute ->
                selectedTime = String.format("%02d:%02d", hourOfDay, minute)
            }
            btnPesan.setOnClickListener {
                Toast.makeText(this@MainActivity, "Tiket Pesawat $selectedType, tanggal $selectedDate, pukul $selectedTime telah dipesan!!", Toast.LENGTH_LONG).show()
            }
        }
    }
}