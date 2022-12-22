package com.example.afinal;

import static com.example.afinal.Grade12.redirectActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Grade12AboutResearch extends AppCompatActivity {

    DrawerLayout drawerLayout12;
    private Button introduction12;
    private Button characteristics12;
    private Button process12;
    private Button research12;
    private Button purpose12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade12_about_research);

        drawerLayout12=findViewById(R.id.drawer_layout12);

        introduction12=findViewById(R.id.introduction12);
        introduction12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Grade12AboutResearch.this,Grade12Introduction.class);
                startActivity(intent);
            }
        });

        characteristics12=findViewById(R.id.characteristics12);
        characteristics12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Grade12AboutResearch.this,Grade12Characteristics .class);
                startActivity(intent);
            }
        });

        process12=findViewById(R.id.process12);
        process12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Grade12AboutResearch.this,Grade12Process .class);
                startActivity(intent);
            }
        });

        research12=findViewById(R.id.research12);
        research12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Grade12AboutResearch.this,Grade12Research.class);
                startActivity(intent);
            }
        });

        purpose12=findViewById(R.id.purpose12);
        purpose12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Grade12AboutResearch.this,Grade12Purpose.class);
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
        redirectActivity(this,Grade12.class);
    }
    public void ClickAboutResearch(View view){
        redirectActivity(this,QuantitativeResearch.class);
    }
    public void clickEthicsResearchIndependent(View view){
        redirectActivity(this,JuniorResearchEthics.class);
    }
    public void clickQuantitative(View view){
        redirectActivity(this,Grade12AboutResearch.class);
    }
    public void clickReferenceFormat(View view){
        redirectActivity(this,Grade12ReferenceFormat.class);
    }
    public void clickReferenceList(View view){
        redirectActivity(this,ReferenceList.class);
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