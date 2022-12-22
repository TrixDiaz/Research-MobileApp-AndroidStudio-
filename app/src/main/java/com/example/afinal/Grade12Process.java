package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Grade12Process extends AppCompatActivity {

    private Button back;
    private Button JuniorWebViewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade12_process);

        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Grade12Process.this,Grade12AboutResearch.class);
                startActivity(intent);
            }
        });

        JuniorWebViewButton=findViewById(R.id.JuniorWebViewButton);
        JuniorWebViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Grade12Process.this,Grade12Chapter3.class);
                startActivity(intent);
            }
        });
    }
}