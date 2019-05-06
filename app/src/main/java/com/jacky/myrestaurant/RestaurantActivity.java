package com.jacky.myrestaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RestaurantActivity extends AppCompatActivity {
    private TextView mLocationTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        mLocationTextView = findViewById(R.id.locationTextView);


        Intent intent = getIntent();
        String location = intent.getStringExtra("location"); //Called upon an Intent that has additional data attached to it. If provided an argument representing the string key in the key-value pair described above, it will return the value.

        mLocationTextView.setText("Here are all the restaurants near: " + location);

    }
}
