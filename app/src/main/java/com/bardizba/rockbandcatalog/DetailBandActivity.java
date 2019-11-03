package com.bardizba.rockbandcatalog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bardizba.rockbandcatalog.Adapter.ListSongAdapter;
import com.bardizba.rockbandcatalog.Model.Band;
import com.bardizba.rockbandcatalog.Model.Song;
import com.bumptech.glide.Glide;

import java.lang.reflect.Array;

public class DetailBandActivity extends AppCompatActivity {

    public static String BAND = "band";
    private Band band;
    private TextView tvName, tvCity,tvArticle;
    private ImageView imgAlbum;
    private TextView[] tvTags;
    private RecyclerView rvSongs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_band);



        band = (Band) getIntent().getSerializableExtra(BAND);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle(band.getName());
        }

        tvName = findViewById(R.id.detail_tv_band_name);
        imgAlbum = findViewById(R.id.img_cd_cover);
        tvCity = findViewById(R.id.detail_tv_band_full_city);
        tvArticle = findViewById(R.id.detail_tv_band_article);
        tvTags = new TextView[]{findViewById(R.id.detail_tv_tag_1),
                findViewById(R.id.detail_tv_tag_2), findViewById(R.id.detail_tv_tag_3)};
        rvSongs = findViewById(R.id.rvSongList);

        tvArticle.setText(band.getArticle());
        tvName.setText(band.getName());
        tvCity.setText(band.getCity_full());
        Glide.with(imgAlbum.getContext())
                .load(band.getImgPhoto())
                .into(imgAlbum);
        for (int i = 0; i < band.getGenre().length; i++) {
            tvTags[i].setText("#"+band.getGenre()[i]);
            tvTags[i].setVisibility(View.VISIBLE);
        }

        rvSongs.setHasFixedSize(true);

        rvSongs.setLayoutManager(new LinearLayoutManager(this));


        ListSongAdapter listSongAdapter = new ListSongAdapter(band.getBest_songs());

        rvSongs.setAdapter(listSongAdapter);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}
