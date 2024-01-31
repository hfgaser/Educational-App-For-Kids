package com.example.a2004projeson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fourthSeasonActivity extends AppCompatActivity {

    private Button buttonN,buttonB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        String currentname = intent.getStringExtra("username");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_season);

        buttonN = findViewById(R.id.next_button);
        buttonB = findViewById(R.id.back_button);

        buttonN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fourthSeasonActivity.this, fifthSeasonActivity.class);
                intent.putExtra("username",currentname);
                startActivity(intent);
            }
        });

        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fourthSeasonActivity.this, thirdSeasonActivity.class);
                intent.putExtra("username",currentname);
                startActivity(intent);
            }
        });
    }
}