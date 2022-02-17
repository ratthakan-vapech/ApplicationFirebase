package com.example.applicationfirebase.Page.Page21_25;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.applicationfirebase.R;
import com.example.applicationfirebase.databinding.ActivityPage021Binding;
import com.example.applicationfirebase.databinding.ActivityPage025Binding;
import com.google.firebase.analytics.FirebaseAnalytics;

public class Page025Activity extends AppCompatActivity {

    ActivityPage025Binding binding;
    FirebaseAnalytics firebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        firebaseAnalytics = FirebaseAnalytics.getInstance(this);
        binding = ActivityPage025Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.BTAddfavLi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle params = new Bundle();
                params.putString("image_name", "android.png");
                params.putString("full_text", "Android 7.0 Nougat");
                firebaseAnalytics.logEvent("BT_addfav_li", params);
            }
        });

        binding.BTEditfavLi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle params = new Bundle();
                params.putString("image_name", "android.png");
                params.putString("full_text", "Android 7.0 Nougat");
                firebaseAnalytics.logEvent("BT_editfav_li", params);
            }
        });

        binding.BTSavefavLi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle params = new Bundle();
                params.putString("image_name", "android.png");
                params.putString("full_text", "Android 7.0 Nougat");
                firebaseAnalytics.logEvent("BT_savefav_li", params);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Bundle bundle = new Bundle();
        bundle.putString("name", "Mark");
        bundle.putString("full_text", "Test001");
        firebaseAnalytics.logEvent("open_view_Page025", bundle);
    }
}