package com.example.ohsanrim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.ohsanrim.databinding.ActivityRegisterBinding


class RegisterMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_main)
        val binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    fun blankCheck(value: String): Boolean {
        return value == "" || value == null
    }

}