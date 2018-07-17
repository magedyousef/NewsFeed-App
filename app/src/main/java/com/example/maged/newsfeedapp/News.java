package com.example.maged.newsfeedapp;

/**
 * Created by Maged on 16-Jul-17.
 */

public class News {

    private String mTitle;

    private String mSection;

    private String mURLaddress;

    public News (String title, String section, String URLaddress){

        mTitle = title;
        mSection = section;
        mURLaddress = URLaddress;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSection() {
        return mSection; }

    public String getURLaddress() {
        return mURLaddress;}
}
