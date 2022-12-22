package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Grade12Cmos extends AppCompatActivity {

    private Button back;
    private Button JuniorWebViewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade12_cmos);

        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Grade12Cmos.this,Grade12ReferenceFormat.class);
                startActivity(intent);
            }
        });

        JuniorWebViewButton=findViewById(R.id.JuniorWebViewButton);
        JuniorWebViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Grade12Cmos.this,CmosWebView.class);
                startActivity(intent);
            }
        });
    }
}