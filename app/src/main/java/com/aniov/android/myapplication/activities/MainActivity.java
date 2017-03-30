package com.aniov.android.myapplication.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.aniov.android.myapplication.R;
import com.aniov.android.myapplication.adapter.MyRecyclerViewAdapter;
import com.aniov.android.myapplication.model.MyRecyclerViewItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<MyRecyclerViewItem> items = new ArrayList<>();

        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        for (int i = 0; i < 150; i++) {
            items.add(new MyRecyclerViewItem("Main Title number " + i, "Subtitle stuff text"));
        }

        MyRecyclerViewAdapter myRecyclerViewAdapter = new MyRecyclerViewAdapter(items);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(myRecyclerViewAdapter);

        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                    Toast.makeText(MainActivity.this, "First full visible item number on screen: " + String.valueOf(layoutManager.findFirstCompletelyVisibleItemPosition()), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
