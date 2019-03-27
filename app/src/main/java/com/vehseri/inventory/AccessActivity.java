package com.vehseri.inventory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AccessActivity extends AppCompatActivity {

    TextView textInstructions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access);

        textInstructions = findViewById(R.id.instructions_access);
    }
}
