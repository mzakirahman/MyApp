package com.example.applicationsederhana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class KonversiSuhu : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konversi_suhu)

        edtCelcius = findViewById(R.id.edt_celsius)
        btnBersuhu = findViewById(R.id.btn_bsuhu)
        esHasil = findViewById(R.id.hasils)
        akhHasil = findViewById(R.id.hasil_akhir)
        hasilAkh = findViewById(R.id.akhir_hasil)

        btnBersuhu.setOnClickListener(this)
    }

    private lateinit var edtCelcius: EditText
    private lateinit var btnBersuhu: Button
    private lateinit var esHasil : TextView
    private lateinit var akhHasil : TextView
    private lateinit var hasilAkh : TextView
    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_bsuhu) {
            val inputCelcius = edtCelcius.text.toString().trim()

            var isEmptyFields = false
            if (inputCelcius.isEmpty()) {
                isEmptyFields = true
                edtCelcius.error = "Field ini tidak boleh kosong"
            }

            if (!isEmptyFields) {
                val celcius = inputCelcius.toDouble()
                val fahrenheit = (celcius*9/5)+32
                val kelvin = celcius + 273
                esHasil.text = celcius.toString()+"Fahrenheit"
                akhHasil.text = fahrenheit.toString()+"Reamur"
                hasilAkh.text = kelvin.toString()+"Kelvin"

            }
        }
    }

}