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

public class Grade11 extends AppCompatActivity {

    DrawerLayout drawerLayout11;
    private Button backtowelcome,AboutPrimer,Works,Contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade11);

        drawerLayout11=findViewById(R.id.drawer11);

        backtowelcome=findViewById(R.id.backtowelcome);
        backtowelcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Grade11.this,welcome.class);
                startActivity(intent);
            }
        });

        AboutPrimer=findViewById(R.id.AboutPrimer);
        AboutPrimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Grade11.this,AboutPrimer.class);
                startActivity(intent);
            }
        });

        Works=findViewById(R.id.Works);
        Works.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Grade11.this,Work.class);
                startActivity(intent);
            }
        });

        Contact=findViewById(R.id.Contact);
        Contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Grade11.this,Contact.class);
                startActivity(intent);
            }
        });
    }
    public void ClickMenu(View view){

        openDrawer(drawerLayout11);
    }

    public static void openDrawer(DrawerLayout drawerLayout) {
        drawerLayout.openDrawer(GravityCompat.START);
    }
    public void ClickLogo(View view){

        closeDrawer(drawerLayout11);
    }

    public static void closeDrawer(DrawerLayout drawerLayout) {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }
    public void Clickhome(View view){
        redirectActivity(this,Grade11.class);
    }
    public void ClickAboutResearch(View view){
        redirectActivity(this,Grade11AboutResearch.class);
    }
    public void clickQualitative(View view){
        redirectActivity(this,QualitativeResearch.class);
    }
    public void clickEthicsResearchIndependent(View view){
        redirectActivity(this,JuniorResearchEthics.class);
    }
    public void clickReferenceFormat(View view){
        redirectActivity(this,Grade11ReferenceFormat.class);
    }
    public void clickReferenceList(View view){
        redirectActivity(this,ReferenceList.class);
    }
    public void ClickLogout(View view)
    {
        logout(this);
    }

    public static void logout(Activity activity) {
        AlertDialog.Builder builder=new AlertDialog.Builder(activity);
        builder.setTitle("Are you sure you want to Logout?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                activity.finishAffinity();
                System.exit(0);
            }
        });
        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.show();
    }

    public static void redirectActivity(Activity activity, Class Class) {
        Intent intent=new Intent(activity,Class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
    }

    @Override
    protected void onPause() {
        super.onPause();
        closeDrawer(drawerLayout11);
    }
}