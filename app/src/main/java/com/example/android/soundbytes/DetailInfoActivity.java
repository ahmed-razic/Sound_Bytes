package com.example.android.soundbytes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetailInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deatil_info);

        TextView home = findViewById(R.id.textView2);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoHome = new Intent(v.getContext(), MainActivity.class);
                startActivity(gotoHome);
            }
        });

        TextView buyOnLine = findViewById(R.id.textView3);
        buyOnLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoBuyOnline = new Intent(v.getContext(), BuyOnlineActivity.class);
                startActivity(gotoBuyOnline);
            }
        });

    }
}