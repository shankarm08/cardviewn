package com.kallur.asus.cardviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity {


    ImageView i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.kallur.asus.cardviewsample.R.layout.activity_main3);
        i1=(ImageView)findViewById(com.kallur.asus.cardviewsample.R.id.i1);
        final int[] imageArray={com.kallur.asus.cardviewsample.R.drawable.h1,
                com.kallur.asus.cardviewsample.R.drawable.h3, com.kallur.asus.cardviewsample.R.drawable.h4, com.kallur.asus.cardviewsample.R.drawable.h5, com.kallur.asus.cardviewsample.R.drawable.h6, com.kallur.asus.cardviewsample.R.drawable.h7, com.kallur.asus.cardviewsample.R.drawable.h8, com.kallur.asus.cardviewsample.R.drawable.h9};
        android.os.Handler handler=new android.os.Handler();

        Runnable runnable = new Runnable() {
            int i = 0;

            @Override
            public void run() {
                i1.setImageResource(imageArray[i]);
                i++;
                if (i > imageArray.length - 1) {
                    i = 0;
                }
                i1.postDelayed(this, 4000);
            }

        };
        handler.postDelayed(runnable,4000);
    }
}
