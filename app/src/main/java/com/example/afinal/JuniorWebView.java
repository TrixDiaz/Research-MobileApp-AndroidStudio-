package com.example.afinal;

import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class JuniorWebView extends AppCompatActivity {

     WebView JuniorWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junior_web_view);

        JuniorWebView = findViewById(R.id.JuniorWebView);
        JuniorWebView.setWebViewClient(new WebViewClient());
        JuniorWebView.loadUrl("https://docs.google.com/document/d/1X5VHHeRmuxA5wi6yP-Pf1kdq-J9ABnjiIS93trOVhMY/edit?fbclid=IwAR3XbswhIOhKkhNUEntFbneUIFdFDCpb6LXX-074kvTW9W07eWcL1YK7uts");

        WebSettings settings = JuniorWebView.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed(){
        if(JuniorWebView.canGoBack())
        {
            JuniorWebView.goBack();
        }
        else
        {
            super.onBackPressed();
        }

    }
}