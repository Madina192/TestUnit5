package com.example.testunit5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testunit5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        with(binding) {
            btnAdd.setOnClickListener {
                tvResult.text = Math().add(etFirst.text.toString(), etSecond.text.toString())
            }
            btnDivide.setOnClickListener {
                tvResult.text = Math().divide(etFirst.text.toString(), etSecond.text.toString())
            }
        }
    }
}