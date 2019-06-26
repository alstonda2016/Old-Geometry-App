package com.example.david.ezgeo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainPage extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-6598871117579204~3110474972");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        Button btn1 = (Button) findViewById(R.id.button);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);



    }


    public void open2D(View v) {

        startActivity(new Intent(getApplicationContext(), list2D.class));
    }

    public void moreApps(View v) {

        startActivity(new Intent(getApplicationContext(), MoreApps.class));
    }

    public void open3D(View v) {

        startActivity(new Intent(getApplicationContext(), list3d.class));
    }

}
