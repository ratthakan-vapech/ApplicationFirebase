package com.example.applicationfirebase.Page.Page1_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.applicationfirebase.R;
import com.example.applicationfirebase.databinding.ActivityPage001Binding;
import com.example.applicationfirebase.databinding.ActivityPage002Binding;
import com.google.firebase.analytics.FirebaseAnalytics;

public class Page002Activity extends AppCompatActivity {

    ActivityPage002Binding binding;
    FirebaseAnalytics firebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        firebaseAnalytics = FirebaseAnalytics.getInstance(this);
        binding = ActivityPage002Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.BTDetailinex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle params = new Bundle();
                params.putString("image_name", "android.png");
                params.putString("full_text", "Android 7.0 Nougat");
                firebaseAnalytics.logEvent("BT_detailinex", params);
            }
        });

        binding.BTStatinex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle params = new Bundle();
                params.putString("image_name", "android.png");
                params.putString("full_text", "Android 7.0 Nougat");
                firebaseAnalytics.logEvent("BT_statinex", params);
            }
        });

        binding.BTBginex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle params = new Bundle();
                params.putString("image_name", "android.png");
                params.putString("full_text", "Android 7.0 Nougat");
                firebaseAnalytics.logEvent("BT_bginex", params);
            }
        });

        binding.BTAddinex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle params = new Bundle();
                params.putString("image_name", "android.png");
                params.putString("full_text", "Android 7.0 Nougat");
                firebaseAnalytics.logEvent("BT_addinex", params);
            }
        });

        binding.BTCreditinex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle params = new Bundle();
                params.putString("image_name", "android.png");
                params.putString("full_text", "Android 7.0 Nougat");
                firebaseAnalytics.logEvent("BT_creditinex", params);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Bundle bundle = new Bundle();
        bundle.putString("name", "Mark");
        bundle.putString("full_text", "Test001");
        firebaseAnalytics.logEvent("open_view_Page002", bundle);
    }
}