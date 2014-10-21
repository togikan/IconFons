package com.example.kayat.fontello.activities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

import com.example.kayat.fontello.R;

/**
 * Author: Togay Han Kaya <togay.kaya@monitise.com>
 * Created: 21/10/14
 */
public class LoginActivity extends Activity implements View.OnClickListener{


    EditText userCode;
    EditText password;
    Button login;
    ToggleButton remember;

    Typeface font;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        font = Typeface.createFromAsset(this.getAssets(),
                "login.ttf");

        userCode = (EditText) findViewById(R.id.user_code);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        remember = (ToggleButton) findViewById(R.id.remember);

        userCode.setTypeface(font);
        password.setTypeface(font);
        login.setTypeface(font);
        remember.setTypeface(font);

        login.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.login:

                startActivity(new Intent(LoginActivity.this,BankingActivity.class));

                break;

            default:
        }

    }
}
