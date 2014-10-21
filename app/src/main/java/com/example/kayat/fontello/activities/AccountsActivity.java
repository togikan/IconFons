package com.example.kayat.fontello.activities;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;

import com.example.kayat.fontello.R;
import com.example.kayat.fontello.adapters.CurrencyListAdapter;

import java.util.ArrayList;

/**
 * Author: Togay Han Kaya <togay.kaya@monitise.com>
 * Created: 20/10/14
 */
public class AccountsActivity extends Activity {

    private ListView listView;
    private CurrencyListAdapter adapter;
    private ArrayList<String> accounts;
    private ArrayList<String> balances;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_accounts);

        populateAccountList();
        populateBalanceList();
        listView = (ListView) findViewById(R.id.listview);
        adapter = new CurrencyListAdapter(this,accounts,balances);
        listView.setAdapter(adapter);

    }

    private void populateAccountList(){

        accounts = new ArrayList<String>();

        accounts.add("\ue600 Euro Account");
        accounts.add("\ue601 Pound Account");
        accounts.add("\ue602 Dollar Account");
        accounts.add("\ue603 Rupee Account");
        accounts.add("\ue604 Yen Account");
        accounts.add("\ue605 Ruble Account");
        accounts.add("\ue606 Won Account");
        accounts.add("\ue607 Bitcoin Account");

    }

    private void populateBalanceList(){

        balances = new ArrayList<String>();
        Resources res = getResources();

        balances.add(res.getString(R.string.balance) + "12.000 \ue600");
        balances.add(res.getString(R.string.balance) + "12.000 \ue601");
        balances.add(res.getString(R.string.balance) + "12.000 \ue602");
        balances.add(res.getString(R.string.balance) + "12.000 \ue603");
        balances.add(res.getString(R.string.balance) + "12.000 \ue604");
        balances.add(res.getString(R.string.balance) + "12.000 \ue605");
        balances.add(res.getString(R.string.balance) + "12.000 \ue606");
        balances.add(res.getString(R.string.balance) + "12.000 \ue607");


    }
}
