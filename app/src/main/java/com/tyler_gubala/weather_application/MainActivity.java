package com.tyler_gubala.weather_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    void onPollUpdatesClick() throws MalformedURLException{
        URL path = new URL("https://www.examplewebpage.com");
        HttpsURLConnection
        URLConnection conn = new URLConnection(path) {
            @Override
            public void connect() throws IOException {

            }
        };
    }
}
