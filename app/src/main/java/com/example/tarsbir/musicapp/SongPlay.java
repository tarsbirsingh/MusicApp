package com.example.tarsbir.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SongPlay extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_play);

        intentCall();
    }


    public void play(View view) {

        Toast.makeText(this, "Song play", Toast.LENGTH_SHORT).show();
    }

    public void prev(View view) {
        Toast.makeText(this, "previous Song ", Toast.LENGTH_SHORT).show();
    }

    public void next(View view) {
        Toast.makeText(this, "Next Song", Toast.LENGTH_SHORT).show();
    }

    public void intentCall() {
        Intent in = getIntent();
        TextView song_name = findViewById(R.id.song_name_display);
        TextView artist_name = findViewById(R.id.artist_name_display);
        song_name.setText(in.getStringExtra("SONG_NAME"));
        artist_name.setText(in.getStringExtra("ARTIST_NAME"));
    }
}
