package com.example.a2004projeson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class firstClockActivity extends AppCompatActivity {

    private Button buttonN,buttonB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_clock);
        buttonN = findViewById(R.id.next_button);
        buttonB = findViewById(R.id.back_button);

        buttonN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(firstClockActivity.this, secondClockActivity.class);
                startActivity(intent);

            }
        });
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(firstClockActivity.this, Time_menu.class);
                startActivity(intent);

            }
        });
    }
}