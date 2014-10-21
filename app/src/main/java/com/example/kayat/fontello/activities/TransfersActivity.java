package com.example.kayat.fontello.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Spinner;

import com.example.kayat.fontello.R;
import com.example.kayat.fontello.adapters.CurrencySpinnerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Togay Han Kaya <togay.kaya@monitise.com>
 * Created: 09/10/14
 */
public class TransfersActivity extends Activity {

    Spinner accountSpinnerSender;
    Spinner accountSpinnerReceiver;
    CurrencySpinnerAdapter accountAdapter;
    List<String> accounts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfers);



        populateAccountList();

        accountSpinnerSender = (Spinner) findViewById(R.id.account_spinner_sender);
        accountSpinnerReceiver = (Spinner) findViewById(R.id.account_spinner_receiver);

        accountAdapter = new CurrencySpinnerAdapter(this,R.layout.spinner_item_currency,accounts);
        accountSpinnerSender.setAdapter(accountAdapter);
        accountSpinnerReceiver.setAdapter(accountAdapter);
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
}
