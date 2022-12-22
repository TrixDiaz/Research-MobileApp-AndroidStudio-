package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QualitativeResearch extends AppCompatActivity {

    DrawerLayout drawerLayout11;
    private Button introduction;
    private Button application;
    private Button process;
    private Button research;
    private Button purpose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qualitative_research);

        drawerLayout11=findViewById(R.id.drawer_layout11);

        introduction=findViewById(R.id.introduction);
        introduction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QualitativeResearch.this,Grade11QualitativeResearchIntroduction.class);
                startActivity(intent);
            }
        });

        application=findViewById(R.id.application);
        application.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QualitativeResearch.this,Grade11Application.class);
                startActivity(intent);
            }
        });

        process=findViewById(R.id.process);
        process.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QualitativeResearch.this,Grade11CharacteristicsResearch.class);
                startActivity(intent);
            }
        });

        research=findViewById(R.id.research);
        research.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QualitativeResearch.this,Grade11Strenghts.class);
                startActivity(intent);
            }
        });

        purpose=findViewById(R.id.purpose);
        purpose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QualitativeResearch.this,Grade11Proper.class);
                startActivity(intent);
            }
        });
    }

    public void ClickMenu(View view){
        Grade11.openDrawer(drawerLayout11);
    }
    public void ClickLogo(View view){
        Grade11.closeDrawer(drawerLayout11);
    }
    public void Clickhome(View view){
        Grade11.redirectActivity(this,Grade11.class);
    }
    public void clickEthicsResearchIndependent(View view){
        Grade11.redirectActivity(this,JuniorResearchEthics.class);
    }
    public void ClickAboutResearch(View view){
        Grade11.redirectActivity(this,Grade11AboutResearch.class);
    }
    public void clickQualitative(View view){
        recreate();
    }
    public void clickReferenceFormat(View view){
        Grade11.redirectActivity(this,Grade11ReferenceFormat.class);
    }
    public void clickReferenceList(View view){
        Grade11.redirectActivity(this,ReferenceList.class);
    }
    public void ClickLogout(View view){
        Grade11.logout(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Grade11.closeDrawer(drawerLayout11);
    }
}