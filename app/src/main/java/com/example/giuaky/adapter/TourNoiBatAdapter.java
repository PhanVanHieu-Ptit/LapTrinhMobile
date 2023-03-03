package com.example.giuaky.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.giuaky.R;
import com.example.giuaky.model.Tour;

import java.util.List;

public class TourNoiBatAdapter extends RecyclerView.Adapter<TourNoiBatAdapter.ViewHolder> {
    private Context mContext;
    private List<Tour> mItems;

    public TourNoiBatAdapter(Context context, List<Tour> items) {
        mContext = context;
        mItems = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_tour_noi_bat, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Tour tour = mItems.get(position);

        holder.imageView.setImageResource(tour.getUrlImage());
        holder.titleTextView.setText(tour.getName());
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView titleTextView;

        ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_tour);
            titleTextView = itemView.findViewById(R.id.item_title);
        }
    }
}
