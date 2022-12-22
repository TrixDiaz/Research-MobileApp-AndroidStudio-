package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResearchEthics extends AppCompatActivity {

    DrawerLayout drawerLayout;
    private Button traditional;
    private Button imrad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research_ethics);

        drawerLayout=findViewById(R.id.drawer_layout);


        traditional=findViewById(R.id.traditional);
        traditional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResearchEthics.this,JuniorTraditionalFormat.class);
                startActivity(intent);
            }
        });

        imrad=findViewById(R.id.imrad);
        imrad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResearchEthics.this,JuniorImradC.class);
                startActivity(intent);
            }
        });


    }
    public void ClickMenu(View view){
        junior.openDrawer(drawerLayout);
    }
    public void ClickLogo(View view){
        junior.closeDrawer(drawerLayout);
    }
    public void Clickhome(View view){
        junior.redirectActivity(this,junior.class);
    }
    public void ClickAboutResearch(View view){
        junior.redirectActivity(this,AboutResearch.class);
    }
    public void clickReferenceList(View view){
        junior.redirectActivity(this,ReferenceList.class);
    }
    public void clickEthicsResearchIndependent(View view){
        junior.redirectActivity(this,JuniorResearchEthics.class);
    }
    public void clickEthicsResearch(View view){
       recreate();
    }
    public void clickReferenceFormat(View view){
        junior.redirectActivity(this,ReferenceFormat.class);
    }
    public void ClickLogout(View view){
        junior.logout(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        junior.closeDrawer(drawerLayout);
    }
}