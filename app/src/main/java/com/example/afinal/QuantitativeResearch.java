package com.example.afinal;

import static com.example.afinal.Grade12.redirectActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuantitativeResearch extends AppCompatActivity {

    DrawerLayout drawerLayout12;
    private Button introduction;
    private Button application;
    private Button characteristics;
    private Button strength;
    private Button nature;
    private Button research;
    private Button experimental;
    private Button proper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quantitative_research);

        drawerLayout12=findViewById(R.id.drawer_layout12);

        introduction=findViewById(R.id.introduction);
        introduction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuantitativeResearch.this,Grade12QuantitativeAboutResearch.class);
                startActivity(intent);
            }
        });

        application=findViewById(R.id.application);
        application.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuantitativeResearch.this,Grade12QuantitativeApplication.class);
                startActivity(intent);
            }
        });

        characteristics=findViewById(R.id.characteristics);
        characteristics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuantitativeResearch.this,Grade12QuantitativeCharacteristics.class);
                startActivity(intent);
            }
        });

        strength=findViewById(R.id.strength);
        strength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuantitativeResearch.this,Grade12QuantitativeStrengths.class);
                startActivity(intent);
            }
        });

        experimental=findViewById(R.id.experimental);
        experimental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuantitativeResearch.this,Grade12QuantitativeExperimental.class);
                startActivity(intent);
            }
        });


        nature=findViewById(R.id.nature);
        nature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuantitativeResearch.this,Grade12QuantitativeNature.class);
                startActivity(intent);
            }
        });

        research=findViewById(R.id.research);
        research.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuantitativeResearch.this,Grade12QuantitativeDesign.class);
                startActivity(intent);
            }
        });

        proper=findViewById(R.id.proper);
        proper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuantitativeResearch.this,Grade12QuantitativeProper.class);
                startActivity(intent);
            }
        });

    }

    public void ClickMenu(View view){
        Grade12.openDrawer(drawerLayout12);
    }
    public void ClickLogo(View view){
        Grade12.closeDrawer(drawerLayout12);
    }
    public void Clickhome(View view){
        Grade12.redirectActivity(this,Grade12.class);
    }
    public void ClickAboutResearch(View view){
        Grade12.redirectActivity(this,QuantitativeResearch.class);
    }
    public void clickQuantitative(View view){
        Grade12.redirectActivity(this,Grade12AboutResearch.class);
    }
    public void clickEthicsResearchIndependent(View view){
        redirectActivity(this,JuniorResearchEthics.class);
    }
    public void clickReferenceFormat(View view){
        Grade12.redirectActivity(this,Grade12ReferenceFormat.class);
    }
    public void clickReferenceList(View view){
        Grade12.redirectActivity(this,ReferenceList.class);
    }
    public void ClickLogout(View view){
        Grade12.logout(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Grade12.closeDrawer(drawerLayout12);
    }
}