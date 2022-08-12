package com.example.brokerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MCXAdapter extends RecyclerView.Adapter<MCXAdapter.McxDataHolder>{

    Context mcontext;

    public MCXAdapter(Context mcontext) {
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public MCXAdapter.McxDataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.custome_mcx_layout, parent, false);
        return new McxDataHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MCXAdapter.McxDataHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 7;
    }

    public class McxDataHolder extends RecyclerView.ViewHolder {

        TextView tv_date, tv_pricetitle, tv_updown, tv_openprice, tv_highprice, tv_lowprice, tv_prev_close_price;

        public McxDataHolder(@NonNull View itemView) {
            super(itemView);
            tv_date = itemView.findViewById(R.id.tv_date);
            tv_pricetitle = itemView.findViewById(R.id.tv_pricetitle);
            tv_updown = itemView.findViewById(R.id.tv_updown);
            tv_openprice = itemView.findViewById(R.id.tv_openprice);
            tv_highprice = itemView.findViewById(R.id.tv_highprice);
            tv_lowprice = itemView.findViewById(R.id.tv_lowprice);
            tv_prev_close_price = itemView.findViewById(R.id.tv_prev_close_price);
        }
    }
}
