package com.vehseri.inventory;

import android.os.Bundle;
import android.widget.TextView;

public class AccessActivity extends WorkActivity {

    TextView textInstructions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access);

        textInstructions = findViewById(R.id.instructions_access);
    }
}
