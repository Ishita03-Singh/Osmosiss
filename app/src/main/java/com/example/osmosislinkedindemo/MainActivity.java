package com.example.osmosislinkedindemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView mbottom_navigation;
    ImageView mprofileIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HomeFragment fragment1 = new HomeFragment();
        FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
        fragmentTransaction1.replace(R.id.content, fragment1, "");
        fragmentTransaction1.commit();
        mbottom_navigation=findViewById(R.id.bottom_navigation);
        mprofileIV=findViewById(R.id.UserProfileIV);
        mprofileIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));
                finish();
            }
        });


        mbottom_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull  MenuItem item) {

                switch (item.getItemId())
                {

                    case R.id.HomeNav:
                        HomeFragment fragment1 = new HomeFragment();
                        FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction1.replace(R.id.content, fragment1, "");
                        fragmentTransaction1.commit();
                        return  true;
                    case R.id.NetworkNav:
                        NetworkFragment fragment2 = new NetworkFragment();
                        FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction2.replace(R.id.content, fragment2, "");
                        fragmentTransaction2.commit();
                        return  true;

                    case R.id.PostNav:
                        PostFragment fragment3 = new PostFragment();
                        FragmentTransaction fragmentTransaction3 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction3.replace(R.id.content, fragment3, "");
                        fragmentTransaction3.commit();
                        return  true;
                    case R.id.JobsNav:
                        JobsFragment fragment4 = new JobsFragment();
                        FragmentTransaction fragmentTransaction4 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction4.replace(R.id.content, fragment4, "");
                        fragmentTransaction4.commit();
                        return  true;
                    case R.id.CourseNav:
                        CourseFrgament fragment5 = new CourseFrgament();
                        FragmentTransaction fragmentTransaction5= getSupportFragmentManager().beginTransaction();
                        fragmentTransaction5.replace(R.id.content, fragment5, "");
                        fragmentTransaction5.commit();
                        return  true;


                }
                return false;
            }
        });

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