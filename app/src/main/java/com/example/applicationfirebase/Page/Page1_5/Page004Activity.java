package com.example.applicationfirebase.Page.Page1_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import com.example.applicationfirebase.databinding.ActivityPage004Binding;
import com.google.firebase.analytics.FirebaseAnalytics;

public class Page004Activity extends AppCompatActivity {

    ActivityPage004Binding binding;
    FirebaseAnalytics firebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        firebaseAnalytics = FirebaseAnalytics.getInstance(this);
        binding = ActivityPage004Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.BTSetbg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle params = new Bundle();
                params.putString("image_name", "android.png");
                params.putString("full_text", "Android 7.0 Nougat");
                firebaseAnalytics.logEvent("BT_setbg", params);
            }
        });

        binding.BTGraphbg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle params = new Bundle();
                params.putString("image_name", "android.png");
                params.putString("full_text", "Android 7.0 Nougat");
                firebaseAnalytics.logEvent("BT_graphbg", params);
            }
        });

        binding.BTEditbg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle params = new Bundle();
                params.putString("image_name", "android.png");
                params.putString("full_text", "Android 7.0 Nougat");
                firebaseAnalytics.logEvent("BT_editbg", params);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Bundle bundle = new Bundle();
        bundle.putString("name", "Mark");
        bundle.putString("full_text", "Test001");
        firebaseAnalytics.logEvent("open_view_Page004", bundle);
    }
}