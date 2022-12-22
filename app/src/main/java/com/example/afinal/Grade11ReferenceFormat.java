package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Grade11ReferenceFormat extends AppCompatActivity {

    DrawerLayout drawerLayout11;
    private Button Juniorapa;
    private Button JuniorCmos;
    private Button Juniormla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade11_reference_format);

        drawerLayout11=findViewById(R.id.drawer_layout11);

        Juniorapa=findViewById(R.id.Juniorapa);
        Juniorapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Grade11ReferenceFormat.this,Grade11Apa.class);
                startActivity(intent);
            }
        });

        JuniorCmos=findViewById(R.id.Juniorcmos);
        JuniorCmos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Grade11ReferenceFormat.this,Grade11Cmos.class);
                startActivity(intent);
            }
        });

        Juniormla=findViewById(R.id.Juniormla);
        Juniormla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Grade11ReferenceFormat.this,Grade11MLA.class);
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
    public void clickReferenceList(View view){
        Grade11.redirectActivity(this,ReferenceList.class);
    }
    public void clickQualitative(View view){
        Grade11.redirectActivity(this,QualitativeResearch.class);
    }
    public void clickReferenceFormat(View view){
        recreate();
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