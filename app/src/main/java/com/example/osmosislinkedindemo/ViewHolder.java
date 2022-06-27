package com.example.osmosislinkedindemo;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder{
    TextView mName;

    ViewHolder(View itemView)
    {
        super(itemView);
        mName
                = (TextView)itemView
                .findViewById(R.id.NameTV);

    }
}
