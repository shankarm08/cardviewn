package com.kallur.asus.cardviewsample;

import android.os.Handler;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class openActivity6 extends AppCompatActivity {






    private int currentPage = -1;

    private int NUM_PAGES=0;
    Runnable update;
    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.kallur.asus.cardviewsample.R.layout.activity_open6);


        // private LinearLayoutManager lLayoutn;

        final Timer timer;
        final long DELAY_MS = 500;//delay in milliseconds before task is to be executed
        final long PERIOD_MS = 3000; // time in milliseconds between successive task executions.


        //private int currentPage = -1;
        final ViewPager viewPager;


        final  Integer[] imageId = {com.kallur.asus.cardviewsample.R.drawable.mask1};
        final String[] imagesName = {"couples","couples","couples","couples","couples","couple","couple","couple"};




        viewPager = (ViewPager) findViewById(com.kallur.asus.cardviewsample.R.id.viewPager);
        PagerAdapter adapter = new CustomAdapter(openActivity6.this,imageId,imagesName);
        viewPager.setAdapter(adapter);
        //USING THREADS AND HANDLERS FOR SLIDESHOW
        final Handler handler = new Handler();
        timer = new Timer(); // This will create a new Thread
        timer .schedule(new TimerTask() { // task to be scheduled

            @Override
            public void run() {
                handler.post(update);
            }
        }, DELAY_MS, PERIOD_MS);

        update = new Runnable() {
            public void run() {
                //  if (currentPage == NUM_PAGES-1) {
                if(currentPage==imagesName.length)
                {
                    viewPager.setCurrentItem(0, true);
                    if(timer!=null)
                    {




                        timer.cancel();
                    }


                }
                else
                {
                    viewPager.setCurrentItem(currentPage++, true);
                }

            }
        };


//AFTER MILLISECONDS THE IMAGE KEEPS CHANGING




        // private int currentPage = -1;
        // start auto scroll of viewpager




    }



}