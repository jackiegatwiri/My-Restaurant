package com.jacky.myrestaurant;


import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static junit.framework.TestCase.assertTrue;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    @Test
    public void validateTextViewContent(){
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        TextView appNameTextView = activity.findViewById(R.id.appNameTextView);
        assertTrue("MyRestaurants".equals(appNameTextView.getText().toString()));
    }
//    @Test
//    public void secondActivityStarted(){
//        activity.findViewById(R.id.findRestaurantsButton).performClick();
//        Intent expectedIntent = new Intent(activity, RestaurantActivity.class);
//        ShadowActivity shadowActivity = org.robolectric.Shadows.shadowOf(activity);
//        Intent actualIntent = shadowActivity.getNextStartedActivity();
//        assertTrue(actualIntent.filterEquals(expectedIntent));
//    }


}
