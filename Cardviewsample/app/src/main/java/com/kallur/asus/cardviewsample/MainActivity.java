package com.kallur.asus.cardviewsample;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private LinearLayoutManager lLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.kallur.asus.cardviewsample.R.layout.activity_main);








        List<ItemObject> rowListItem = getAllItemList();
        lLayout = new LinearLayoutManager(MainActivity.this);

        RecyclerView rView = (RecyclerView)findViewById(com.kallur.asus.cardviewsample.R.id.recycler_view);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(MainActivity.this, rowListItem);
        rView.setAdapter(rcAdapter);


    }





    private List<ItemObject> getAllItemList(){

        List<ItemObject> allItems = new ArrayList<ItemObject>();
        allItems.add(new ItemObject("Temple", com.kallur.asus.cardviewsample.R.drawable.durgaf));
        allItems.add(new ItemObject("Hospital", com.kallur.asus.cardviewsample.R.drawable.hospital4));
        allItems.add(new ItemObject("Agriculture", com.kallur.asus.cardviewsample.R.drawable.agiculture100));
        allItems.add(new ItemObject("School", com.kallur.asus.cardviewsample.R.drawable.schoolf));
        allItems.add(new ItemObject("Panchayat", com.kallur.asus.cardviewsample.R.drawable.pamchayat100));
        allItems.add(new ItemObject("Bloodbank", com.kallur.asus.cardviewsample.R.drawable.bloodbank));
        allItems.add(new ItemObject("Village location", com.kallur.asus.cardviewsample.R.drawable.location));
        allItems.add(new ItemObject("Krishna jayanthi 2018", R.drawable.krish1));
        allItems.add(new ItemObject("Upcoming Projects", R.drawable.upp));
        allItems.add(new ItemObject("Contact Us", com.kallur.asus.cardviewsample.R.drawable.contact));

        return allItems;
    }
}
