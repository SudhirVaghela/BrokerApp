package com.example.brokerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyContractFilterAdapter extends RecyclerView.Adapter<MyContractFilterAdapter.FilterViewHolder> {

    Context context;

    public MyContractFilterAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public FilterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.custome_filter_layout,parent,false);
        return new FilterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FilterViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class FilterViewHolder extends RecyclerView.ViewHolder {

        CheckBox chk1;
        TextView companyname_txt, company_city_txt;

        public FilterViewHolder(@NonNull View itemView) {
            super(itemView);
            chk1 = itemView.findViewById(R.id.chk1);
            companyname_txt = itemView.findViewById(R.id.companyname_txt);
            company_city_txt = itemView.findViewById(R.id.company_city_txt);
        }
    }
}
