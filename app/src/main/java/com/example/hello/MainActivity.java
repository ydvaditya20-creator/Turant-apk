package com.example.hello;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.Gravity;
import android.graphics.Color;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState) ;

        // Ek simple text view bana rahe hain bina kisi XML file ke
        TextView textView = new TextView(this);
        textView.setText("Hello from GitHub Actions!");
        textView.setTextSize(24);
        textView.setTextColor(Color.WHITE);
        textView.setGravity(Gravity.CENTER);
        
        // Full screen setup
        textView.setBackgroundColor(Color.BLACK);

        setContentView(textView);
    }
}
