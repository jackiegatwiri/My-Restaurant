package com.jacky.myrestaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Typeface;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private Button mFindRestaurantsButton;
    private EditText mLocationEditText;
    private TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //The onCreate() method is called every time a user visits this activity. Any code that goes inside of it will be run immediately once the activity loads.
        super.onCreate(savedInstanceState); //causes Android to run all of the default behaviours for an activity
        setContentView(R.layout.activity_main); //tells the activity which layout to use for the device screen

        mLocationEditText = (EditText) findViewById(R.id.locationEditText);
        mFindRestaurantsButton = (Button) findViewById(R.id.findRestaurantsButton);
        mFindRestaurantsButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mAppNameTextView=(TextView) findViewById(R.id.appNameTextView);
                Typeface ostrichFont = Typeface.createFromAsset(getAssets(), "fonts/ostrich-regular.ttf");
                mAppNameTextView.setTypeface(ostrichFont);
//                Toast.makeText(MainActivity.this, "Hello World!", Toast.LENGTH_LONG).show();
                String location = mLocationEditText.getText().toString();
//                Log.d(TAG, location);


                Intent intent = new Intent(MainActivity.this, RestaurantActivity.class);
                intent.putExtra("location", location); //Is called upon an Intent, adds additional information to the intent in the form of a key-value pair.
                startActivity(intent);
//                Toast.makeText(MainActivity.this, location, Toast.LENGTH_LONG).show();
            }
        });
    }
}
