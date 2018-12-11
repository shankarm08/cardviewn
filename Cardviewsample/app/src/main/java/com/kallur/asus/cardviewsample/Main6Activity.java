package com.kallur.asus.cardviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Main6Activity extends AppCompatActivity {




    ImageView i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.kallur.asus.cardviewsample.R.layout.activity_main6);
        i1=(ImageView)findViewById(com.kallur.asus.cardviewsample.R.id.i1);
        final int[] imageArray={com.kallur.asus.cardviewsample.R.drawable.pro, com.kallur.asus.cardviewsample.R.drawable.pro1, com.kallur.asus.cardviewsample.R.drawable.pro3, com.kallur.asus.cardviewsample.R.drawable.pro4, com.kallur.asus.cardviewsample.R.drawable.pro5, com.kallur.asus.cardviewsample.R.drawable.pro6, com.kallur.asus.cardviewsample.R.drawable.pro7
        , com.kallur.asus.cardviewsample.R.drawable.pro8, com.kallur.asus.cardviewsample.R.drawable.pro9, com.kallur.asus.cardviewsample.R.drawable.pro10, com.kallur.asus.cardviewsample.R.drawable.pro13, com.kallur.asus.cardviewsample.R.drawable.pro14, com.kallur.asus.cardviewsample.R.drawable.pro15, com.kallur.asus.cardviewsample.R.drawable.pro2, com.kallur.asus.cardviewsample.R.drawable.pro12};
        android.os.Handler handler=new android.os.Handler();
       // final String[] imagesName = {"couples","couples","couples","couples","couples"};

        Runnable runnable = new Runnable() {
            int i = 0;

            @Override
            public void run() {
                i1.setImageResource(imageArray[i]);
                i++;
                if (i > imageArray.length - 1) {
                    i = 0;
                }
                i1.postDelayed(this, 2000);
            }

        };
        handler.postDelayed(runnable,2000);
    }
}

