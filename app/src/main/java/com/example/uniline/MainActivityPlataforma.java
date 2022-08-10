package com.example.uniline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivityPlataforma extends AppCompatActivity {

    WebView mywebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_plataforma);

        WebView webView = (WebView) findViewById(R.id.plataforma);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);






        mywebview = findViewById(R.id.plataforma);

        mywebview.setWebViewClient(new WebViewClient());

        mywebview.loadUrl("https://virtualunivalle.online/");


    }

    @Override
    public void onBackPressed() {

        if (mywebview.canGoBack()){
            mywebview.goBack();



        } else{
            super.onBackPressed();
        }

    }

}