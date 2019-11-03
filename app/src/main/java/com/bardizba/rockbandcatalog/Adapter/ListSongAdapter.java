package com.bardizba.rockbandcatalog.Adapter;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bardizba.rockbandcatalog.Model.Song;
import com.bardizba.rockbandcatalog.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListSongAdapter extends RecyclerView.Adapter<ListSongAdapter.ListViewHolder> {

    private ArrayList<Song> songs;
    public ListSongAdapter(ArrayList<Song> songs) {
        this.songs = songs;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_song_spotify,
                parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, final int position) {

        holder.tvSongTitle.setText(songs.get(position).getTitle());
        holder.spotifyBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent openSpotifyLink = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(songs.get(position).getSpotify_uri()));

                v.getContext().startActivity(openSpotifyLink);
            }
        });
    }

    @Override
    public int getItemCount() {
        return songs.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tvSongTitle,spotifyBtn;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            tvSongTitle = itemView.findViewById(R.id.tv_song_title);
            spotifyBtn = itemView.findViewById(R.id.tv_song_btn);

        }
    }
}
