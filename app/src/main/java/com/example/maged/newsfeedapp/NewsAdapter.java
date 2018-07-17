package com.example.maged.newsfeedapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by Maged on 16-Jul-17.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Activity context, ArrayList<News> news) {

        super(context, 0, news);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        News currentNews = getItem(position);

        String title = currentNews.getTitle();
        String section = currentNews.getSection();

        TextView titleView = (TextView) convertView.findViewById(R.id.title);
        titleView.setText(title);

        TextView sectionView = (TextView) convertView.findViewById(R.id.section);
        sectionView.setText(section);

        return convertView;
    }
}
