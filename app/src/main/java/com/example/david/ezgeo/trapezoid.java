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

public class trapezoid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapezoid);

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-6598871117579204~3110474972");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void trapefacts(View v) {
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
   //     TextView cirAR = (TextView) findViewById(R.id.textView5);
     //   TextView cirAL = (TextView) findViewById(R.id.textView9);
       // TextView cirAA = (TextView) findViewById(R.id.textView6);
   //     TextView cirPR = (TextView) findViewById(R.id.textView7);
     //   TextView cirPP = (TextView) findViewById(R.id.textView8);
//        TextView trapPb = (TextView) findViewById(R.id.textView12);
  //      TextView trapAb = (TextView) findViewById(R.id.textView13);
    //    TextView trapPC = (TextView) findViewById(R.id.textView11);
      //  TextView trapPD = (TextView) findViewById(R.id.textView10);

  //      trapAb.setVisibility(View.VISIBLE);

        EditText radius = (EditText) findViewById(R.id.editText2);
        EditText area = (EditText) findViewById(R.id.editText3);
        EditText o = (EditText) findViewById(R.id.editText8);
        EditText ioo = (EditText) findViewById(R.id.editText9);

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
//        cirAA.setVisibility(View.VISIBLE);
  //      cirAR.setVisibility(View.VISIBLE);
        o.setVisibility(View.VISIBLE);
    //    cirAL.setVisibility(View.VISIBLE);
        ioo.setVisibility(View.VISIBLE);
    }
