package com.example.a2004projeson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fourthOneClockActivity extends AppCompatActivity {

    private Button buttonN,buttonB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_one_clock);

        buttonB = findViewById(R.id.back_button);
        buttonN = findViewById(R.id.next_button);

        buttonN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fourthOneClockActivity.this, fifthClockActivity.class);
                startActivity(intent);
                finish();
            }
        });

        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fourthOneClockActivity.this, fourthClockActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}