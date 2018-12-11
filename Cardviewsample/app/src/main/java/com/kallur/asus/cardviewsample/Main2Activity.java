package com.kallur.asus.cardviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {


    ImageView imageView;
    TextView textView;

    private LinearLayoutManager lLayoutn;
    public List<ItemObject> rowListItem = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.kallur.asus.cardviewsample.R.layout.activity_main2);


        // private LinearLayoutManager lLayoutn;


        lLayoutn = new LinearLayoutManager(Main2Activity.this);

        RecyclerView rView = (RecyclerView) findViewById(com.kallur.asus.cardviewsample.R.id.recycler_view);
        rView.setLayoutManager(lLayoutn);

      Adapter adapter = new Adapter(Main2Activity.this,rowListItem);
      rView.setAdapter(adapter);


        getAllItemList();






    }


    public  void getAllItemList(){

        ItemObject itemObject = new ItemObject("Durga Temple", com.kallur.asus.cardviewsample.R.drawable.t1);
        rowListItem.add(itemObject);

        ItemObject itemObject1 = new ItemObject("Perumal Temple", com.kallur.asus.cardviewsample.R.drawable.t2);
        rowListItem.add(itemObject1);


        ItemObject itemObject2 = new ItemObject("Krishna Temple", com.kallur.asus.cardviewsample.R.drawable.krish2);
        rowListItem.add(itemObject2);

        ItemObject itemObject3 = new ItemObject("Bhaskara sudalai Temple", com.kallur.asus.cardviewsample.R.drawable.t4);
        rowListItem.add(itemObject3);

        ItemObject itemObject4 = new ItemObject("Kodaganallur Temples", com.kallur.asus.cardviewsample.R.drawable.t5);
        rowListItem.add(itemObject4);

        ItemObject itemObject5 = new ItemObject("Sapthakanigal Temple", com.kallur.asus.cardviewsample.R.drawable.sapthaaa);
        rowListItem.add(itemObject5);




    }

}