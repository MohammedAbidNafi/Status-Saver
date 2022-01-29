package com.margsapp.statussaver.Activity;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.margsapp.statussaver.R;
import com.google.android.material.appbar.MaterialToolbar;

import java.util.Objects;


public class Privacy_Policy extends AppCompatActivity {

    public MaterialToolbar toolbar;

    private WebView webView;

    String privacy = "https://margsglobal.weebly.com/statussaver-privacy.html";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);

        toolbar = findViewById(R.id.toolbar_privacy_policy);
        toolbar.setTitle(getResources().getString(R.string.privacy_policy));
        setSupportActionBar(toolbar);

        webView = findViewById(R.id.webview);
        webView.loadUrl(privacy);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
