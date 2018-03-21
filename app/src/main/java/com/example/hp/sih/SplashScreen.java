package com.example.hp.sih;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.felipecsl.gifimageview.library.GifImageView;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class SplashScreen extends AppCompatActivity {
    GifImageView gifView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        gifView = (GifImageView) findViewById(R.id.GifImageView);
        try{
            InputStream inputStream = getAssets().open("river.gif");
            byte[] bytes = IOUtils.toByteArray(inputStream);
            gifView.setBytes(bytes);
            gifView.startAnimation();
        } catch (IOException e) {
            e.printStackTrace();
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SplashScreen.this.startActivity(new Intent(SplashScreen.this,HomePage.class));
                SplashScreen.this.finish();
            }
        },2000);
    }


}
