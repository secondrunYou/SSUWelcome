package com.example.admin.ssuwelcome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sellerclick(View v)
    {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void buyerclick(View v)
    {
        Intent intent = new Intent(this, CategoryActivity.class);
        startActivity(intent);
    }
}
