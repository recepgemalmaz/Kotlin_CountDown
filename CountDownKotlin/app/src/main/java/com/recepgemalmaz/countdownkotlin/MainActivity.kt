package com.recepgemalmaz.countdownkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.recepgemalmaz.countdownkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Countdown example for 10 seconds  // 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, Finish!
        object : CountDownTimer(10000, 1000) {
            override fun onTick(p0: Long) {
                binding.textView.text = (p0 / 1000).toString()
            }

            override fun onFinish() {
                binding.textView.text = "Finish!"
            }
        }.start()
    }
}