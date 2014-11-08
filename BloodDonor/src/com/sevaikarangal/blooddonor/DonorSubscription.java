package com.sevaikarangal.blooddonor;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class DonorSubscription extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_subscription);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.donor_subscription, menu);
        return true;
    }
    
}
