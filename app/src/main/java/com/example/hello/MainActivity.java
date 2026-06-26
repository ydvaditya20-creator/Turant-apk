package com.example.myapk;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void java.lang.Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Bina XML layout file ke screen par text dikhane ke liye
        TextView textView = new TextView(this);
        textView.setText("Hello World! GitHub Actions se bana APK successfully chal raha hai.");
        textView.setTextSize(20);
        textView.setPadding(50, 50, 50, 50);
        
        setContentView(textView);
    }
}
