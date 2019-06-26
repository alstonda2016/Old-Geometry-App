package com.example.david.ezgeo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class sphere extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-6598871117579204~3110474972");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void sphefacts(View v) {
        TextView cirP = (TextView) findViewById(R.id.textView16);

        Button solvePerimeter = (Button) findViewById(R.id.button12);

        Button b1 = (Button) findViewById(R.id.button6);
        Button b2 = (Button) findViewById(R.id.button7);
        Button b3 = (Button) findViewById(R.id.button8);

        b1.setVisibility(View.INVISIBLE);
        b2.setVisibility(View.INVISIBLE);
        b3.setVisibility(View.INVISIBLE);



        cirP.setVisibility(View.VISIBLE);
        solvePerimeter.setVisibility(View.VISIBLE);

    }

    public void findArea(View v) {




        TextView cirP = (TextView) findViewById(R.id.textView2);
        TextView cirName = (TextView) findViewById(R.id.textView3);
        TextView cirA = (TextView) findViewById(R.id.textView4);
//        TextView cirAR = (TextView) findViewById(R.id.textView5);
  //      TextView cirAA = (TextView) findViewById(R.id.textView6);
    //    TextView cirPR = (TextView) findViewById(R.id.textView7);
      //  TextView cirPP = (TextView) findViewById(R.id.textView8);

        EditText radius = (EditText) findViewById(R.id.editText2);
        EditText area = (EditText) findViewById(R.id.editText3);

        Button backBtn = (Button) findViewById(R.id.button12);
        Button solveArea = (Button) findViewById(R.id.button6);
        Button solvePerimeter = (Button) findViewById(R.id.button7);
        Button clearing = (Button) findViewById(R.id.button10);
        Button cirInfo = (Button) findViewById(R.id.button8);
        Button areaSolvebtn = (Button) findViewById(R.id.button9);




        radius.setVisibility(View.VISIBLE);
        area.setVisibility(View.VISIBLE);
        solveArea.setVisibility(View.INVISIBLE);
        solvePerimeter.setVisibility(View.INVISIBLE);
        areaSolvebtn.setVisibility(View.VISIBLE);
        cirInfo.setVisibility(View.INVISIBLE);
        clearing.setVisibility(View.VISIBLE);
        backBtn.setVisibility(View.VISIBLE);
        cirA.setVisibility(View.VISIBLE);
 //       cirAA.setVisibility(View.VISIBLE);
   //     cirAR.setVisibility(View.VISIBLE);
    }
