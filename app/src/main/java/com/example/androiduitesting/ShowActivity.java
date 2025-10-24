package com.example.androiduitesting;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show); // Set the layout for this activity

        // Display the selected city name
        TextView cityName = findViewById(R.id.cityName);
        String city = getIntent().getStringExtra("city_name");
        if (city != null) cityName.setText(city);

        // Set up back button to close this screen when clicked
        Button backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(v -> finish());
    }
}