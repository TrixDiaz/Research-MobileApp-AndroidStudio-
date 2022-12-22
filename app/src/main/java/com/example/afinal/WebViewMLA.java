package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewMLA extends AppCompatActivity {

    WebView JuniorWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_mla);

        JuniorWebView = findViewById(R.id.MLAWebView);
        JuniorWebView.setWebViewClient(new WebViewClient());
        JuniorWebView.loadUrl("https://docs.google.com/document/d/14V2rwGXQneMTVnps9MetXwN7uOGCj-IifaqOI71WYyE/edit?fbclid=IwAR1vz6aU9GUf-1puaB2CSNiJTRRbcHj88a6PuUlT6C--OV5vbzQv-dcLb14");
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