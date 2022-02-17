package com.example.applicationfirebase.Page.Page21_25;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.applicationfirebase.Page.Page11_15.Page011Activity;
import com.example.applicationfirebase.Page.Page11_15.Page012Activity;
import com.example.applicationfirebase.R;
import com.example.applicationfirebase.databinding.ActivityPage020Binding;
import com.example.applicationfirebase.databinding.ActivityPage021Binding;
import com.google.firebase.analytics.FirebaseAnalytics;

public class page021Activity extends AppCompatActivity {

    ActivityPage021Binding binding;
    FirebaseAnalytics firebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        firebaseAnalytics = FirebaseAnalytics.getInstance(this);
        binding = ActivityPage021Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.BTAddauto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle params = new Bundle();
                params.putString("image_name", "android.png");
                params.putString("full_text", "Android 7.0 Nougat");
                firebaseAnalytics.logEvent("BT_addauto", params);
            }
        });

        binding.BTEditauto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle params = new Bundle();
                params.putString("image_name", "android.png");
                params.putString("full_text", "Android 7.0 Nougat");
                firebaseAnalytics.logEvent("BT_editauto", params);
            }
        });

        binding.BTDoneauto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle params = new Bundle();
                params.putString("image_name", "android.png");
                params.putString("full_text", "Android 7.0 Nougat");
                firebaseAnalytics.logEvent("BT_doneauto", params);
            }
        });
        
        Nextpage();
    }

    private void Nextpage() {

        binding.page022.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page021Activity.this, Page022Activity.class);
                startActivity(intent);
            }
        });

        binding.page023.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page021Activity.this, Page023Activity.class);
                startActivity(intent);
            }
        });

        binding.page024.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page021Activity.this, Page024Activity.class);
                startActivity(intent);
            }
        });

        binding.page025.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page021Activity.this, Page025Activity.class);
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
        firebaseAnalytics.logEvent("open_view_Page021", bundle);
    }
}