package com.eighttech.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button paintingButton = (Button) findViewById(R.id.buttonpainting);
        paintingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainPage2.class);
                startActivity(intent);
            }
        });

        Button plumbingButton = (Button) findViewById(R.id.buttonplumbing);
        plumbingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainPage2.class);
                startActivity(intent);
            }
        });

        Button electricalButton = (Button) findViewById(R.id.buttonelectrical);
        electricalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainPage2.class);
                startActivity(intent);
            }
        });

        Button acButton = (Button) findViewById(R.id.buttonac);
        acButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainPage2.class);
                startActivity(intent);
            }
        });

        Button CarpentaryButton = (Button) findViewById(R.id.buttoncarpentary);
        CarpentaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainPage2.class);
                startActivity(intent);
            }
        });

        Button cleaningButton = (Button) findViewById(R.id.buttoncleaning);
        cleaningButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainPage2.class);
                startActivity(intent);
            }
        });






    }
}