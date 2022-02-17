package com.example.applicationfirebase.Page.Page11_15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.applicationfirebase.Page.Page1_5.Page001Activity;
import com.example.applicationfirebase.Page.Page6_10.Page006Activity;
import com.example.applicationfirebase.R;
import com.example.applicationfirebase.databinding.ActivityPage008Binding;
import com.example.applicationfirebase.databinding.ActivityPage011Binding;
import com.google.firebase.analytics.FirebaseAnalytics;

public class Page011Activity extends AppCompatActivity {

    ActivityPage011Binding binding;
    FirebaseAnalytics firebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        firebaseAnalytics = FirebaseAnalytics.getInstance(this);
        binding = ActivityPage011Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.BTStatcf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle params = new Bundle();
                params.putString("image_name", "android.png");
                params.putString("full_text", "Android 7.0 Nougat");
                firebaseAnalytics.logEvent("BT_statcf", params);
            }
        });

        binding.BTCicf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle params = new Bundle();
                params.putString("image_name", "android.png");
                params.putString("full_text", "Android 7.0 Nougat");
                firebaseAnalytics.logEvent("BT_cicf", params);
            }
        });

        binding.BTCocf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle params = new Bundle();
                params.putString("image_name", "android.png");
                params.putString("full_text", "Android 7.0 Nougat");
                firebaseAnalytics.logEvent("BT_cocf", params);
            }
        });

        NextPage();

    }

    private void NextPage() {

        binding.page012.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Page011Activity.this, Page012Activity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Bundle bundle = new Bundle();
        bundle.putString("name", "Mark");
        bundle.putString("full_text", "Test001");
        firebaseAnalytics.logEvent("open_view_Page011", bundle);
    }
}