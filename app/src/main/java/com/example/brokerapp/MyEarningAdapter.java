package com.example.brokerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyEarningAdapter extends RecyclerView.Adapter<MyEarningAdapter.EarningViewHolder> {

    Context mContext;

    public MyEarningAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public EarningViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.custom_earnings_layout,parent,false);
        return new EarningViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EarningViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public class EarningViewHolder extends RecyclerView.ViewHolder {

        TextView date, total_amount;

        public EarningViewHolder(@NonNull View itemView) {
            super(itemView);

            date  = itemView.findViewById(R.id.date);
            total_amount = itemView.findViewById(R.id.total_amount);
        }
    }
}
