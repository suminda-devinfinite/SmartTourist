package com.example.coderx.smarttour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by lionsroarsumi on 17-Mar-17.
 */

public class Mainmenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
    }

    public void btnNextActivity(View view )
    {
        Intent intent = new Intent (this,Compass.class);
        startActivity(intent);

    }

    public void btnNearByActivity(View view )
    {
        Intent intent = new Intent (this,nearby.class);
        startActivity(intent);

    }

    public void btnPlaneTrackActivity(View view )
    {
        Intent intent = new Intent (this,planetracker.class);
        startActivity(intent);

    }

    public void btnAboutActivity(View view )
    {
        Intent intent = new Intent (this,splashscreen.class);
        startActivity(intent);

    }

    public void launchTaxiTracker(View view) {

        Intent launchTaxiTracker = getPackageManager().getLaunchIntentForPackage("com.example.infowindowdemo");

        startActivity(launchTaxiTracker);

    }

}
