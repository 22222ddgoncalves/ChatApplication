package com.example.diogo.chatapplication;

import android.app.Dialog;
import android.content.SharedPreferences;
import android.support.v4.content.SharedPreferencesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ShareActionProvider;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sh = getPreferences(MODE_PRIVATE);

        if(sh.getString(getResources().getString(R.string.hash_username),"nulla")
                .contentEquals("nulla")){

            Dialog create_account = new Dialog(this);
            create_account.setContentView(R.layout.create_account_dialog);
        }

    }
}
