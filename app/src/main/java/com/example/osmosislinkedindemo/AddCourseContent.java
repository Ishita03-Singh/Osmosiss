package com.example.osmosislinkedindemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class AddCourseContent extends AppCompatActivity {
    RecyclerView recyclerView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_course_content);
        List<String> list = new ArrayList<>();
        list = getData();


        recyclerView1 = findViewById(R.id.recyclerView_CourseContent);
        recyclerView1.setAdapter(new AdapterCourseContent(list));
    }
    private List<String> getData()
    {
        List<String> list = new ArrayList<>();
        list.add("First Section");
        list.add("Second Section");
        list.add("Third Section");
        list.add("Fourth Section");

        return list;
    }

    public void addSection(View view) {
    }
}