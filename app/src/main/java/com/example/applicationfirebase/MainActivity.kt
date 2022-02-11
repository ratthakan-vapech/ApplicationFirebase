package com.example.applicationfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.analytics.FirebaseAnalytics

import android.R.id
import android.content.Intent
import android.widget.Button
import com.google.android.gms.measurement.module.Analytics


class MainActivity : AppCompatActivity() {

    private lateinit var mFirebaseAnalytics: FirebaseAnalytics
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this)


        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val params = Bundle()
            params.putString("image_name", "android.png")
            params.putString("full_text", "Android 7.0 Nougat")
            mFirebaseAnalytics.logEvent("push_button_android", params)

            startActivity(Intent(this, MainMenuActivity::class.java))
        }


    }

    override fun onResume() {
        super.onResume()
        val bundle = Bundle()
        bundle.putString("name", "Nueng")
        bundle.putString("full_text", "Asadej")
        mFirebaseAnalytics.logEvent("open_view_android", bundle)
    }
}