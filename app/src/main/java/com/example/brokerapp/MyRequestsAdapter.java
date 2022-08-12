package com.example.brokerapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;

public class MyRequestsAdapter extends RecyclerView.Adapter<MyRequestsAdapter.RequestViewHolder> {

    Context mContext;

    public MyRequestsAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RequestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.custome_myrequests_layout, parent, false);
        return new RequestViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RequestViewHolder holder, int position) {

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mContext.startActivity(new Intent(mContext, RequestDataActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return 9;
    }

    public class RequestViewHolder extends RecyclerView.ViewHolder {

        TextView txt_date, name, txt_BuyerSeller, txt_stateName, txt_cityName;
        AppCompatButton btn_reject, btn_accept;

        public RequestViewHolder(@NonNull View itemView) {
            super(itemView);

            txt_date = itemView.findViewById(R.id.txt_date);
            name = itemView.findViewById(R.id.name);
            txt_BuyerSeller = itemView.findViewById(R.id.txt_BuyerSeller);
            txt_stateName = itemView.findViewById(R.id.txt_stateName);
            txt_cityName = itemView.findViewById(R.id.txt_cityName);
            btn_reject = itemView.findViewById(R.id.btn_reject);
            btn_accept = itemView.findViewById(R.id.btn_accept);
        }
    }
}
