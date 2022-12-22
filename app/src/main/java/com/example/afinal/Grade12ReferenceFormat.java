package com.example.afinal;

import static com.example.afinal.Grade12.redirectActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Grade12ReferenceFormat extends AppCompatActivity {

    DrawerLayout drawerLayout12;
    private Button grade12apa;
    private Button Grade12Cmos;
    private Button Grade12Mla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade12_reference_format);

        drawerLayout12=findViewById(R.id.drawer_layout12);

        grade12apa=findViewById(R.id.grade12apa);
        grade12apa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Grade12ReferenceFormat.this,Grade12Apa.class);
                startActivity(intent);
            }
        });


        Grade12Cmos=findViewById(R.id.Grade12Cmos);
        Grade12Cmos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Grade12ReferenceFormat.this,Grade12Cmos.class);
                startActivity(intent);
            }
        });


        Grade12Mla=findViewById(R.id.Grade12Mla);
        Grade12Mla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Grade12ReferenceFormat.this,Grade12Mla.class);
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
    public void clickReferenceList(View view){
        Grade12.redirectActivity(this,ReferenceList.class);
    }
    public void clickEthicsResearchIndependent(View view){
        redirectActivity(this,JuniorResearchEthics.class);
    }
    public void clickReferenceFormat(View view){
        recreate();
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