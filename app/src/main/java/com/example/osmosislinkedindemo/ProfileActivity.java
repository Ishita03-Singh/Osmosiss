package com.example.osmosislinkedindemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.DateFormat;
import java.util.Calendar;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
    public void showAlertDialogButtonClicked(View view)
    {

        // Create an alert builder
        AlertDialog.Builder builder
                = new AlertDialog.Builder(this);
        builder.setTitle("Add Education");

        // set the custom layout
        final View customLayout
                = getLayoutInflater()
                .inflate(
                        R.layout.new_education,
                        null);
        builder.setView(customLayout);

        // add a button
        builder
                .setPositiveButton(
                        "Save",
                        new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(
                                    DialogInterface dialog,
                                    int which)
                            {

                                // send data from the
                                // AlertDialog to the Activity
                                EditText m=findViewById(R.id.Start_dateTV);

                            }
                        });

        // create and show
        // the alert dialog
        AlertDialog dialog
                = builder.create();
        dialog.show();
    }
    public void showAlertDialogButtonClickedExperience(View view)
    {

        // Create an alert builder
        AlertDialog.Builder builder
                = new AlertDialog.Builder(this);
        builder.setTitle("Add Experience");

        // set the custom layout
        final View customLayout
                = getLayoutInflater()
                .inflate(
                        R.layout.new_experience,
                        null);
        builder.setView(customLayout);

        // add a button
        builder
                .setPositiveButton(
                        "Save",
                        new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(
                                    DialogInterface dialog,
                                    int which)
                            {

                                // send data from the
                                // AlertDialog to the Activity

                            }
                        });

        // create and show
        // the alert dialog
        AlertDialog dialog
                = builder.create();
        dialog.show();
    }
    public void showAlertDialogButtonClickedProjects(View view)
    {

        // Create an alert builder
        AlertDialog.Builder builder
                = new AlertDialog.Builder(this);
        builder.setTitle("Add Project");

        // set the custom layout
        final View customLayout
                = getLayoutInflater()
                .inflate(
                        R.layout.new_project,
                        null);
        builder.setView(customLayout);

        // add a button
        builder
                .setPositiveButton(
                        "Save",
                        new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(
                                    DialogInterface dialog,
                                    int which)
                            {

                                // send data from the
                                // AlertDialog to the Activity
                                EditText m=findViewById(R.id.Start_dateTV);

                            }
                        });

        // create and show
        // the alert dialog
        AlertDialog dialog
                = builder.create();
        dialog.show();
    }
    public void showAlertDialogButtonClickedUserDetail(View view)
    {

        // Create an alert builder
        AlertDialog.Builder builder
                = new AlertDialog.Builder(this);
        builder.setTitle("Edit User Details");

        // set the custom layout
        final View customLayout
                = getLayoutInflater()
                .inflate(
                        R.layout.edit_uerdetail,
                        null);
        builder.setView(customLayout);

        // add a button
        builder
                .setPositiveButton(
                        "Save",
                        new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(
                                    DialogInterface dialog,
                                    int which)
                            {

                                // send data from the
                                // AlertDialog to the Activity
                                EditText m=findViewById(R.id.Start_dateTV);

                            }
                        });

        // create and show
        // the alert dialog
        AlertDialog dialog
                = builder.create();
        dialog.show();
    }


}