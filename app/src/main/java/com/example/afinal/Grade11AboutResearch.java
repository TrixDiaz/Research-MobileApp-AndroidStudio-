package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Grade11AboutResearch extends AppCompatActivity {

    DrawerLayout drawerLayout11;
    private Button introduction11;
    private Button characteristics11;
    private Button process11;
    private Button research11;
    private Button purpose11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade11_about_research);


        drawerLayout11=findViewById(R.id.drawer_layout11);

        introduction11=findViewById(R.id.introduction11);
        introduction11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Grade11AboutResearch.this,Grade11Introduction.class);
                startActivity(intent);
            }
        });

        characteristics11=findViewById(R.id.characteristics11);
        characteristics11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Grade11AboutResearch.this,Grade11Characteristics.class);
                startActivity(intent);
            }
        });

        process11=findViewById(R.id.process11);
        process11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Grade11AboutResearch.this,Grade11Process.class);
                startActivity(intent);
            }
        });

        research11=findViewById(R.id.research11);
        research11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Grade11AboutResearch.this,Grade11Research.class);
                startActivity(intent);
            }
        });

        purpose11=findViewById(R.id.purpose11);
        purpose11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Grade11AboutResearch.this,Grade11Purpose.class);
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
        recreate();
    }
    public void clickQualitative(View view){
        Grade11.redirectActivity(this,QualitativeResearch.class);
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