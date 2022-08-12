package com.example.brokerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ParticipantsDataAdapter extends RecyclerView.Adapter<ParticipantsDataAdapter.ParticipantsViewHolder>{

    Context context;

    public ParticipantsDataAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ParticipantsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.custom_negotiationdata_layout,parent,false);

        return new ParticipantsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ParticipantsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 7;
    }

    public class ParticipantsViewHolder extends RecyclerView.ViewHolder {

        TextView nameTxt, userPost, prevAmount, newTotal;
        public ParticipantsViewHolder(@NonNull View itemView) {
            super(itemView);

            nameTxt = itemView.findViewById(R.id.nameTxt);
            userPost = itemView.findViewById(R.id.userPost);
            prevAmount = itemView.findViewById(R.id.prevAmount);
            newTotal = itemView.findViewById(R.id.newTotal);
        }
    }
}
