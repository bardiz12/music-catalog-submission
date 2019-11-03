package com.bardizba.rockbandcatalog.Adapter;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bardizba.rockbandcatalog.Model.Band;
import com.bardizba.rockbandcatalog.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class GridBandAdapter extends RecyclerView.Adapter<GridBandAdapter.GridViewHolder> {

    private ArrayList<Band> bands;
    private OnItemClickCallback onItemClickCallback;

    public GridBandAdapter(ArrayList<Band> bands) {
        this.bands = bands;
    }


    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_band,
                parent,false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final GridViewHolder holder, int position) {
        Glide.with(holder.itemView.getContext())
                .load(bands.get(position).getImgPhoto())
                .apply(new RequestOptions().override(350,350))
                .into(holder.imgPhoto);
        holder.tvName.setText(bands.get(position).getName());
        holder.itemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(bands.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return bands.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName;
        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_band_cover);
            tvName = itemView.findViewById(R.id.tv_band_name);
        }
    }

    public interface OnItemClickCallback{
        void onItemClicked(Band band);
    }
}