//button11

    public void findPerimeter(View v) {

        Button backBtn = (Button) findViewById(R.id.button12);
        backBtn.setVisibility(View.VISIBLE);


        EditText area = (EditText) findViewById(R.id.editText3);
        Button solveArea = (Button) findViewById(R.id.button6);

        EditText radius = (EditText) findViewById(R.id.editText4);
        EditText Perimeter = (EditText) findViewById(R.id.editText5);



        Button clearing = (Button) findViewById(R.id.button10);

        Button solvePerimeter = (Button) findViewById(R.id.button7);
        Button cirInfo = (Button) findViewById(R.id.button8);
        Button areaSolvebtn = (Button) findViewById(R.id.button9);
        Button perSolvebtn = (Button) findViewById(R.id.button11);

        TextView cirP = (TextView) findViewById(R.id.textView2);
        TextView cirName = (TextView) findViewById(R.id.textView3);
        TextView cirA = (TextView) findViewById(R.id.textView4);
//        TextView cirAR = (TextView) findViewById(R.id.textView5);
  //      TextView cirAA = (TextView) findViewById(R.id.textView6);
    //    TextView cirPR = (TextView) findViewById(R.id.textView7);
      //  TextView cirPP = (TextView) findViewById(R.id.textView8);

        cirP.setVisibility(View.VISIBLE);
     //   cirPP.setVisibility(View.VISIBLE);
       // cirPR.setVisibility(View.VISIBLE);

        radius.setVisibility(View.VISIBLE);
        Perimeter.setVisibility(View.VISIBLE);
        solveArea.setVisibility(View.INVISIBLE);
        perSolvebtn.setVisibility(View.VISIBLE);


        solvePerimeter.setVisibility(View.INVISIBLE);
        areaSolvebtn.setVisibility(View.INVISIBLE);
        cirInfo.setVisibility(View.INVISIBLE);
        clearing.setVisibility(View.VISIBLE);


    }
    public void clearCircle(View v) {

        EditText a = (EditText) findViewById(R.id.editText2);
        EditText b = (EditText) findViewById(R.id.editText3);
        EditText c = (EditText) findViewById(R.id.editText4);
        EditText d = (EditText) findViewById(R.id.editText5);

        a.setText("");
        b.setText("");
        c.setText("");
        d.setText("");

        a.setTextColor(Color.rgb(255, 255, 255));
        b.setTextColor(Color.rgb(255, 255, 255));
        c.setTextColor(Color.rgb(255, 255, 255));
        d.setTextColor(Color.rgb(255, 255, 255));

        d.setFocusableInTouchMode(true);
        a.setFocusableInTouchMode(true);
        b.setFocusableInTouchMode(true);
        c.setFocusableInTouchMode(true);
    }

    public void backCircle(View v){

        TextView cirP = (TextView) findViewById(R.id.textView2);
        TextView cirName = (TextView) findViewById(R.id.textView3);
        TextView cirA = (TextView) findViewById(R.id.textView4);
       // TextView cirAR = (TextView) findViewById(R.id.textView5);
 //       TextView cirAA = (TextView) findViewById(R.id.textView6);
   //     TextView cirPR = (TextView) findViewById(R.id.textView7);
     //   TextView cirPP = (TextView) findViewById(R.id.textView8);

        EditText radius = (EditText) findViewById(R.id.editText2);
        EditText area = (EditText) findViewById(R.id.editText3);
        Button solveArea = (Button) findViewById(R.id.button6);
        Button backBtn = (Button) findViewById(R.id.button12);

        EditText c = (EditText) findViewById(R.id.editText4);
        EditText d = (EditText) findViewById(R.id.editText5);

        c.setTextColor(Color.rgb(255, 255, 255));
        d.setTextColor(Color.rgb(255, 255, 255));
        radius.setTextColor(Color.rgb(255, 255, 255));
        area.setTextColor(Color.rgb(255, 255, 255));

        TextView cirB = (TextView) findViewById(R.id.textView16);

        cirB.setVisibility(View.INVISIBLE);

        radius.setText("");
        area.setText("");
        c.setText("");
        d.setText("");

        d.setFocusableInTouchMode(true);
        radius.setFocusableInTouchMode(true);
        area.setFocusableInTouchMode(true);
        c.setFocusableInTouchMode(true);

        c.setVisibility(View.INVISIBLE);
        d.setVisibility(View.INVISIBLE);
        backBtn.setVisibility(View.INVISIBLE);

        Button perSolve = (Button) findViewById(R.id.button11);
        perSolve.setVisibility(View.INVISIBLE);


        Button solvePerimeter = (Button) findViewById(R.id.button7);

        Button clearing = (Button) findViewById(R.id.button10);


        Button cirInfo = (Button) findViewById(R.id.button8);
        Button areaSolvebtn = (Button) findViewById(R.id.button9);


        radius.setVisibility(View.INVISIBLE);
        area.setVisibility(View.INVISIBLE);
        solveArea.setVisibility(View.VISIBLE);
        solvePerimeter.setVisibility(View.VISIBLE);
        areaSolvebtn.setVisibility(View.INVISIBLE);
        cirInfo.setVisibility(View.VISIBLE);
        clearing.setVisibility(View.INVISIBLE);

        cirA.setVisibility(View.INVISIBLE);
//        cirAA.setVisibility(View.INVISIBLE);
  //      cirAR.setVisibility(View.INVISIBLE);
        cirP.setVisibility(View.INVISIBLE);
    //    cirPP.setVisibility(View.INVISIBLE);
      //  cirPR.setVisibility(View.INVISIBLE);

    }

    public void sphereVol(View v) {

        EditText radius = (EditText) findViewById(R.id.editText2);
        EditText area = (EditText) findViewById(R.id.editText3);
        Button solveArea = (Button) findViewById(R.id.button6);


        Button solvePerimeter = (Button) findViewById(R.id.button7);
        Button cirInfo = (Button) findViewById(R.id.button8);
        Button areaSolvebtn = (Button) findViewById(R.id.button9);

        radius.setTextColor(Color.rgb(255, 255, 255));
        area.setTextColor(Color.rgb(255, 255, 255));

        //TextView txVFg = (TextView) findViewById(R.id.textView43);
        // TextView txVM= (TextView) findViewById(R.id.textView44);

        if(radius.isFocusable() == true) {


            if (radius.getText().length() == 0 && area.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter one number to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (radius.getText().length() == 0) {
                float decm = Float.parseFloat(area.getText().toString());

                double rad = Math.cbrt((decm * 3) / (4 * Math.PI));
                String strFg = String.valueOf(rad);
                radius.setText("r=" + strFg);

                radius.setTextColor(Color.rgb(102, 204, 255));

                String V = String.valueOf(decm);


                area.setText("V=" + V);


                radius.setFocusable(false);
                area.setFocusable(false);


            } else if (area.getText().length() == 0) {
                float decFg = Float.parseFloat(radius.getText().toString());

                double decm = (decFg * decFg * decFg) * (1.33333333333333333333) * Math.PI;
                String strm = String.valueOf(decm);
                area.setText("V=" + strm);
                area.setTextColor(Color.rgb(102, 204, 255));

                String V = String.valueOf(decFg);


                radius.setText("r=" + V);


                radius.setFocusable(false);
                area.setFocusable(false);


            } else {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter one number to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();


            }
        }
        else{AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Press clear to solve another equation");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();}
    }


    public void sphereSA(View v) {

        EditText radius = (EditText) findViewById(R.id.editText4);
        EditText Perimeter = (EditText) findViewById(R.id.editText5);
        Button solveArea = (Button) findViewById(R.id.button6);


        Button solvePerimeter = (Button) findViewById(R.id.button7);
        Button cirInfo = (Button) findViewById(R.id.button8);
        Button Solvebtn = (Button) findViewById(R.id.button9);

        radius.setTextColor(Color.rgb(255, 255, 255));
        Perimeter.setTextColor(Color.rgb(255, 255, 255));

        //TextView txVFg = (TextView) findViewById(R.id.textView43);
        // TextView txVM= (TextView) findViewById(R.id.textView44);

        if(radius.isFocusable() == true) {
            if (radius.getText().length() == 0 && Perimeter.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter one number to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (radius.getText().length() == 0) {
                float decm = Float.parseFloat(Perimeter.getText().toString());

                double rad = Math.sqrt((decm / (4 * Math.PI)));
                String strFg = String.valueOf(rad);
                radius.setText("r="+strFg);

                radius.setTextColor(Color.rgb(102, 204, 255));

                String V = String.valueOf(decm);


                Perimeter.setText("SA=" + V);


                radius.setFocusable(false);
                Perimeter.setFocusable(false);


            } else if (Perimeter.getText().length() == 0) {
                float decFg = Float.parseFloat(radius.getText().toString());

                double decm = (decFg * decFg) * (4) * Math.PI;
                String strm = String.valueOf(decm);
                Perimeter.setText("SA=" + strm);
                Perimeter.setTextColor(Color.rgb(102, 204, 255));

                String V = String.valueOf(decFg);


                radius.setText("r=" + V);


                radius.setFocusable(false);
                Perimeter.setFocusable(false);


            } else {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter one number to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();


            }
        }
        else{AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Press clear to solve another equation");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();}
    }
}
