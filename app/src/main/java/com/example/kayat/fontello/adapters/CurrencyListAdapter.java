package com.example.kayat.fontello.adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.kayat.fontello.R;

import java.util.ArrayList;

/**
 * Author: Togay Han Kaya <togay.kaya@monitise.com>
 * Created: 19/09/14
 */
public class CurrencyListAdapter extends BaseAdapter {

    private ArrayList<String> currencies;
    private ArrayList<String> balances;

    private LayoutInflater inflater;

    Typeface font;


    public CurrencyListAdapter(Context context, ArrayList<String> currencies,ArrayList<String> balances){

        this.currencies = currencies;
        this.balances = balances;
        this.inflater = LayoutInflater.from(context);
        font = Typeface.createFromAsset(context.getAssets(),
                "currencies.ttf");

    }

    @Override
    public int getCount() {
        return currencies.size();
    }

    @Override
    public String getItem(int position) {
        return currencies.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if(convertView == null){

            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.list_item_account,null);
            holder.currency = (TextView) convertView.findViewById(R.id.account_name);
            holder.balance = (TextView) convertView.findViewById(R.id.balance);
            holder.currency.setTypeface(font);
            holder.balance.setTypeface(font);
            convertView.setTag(holder);

        } else {

            holder = (ViewHolder) convertView.getTag();
        }

        holder.currency.setText(currencies.get(position));
        holder.balance.setText(balances.get(position));


        return convertView;
    }

    static class ViewHolder{

        TextView currency;
        TextView balance;
    }

}


