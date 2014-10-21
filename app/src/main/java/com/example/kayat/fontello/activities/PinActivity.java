package com.example.kayat.fontello.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.kayat.fontello.R;
import com.example.kayat.fontello.adapters.CurrencyListAdapter;

/**
 * Author: Togay Han Kaya <togay.kaya@monitise.com>
 * Created: 19/09/14
 */
public class PinActivity extends Activity {

    ListView currencyList;
    CurrencyListAdapter listAdapter;
    String[] currencies =  {"dolar","tl"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin);



    }



}
