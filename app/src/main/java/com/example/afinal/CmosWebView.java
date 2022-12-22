package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CmosWebView extends AppCompatActivity {

    WebView JuniorWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmos_web_view);

        JuniorWebView = findViewById(R.id.CmosWebView);
        JuniorWebView.setWebViewClient(new WebViewClient());
        JuniorWebView.loadUrl("https://docs.google.com/document/d/1sQTzSFpGRZtjMVqZwmJkEgOXloIojv1flYMuMo58pdY/edit?fbclid=IwAR2CxsFyIH-10Etg_gWUnCgWZCRbp3NOvaoGTqQrZMUxuS_2T59gxEC2Xks#heading=h.4hcmifg9rdbn");
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