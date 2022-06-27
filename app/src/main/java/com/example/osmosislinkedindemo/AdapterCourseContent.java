package com.example.osmosislinkedindemo;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterCourseContent extends RecyclerView.Adapter<AdapterCourseContent.MyView>{
    private List<String> list;

    // View Holder class which
    // extends RecyclerView.ViewHolder
    public class MyView
            extends RecyclerView.ViewHolder {

        // Text View
        TextView textView;

        // parameterised constructor for View Holder class
        // which takes the view as a parameter
        public MyView(View view)
        {
            super(view);

            // initialise TextView with id
            textView = (TextView)view
                    .findViewById(R.id.course_title_TV);
        }
    }

    // Constructor for adapter class
    // which takes a list of String type
    public AdapterCourseContent(List<String> list)
    {
        this.list = list;
    }

    // Override onCreateViewHolder which deals
    // with the inflation of the card layout
    // as an item for the RecyclerView.
    @Override
    public AdapterCourseContent.MyView onCreateViewHolder(ViewGroup parent,
                                                           int viewType)
    {

        // Inflate item.xml using LayoutInflator
        View itemView
                = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.course_content,
                        parent,
                        false);

        // return itemView
        return new AdapterCourseContent.MyView(itemView);
    }

    // Override onBindViewHolder which deals
    // with the setting of different data
    // and methods related to clicks on
    // particular items of the RecyclerView.
    @Override
    public void onBindViewHolder(final AdapterCourseContent.MyView holder,
                                 final int position)
    {

        // Set the text of each item of
        // Recycler view with the list items
        holder.textView.setText(list.get(position));
    }

    // Override getItemCount which Returns
    // the length of the RecyclerView.
    @Override
    public int getItemCount()
    {
        return list.size();
    }
}
