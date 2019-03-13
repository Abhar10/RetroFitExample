package com.abhar.android.retro;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class CountryAdapterRecycleView extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private ArrayList<Country> countryArrayList;
    public CountryAdapterRecycleView(final ArrayList<Country> countries){
        this.countryArrayList=countries;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_country,viewGroup,false);
        CountryViewHolder countryViewHolder = new CountryViewHolder(view);
        return countryViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        Country std=countryArrayList.get(i);
        String title=std.getName();
        ((CountryViewHolder) viewHolder).mTextViewName.setText(title);
    }

    @Override
    public int getItemCount() {
        return countryArrayList.size();
    }


    class CountryViewHolder extends RecyclerView.ViewHolder{
        private TextView mTextViewName;
        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);


            mTextViewName=itemView.findViewById(R.id.textName);


        }
    }
}
