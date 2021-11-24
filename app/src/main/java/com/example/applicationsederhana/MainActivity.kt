package com.example.applicationsederhana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDolar: Button = findViewById(R.id.btn_dolar)
        btnDolar.setOnClickListener(this)

        val btnSuhu: Button = findViewById(R.id.btn_suhu)
        btnSuhu.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_dolar -> {
                val moveIntent = Intent(this@MainActivity, KonversiDolar::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_suhu -> {
                val moveIntent = Intent(this@MainActivity, KonversiSuhu::class.java)
                startActivity(moveIntent)
            }
        }
    }
}