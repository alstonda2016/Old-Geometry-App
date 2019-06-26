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

public class rectangularprism extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangularprism);

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-6598871117579204~3110474972");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void rectpfacts(View v) {
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
        TextView cirA = (TextView) findViewById(R.id.textView2);
  //      TextView cirAR = (TextView) findViewById(R.id.textView5);
    //    TextView cirAL = (TextView) findViewById(R.id.textView9);
      //  TextView cirAA = (TextView) findViewById(R.id.textView6);
        // TextView cirPR = (TextView) findViewById(R.id.textView7);
        // TextView cirPP = (TextView) findViewById(R.id.textView8);
        //TextView cirPLOP = (TextView) findViewById(R.id.textView14);

        EditText radius = (EditText) findViewById(R.id.editText2);
        EditText area = (EditText) findViewById(R.id.editText3);
        EditText o = (EditText) findViewById(R.id.editText);
        EditText ig = (EditText) findViewById(R.id.editText10);

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
      //  cirPLOP.setVisibility(View.VISIBLE);
        ig.setVisibility(View.VISIBLE);
    }
//button11

    public void findPerimeter(View v) {

        Button backBtn = (Button) findViewById(R.id.button12);
        backBtn.setVisibility(View.VISIBLE);


        Button solveArea = (Button) findViewById(R.id.button6);

        EditText W = (EditText) findViewById(R.id.editText3);
        EditText radius = (EditText) findViewById(R.id.editText);
        EditText Perimeter = (EditText) findViewById(R.id.editText2);
        EditText SA = (EditText) findViewById(R.id.editText11);

        W.setVisibility(View.VISIBLE);
        SA.setVisibility(View.VISIBLE);

        Button clearing = (Button) findViewById(R.id.button10);

        Button solvePerimeter = (Button) findViewById(R.id.button7);
        Button cirInfo = (Button) findViewById(R.id.button8);
        Button areaSolvebtn = (Button) findViewById(R.id.button9);
        Button perSolvebtn = (Button) findViewById(R.id.button11);

        TextView cirP = (TextView) findViewById(R.id.textView4);
        TextView cirName = (TextView) findViewById(R.id.textView3);
        //   TextView cirA = (TextView) findViewById(R.id.textView4);
//        TextView cirAR = (TextView) findViewById(R.id.textView5);
  //      TextView cirAA = (TextView) findViewById(R.id.textView6);
        //TextView cirPR = (TextView) findViewById(R.id.textView7);
    //    TextView cirPP = (TextView) findViewById(R.id.textView8);
      //  TextView cirPe = (TextView) findViewById(R.id.textView9);

        cirP.setVisibility(View.VISIBLE);
//        cirPP.setVisibility(View.VISIBLE);
        cirName.setVisibility(View.VISIBLE);
  //      cirAA.setVisibility(View.VISIBLE);
    //    cirAR.setVisibility(View.VISIBLE);
      //  cirPe.setVisibility(View.VISIBLE);

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
        EditText c = (EditText) findViewById(R.id.editText10);
        EditText d = (EditText) findViewById(R.id.editText11);

        o.setText("");
        a.setText("");
        b.setText("");
        c.setText("");
        d.setText("");

        d.setFocusableInTouchMode(true);
        a.setFocusableInTouchMode(true);
        b.setFocusableInTouchMode(true);
        c.setFocusableInTouchMode(true);
        o.setFocusableInTouchMode(true);


        c.setTextColor(Color.rgb(255, 255, 255));
        d.setTextColor(Color.rgb(255, 255, 255));
        a.setTextColor(Color.rgb(255, 255, 255));
        b.setTextColor(Color.rgb(255, 255, 255));
        o.setTextColor(Color.rgb(255, 255, 255));

    }

    public void backCircle(View v) {

        TextView cirL = (TextView) findViewById(R.id.textView16);
        TextView cirK = (TextView) findViewById(R.id.textView17);
        TextView cirB = (TextView) findViewById(R.id.textView18);

        cirL.setVisibility(View.INVISIBLE);
        cirK.setVisibility(View.INVISIBLE);
        cirB.setVisibility(View.INVISIBLE);

        TextView cirP = (TextView) findViewById(R.id.textView2);
        TextView cirName = (TextView) findViewById(R.id.textView3);
        TextView cirA = (TextView) findViewById(R.id.textView4);
       // TextView cirAR = (TextView) findViewById(R.id.textView5);
        //TextView cirAL = (TextView) findViewById(R.id.textView9);
        //TextView cirAA = (TextView) findViewById(R.id.textView6);
        //  TextView cirPR = (TextView) findViewById(R.id.textView7);
       // TextView cirPP = (TextView) findViewById(R.id.textView8);
       // TextView cirPLOP = (TextView) findViewById(R.id.textView14);
        // TextView cirPP = (TextView) findViewById(R.id.textView8);
        //TextView cirPP = (TextView) findViewById(R.id.textView8);
        //TextView cirPP = (TextView) findViewById(R.id.textView8);
     //   cirPLOP.setVisibility(View.INVISIBLE);

        EditText o = (EditText) findViewById(R.id.editText);

        EditText radius = (EditText) findViewById(R.id.editText2);
        EditText area = (EditText) findViewById(R.id.editText3);
        Button solveArea = (Button) findViewById(R.id.button6);
        Button backBtn = (Button) findViewById(R.id.button12);



        //   EditText c = (EditText) findViewById(R.id.editText4);
        // EditText d = (EditText) findViewById(R.id.editText5);
        EditText hehe = (EditText) findViewById(R.id.editText10);
        EditText haha = (EditText) findViewById(R.id.editText11);
        hehe.setVisibility(View.INVISIBLE);
        haha.setVisibility(View.INVISIBLE);

        radius.setText("");
        area.setText("");
        haha.setText("");
        hehe.setText("");
        o.setText("");

        radius.setFocusableInTouchMode(true);
        area.setFocusableInTouchMode(true);
        haha.setFocusableInTouchMode(true);
        hehe.setFocusableInTouchMode(true);
        o.setFocusableInTouchMode(true);

        radius.setTextColor(Color.rgb(255, 255, 255));
        o.setTextColor(Color.rgb(255, 255, 255));

        area.setTextColor(Color.rgb(255, 255, 255));
        hehe.setTextColor(Color.rgb(255, 255, 255));
        haha.setTextColor(Color.rgb(255, 255, 255));


        hehe.setVisibility(View.INVISIBLE);
        haha.setVisibility(View.INVISIBLE);
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
      //  cirAA.setVisibility(View.INVISIBLE);
        //cirAR.setVisibility(View.INVISIBLE);
        cirP.setVisibility(View.INVISIBLE);
//        cirPP.setVisibility(View.INVISIBLE);
        //cirPR.setVisibility(View.INVISIBLE);
  //      cirAL.setVisibility(View.INVISIBLE);

    }

    public void rectPVol(View v) {
        EditText o = (EditText) findViewById(R.id.editText);
        EditText radius = (EditText) findViewById(R.id.editText2);
        EditText pd = (EditText) findViewById(R.id.editText3);
        EditText Perimeter = (EditText) findViewById(R.id.editText10);
        Button solveArea = (Button) findViewById(R.id.button6);


        Button solvePerimeter = (Button) findViewById(R.id.button7);
        Button cirInfo = (Button) findViewById(R.id.button8);
        Button areaSolvebtn = (Button) findViewById(R.id.button9);

        radius.setTextColor(Color.rgb(255, 255, 255));
        o.setTextColor(Color.rgb(255, 255, 255));
        pd.setTextColor(Color.rgb(255, 255, 255));
        Perimeter.setTextColor(Color.rgb(255, 255, 255));

        //TextView txVFg = (TextView) findViewById(R.id.textView43);
        // TextView txVM= (TextView) findViewById(R.id.textView44);

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
                float V = Float.parseFloat(Perimeter.getText().toString());
                float L = Float.parseFloat(o.getText().toString());
                float H = Float.parseFloat(pd.getText().toString());


                double rad = V / (L * H);
                String strFg = String.valueOf(rad);
                radius.setText("l=" + strFg);

                radius.setTextColor(Color.rgb(102, 204, 255));

                String vo = String.valueOf(V);
                String w = String.valueOf(L);
                String h = String.valueOf(H);



                Perimeter.setText("V=" + vo);
                o.setText("h=" + w);
                pd.setText("w=" + h);


                radius.setFocusable(false);
                Perimeter.setFocusable(false);
                o.setFocusable(false);
                pd.setFocusable(false);
//

            } else if (Perimeter.getText().length() == 0) {
                float A = Float.parseFloat(o.getText().toString());
                float B = Float.parseFloat(radius.getText().toString());
                float C = Float.parseFloat(pd.getText().toString());


                double decm = A * B * C;
                String strm = String.valueOf(decm);
                Perimeter.setText("V="+strm);
                Perimeter.setTextColor(Color.rgb(102, 204, 255));

                String vo = String.valueOf(B);
                String w = String.valueOf(A);
                String h = String.valueOf(C);



                radius.setText("l=" + vo);
                o.setText("h=" + w);
                pd.setText("w=" + h);


                radius.setFocusable(false);
                Perimeter.setFocusable(false);
                o.setFocusable(false);
                pd.setFocusable(false);

//
            } else if (pd.getText().length() == 0) {
                float V = Float.parseFloat(Perimeter.getText().toString());
                float W = Float.parseFloat(radius.getText().toString());
                float L = Float.parseFloat(o.getText().toString());


                double rad = V / (L * W);
                String strFg = String.valueOf(rad);
                pd.setText("w="+strFg);

                pd.setTextColor(Color.rgb(102, 204, 255));

                String vo = String.valueOf(V);
                String w = String.valueOf(L);
                String h = String.valueOf(W);



                Perimeter.setText("V=" + vo);
                o.setText("h=" + w);
                radius.setText("l=" + h);


                radius.setFocusable(false);
                Perimeter.setFocusable(false);
                o.setFocusable(false);
                pd.setFocusable(false);


            } else if (o.getText().length() == 0) {
                float V = Float.parseFloat(Perimeter.getText().toString());
                float W = Float.parseFloat(radius.getText().toString());
                float H = Float.parseFloat(pd.getText().toString());


                double rad = V / (H * W);
                String strFg = String.valueOf(rad);
                o.setText("h="+strFg);

                o.setTextColor(Color.rgb(102, 204, 255));

                String vo = String.valueOf(V);
                String w = String.valueOf(W);
                String h = String.valueOf(H);



                Perimeter.setText("V=" + vo);
                radius.setText("l=" + w);
                pd.setText("w=" + h);


                radius.setFocusable(false);
                Perimeter.setFocusable(false);
                o.setFocusable(false);
                pd.setFocusable(false);


            } else {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter three numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();


            }
        }
        else{ AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Press clear to solve another equation");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();}
    }


    public void rectPSA(View v) {

        EditText o = (EditText) findViewById(R.id.editText);
        EditText radius = (EditText) findViewById(R.id.editText2);
        EditText pd = (EditText) findViewById(R.id.editText3);
        EditText Perimeter = (EditText) findViewById(R.id.editText11);
        Button solveArea = (Button) findViewById(R.id.button6);


        Button solvePerimeter = (Button) findViewById(R.id.button7);
        Button cirInfo = (Button) findViewById(R.id.button8);
        Button areaSolvebtn = (Button) findViewById(R.id.button9);

        radius.setTextColor(Color.rgb(255, 255, 255));
        o.setTextColor(Color.rgb(255, 255, 255));
        pd.setTextColor(Color.rgb(255, 255, 255));
        Perimeter.setTextColor(Color.rgb(255, 255, 255));

        //TextView txVFg = (TextView) findViewById(R.id.textView43);
        // TextView txVM= (TextView) findViewById(R.id.textView44);

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
                float SA = Float.parseFloat(Perimeter.getText().toString());
                float H = Float.parseFloat(o.getText().toString());
                float L = Float.parseFloat(pd.getText().toString());


                double rad = (SA - (2 * L * H)) / ((2 * L) + (2 * H));
                String strFg = String.valueOf(rad);
                radius.setText("l="+strFg);

                radius.setTextColor(Color.rgb(102, 204, 255));

                String vo = String.valueOf(SA);
                String w = String.valueOf(L);
                String h = String.valueOf(H);



                Perimeter.setText("SA=" + vo);
                o.setText("h=" + h);
                pd.setText("w=" + w);


                radius.setFocusable(false);
                Perimeter.setFocusable(false);
                o.setFocusable(false);
                pd.setFocusable(false);


            } else if (Perimeter.getText().length() == 0) {
                float A = Float.parseFloat(o.getText().toString());
                float B = Float.parseFloat(radius.getText().toString());
                float C = Float.parseFloat(pd.getText().toString());


                double decm = 2 * ((A * B) + (B * C) + (A * C));
                String strm = String.valueOf(decm);
                Perimeter.setText("SA=" + strm);
                Perimeter.setTextColor(Color.rgb(102, 204, 255));

                String l = String.valueOf(B);
                String w = String.valueOf(C);
                String h = String.valueOf(A);



                radius.setText("l=" + l);
                o.setText("h=" + h);
                pd.setText("w=" + w);


                radius.setFocusable(false);
                Perimeter.setFocusable(false);
                o.setFocusable(false);
                pd.setFocusable(false);


            } else if (pd.getText().length() == 0) {
                float SA = Float.parseFloat(Perimeter.getText().toString());
                float W = Float.parseFloat(radius.getText().toString());
                float L = Float.parseFloat(o.getText().toString());


                double rad = (SA - (2 * W * L)) / ((2 * L) + (2 * W));
                String strFg = String.valueOf(rad);
                pd.setText("w="+strFg);

                pd.setTextColor(Color.rgb(102, 204, 255));

                String vo = String.valueOf(SA);
                String w = String.valueOf(L);
                String h = String.valueOf(W);



                Perimeter.setText("SA=" + vo);
                o.setText("h=" + w);
                radius.setText("l=" + h);


                radius.setFocusable(false);
                Perimeter.setFocusable(false);
                o.setFocusable(false);
                pd.setFocusable(false);


            } else if (o.getText().length() == 0) {
                float SA = Float.parseFloat(Perimeter.getText().toString());
                float H = Float.parseFloat(radius.getText().toString());
                float W = Float.parseFloat(pd.getText().toString());


                double rad = (SA - (2 * W * H)) / ((2 * H) + (2 * W));
                String strFg = String.valueOf(rad);
                o.setText("h="+strFg);

                o.setTextColor(Color.rgb(102, 204, 255));

                String vo = String.valueOf(SA);
                String w = String.valueOf(H);
                String h = String.valueOf(W);



                Perimeter.setText("SA=" + vo);
                radius.setText("l=" + w);
                pd.setText("w=" + h);


                radius.setFocusable(false);
                Perimeter.setFocusable(false);
                o.setFocusable(false);
                pd.setFocusable(false);


            } else {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter three numbers to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();


            }
        }
        else{ AlertDialog alertDialog = new AlertDialog.Builder(this).create();
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
