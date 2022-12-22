package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ReferenceList extends AppCompatActivity {

    WebView JuniorWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reference_list);
        JuniorWebView = findViewById(R.id.JuniorWebView);
        JuniorWebView.setWebViewClient(new WebViewClient());
        JuniorWebView.loadUrl("https://docs.google.com/document/d/17PHqY8MhUjvEj2HA8bRS6xEi5n0-4NSsMAI9BktwKmI/mobilebasic?fbclid=IwAR1xl3dnjbhYscqZTAnJ5YYLyzsG_beQpiMZToAIABDzU4ZoSgHmZ6tzDHs");
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