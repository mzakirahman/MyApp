package com.example.applicationsederhana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class KonversiDolar : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konversi_dolar)

        edtDolar = findViewById(R.id.edt_dolar)
        btnRupiah = findViewById(R.id.btn_rupiah)
        eHasil = findViewById(R.id.hasil)

        btnRupiah.setOnClickListener(this)

    }
    private lateinit var edtDolar: EditText
    private lateinit var btnRupiah: Button
    private lateinit var eHasil : TextView


    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_rupiah) {
            val inputRupiah = edtDolar.text.toString().trim()

            var isEmptyFields = false
            if (inputRupiah.isEmpty()) {
                isEmptyFields = true
                edtDolar.error = "Field ini tidak boleh kosong"
            }

            if (!isEmptyFields) {
                val akhir = inputRupiah.toFloat()/15000
                eHasil.text = "$"+ akhir.toString()
            }
        }


    }
}