package com.kallur.asus.cardviewsample;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class openActivity5 extends AppCompatActivity {





    ImageView i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.kallur.asus.cardviewsample.R.layout.activity_open5);
        i1=(ImageView)findViewById(com.kallur.asus.cardviewsample.R.id.i1);
        final int[] imageArray={com.kallur.asus.cardviewsample.R.drawable.kadaganallur,
                com.kallur.asus.cardviewsample.R.drawable.kadaganallur1, com.kallur.asus.cardviewsample.R.drawable.kadaganallur2, com.kallur.asus.cardviewsample.R.drawable.kadaganallur3, com.kallur.asus.cardviewsample.R.drawable.kadaganallur4, com.kallur.asus.cardviewsample.R.drawable.koda1, com.kallur.asus.cardviewsample.R.drawable.koda2};
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
