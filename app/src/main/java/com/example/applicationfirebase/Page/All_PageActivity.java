package com.example.applicationfirebase.Page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.applicationfirebase.Page.Page11_15.Page011Activity;
import com.example.applicationfirebase.Page.Page16_20.Page020Activity;
import com.example.applicationfirebase.Page.Page1_5.Page001Activity;
import com.example.applicationfirebase.Page.Page21_25.page021Activity;
import com.example.applicationfirebase.Page.Page6_10.Page006Activity;
import com.example.applicationfirebase.databinding.ActivityAllPageBinding;

public class All_PageActivity extends AppCompatActivity {

    ActivityAllPageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAllPageBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.page001005.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(All_PageActivity.this, Page001Activity.class);
                startActivity(intent);
            }
        });

        binding.page006010.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(All_PageActivity.this, Page006Activity.class);
                startActivity(intent);
            }
        });

        binding.page011015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(All_PageActivity.this, Page011Activity.class);
                startActivity(intent);
            }
        });

        binding.page016020.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(All_PageActivity.this, Page020Activity.class);
                startActivity(intent);
            }
        });

        binding.page021025.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(All_PageActivity.this, page021Activity.class);
                startActivity(intent);
            }
        });
    }
}