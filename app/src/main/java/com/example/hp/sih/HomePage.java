package com.example.hp.sih;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.felipecsl.gifimageview.library.GifImageView;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class HomePage extends AppCompatActivity {

    Button guestUser;
    Button authorityLogin;
    //ImageView chakra;
    GifImageView gifView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        guestUser = (Button)findViewById(R.id.GuestUser);
        authorityLogin = (Button)findViewById(R.id.AuthorityLogin);
        //chakra = (ImageView)findViewById(R.id.chakra);
         gifView = (GifImageView) findViewById(R.id.GifImageView);
        //gifImageView.setGifImageResource(R.drawable.chakra);
       // gifImageView.setGifImageUri(uri);
        //gifView = (GifImageView) findViewById(R.id.gifImageView);
        try{
            InputStream inputStream = getAssets().open("chakra.gif");
            byte[] bytes = IOUtils.toByteArray(inputStream);
            gifView.setBytes(bytes);
            gifView.startAnimation();
        } catch (IOException e) {
            e.printStackTrace();
        }


        guestUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this,MainActivity.class);
                startActivity(intent);
            }
        });

        authorityLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(HomePage.this,Auth_login.class);
                startActivity(intent2);
            }
        });
    }



}
