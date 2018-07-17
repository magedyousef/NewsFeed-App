package com.example.maged.newsfeedapp;

/**
 * Created by Maged on 16-Jul-17.
 */

import android.content.AsyncTaskLoader;
import android.content.Context;
import java.util.List;


public class NewsLoader extends AsyncTaskLoader<List<News>> {

    public static final String LOG_TAG = NewsLoader.class.getName();

    private String mUrl;

    public NewsLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        List<News> result = Data.fetchNewsData(mUrl);
        return result;
    }
}
