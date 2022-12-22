package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ReferenceFormat extends AppCompatActivity {

    DrawerLayout drawerLayout;
    private Button Juniorapa;
    private Button JuniorCmos;
    private Button Juniormla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reference_format);

        drawerLayout=findViewById(R.id.drawer_layout);

        Juniorapa=findViewById(R.id.Juniorapa);
        Juniorapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReferenceFormat.this,JuniorApa.class);
                startActivity(intent);
            }
        });

        JuniorCmos=findViewById(R.id.Juniorcmos);
        JuniorCmos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReferenceFormat.this,JuniorCmos.class);
                startActivity(intent);
            }
        });

        Juniormla=findViewById(R.id.Juniormla);
        Juniormla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReferenceFormat.this,JuniorMla.class);
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
    public void clickEthicsResearchIndependent(View view){
        junior.redirectActivity(this,JuniorResearchEthics.class);
    }
    public void clickReferenceList(View view){
        junior.redirectActivity(this,ReferenceList.class);
    }

    public void ClickAboutResearch(View view){

        junior.redirectActivity(this,AboutResearch.class);
    }
    public void clickEthicsResearch(View view){
        junior.redirectActivity(this,ResearchEthics.class);
    }
    public void clickReferenceFormat(View view){
        recreate();
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