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

public class Triangle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-6598871117579204~3110474972");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void trianglefacts(View v) {
        TextView cirP = (TextView) findViewById(R.id.textView16);
        TextView cirA = (TextView) findViewById(R.id.textView17);
        TextView cirB = (TextView) findViewById(R.id.textView18);
        Button solvePerimeter = (Button) findViewById(R.id.button12);

        Button b1 = (Button) findViewById(R.id.button6);
        Button b2 = (Button) findViewById(R.id.button7);
        Button b3 = (Button) findViewById(R.id.button8);

        b1.setVisibility(View.INVISIBLE);
        b2.setVisibility(View.INVISIBLE);
        b3.setVisibility(View.INVISIBLE);


        cirA.setVisibility(View.VISIBLE);
        cirB.setVisibility(View.VISIBLE);
        cirP.setVisibility(View.VISIBLE);
        solvePerimeter.setVisibility(View.VISIBLE);

    }

    public void findArea(View v) {




        TextView cirP = (TextView) findViewById(R.id.textView2);
        TextView cirName = (TextView) findViewById(R.id.textView3);
        TextView cirA = (TextView) findViewById(R.id.textView4);
//        TextView cirAR = (TextView) findViewById(R.id.textView5);
  //      TextView cirAL = (TextView) findViewById(R.id.textView9);
    //    TextView cirAA = (TextView) findViewById(R.id.textView6);
      //  TextView cirPR = (TextView) findViewById(R.id.textView7);
        //TextView cirPP = (TextView) findViewById(R.id.textView8);

        EditText radius = (EditText) findViewById(R.id.editText2);
        EditText area = (EditText) findViewById(R.id.editText3);
        EditText o = (EditText) findViewById(R.id.editText);

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
        o.setVisibility(View.VISIBLE);
     //   cirAL.setVisibility(View.VISIBLE);
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
 //       cirPP.setVisibility(View.VISIBLE);
   //     cirPR.setVisibility(View.VISIBLE);

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
        EditText o = (EditText) findViewById(R.id.editText);
        EditText a = (EditText) findViewById(R.id.editText2);
        EditText b = (EditText) findViewById(R.id.editText3);
        EditText c = (EditText) findViewById(R.id.editText4);
        EditText d = (EditText) findViewById(R.id.editText5);

        o.setText("");
        a.setText("");
        b.setText("");
        c.setText("");
        d.setText("");


        o.setTextColor(Color.rgb(255, 255, 255));
        a.setTextColor(Color.rgb(255, 255, 255));
        b.setTextColor(Color.rgb(255, 255, 255));
        c.setTextColor(Color.rgb(255, 255, 255));
        d.setTextColor(Color.rgb(255, 255, 255));


        a.setFocusableInTouchMode(true);
        b.setFocusableInTouchMode(true);
        d.setFocusableInTouchMode(true);
        c.setFocusableInTouchMode(true);
        o.setFocusableInTouchMode(true);


    }

    public void backCircle(View v){

        TextView cirP = (TextView) findViewById(R.id.textView2);
        TextView cirName = (TextView) findViewById(R.id.textView3);
        TextView cirA = (TextView) findViewById(R.id.textView4);
 //       TextView cirAR = (TextView) findViewById(R.id.textView5);
   //     TextView cirAL = (TextView) findViewById(R.id.textView9);
     //   TextView cirAA = (TextView) findViewById(R.id.textView6);
       // TextView cirPR = (TextView) findViewById(R.id.textView7);
       // TextView cirPP = (TextView) findViewById(R.id.textView8);


        TextView cirL = (TextView) findViewById(R.id.textView16);
        TextView cirK = (TextView) findViewById(R.id.textView17);
        TextView cirB = (TextView) findViewById(R.id.textView18);

        cirL.setVisibility(View.INVISIBLE);
        cirK.setVisibility(View.INVISIBLE);
        cirB.setVisibility(View.INVISIBLE);

        EditText o = (EditText) findViewById(R.id.editText);

        EditText radius = (EditText) findViewById(R.id.editText2);
        EditText area = (EditText) findViewById(R.id.editText3);
        Button solveArea = (Button) findViewById(R.id.button6);
        Button backBtn = (Button) findViewById(R.id.button12);

        EditText c = (EditText) findViewById(R.id.editText4);
        EditText d = (EditText) findViewById(R.id.editText5);

        o.setTextColor(Color.rgb(255, 255, 255));
        radius.setTextColor(Color.rgb(255, 255, 255));
        area.setTextColor(Color.rgb(255, 255, 255));
        c.setTextColor(Color.rgb(255, 255, 255));
        d.setTextColor(Color.rgb(255, 255, 255));

        radius.setText("");
        area.setText("");
        c.setText("");
        d.setText("");
        o.setText("");

        radius.setFocusableInTouchMode(true);
        area.setFocusableInTouchMode(true);
        d.setFocusableInTouchMode(true);
        c.setFocusableInTouchMode(true);
        o.setFocusableInTouchMode(true);

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
        o.setVisibility(View.INVISIBLE);

        cirA.setVisibility(View.INVISIBLE);
//        cirAA.setVisibility(View.INVISIBLE);
  //      cirAR.setVisibility(View.INVISIBLE);
        cirP.setVisibility(View.INVISIBLE);
//        cirPP.setVisibility(View.INVISIBLE);
  //      cirPR.setVisibility(View.INVISIBLE);
    //    cirAL.setVisibility(View.INVISIBLE);

    }

    public void circleArea(View v) {
        EditText o = (EditText) findViewById(R.id.editText);
        EditText radius = (EditText) findViewById(R.id.editText2);
        EditText area = (EditText) findViewById(R.id.editText3);
        Button solveArea = (Button) findViewById(R.id.button6);


        Button solvePerimeter = (Button) findViewById(R.id.button7);
        Button cirInfo = (Button) findViewById(R.id.button8);
        Button areaSolvebtn = (Button) findViewById(R.id.button9);

        radius.setTextColor(Color.rgb(255, 255, 255));
        area.setTextColor(Color.rgb(255, 255, 255));
        o.setTextColor(Color.rgb(255, 255, 255));

        //TextView txVFg = (TextView) findViewById(R.id.textView43);
        // TextView txVM= (TextView) findViewById(R.id.textView44);


        if (radius.getText().length() == 0 && area.getText().length() == 0 && o.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter two numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();
            //

        }
        else   if (radius.getText().length() == 0 && area.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter two numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();
            //

        }
        else   if (o.getText().length() == 0 && area.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter two numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();
            //

        }
        else   if (radius.getText().length() == 0 && o.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter two numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();
            //

        }
        else if (radius.getText().length() == 0) {
            float decm = Float.parseFloat(area.getText().toString());
            float decFg = Float.parseFloat(o.getText().toString());

            double rad = (2 * decFg)/ decm;
            String strFg = String.valueOf(rad);
            radius.setText("b=" + strFg);

            radius.setTextColor(Color.rgb(102, 204, 255));

            String vo = String.valueOf(decFg);
            String w = String.valueOf(decm);




            area.setText("h=" + vo);
            o.setText("A=" + w);



            radius.setFocusable(false);
            o.setFocusable(false);
            area.setFocusable(false);


        } else if (area.getText().length() == 0) {
            float decFg = Float.parseFloat(radius.getText().toString());
            float decot = Float.parseFloat(o.getText().toString());

            double decm = (2 * decot)/ decFg;
            String strm = String.valueOf(decm);
            area.setText("h=" + strm);
            area.setTextColor(Color.rgb(102, 204, 255));

            String vo = String.valueOf(decFg);
            String w = String.valueOf(decot);





            o.setText("A=" + w);
            radius.setText("b=" + vo);


            radius.setFocusable(false);
            area.setFocusable(false);
            o.setFocusable(false);


        }
        //area
        else if (o.getText().length() == 0) {
            float decFg = Float.parseFloat(radius.getText().toString());
            float decot = Float.parseFloat(area.getText().toString());

            double decm = decFg * decot * .5;
            String strm = String.valueOf(decm);
            o.setText("A="+strm);
            o.setTextColor(Color.rgb(102, 204, 255));


            String w = String.valueOf(decFg);
            String h = String.valueOf(decot);




            radius.setText("b=" + w);
            area.setText("h=" + h);


            o.setFocusable(false);
            area.setFocusable(false);
            radius.setFocusable(false);


        }else {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter two numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();


        }
    }


    public void circlePerimeter(View v) {

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

            double rad = decm/3;
            String strFg = String.valueOf(rad);
            radius.setText("l=" + strFg);

            radius.setTextColor(Color.rgb(102, 204, 255));

            String w = String.valueOf(decm);





            Perimeter.setText("P=" + w);

            Perimeter.setFocusable(false);
            radius.setFocusable(false);


        } else if (Perimeter.getText().length() == 0) {
            float decFg = Float.parseFloat(radius.getText().toString());

            double decm = 3* decFg;
            String strm = String.valueOf(decm);
            Perimeter.setText("P=" + strm);
            Perimeter.setTextColor(Color.rgb(102, 204, 255));

            String w = String.valueOf(decFg);





            radius.setText("l=" + w);

            Perimeter.setFocusable(false);
            radius.setFocusable(false);


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
}
