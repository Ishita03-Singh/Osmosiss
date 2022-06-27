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


public class CourseFrgament extends Fragment {
    RecyclerView recyclerView1,recyclerView,recyclerView2;

    // Layout Manager
    RecyclerView.LayoutManager RecyclerViewLayoutManager,RecyclerViewLayoutManager1,RecyclerViewLayoutManager2;

    // adapter class object
    Adapter adapter;

    // Linear Layout Manager
    LinearLayoutManager HorizontalLayout,HorizontalLayout1,HorizontalLayout2;

    View ChildView;
    int RecyclerViewItemPosition;
    public CourseFrgament() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        List<String> list = new ArrayList<>();
        List<String> category_list=new ArrayList<>();
        List<String> popular_list=new ArrayList<>();

        category_list =AddItemstoCategoryList();
        list = AddItemsToRecyclerViewArrayList();
        popular_list = AddItemstoPopularList();


        View view=inflater.inflate(R.layout.fragment_course_frgament, container, false);

        recyclerView = view.findViewById(R.id.recyclerview_yourCourse);
        recyclerView1=view.findViewById(R.id.recyclerview_Category);
        recyclerView2=view.findViewById(R.id.recyclerview_Popular);

        recyclerView.setHasFixedSize(true);
        recyclerView1.setHasFixedSize(true);
        recyclerView2.setHasFixedSize(true);

        HorizontalLayout = new LinearLayoutManager(
                view.getContext(),
                LinearLayoutManager.HORIZONTAL,
                false);
        HorizontalLayout1 = new LinearLayoutManager(
                view.getContext(),
                LinearLayoutManager.HORIZONTAL,
                false);
        HorizontalLayout2 = new LinearLayoutManager(
                view.getContext(),
                LinearLayoutManager.HORIZONTAL,
                false);

        recyclerView.setLayoutManager(HorizontalLayout);
        recyclerView1.setLayoutManager(HorizontalLayout1);
        recyclerView2.setLayoutManager(HorizontalLayout2);


        recyclerView.setAdapter(new My_coursesAdapter(list));
        recyclerView1.setAdapter(new CategoryAdapter(category_list));
        recyclerView2.setAdapter(new Adapter_PopularCourse(popular_list));

        return  view;

    }
    private List<String> AddItemsToRecyclerViewArrayList()
    {
        // Adding items to ArrayList
        List<String> list = new ArrayList<>();
        list.add("First Course");
        list.add("Second Course");
        list.add("Third Course");
        list.add("Fourth Course");
        list.add("Fifth Course");
        return list;
    }
    private List<String> AddItemstoCategoryList()
    {
        // Adding items to ArrayList
        List<String> list = new ArrayList<>();
        list.add("Physics");
        list.add("Category 1");
        list.add("Category 2");
        list.add("Category 3");
        list.add("Category 4");
        return list;
    }
    private List<String> AddItemstoPopularList()
    {
        // Adding items to ArrayList
        List<String> list = new ArrayList<>();
        list.add("Trending 1");
        list.add("Trending 2");
        list.add("Trending 3");
        list.add("Trending 4");
        list.add("Trending 5");
        return list;
    }
}