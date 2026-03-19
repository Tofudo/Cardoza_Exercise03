package com.example.cardoza_exercise03;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class GreetingActivity extends AppCompatActivity {
    // Define a constant TAG for this Activity
    private static final String TAG = "GreetingActivityLog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        Log.d(TAG, "onCreate method has successfully started.");

        // Receiving the Data
        Intent receivedIntent = getIntent();
        String name = receivedIntent.getStringExtra("USER_NAME");

        if (name != null) {
            Log.d(TAG, "Received name: " + name);
            TextView txtGreeting = findViewById(R.id.txtGreeting);
            txtGreeting.setText("Hello, " + name + "!");
        }
    }
}
