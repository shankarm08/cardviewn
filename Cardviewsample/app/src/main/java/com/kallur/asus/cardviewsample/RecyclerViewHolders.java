package com.kallur.asus.cardviewsample;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView countryName;
    public ImageView countryPhoto;
    public RelativeLayout rv;
 public  RelativeLayout r1;



    public RecyclerViewHolders(final View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        countryName = (TextView)itemView.findViewById(com.kallur.asus.cardviewsample.R.id.country_name);
        countryPhoto = (ImageView)itemView.findViewById(com.kallur.asus.cardviewsample.R.id.country_photo);
        rv = (RelativeLayout)itemView.findViewById(com.kallur.asus.cardviewsample.R.id.r1);
       r1 = (RelativeLayout)itemView.findViewById(com.kallur.asus.cardviewsample.R.id.r2);

        }

    @Override
    public void onClick(View view) {




    }








   /* @Override
    public void onBindViewHolder(RecyclerViewHolders holders , int  position ) {

        Intent intent = new Intent(getAdapterPosition(), Main2Activity.class);
       startActivity(intent);
    }


*/


}