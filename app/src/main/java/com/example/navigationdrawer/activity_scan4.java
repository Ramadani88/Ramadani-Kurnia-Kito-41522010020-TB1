package com.example.navigationdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class activity_scan4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan4);
    }
    public void imageButton(View view) {
        Intent intent = new Intent(activity_scan4.this, activity_scan3.class);
        startActivity(intent);
    }
    public void imageButton2(View view) {
        Intent intent = new Intent(activity_scan4.this, activity_scan5.class);
        startActivity(intent);
    }
}