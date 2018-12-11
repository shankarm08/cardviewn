package com.kallur.asus.cardviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class openActivity extends AppCompatActivity {

    ImageView i5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.kallur.asus.cardviewsample.R.layout.activity_open);
        i5=(ImageView)findViewById(com.kallur.asus.cardviewsample.R.id.i1);
        final int[] imageArray={com.kallur.asus.cardviewsample.R.drawable.durga2,
                com.kallur.asus.cardviewsample.R.drawable.durga1, com.kallur.asus.cardviewsample.R.drawable.durgaf, com.kallur.asus.cardviewsample.R.drawable.dur, com.kallur.asus.cardviewsample.R.drawable.dur1};
        android.os.Handler handler=new android.os.Handler();

        Runnable runnable = new Runnable() {
            int i = 0;

            @Override
            public void run() {
                i5.setImageResource(imageArray[i]);
                i++;
                if (i > imageArray.length - 1) {
                    i = 0;
                }
                i5.postDelayed(this, 2000);
            }

        };
        handler.postDelayed(runnable,2000);
    }


}
