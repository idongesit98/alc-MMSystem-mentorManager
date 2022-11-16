package com.peculiaruc.alc_mmsystem_mentormanager.ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.peculiaruc.alc_mmsystem_mentormanager.R
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.ActivityEditProfileBinding

class EditProfile : AppCompatActivity() {

    private lateinit var binding: ActivityEditProfileBinding

    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEditProfileBinding.inflate(layoutInflater)

        setContentView(binding.root)

        supportActionBar!!.setDefaultDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "Edit Profile"


        //Country Exposed DropDown
        val country = resources.getStringArray(R.array.Countries)
        val countryArrayAdapter = ArrayAdapter(this,R.layout.drop_down_item,country)
        binding.autoCompleteCountryTextView.setAdapter(countryArrayAdapter)


        //City Exposed DropDown
        val city = resources.getStringArray(R.array.Cities)
        val cityArrayAdapter = ArrayAdapter(this,R.layout.drop_down_item,city)
        binding.autoCompleteCityTextView.setAdapter(cityArrayAdapter)



    }
}