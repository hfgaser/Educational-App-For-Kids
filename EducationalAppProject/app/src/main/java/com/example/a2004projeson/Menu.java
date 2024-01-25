package com.example.a2004projeson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        String currentname = intent.getStringExtra("username");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageView imageView = findViewById(R.id.Time);
        ImageView imageView2 = findViewById(R.id.Math);
        ImageView imageView3 = findViewById(R.id.Visual);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Time_menu.class);
                intent.putExtra("username",currentname);
                startActivity(intent);
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Math_menu.class);
                intent.putExtra("username",currentname);
                startActivity(intent);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Visual_menu.class);
                intent.putExtra("username",currentname);
                startActivity(intent);
            }
        });

    }






    //    public void time(View view) {
//        Intent it = new Intent(getBaseContext(), Time.class);
//        startActivity(it);
//    }
//
//
//    public void math(View view) {
//        Intent it = new Intent(getBaseContext(), Math.class);
//        startActivity(it);
//    }
//
//
//    public void visual(View view) {
//        Intent it = new Intent(getBaseContext(), Visual.class);
//        startActivity(it);
//    }
}