//button11

    public void findPerimeter(View v) {

        Button backBtn = (Button) findViewById(R.id.button12);
        backBtn.setVisibility(View.VISIBLE);

 //       TextView trapPb = (TextView) findViewById(R.id.textView12);
   //     TextView trapAb = (TextView) findViewById(R.id.textView13);
     //   TextView trapPC = (TextView) findViewById(R.id.textView11);
       // TextView trapPD = (TextView) findViewById(R.id.textView10);

//        trapPb.setVisibility(View.VISIBLE);
  //      trapPC.setVisibility(View.VISIBLE);
    //    trapPD.setVisibility(View.VISIBLE);


        EditText area = (EditText) findViewById(R.id.editText3);
        Button solveArea = (Button) findViewById(R.id.button6);

        EditText radius = (EditText) findViewById(R.id.editText4);
        EditText Perimeter = (EditText) findViewById(R.id.editText5);
        EditText pd = (EditText) findViewById(R.id.editText6);
        EditText pp = (EditText) findViewById(R.id.editText7);
        EditText o = (EditText) findViewById(R.id.editText);

        Button clearing = (Button) findViewById(R.id.button10);

        Button solvePerimeter = (Button) findViewById(R.id.button7);
        Button cirInfo = (Button) findViewById(R.id.button8);
        Button areaSolvebtn = (Button) findViewById(R.id.button9);
        Button perSolvebtn = (Button) findViewById(R.id.button11);

        TextView cirP = (TextView) findViewById(R.id.textView2);
        TextView cirName = (TextView) findViewById(R.id.textView3);
        TextView cirA = (TextView) findViewById(R.id.textView4);
 //       TextView cirAR = (TextView) findViewById(R.id.textView5);
   //     TextView cirAA = (TextView) findViewById(R.id.textView6);
     //   TextView cirPR = (TextView) findViewById(R.id.textView7);
       // TextView cirPP = (TextView) findViewById(R.id.textView8);

        cirP.setVisibility(View.VISIBLE);
  //      cirPP.setVisibility(View.VISIBLE);
    //    cirPR.setVisibility(View.VISIBLE);
        pd.setVisibility(View.VISIBLE);
        pp.setVisibility(View.VISIBLE);
        o.setVisibility(View.VISIBLE);

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
        EditText pd = (EditText) findViewById(R.id.editText6);
        EditText pp = (EditText) findViewById(R.id.editText7);
        EditText pi = (EditText) findViewById(R.id.editText8);
        EditText pot = (EditText) findViewById(R.id.editText9);

        o.setText("");
        a.setText("");
        b.setText("");
        c.setText("");
        d.setText("");
        pd.setText("");
        pp.setText("");
        pi.setText("");
        pot.setText("");

        c.setTextColor(Color.rgb(255, 255, 255));
        d.setTextColor(Color.rgb(255, 255, 255));
        pd.setTextColor(Color.rgb(255, 255, 255));
        pp.setTextColor(Color.rgb(255, 255, 255));
        pi.setTextColor(Color.rgb(255, 255, 255));
        pot.setTextColor(Color.rgb(255, 255, 255));
        o.setTextColor(Color.rgb(255, 255, 255));
        a.setTextColor(Color.rgb(255, 255, 255));
        b.setTextColor(Color.rgb(255, 255, 255));

        c.setFocusableInTouchMode(true);
        d.setFocusableInTouchMode(true);
        pd.setFocusableInTouchMode(true);
        pp.setFocusableInTouchMode(true);
        pi.setFocusableInTouchMode(true);
        pot.setFocusableInTouchMode(true);
        o.setFocusableInTouchMode(true);
        a.setFocusableInTouchMode(true);
        b.setFocusableInTouchMode(true);

    }

    public void backCircle(View v){

        TextView cirP = (TextView) findViewById(R.id.textView2);
        TextView cirName = (TextView) findViewById(R.id.textView3);
        TextView cirA = (TextView) findViewById(R.id.textView4);
//        TextView cirAR = (TextView) findViewById(R.id.textView5);
  //      TextView cirAL = (TextView) findViewById(R.id.textView9);
    //    TextView cirAA = (TextView) findViewById(R.id.textView6);
      //  TextView cirPR = (TextView) findViewById(R.id.textView7);
//        TextView cirPP = (TextView) findViewById(R.id.textView8);
  //      TextView trapPb = (TextView) findViewById(R.id.textView12);
    //    TextView trapAb = (TextView) findViewById(R.id.textView13);
      //  TextView trapPC = (TextView) findViewById(R.id.textView11);
       // TextView trapPD = (TextView) findViewById(R.id.textView10);

        cirP.setVisibility(View.INVISIBLE);


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
        EditText pd = (EditText) findViewById(R.id.editText6);
        EditText pp = (EditText) findViewById(R.id.editText7);
        EditText pi = (EditText) findViewById(R.id.editText8);
        EditText pot = (EditText) findViewById(R.id.editText9);
        EditText j = (EditText) findViewById(R.id.editText);
        EditText a = (EditText) findViewById(R.id.editText2);
        EditText b = (EditText) findViewById(R.id.editText3);


        c.setTextColor(Color.rgb(255, 255, 255));
        d.setTextColor(Color.rgb(255, 255, 255));
        pd.setTextColor(Color.rgb(255, 255, 255));
        pp.setTextColor(Color.rgb(255, 255, 255));
        pi.setTextColor(Color.rgb(255, 255, 255));
        pot.setTextColor(Color.rgb(255, 255, 255));
        j.setTextColor(Color.rgb(255, 255, 255));
        a.setTextColor(Color.rgb(255, 255, 255));
        b.setTextColor(Color.rgb(255, 255, 255));
        radius.setTextColor(Color.rgb(255, 255, 255));
        area.setTextColor(Color.rgb(255, 255, 255));


        radius.setText("");
        area.setText("");
        c.setText("");
        d.setText("");
        pd.setText("");
        pp.setText("");
        j.setText("");
        a.setText("");
        b.setText("");
        pi.setText("");
        pot.setText("");

        radius.setFocusableInTouchMode(true);
        area.setFocusableInTouchMode(true);
        c.setFocusableInTouchMode(true);
        d.setFocusableInTouchMode(true);
        pd.setFocusableInTouchMode(true);
        pp.setFocusableInTouchMode(true);
        j.setFocusableInTouchMode(true);
        a.setFocusableInTouchMode(true);
        b.setFocusableInTouchMode(true);
        pi.setFocusableInTouchMode(true);
        pot.setFocusableInTouchMode(true);


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
    //    cirP.setVisibility(View.INVISIBLE);
      //  cirPP.setVisibility(View.INVISIBLE);
//        cirPR.setVisibility(View.INVISIBLE);
  //      cirAL.setVisibility(View.INVISIBLE);
        pd.setVisibility(View.INVISIBLE);
        pp.setVisibility(View.INVISIBLE);
        pi.setVisibility(View.INVISIBLE);
        pot.setVisibility(View.INVISIBLE);
//        trapAb.setVisibility(View.INVISIBLE);
  //      trapPb.setVisibility(View.INVISIBLE);
    //    trapPC.setVisibility(View.INVISIBLE);
      //  trapPD.setVisibility(View.INVISIBLE);

    }

    public void trapArea(View v) {



        //TextView txVFg = (TextView) findViewById(R.id.textView43);
        // TextView txVM= (TextView) findViewById(R.id.textView44);

        EditText radius = (EditText) findViewById(R.id.editText2);
        EditText Perimeter = (EditText) findViewById(R.id.editText3);
        EditText pd = (EditText) findViewById(R.id.editText9);
       // EditText pp = (EditText) findViewById(R.id.editText9);
        EditText o = (EditText) findViewById(R.id.editText8);

        radius.setTextColor(Color.rgb(255, 255, 255));
        Perimeter.setTextColor(Color.rgb(255, 255, 255));
        pd.setTextColor(Color.rgb(255, 255, 255));
        o.setTextColor(Color.rgb(255, 255, 255));


       // EditText o = (EditText) findViewById(R.id.editText
        //EditText radius = (EditText) findViewById(R.id.editText2);
        //EditText area = (EditText) findViewById(R.id.editText3);


        Button solveArea = (Button) findViewById(R.id.button6);
       // Button solveArea = (Button) findViewById(R.id.button6);


        Button solvePerimeter = (Button) findViewById(R.id.button7);
        Button cirInfo = (Button) findViewById(R.id.button8);
        Button Solvebtn = (Button) findViewById(R.id.button9);



        //TextView txVFg = (TextView) findViewById(R.id.textView43);
        // TextView txVM=

        if(o.isFocusable() == true) {


            if (radius.getText().length() == 0 && Perimeter.getText().length() == 0 && pd.getText().length() == 0 && o.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter three numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (radius.getText().length() == 0 && Perimeter.getText().length() == 0 && pd.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter three numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (radius.getText().length() == 0 && Perimeter.getText().length() == 0 && o.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter three numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (radius.getText().length() == 0 && pd.getText().length() == 0 && o.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter three numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (o.getText().length() == 0 && Perimeter.getText().length() == 0 && pd.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter three numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (radius.getText().length() == 0 && Perimeter.getText().length() == 0 && pd.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter three numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (radius.getText().length() == 0 && Perimeter.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter three numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (radius.getText().length() == 0 && pd.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter three numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (radius.getText().length() == 0 && o.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter three numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (Perimeter.getText().length() == 0 && pd.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter three numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (Perimeter.getText().length() == 0 && o.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter three numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (o.getText().length() == 0 && pd.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter three numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            }
            //
            else if (radius.getText().length() == 0) {
                float A = Float.parseFloat(Perimeter.getText().toString());
                float B = Float.parseFloat(o.getText().toString());
                float C = Float.parseFloat(pd.getText().toString());


                double rad = (2 * C) / B - A;
                String strFg = String.valueOf(rad);
                radius.setText("a="+strFg);

                radius.setTextColor(Color.rgb(102, 204, 255));

                String vo = String.valueOf(B);
                String w = String.valueOf(A);
                String h = String.valueOf(C);



                Perimeter.setText("b=" + w);
                o.setText("h=" + vo);
                pd.setText("A=" + h);


                radius.setFocusable(false);
                Perimeter.setFocusable(false);
                o.setFocusable(false);
                pd.setFocusable(false);


            } else if (Perimeter.getText().length() == 0) {
                float A = Float.parseFloat(o.getText().toString());
                float B = Float.parseFloat(radius.getText().toString());
                float C = Float.parseFloat(pd.getText().toString());


                double decm = (2 * C) / A - B;
                String strm = String.valueOf(decm);
                Perimeter.setText("b="+strm);
                Perimeter.setTextColor(Color.rgb(102, 204, 255));

                String vo = String.valueOf(B);
                String w = String.valueOf(A);
                String h = String.valueOf(C);



                radius.setText("a=" + vo);
                o.setText("h=" + w);
                pd.setText("A=" + h);


                radius.setFocusable(false);
                Perimeter.setFocusable(false);
                o.setFocusable(false);
                pd.setFocusable(false);


            } else if (pd.getText().length() == 0) {
                float A = Float.parseFloat(Perimeter.getText().toString());
                float B = Float.parseFloat(radius.getText().toString());
                float C = Float.parseFloat(o.getText().toString());


                double rad = ((B + A) / 2) * C;
                String strFg = String.valueOf(rad);
                pd.setText("A="+ strFg);

                pd.setTextColor(Color.rgb(102, 204, 255));

                String vo = String.valueOf(B);
                String w = String.valueOf(A);
                String h = String.valueOf(C);



                radius.setText("a=" + vo);
                o.setText("h=" + h);
                Perimeter.setText("b=" + w);


                radius.setFocusable(false);
                Perimeter.setFocusable(false);
                o.setFocusable(false);
                pd.setFocusable(false);


            } else if (o.getText().length() == 0) {
                float A = Float.parseFloat(Perimeter.getText().toString());
                float B = Float.parseFloat(radius.getText().toString());
                float C = Float.parseFloat(pd.getText().toString());


                double rad = C * (2 / (A + B));
                String strFg = String.valueOf(rad);
                o.setText("h="+strFg);

                o.setTextColor(Color.rgb(102, 204, 255));

                String vo = String.valueOf(B);
                String w = String.valueOf(A);
                String h = String.valueOf(C);



                radius.setText("a=" + vo);
                Perimeter.setText("b=" + w);
                pd.setText("A=" + h);


                radius.setFocusable(false);
                Perimeter.setFocusable(false);
                o.setFocusable(false);
                pd.setFocusable(false);


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


    public void trapPerimeter(View v) {

        EditText radius = (EditText) findViewById(R.id.editText4);
        EditText Perimeter = (EditText) findViewById(R.id.editText5);
        EditText pd = (EditText) findViewById(R.id.editText6);
        EditText pp = (EditText) findViewById(R.id.editText7);
        EditText o = (EditText) findViewById(R.id.editText);
        Button solveArea = (Button) findViewById(R.id.button6);

        radius.setTextColor(Color.rgb(255, 255, 255));
        Perimeter.setTextColor(Color.rgb(255, 255, 255));
        pd.setTextColor(Color.rgb(255, 255, 255));
        pp.setTextColor(Color.rgb(255, 255, 255));
        o.setTextColor(Color.rgb(255, 255, 255));



        Button solvePerimeter = (Button) findViewById(R.id.button7);
        Button cirInfo = (Button) findViewById(R.id.button8);
        Button Solvebtn = (Button) findViewById(R.id.button9);



        //TextView txVFg = (TextView) findViewById(R.id.textView43);
        // TextView txVM= (TextView) findViewById(R.id.textView44);

        if(radius.isFocusable() == true) {

            if (radius.getText().length() == 0 && Perimeter.getText().length() == 0 && pd.getText().length() == 0 && pp.getText().length() == 0 && o.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter four numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (radius.getText().length() == 0 && Perimeter.getText().length() == 0 && pd.getText().length() == 0 && pp.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter four numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (radius.getText().length() == 0 && Perimeter.getText().length() == 0 && pd.getText().length() == 0 && o.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter four numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (radius.getText().length() == 0 && Perimeter.getText().length() == 0 && pp.getText().length() == 0 && pp.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter four numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (radius.getText().length() == 0 && pd.getText().length() == 0 && pp.getText().length() == 0 && o.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter four numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (o.getText().length() == 0 && Perimeter.getText().length() == 0 && pd.getText().length() == 0 && pp.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter four numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (radius.getText().length() == 0 && Perimeter.getText().length() == 0 && pd.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter four numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (radius.getText().length() == 0 && Perimeter.getText().length() == 0 && pp.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter four numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (radius.getText().length() == 0 && Perimeter.getText().length() == 0 && o.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter four numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (radius.getText().length() == 0 && pp.getText().length() == 0 && pd.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter four numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (radius.getText().length() == 0 && pp.getText().length() == 0 && o.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter four numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (radius.getText().length() == 0 && o.getText().length() == 0 && pd.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter four numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (Perimeter.getText().length() == 0 && pd.getText().length() == 0 && pp.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter four numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (Perimeter.getText().length() == 0 && pp.getText().length() == 0 && o.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter four numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (pp.getText().length() == 0 && o.getText().length() == 0 && pd.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter four numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (radius.getText().length() == 0 && Perimeter.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter four numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (radius.getText().length() == 0 && pd.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter four numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (radius.getText().length() == 0 && pp.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter four numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (radius.getText().length() == 0 & o.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter four numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (Perimeter.getText().length() == 0 && pd.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter four numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (Perimeter.getText().length() == 0 && pp.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter four numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (Perimeter.getText().length() == 0 && o.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter four numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (pd.getText().length() == 0 && pp.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter four numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (pd.getText().length() == 0 && o.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter four numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (pp.getText().length() == 0 && o.getText().length() == 0) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter four numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
                //

            } else if (radius.getText().length() == 0) {
                float A = Float.parseFloat(Perimeter.getText().toString());
                float B = Float.parseFloat(o.getText().toString());
                float C = Float.parseFloat(pd.getText().toString());
                float D = Float.parseFloat(pp.getText().toString());

                double rad = D - A - B - C;
                String strFg = String.valueOf(rad);
                radius.setText("a="+strFg);

                radius.setTextColor(Color.rgb(102, 204, 255));

                String b = String.valueOf(B);
                String a = String.valueOf(A);
                String c = String.valueOf(C);
                String d = String.valueOf(D);



                pp.setText("P=" + d);
                o.setText("c=" + b);
                Perimeter.setText("b=" + a);
                pd.setText("d=" + c);


                radius.setFocusable(false);
                Perimeter.setFocusable(false);
                o.setFocusable(false);
                pd.setFocusable(false);
                pp.setFocusable(false);


            } else if (Perimeter.getText().length() == 0) {
                float A = Float.parseFloat(o.getText().toString());
                float B = Float.parseFloat(radius.getText().toString());
                float C = Float.parseFloat(pd.getText().toString());
                float D = Float.parseFloat(pp.getText().toString());

                double decm = D - A - B - C;
                String strm = String.valueOf(decm);
                Perimeter.setText("b="+strm);
                Perimeter.setTextColor(Color.rgb(102, 204, 255));

                String b = String.valueOf(B);
                String a = String.valueOf(A);
                String c = String.valueOf(C);
                String d = String.valueOf(D);



                pp.setText("P=" + d);
                o.setText("c=" + a);
                radius.setText("a=" + b);
                pd.setText("d=" + c);


                radius.setFocusable(false);
                Perimeter.setFocusable(false);
                o.setFocusable(false);
                pd.setFocusable(false);
                pp.setFocusable(false);


            } else if (pd.getText().length() == 0) {
                float A = Float.parseFloat(Perimeter.getText().toString());
                float B = Float.parseFloat(radius.getText().toString());
                float C = Float.parseFloat(o.getText().toString());
                float D = Float.parseFloat(pp.getText().toString());

                double rad = D - A - B - C;
                String strFg = String.valueOf(rad);
                pd.setText("d="+strFg);

                pd.setTextColor(Color.rgb(102, 204, 255));

                String b = String.valueOf(B);
                String a = String.valueOf(A);
                String c = String.valueOf(C);
                String d = String.valueOf(D);



                pp.setText("P=" + d);
                o.setText("c=" + c);
                Perimeter.setText("b=" + a);
                radius.setText("a=" + b);


                radius.setFocusable(false);
                Perimeter.setFocusable(false);
                o.setFocusable(false);
                pd.setFocusable(false);
                pp.setFocusable(false);


            } else if (pp.getText().length() == 0) {
                float A = Float.parseFloat(Perimeter.getText().toString());
                float B = Float.parseFloat(radius.getText().toString());
                float C = Float.parseFloat(pd.getText().toString());
                float D = Float.parseFloat(o.getText().toString());

                double rad = A + B + C + D;
                String strFg = String.valueOf(rad);
                pp.setText("P="+ strFg);

                pp.setTextColor(Color.rgb(102, 204, 255));

                String b = String.valueOf(B);
                String a = String.valueOf(A);
                String c = String.valueOf(C);
                String d = String.valueOf(D);



                Perimeter.setText("b=" + a);
                o.setText("c=" + d);
                radius.setText("a=" + b);
                pd.setText("d=" + c);


                radius.setFocusable(false);
                Perimeter.setFocusable(false);
                o.setFocusable(false);
                pd.setFocusable(false);
                pp.setFocusable(false);


            } else if (o.getText().length() == 0) {
                float A = Float.parseFloat(Perimeter.getText().toString());
                float B = Float.parseFloat(radius.getText().toString());
                float C = Float.parseFloat(pd.getText().toString());
                float D = Float.parseFloat(pp.getText().toString());

                double rad = D - A - B - C;
                String strFg = String.valueOf(rad);
                o.setText("c=" + strFg);

                o.setTextColor(Color.rgb(102, 204, 255));

                String b = String.valueOf(B);
                String a = String.valueOf(A);
                String c = String.valueOf(C);
                String d = String.valueOf(D);



                pp.setText("P=" + d);
                radius.setText("a=" + b);
                Perimeter.setText("b=" + a);
                pd.setText("d=" + c);


                radius.setFocusable(false);
                Perimeter.setFocusable(false);
                o.setFocusable(false);
                pd.setFocusable(false);
                pp.setFocusable(false);


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
