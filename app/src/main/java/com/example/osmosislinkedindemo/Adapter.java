package com.example.osmosislinkedindemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {

    List<data> list
            = Collections.emptyList();

    Context context;

    public Adapter(List<data> list,
                                Context context)
    {
        this.list = list;
        this.context = context;
    }

    @Override
    public ViewHolder
    onCreateViewHolder(ViewGroup parent,
                       int viewType)
    {

        Context context
                = parent.getContext();
        LayoutInflater inflater
                = LayoutInflater.from(context);

        // Inflate the layout

        View photoView
                = inflater
                .inflate(R.layout.item_one,
                        parent, false);

        ViewHolder viewHolder
                = new ViewHolder(photoView);
        return viewHolder;
    }

    @Override
    public void
    onBindViewHolder(final ViewHolder viewHolder,
                     final int position)
    {
        viewHolder.mName
                .setText(list.get(position).name);
    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }

    @Override
    public void onAttachedToRecyclerView(
            RecyclerView recyclerView)
    {
        super.onAttachedToRecyclerView(recyclerView);
    }


}
