package com.example.android.soundbytes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MusicLibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_library);

        TextView home = findViewById(R.id.textView2);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoHome = new Intent(v.getContext(), MainActivity.class);
                startActivity(gotoHome);
            }
        });


        TextView search = findViewById(R.id.textView3);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoSearch = new Intent(v.getContext(), SearchActivity.class);
                startActivity(gotoSearch);
            }
        });

        TextView nowPlaying = findViewById(R.id.textView4);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoNowPlaying = new Intent(v.getContext(), NowPlayingActivity.class);
                startActivity(gotoNowPlaying);
            }
        });
    }
}