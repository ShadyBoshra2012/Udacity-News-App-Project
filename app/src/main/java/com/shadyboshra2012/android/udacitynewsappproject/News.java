package com.shadyboshra2012.android.udacitynewsappproject;

import java.util.Date;

public class News {
    private String title;
    private String sectionName;
    private Date pubDate;
    private String authorName;
    private String url;

    public News(String title, String sectionName, Date pubDate, String authorName, String url) {
        this.title = title;
        this.sectionName = sectionName;
        this.pubDate = pubDate;
        this.authorName = authorName;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public String getSectionName() {
        return sectionName;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getUrl() {
        return url;
    }
}
