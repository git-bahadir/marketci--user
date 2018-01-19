package com.example.user.marketci.Utils;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import com.example.user.marketci.R;
import com.example.user.marketci.Shop;

/**
 * Created by Lenovo PC on 12/15/2017.
 */

public class CustomAdapterShops extends ArrayAdapter<Shop> {
    /**
     * Created by Lenovo PC on 9/23/2016. Salvaged from my LibraryNavigator Project
     */
        private Context context;
        private ArrayList<Shop> results;

        public CustomAdapterShops(Context context, ArrayList<Shop> results){
            super(context, R.layout.custom_shop_row, results);
            this.context = context;
            this.results = results;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View row = null;
            if(convertView ==null) {
                LayoutInflater bahadirsInflater = LayoutInflater.from(getContext());
                convertView = bahadirsInflater.inflate(R.layout.custom_shop_row, parent, false);
            }
            row = convertView;

            TextView titleText = (TextView) row.findViewById(R.id.titleText);
            TextView authorText = (TextView) row.findViewById(R.id.authorText);
            TextView callNumText = (TextView) row.findViewById(R.id.callText);

            //Set Text
            titleText.setText("abbas");//results.get(position).getTitle());
            authorText.setText("verdi");//results.get(position).getAuthor());
            callNumText.setText("bir şeyler");//results.get(position).getCallNumber());

            return row;
        }
    }


