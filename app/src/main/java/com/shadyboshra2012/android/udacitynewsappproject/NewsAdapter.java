package com.shadyboshra2012.android.udacitynewsappproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param newss is the list of newss, which is the data source of the adapter
     */
    public NewsAdapter(Context context, List<News> newss) {
        super(context, 0, newss);
    }

    /**
     * Returns a list item view that displays information about the news at the given position
     * in the list of newss.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        // Find the news at the given position in the list of newss
        News currentNews = getItem(position);

        TextView newsTitleTextView =  listItemView.findViewById(R.id.news_title);
        newsTitleTextView.setText(currentNews.getTitle());

        TextView newsSectionTextView =  listItemView.findViewById(R.id.news_section_name);
        newsSectionTextView.setText(currentNews.getSectionName());

        TextView dateTextView =  listItemView.findViewById(R.id.date);
        dateTextView.setText(formatDate(currentNews.getPubDate()));

        TextView timeTextView =  listItemView.findViewById(R.id.time);
        timeTextView.setText(formatTime(currentNews.getPubDate()));

        TextView authorNameTextView =  listItemView.findViewById(R.id.author_name);
        authorNameTextView.setText(currentNews.getAuthorName());

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }

    /**
     * Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
     */
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    /**
     * Return the formatted date string (i.e. "4:30 PM") from a Date object.
     */
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }
}
