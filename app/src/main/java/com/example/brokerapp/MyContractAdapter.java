package com.example.brokerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyContractAdapter extends RecyclerView.Adapter<MyContractAdapter.ContractViewHolder> {

    Context mcontext;


    public MyContractAdapter(Context mcontext) {
        this.mcontext = mcontext;

    }

    @NonNull
    @Override
    public ContractViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mcontext).inflate(R.layout.custome_mycontract_layout,parent,false);
        return new ContractViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContractViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return 7;
    }

    public class ContractViewHolder extends RecyclerView.ViewHolder {

        TextView date_txt, companyname_txt, sellername_txt, price_txt;
        RelativeLayout parent_rl;

        public ContractViewHolder(@NonNull View itemView) {
            super(itemView);

            date_txt = itemView.findViewById(R.id.date_txt);
            companyname_txt = itemView.findViewById(R.id.companyname_txt);
            sellername_txt = itemView.findViewById(R.id.sellername_txt);
            price_txt = itemView.findViewById(R.id.price_txt);
            parent_rl = itemView.findViewById(R.id.parent_rl);
        }
    }
}
