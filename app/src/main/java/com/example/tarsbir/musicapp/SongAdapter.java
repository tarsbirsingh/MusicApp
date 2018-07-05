package com.example.tarsbir.musicapp;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;


public class SongAdapter extends RecyclerView.Adapter<SongAdapter.MyViewHolder> {
    private List<Song> songsList;

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView song, artist;
        ImageButton play;

        MyViewHolder(View view) {
            super(view);
            song = view.findViewById(R.id.song_name);
            artist = view.findViewById(R.id.artist_name);
            play=view.findViewById(R.id.play_button);
        }
    }

    SongAdapter(List<Song> songsList)
    {
        this.songsList = songsList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.song_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Song song = songsList.get(position);
        holder.song.setText(song.getSong_name());
        holder.artist.setText(song.getArtist_name());
    }

    @Override
    public int getItemCount()
    {
        return songsList.size();
    }


}
