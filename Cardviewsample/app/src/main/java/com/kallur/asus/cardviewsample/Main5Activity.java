package com.kallur.asus.cardviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Main5Activity extends AppCompatActivity {



    ImageView i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.kallur.asus.cardviewsample.R.layout.activity_main5);
        i1=(ImageView)findViewById(com.kallur.asus.cardviewsample.R.id.i1);
        final int[] imageArray={com.kallur.asus.cardviewsample.R.drawable.schol1, com.kallur.asus.cardviewsample.R.drawable.schol2, com.kallur.asus.cardviewsample.R.drawable.schol3, com.kallur.asus.cardviewsample.R.drawable.schoolf};
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

