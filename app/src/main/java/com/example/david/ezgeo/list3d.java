package com.example.david.ezgeo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class list3d extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list3d);

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-6598871117579204~3110474972");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void openCylinder(View v) {

        startActivity(new Intent(getApplicationContext(), cylinder.class));

    }

    public void openCone(View v) {

        startActivity(new Intent(getApplicationContext(), cone.class));

    }

    public void openSphere(View v) {

        startActivity(new Intent(getApplicationContext(), sphere.class));

    }

    public void openRecPris(View v) {

        startActivity(new Intent(getApplicationContext(), rectangularprism.class));

    }

    public void openCube(View v) {

        startActivity(new Intent(getApplicationContext(), cube.class));

    }

    public void openPyramid(View v) {

        startActivity(new Intent(getApplicationContext(), pyramid.class));

    }
}
