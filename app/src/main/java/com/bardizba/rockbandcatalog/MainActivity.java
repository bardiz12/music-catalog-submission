package com.bardizba.rockbandcatalog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.bardizba.rockbandcatalog.Adapter.GridBandAdapter;
import com.bardizba.rockbandcatalog.Model.Band;
import com.bardizba.rockbandcatalog.Model.allBand;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private allBand semuaBand;
    private ArrayList<Band> bands;
    private RecyclerView rvBands;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBands = findViewById(R.id.rvBands);
        rvBands.setHasFixedSize(true);

        semuaBand = new allBand();
        bands = semuaBand.getBands();
        for(int i=0;i<bands.size();i++){
            Log.i("BAND KE-" + i,bands.get(i).getName());
            Log.i("LAGU 1 BAND KE-" + i,bands.get(i).getBest_songs().get(0).getTitle());

        }
        GridViewShow();
    }

    private void GridViewShow() {
        this.rvBands.setLayoutManager(new GridLayoutManager(this,2));
        GridBandAdapter gridBandAdapter = new GridBandAdapter(bands);
        rvBands.setAdapter(gridBandAdapter);

        gridBandAdapter.setOnItemClickCallback(new GridBandAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Band band) {
                Bundle bundle = new Bundle();
                bundle.putSerializable(DetailBandActivity.BAND,band);
                Intent moveIntent = new Intent(MainActivity.this,DetailBandActivity.class);
                moveIntent.putExtras(bundle);

                startActivity(moveIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_about, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.about_menu_about){
            Intent intent = new Intent(MainActivity.this,AboutMeActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
