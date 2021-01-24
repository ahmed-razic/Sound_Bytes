package com.example.android.soundbytes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView home = findViewById(R.id.home);
        TextView musicLibrary = findViewById(R.id.library);
        TextView nowPlaying = findViewById(R.id.nowPlaying);
        TextView karooke = findViewById(R.id.karooke);
        TextView radiofm = findViewById(R.id.radiofm);
        TextView detailInfo = findViewById(R.id.detailInfo);
        TextView buyOnline = findViewById(R.id.buyOnline);
        TextView search = findViewById(R.id.search);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoHome = new Intent(v.getContext(), MainActivity.class);
                startActivity(gotoHome);
            }
        });

        musicLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoMusicLibrary = new Intent(v.getContext(), MusicLibraryActivity.class);
                startActivity(gotoMusicLibrary);
            }
        });

        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoNowPlaying = new Intent(v.getContext(), NowPlayingActivity.class);
                startActivity(gotoNowPlaying);
            }
        });

        karooke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoKarooke = new Intent(v.getContext(), KarookeActivity.class);
                startActivity(gotoKarooke);
            }
        });

        radiofm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoRadiofm = new Intent(v.getContext(), RadiofmActivity.class);
                startActivity(gotoRadiofm);
            }
        });

        detailInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoDetailInfo = new Intent(v.getContext(), DetailInfoActivity.class);
                startActivity(gotoDetailInfo);
            }
        });

        buyOnline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoBuyOnline = new Intent(v.getContext(), BuyOnlineActivity.class);
                startActivity(gotoBuyOnline);
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoSearch = new Intent(v.getContext(), SearchActivity.class);
                startActivity(gotoSearch);
            }
        });


    }
}