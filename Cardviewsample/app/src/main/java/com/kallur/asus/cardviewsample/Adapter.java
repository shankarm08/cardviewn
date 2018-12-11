package com.kallur.asus.cardviewsample;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<RecyclerViewHolders> {

    private List<ItemObject> itemList;
    private Context context;

    public Adapter(Context context, List<ItemObject> itemList) {
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
                    Intent intent = new Intent(v.getContext(), openActivity.class);
                    v.getContext().startActivity(intent);

                }else  if (position==1){
                    Intent intent = new Intent(v.getContext(), openActivity2.class);
                    v.getContext().startActivity(intent);

                }else if (position==2){
                    Intent intent = new Intent(v.getContext(), openActivity7.class);
                    v.getContext().startActivity(intent);
                }else  if (position==3) {
                    Intent intent = new Intent(v.getContext(), openActivity4.class);
                    v.getContext().startActivity(intent);

                }else if (position==4){
                    Intent intent = new Intent(v.getContext(), openActivity5.class);
                    v.getContext().startActivity(intent);
                } else if (position==5){
                Intent intent = new Intent(v.getContext(), openActivity8.class);
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