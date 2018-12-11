package com.kallur.asus.cardviewsample;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolders> {

    private List<ItemObject> itemList;
    private Context context;

    public RecyclerViewAdapter(Context context, List<ItemObject> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(com.kallur.asus.cardviewsample.R.layout.card_view_list, null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, final int position) {
        holder.countryName.setText(itemList.get(position).getName());
        holder.countryPhoto.setImageResource(itemList.get(position).getPhoto());
        holder.rv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position==0){
                    Intent intent = new Intent(v.getContext(), Main2Activity.class);
                    v.getContext().startActivity(intent);

                }else  if (position==1){
                    Intent intent = new Intent(v.getContext(), Main3Activity.class);
                    v.getContext().startActivity(intent);

                }else if (position==2){
                    Intent intent = new Intent(v.getContext(), Main4Activity.class);
                    v.getContext().startActivity(intent);
                }else  if (position==3) {
                    Intent intent = new Intent(v.getContext(), Main5Activity.class);
                    v.getContext().startActivity(intent);

                }else if (position==4){
                    Intent intent = new Intent(v.getContext(), Main7Activity1.class);
                    v.getContext().startActivity(intent);


                }else if (position==5){
                    Intent intent = new Intent(v.getContext(), bloodbank.class);
                    v.getContext().startActivity(intent);

                }else if (position==6){
                    Intent intent = new Intent(v.getContext(), MapsActivity.class);
                    v.getContext().startActivity(intent);

                }else if (position==7){
                    Intent intent = new Intent(v.getContext(), Upcomingevents.class);
                    v.getContext().startActivity(intent);
                }else if (position==8){
                    Intent intent = new Intent(v.getContext(),  Main6Activity.class);
                    v.getContext().startActivity(intent);
                }else  if (position==9){
                    Intent intent = new Intent(v.getContext(), Contactus.class);
                    v.getContext().startActivity(intent);
                }

            }
        });
    }

    @Override
    public int getItemCount() {



        return this.itemList.size();
    }


}