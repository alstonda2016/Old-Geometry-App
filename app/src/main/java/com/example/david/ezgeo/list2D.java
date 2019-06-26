package com.example.david.ezgeo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class list2D extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2_d);

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-6598871117579204~3110474972");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void open2DCircleee(View v) {

        startActivity(new Intent(getApplicationContext(), square2d.class));

    }

    public void openHexagon(View v) {

        startActivity(new Intent(getApplicationContext(), hexagon.class));

    }
    public void openTriangle(View v) {

        startActivity(new Intent(getApplicationContext(), Triangle.class));

    }
    public void openSquare(View v) {

        startActivity(new Intent(getApplicationContext(), realsquare.class));

    }
    public void openOctooo(View v) {

        startActivity(new Intent(getApplicationContext(), octagon.class));

    }

    public void openheyaa(View v) {

        startActivity(new Intent(getApplicationContext(), octagon.class));

    }

    public void openDecagon(View v) {

        startActivity(new Intent(getApplicationContext(), decagon.class));

    }
    public void openPentagon(View v) {

        startActivity(new Intent(getApplicationContext(), pentagon.class));

    }
    public void openTrapezoidaa(View v) {

        startActivity(new Intent(getApplicationContext(), trapezoid.class));

    }
}
