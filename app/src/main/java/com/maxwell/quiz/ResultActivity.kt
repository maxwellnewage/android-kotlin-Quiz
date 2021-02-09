package com.maxwell.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    private lateinit var tvName: TextView
    private lateinit var tvScore: TextView
    private lateinit var btFinish: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        initViews()
    }

    private fun initViews() {
        tvName = findViewById(R.id.tvName)
        tvScore = findViewById(R.id.tvScore)
        btFinish = findViewById(R.id.btFinish)

        btFinish.setOnClickListener {

        }
    }
}