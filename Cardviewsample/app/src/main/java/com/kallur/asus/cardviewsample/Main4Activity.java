package com.kallur.asus.cardviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Main4Activity extends AppCompatActivity {

    ImageView i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.kallur.asus.cardviewsample.R.layout.activity_main4);
        i1=(ImageView)findViewById(com.kallur.asus.cardviewsample.R.id.i1);
        final int[] imageArray={com.kallur.asus.cardviewsample.R.drawable.a1
                , com.kallur.asus.cardviewsample.R.drawable.a6, com.kallur.asus.cardviewsample.R.drawable.a7, com.kallur.asus.cardviewsample.R.drawable.a8, com.kallur.asus.cardviewsample.R.drawable.a12, com.kallur.asus.cardviewsample.R.drawable.a13, com.kallur.asus.cardviewsample.R.drawable.a14, com.kallur.asus.cardviewsample.R.drawable.agri2, com.kallur.asus.cardviewsample.R.drawable.agri3, com.kallur.asus.cardviewsample.R.drawable.agri4, com.kallur.asus.cardviewsample.R.drawable.agri5, com.kallur.asus.cardviewsample.R.drawable.agri6, com.kallur.asus.cardviewsample.R.drawable.a16, com.kallur.asus.cardviewsample.R.drawable.a15, com.kallur.asus.cardviewsample.R.drawable.agiculture100, com.kallur.asus.cardviewsample.R.drawable.agriculturefirst, com.kallur.asus.cardviewsample.R.drawable.agri7, com.kallur.asus.cardviewsample.R.drawable.agri8, com.kallur.asus.cardviewsample.R.drawable.agri9, com.kallur.asus.cardviewsample.R.drawable.agri10};
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
                i1.postDelayed(this, 2000);
            }

        };
        handler.postDelayed(runnable,2000);
    }
}




