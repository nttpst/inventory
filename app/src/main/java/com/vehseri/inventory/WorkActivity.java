package com.vehseri.inventory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class WorkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);
    }
    /* menu creating */
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        switch (id) {
            case R.id.menuItemInventory: {
                Intent intent = new Intent(WorkActivity.this, InventoryActivity.class);
                startActivity(intent);
                this.finish();
                return true;
            }
            case R.id.menuItemAccess: {
                Intent intent = new Intent(WorkActivity.this, AccessActivity.class);
                startActivity(intent);
                this.finish();
                return true;
            }
            case R.id.menuItemAbout: {
                Toast.makeText(this, "Автор. Версия. Связь", Toast.LENGTH_LONG).show();
                return true;
            }
            case R.id.menuItemExit: {
                WorkActivity.super.finish();
                return true;
            }
            default:{
                return false;
            }
        }
    }
}