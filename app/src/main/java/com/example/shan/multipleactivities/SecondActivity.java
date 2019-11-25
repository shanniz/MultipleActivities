package com.example.shan.multipleactivities;

import android.app.Application;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String uname = getIntent().getStringExtra("username");
        Toast.makeText(SecondActivity.this,
                uname,
                Toast.LENGTH_LONG).show();
    }

    public void returnToMain(View view){
        Intent intent = new Intent();
        intent.putExtra("message",
                "Welcome " + getIntent().getStringExtra("username"));
        setResult(RESULT_OK, intent);

        finish();
    }

}
