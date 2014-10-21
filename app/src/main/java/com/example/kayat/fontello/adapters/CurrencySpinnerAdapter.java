package com.example.kayat.fontello.adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.kayat.fontello.R;

import java.util.List;

/**
 * Author: Togay Han Kaya <togay.kaya@monitise.com>
 * Created: 09/10/14
 */
public class CurrencySpinnerAdapter extends ArrayAdapter<String> {

    Typeface font = Typeface.createFromAsset(getContext().getAssets(),
            "currencies.ttf");


    public CurrencySpinnerAdapter(Context context, int resource, List<String> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView view = (TextView) super.getView(position, convertView, parent);
        view.setBackgroundColor(getContext().getResources().getColor(R.color.transparent));
        view.setTypeface(font);
        return view;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        TextView view = (TextView) super.getDropDownView(position, convertView, parent);
        view.setTypeface(font);
        return view;
    }
}