package com.example.david.ezgeo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView bob = (ImageView) findViewById(R.id.imageView);
       // bob.setImageBitmap(Bitmap bm);
       // bob.setImageDrawable(R.drawable);


        //Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.itayicon);
        //bob.setImageBitmap(bm);


        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {

            @Override
            public void run() {
                //start your activity here
                startActivity(new Intent(getApplicationContext(),MainPage.class));
                finish();
            }

        }, 4000L);
    }

    public void open2DCircle(View v) {

        startActivity(new Intent(getApplicationContext(), square2d.class));
    }

}
