package com.example.shopbiller

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.zxing.integration.android.IntentIntegrator
import kotlinx.android.synthetic.main.activity_addproduct.*
import android.R.attr.data
import android.widget.Toast
import com.google.zxing.integration.android.IntentResult
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.text.TextUtils
import kotlinx.android.synthetic.main.adminlogin.*


class adminlogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.adminlogin)



        login.setOnClickListener{

            if (username.text.toString()=="admin" && password.text.toString()=="admin123"){
                var intent = Intent(this,admindash::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"username and password are incorrect",Toast.LENGTH_SHORT).show()
            }

        }
    }


}
admin