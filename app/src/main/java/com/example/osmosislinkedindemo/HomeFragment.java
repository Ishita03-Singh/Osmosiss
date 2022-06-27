package com.example.osmosislinkedindemo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {
    private RecyclerView mActivityRV;


    public HomeFragment() {

    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        List<data> list = new ArrayList<>();
        list = getData();

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        mActivityRV = view.findViewById(R.id.ActivityRV);
        mActivityRV.setHasFixedSize(true);
        mActivityRV.setLayoutManager(new LinearLayoutManager(view.getContext()));
        mActivityRV.setAdapter(new Adapter(list,getContext()));
        return  view;
    }
    private List<data> getData()
    {
        List<data> list = new ArrayList<>();
        list.add(new data("First Name"));
        list.add(new data("Second Name"));
        list.add(new data("Third Name"));
        list.add(new data("Fourth Name"));

        return list;
    }
}