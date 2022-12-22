package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JuniorImradC extends AppCompatActivity {

    private Button back;
    private Button JuniorWebViewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junior_imrad_c);

        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JuniorImradC.this,ResearchEthics.class);
                startActivity(intent);
            }
        });

        JuniorWebViewButton=findViewById(R.id.JuniorWebView);
        JuniorWebViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JuniorImradC.this,ImradCWebView.class);
                startActivity(intent);
            }
        });
    }
}