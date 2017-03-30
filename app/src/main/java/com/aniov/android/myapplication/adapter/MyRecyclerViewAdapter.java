package com.aniov.android.myapplication.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.aniov.android.myapplication.R;
import com.aniov.android.myapplication.model.MyRecyclerViewItem;

import java.util.List;

/**
 * Created by Marius on 3/29/2017.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter <MyRecyclerViewAdapter.ItemViewHolder>{

    private List<MyRecyclerViewItem> items;

    public MyRecyclerViewAdapter(List<MyRecyclerViewItem> items) {
        this.items = items;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.titletextView.setText(items.get(position).getTitle());
        holder.subtitleTextView.setText(items.get(position).getSubtitle());
    }

    @Override
    public int getItemCount() {
        return items != null && !items.isEmpty() ? items.size() : 0;
    }


    class ItemViewHolder extends RecyclerView.ViewHolder {

        private TextView titletextView;
        private TextView subtitleTextView;

        ItemViewHolder(View itemView) {
            super(itemView);

            titletextView = (TextView) itemView.findViewById(R.id.text_title);
            subtitleTextView = (TextView) itemView.findViewById(R.id.text_subtitle);
        }
    }
}
