package com.example.wesfood;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class profil  extends AppCompatActivity {
    ImageView notif;
    LinearLayout fb1,fb2,fb3,fb4,fb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        notif=findViewById(R.id.notif);
        fb1=findViewById(R.id.fb1);
        fb2=findViewById(R.id.fb2);
        fb3 = findViewById(R.id.fb3);
        fb4 = findViewById(R.id.fb4);
        fb5=findViewById(R.id.fb5);


       notif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),user.class);
                startActivity(i);
            }
        });
        fb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"));
                startActivity(j);
            }
        });
        fb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com"));
                startActivity(j);
            }
        });
        fb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com"));
                startActivity(j);
            }
        });
        fb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gmail.com"));
                startActivity(j);
            }
        });

        fb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),tel.class);
                startActivity(i);
            }
        });



    }
}
