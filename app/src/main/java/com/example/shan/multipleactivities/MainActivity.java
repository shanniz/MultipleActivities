package com.example.shan.multipleactivities;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mEditTextUserName, mEditTextPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditTextUserName = findViewById(R.id.editTextUserName);
        mEditTextPassword = findViewById(R.id.editTextPassword);
        //

    }

    public void startNewActivity(View view){


            Intent intent = new Intent(MainActivity.this,
                    SecondActivity.class);
            intent.putExtra("username",
                    mEditTextUserName.getText().toString()
                    );
            startActivityForResult(intent, 2);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        
    }
}
