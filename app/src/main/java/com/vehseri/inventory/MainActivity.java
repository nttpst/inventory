package com.vehseri.inventory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textHello;
    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setButtonLogin();
    }

    /* method: initialisation of Views */
    private void initViews(){
        textHello = findViewById(R.id.text_hello);
        buttonLogin = findViewById(R.id.button_login);
    }
    /* handle buttonLogin behavior */
    private void setButtonLogin() {
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WorkActivity.class);
                startActivity(intent);
                MainActivity.super.finish();
            }
        });
    }
}
