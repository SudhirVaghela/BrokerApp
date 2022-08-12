package com.example.brokerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AllClientsTabAdapter extends RecyclerView.Adapter<AllClientsTabAdapter.AllClientsViewHolder>{

    Context mcontext;

    public AllClientsTabAdapter(Context mcontext) {
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public AllClientsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.custom_clientstabs_layout,parent,false);
        return new AllClientsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllClientsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 9;
    }

    public class AllClientsViewHolder extends RecyclerView.ViewHolder {

        TextView company_name, client_name, date, totaldeals, totalbales,client_txt;

        public AllClientsViewHolder(@NonNull View itemView) {
            super(itemView);

            company_name = itemView.findViewById(R.id.company_name);
            client_name = itemView.findViewById(R.id.client_name);
            date = itemView.findViewById(R.id.date);
            totaldeals = itemView.findViewById(R.id.totaldeals);
            totalbales = itemView.findViewById(R.id.totalbales);
            client_txt = itemView.findViewById(R.id.client_txt);
        }
    }
}
