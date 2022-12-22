package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutResearch extends AppCompatActivity {

    DrawerLayout drawerLayout;
    private Button introduction;
    private Button characteristics;
    private Button process;
    private Button research;
    private Button purpose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_research);

        drawerLayout=findViewById(R.id.drawer_layout);

        introduction=findViewById(R.id.introduction);
        introduction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutResearch.this,JuniorIntroduction.class);
                startActivity(intent);
            }
        });

        characteristics=findViewById(R.id.characteristics);
        characteristics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutResearch.this,JuniorCharacteristics.class);
                startActivity(intent);
            }
        });

        process=findViewById(R.id.process);
        process.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutResearch.this,JuniorProcess.class);
                startActivity(intent);
            }
        });

        research=findViewById(R.id.research);
        research.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutResearch.this,JuniorResearch.class);
                startActivity(intent);
            }
        });

        purpose=findViewById(R.id.purpose);
        purpose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutResearch.this,JuniorPurpose.class);
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
        recreate();
    }
    public void clickEthicsResearch(View view){
        junior.redirectActivity(this,ResearchEthics.class);
    }
    public void clickEthicsResearchIndependent(View view){
        junior.redirectActivity(this,JuniorResearchEthics.class);
    }
    public void clickReferenceFormat(View view){
        junior.redirectActivity(this,ReferenceFormat.class);
    }
    public void clickReferenceList(View view){
        junior.redirectActivity(this,ReferenceList.class);
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