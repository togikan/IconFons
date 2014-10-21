package com.example.kayat.fontello.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.kayat.fontello.IconTextView;
import com.example.kayat.fontello.R;

public class MainActivity extends Activity implements View.OnClickListener{

    IconTextView mobileBanking;
    IconTextView mobilePin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mobileBanking = (IconTextView) findViewById(R.id.main_mobile_banking);
        mobilePin = (IconTextView) findViewById(R.id.main_mobile_pin);

        mobileBanking.setOnClickListener(this);
        mobilePin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.main_mobile_banking){

            Intent intent = new Intent(MainActivity.this,LoginActivity.class);
            startActivity(intent);


        } else if (v.getId() == R.id.main_mobile_pin){

//            Intent intent = new Intent(MainActivity.this,PinActivity.class);
//            startActivity(intent);

        }
    }



}
