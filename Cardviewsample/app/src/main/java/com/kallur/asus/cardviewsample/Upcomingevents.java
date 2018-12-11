package com.kallur.asus.cardviewsample;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Upcomingevents extends AppCompatActivity {
    ImageView i1;
    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.kallur.asus.cardviewsample.R.layout.activity_upcommingevents);
        i1=(ImageView)findViewById(R.id.imgnew);
        b1=(Button)findViewById(R.id.buttonpudhu);
        b2=(Button)findViewById(R.id.buttonnew1);
        b3=(Button)findViewById(R.id.buttonnew2);


        final int[] imageArray={R.drawable.krish1,R.drawable.krishjayan1,R.drawable.jan2,R.drawable.jan3,R.drawable.jan4,R.drawable.jan5,R.drawable.jan6,R.drawable.last};
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

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "67pwBOSOGnY";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:"+videoId));
                intent.putExtra("VIDEO_ID", videoId);
                startActivity(intent);
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String videoId = "f98K_KIwOB8";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:"+videoId));
                intent.putExtra("VIDEO_ID", videoId);
                startActivity(intent);



            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String videoId = "8xABsWam_Sg";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:"+videoId));
                intent.putExtra("VIDEO_ID", videoId);
                startActivity(intent);




            }
        });





    }
}

