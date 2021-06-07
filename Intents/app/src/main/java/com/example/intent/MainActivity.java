package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.lang.UProperty;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button call;
    Button website;
    Button sActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        call = findViewById(R.id.call);
        website = findViewById(R.id.website);
        sActivity = findViewById(R.id.second_activity);

    }
    

    public void dial(View view) {
        Uri uri = Uri.parse("tel:+92324218199");
        Intent intent = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(intent);
    }


    public void OpenSecondActivity(View view) {
        Intent intent = new Intent(MainActivity.this, second_activity.class);
        startActivity(intent);
    }

    public void openWebsite(View view) {
        Uri uri = Uri.parse("https://www.pucit.edu.pk");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}