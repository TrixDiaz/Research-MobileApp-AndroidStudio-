package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ImradCWebView extends AppCompatActivity {

    WebView JuniorWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imrad_cweb_view);

        JuniorWebView = findViewById(R.id.JuniorWebView);
        JuniorWebView.setWebViewClient(new WebViewClient());
        JuniorWebView.loadUrl("https://docs.google.com/document/d/1MbqmoU3KTblzt9yj04KidHHLMiAPlijfoEquDClWSNs/edit?fbclid=IwAR3lQz1TlvJajhyhbWqT5rqbXZ7z9iNqnY99Vgml5ytWymHh0YEJPWa8tyo");

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