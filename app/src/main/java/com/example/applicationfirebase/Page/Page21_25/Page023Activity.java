package com.example.applicationfirebase.Page.Page21_25;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.applicationfirebase.R;
import com.example.applicationfirebase.databinding.ActivityPage021Binding;
import com.example.applicationfirebase.databinding.ActivityPage023Binding;
import com.google.firebase.analytics.FirebaseAnalytics;

public class Page023Activity extends AppCompatActivity {

    ActivityPage023Binding binding;
    FirebaseAnalytics firebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        firebaseAnalytics = FirebaseAnalytics.getInstance(this);
        binding = ActivityPage023Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.BTAddfavIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle params = new Bundle();
                params.putString("image_name", "android.png");
                params.putString("full_text", "Android 7.0 Nougat");
                firebaseAnalytics.logEvent("BT_addfav_in", params);
            }
        });

        binding.BTEditfavIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle params = new Bundle();
                params.putString("image_name", "android.png");
                params.putString("full_text", "Android 7.0 Nougat");
                firebaseAnalytics.logEvent("BT_editfav_in", params);
            }
        });

        binding.BTSavefavIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle params = new Bundle();
                params.putString("image_name", "android.png");
                params.putString("full_text", "Android 7.0 Nougat");
                firebaseAnalytics.logEvent("BT_savefav_in", params);
            }
        });

        binding.BTAllSelectin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle params = new Bundle();
                params.putString("image_name", "android.png");
                params.putString("full_text", "Android 7.0 Nougat");
                firebaseAnalytics.logEvent("BT_all_selectin", params);
            }
        });

        binding.BTActSelectin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle params = new Bundle();
                params.putString("image_name", "android.png");
                params.putString("full_text", "Android 7.0 Nougat");
                firebaseAnalytics.logEvent("BT_act_selectin", params);
            }
        });

        binding.BTPasSelectin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle params = new Bundle();
                params.putString("image_name", "android.png");
                params.putString("full_text", "Android 7.0 Nougat");
                firebaseAnalytics.logEvent("BT_pas_selectin", params);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Bundle bundle = new Bundle();
        bundle.putString("name", "Mark");
        bundle.putString("full_text", "Test001");
        firebaseAnalytics.logEvent("open_view_Page023", bundle);
    }
}