package com.example.brokerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.Pair;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.brokerapp.databinding.ActivityMyContractFilteractivityBinding;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;

public class MyContractFilteractivity extends AppCompatActivity {

    ActivityMyContractFilteractivityBinding binding;
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMyContractFilteractivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.searchview.setVisibility(View.GONE);
        context = this;
        setFilterAdapter();

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        MaterialDatePicker materialDatePicker = MaterialDatePicker.Builder.dateRangePicker().
                setSelection(Pair.create(MaterialDatePicker.thisMonthInUtcMilliseconds(),
                        MaterialDatePicker.todayInUtcMilliseconds())).build();

        binding.btnWeekly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(view.getId()==R.id.btn_weekly){
                    binding.btnWeekly.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    binding.btnWeekly.setTextColor(getResources().getColor(R.color.white));

                    binding.btnMonthly.setBackgroundColor(getResources().getColor(R.color.light_grey));
                    binding.btnMonthly.setTextColor(getResources().getColor(R.color.black));

                    binding.btnCustome.setBackgroundColor(getResources().getColor(R.color.light_grey));
                    binding.btnCustome.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
        binding.btnMonthly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.btn_monthly){
                    binding.btnMonthly.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    binding.btnMonthly.setTextColor(getResources().getColor(R.color.white));

                    binding.btnWeekly.setBackgroundColor(getResources().getColor(R.color.light_grey));
                    binding.btnWeekly.setTextColor(getResources().getColor(R.color.black));

                    binding.btnCustome.setBackgroundColor(getResources().getColor(R.color.light_grey));
                    binding.btnCustome.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
        binding.btnCustome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.btn_custome){
                    binding.btnCustome.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    binding.btnCustome.setTextColor(getResources().getColor(R.color.white));

                    binding.btnMonthly.setBackgroundColor(getResources().getColor(R.color.light_grey));
                    binding.btnMonthly.setTextColor(getResources().getColor(R.color.black));

                    binding.btnWeekly.setBackgroundColor(getResources().getColor(R.color.light_grey));
                    binding.btnWeekly.setTextColor(getResources().getColor(R.color.black));

                    materialDatePicker.show(getSupportFragmentManager(), "MATERIAL_DATE_PICKER");
                    materialDatePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
                        @Override
                        public void onPositiveButtonClick(Object selection) {

                        }
                    });
                }
            }
        });
        binding.btnCancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyContractFilteractivity.this,MyContractActivity.class));
            }
        });

        binding.ivSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.ivSearch.setVisibility(View.INVISIBLE);
                binding.searchview.setVisibility(View.VISIBLE);
                binding.searchview.setIconified(false);
            }
        });
    }
    private void setFilterAdapter() {

        MyContractFilterAdapter adapter = new MyContractFilterAdapter(context);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        binding.bySellerRecycler.setLayoutManager(layoutManager);
        binding.bySellerRecycler.setAdapter(adapter);
    }
}