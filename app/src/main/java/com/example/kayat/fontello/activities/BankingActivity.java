package com.example.kayat.fontello.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.kayat.fontello.IconTextView;
import com.example.kayat.fontello.R;

/**
 * Author: Togay Han Kaya <togay.kaya@monitise.com>
 * Created: 19/09/14
 */
public class BankingActivity extends Activity implements View.OnClickListener {

    IconTextView accounts;
    IconTextView transfers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banking);

        transfers = (IconTextView) findViewById(R.id.banking_transfers);
        transfers.setOnClickListener(this);

        accounts = (IconTextView) findViewById(R.id.banking_accounts);
        accounts.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {

            case R.id.banking_transfers:

                startActivity(new Intent(BankingActivity.this, TransfersActivity.class));

                break;

            case R.id.banking_accounts:

                startActivity(new Intent(BankingActivity.this, AccountsActivity.class));

                break;

            default:
        }
    }
}
