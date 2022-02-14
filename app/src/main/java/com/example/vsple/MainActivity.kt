package com.example.vsple

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.vsple.LocalDatabase.ApiService
import com.example.vsple.LocalDatabase.Network
import com.example.vsple.LocalDatabase.ResponseDTO
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var editText: EditText
    private lateinit var editPassword: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById<Button>(R.id.LoginBtn)!!
        editText = findViewById(R.id.etEmail)
        editPassword = findViewById(R.id.etPassword)
        buildData()
    }

    private fun buildData() {
        button.setOnClickListener {
            var apiService = Network.getInstance().create(ApiService::class.java)
            apiService.getApi(editText.text.toString(), editPassword.text.toString())
                .enqueue(object : retrofit2
                .Callback<ResponseDTO> {
                    override fun onResponse(
                        call: Call<ResponseDTO>,
                        response: Response<ResponseDTO>
                    ) {
                        if(editText.text.toString() == "hr@vsple.com" && editPassword.text.toString().trim()
                        == "Aa@1234567") {

                            var intent = Intent(applicationContext, MainActivity2::class.java)
                            startActivity(intent)
                            Toast.makeText(
                                applicationContext,
                                "Uploaded SuccessFull!",
                                Toast.LENGTH_LONG
                            ).show()

                        }
                        else{
                            Toast.makeText(applicationContext, "UnValid Credentials", Toast.LENGTH_LONG).show()
                        }
                    }

                    override fun onFailure(call: Call<ResponseDTO>, t: Throwable) {

                    }

                })

        }
    }
}