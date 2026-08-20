package com.example.shopbiller

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.shopbiller.addproduct
import com.google.zxing.integration.android.IntentIntegrator
import kotlinx.android.synthetic.main.activity_addproduct.*
import kotlinx.android.synthetic.main.activity_homepage.*
import kotlinx.android.synthetic.main.activity_homepage.addproduct
import kotlinx.android.synthetic.main.admindash.*

class admindash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.admindash)

        addproduct.setOnClickListener {

            var intent = Intent(this, com.example.shopbiller.addproduct::class.java)
            startActivity(intent)
        }
        viewproducts.setOnClickListener {

            var intent = Intent(this, com.example.shopbiller.Viewproducts::class.java)
            startActivity(intent)
        }

    }


}
