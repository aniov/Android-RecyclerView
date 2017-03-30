package com.aniov.android.myapplication.model;

/**
 * Created by Marius on 3/29/2017.
 */

public class MyRecyclerViewItem {

    private String title;
    private String subtitle;

    public MyRecyclerViewItem(String title, String subtitle) {
        this.title = title;
        this.subtitle = subtitle;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }
}
