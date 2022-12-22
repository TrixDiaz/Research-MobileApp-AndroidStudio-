package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class welcome extends AppCompatActivity {

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        spinner = findViewById(R.id.spinner);

        List<String> categories = new ArrayList<>();
        categories.add(0, "Choose Category");
        categories.add("Junior High School");
        categories.add("Grade 11");
        categories.add("Grade 12");

        //Style and populate spinner
        ArrayAdapter<String> dataAdapter;
        dataAdapter =  new ArrayAdapter(this, android.R.layout.simple_spinner_item,categories);

        //Dropdown style
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {

                if(parent.getItemAtPosition(position).equals("     Choose Category     "))
                {
                    // do nothing
                }
                else
                {
                    //On selecting a spinner item
                    String item = parent.getItemAtPosition(position).toString();

                    //show selected spinner item
                    Toast.makeText(parent.getContext(), "Selected: " + item,Toast.LENGTH_SHORT).show();

                    //anything else that you want to do on selected spinner
                    if(parent.getItemAtPosition(position).equals("Junior High School"))
                    {
                        Intent intent = new Intent(welcome.this, junior.class);
                        startActivity(intent);
                    }
                    else if(parent.getItemAtPosition(position).equals("Grade 11"))
                    {
                        Intent intent = new Intent(welcome.this, Grade11.class);
                        startActivity(intent);
                    }
                    else if(parent.getItemAtPosition(position).equals("Grade 12"))
                    {
                        Intent intent = new Intent(welcome.this, Grade12.class);
                        startActivity(intent);
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

                //TODO Auto-generated method stub
            }
        });

    }
}