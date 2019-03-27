package com.vehseri.inventory;

import android.os.Bundle;
import android.widget.TextView;

public class InventoryActivity extends WorkActivity {

    TextView textInstructions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);

        textInstructions = findViewById(R.id.instructions_inventory);

    }


}
