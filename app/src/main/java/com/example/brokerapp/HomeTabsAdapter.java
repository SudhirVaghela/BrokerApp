package com.example.brokerapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

public class HomeTabsAdapter extends RecyclerView.Adapter<HomeTabsAdapter.HomeViewHolder> {

    Context mContext;

    public HomeTabsAdapter(FragmentActivity activity) {

        this.mContext =activity;
    }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.custom_negotiation_layout,parent,false);
        return new HomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mContext.startActivity(new Intent(mContext,ParticipantsDataActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return 7;
    }

    public class HomeViewHolder extends RecyclerView.ViewHolder {

        TextView companyName, userPost, baseAmount, balesTotal;
        public HomeViewHolder(@NonNull View itemView) {
            super(itemView);

            companyName = itemView.findViewById(R.id.companyName);
            userPost = itemView.findViewById(R.id.userPost);
            baseAmount = itemView.findViewById(R.id.baseAmount);
            balesTotal = itemView.findViewById(R.id.balesTotal);
        }
    }
}
