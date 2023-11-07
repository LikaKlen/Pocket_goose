package com.example.pocketgoose;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class StartActivity extends AppCompatActivity {
    ImageButton backStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        backStartButton= findViewById(R.id.startButton);
        backStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
                finish();

            }
        });
    }
    public void openMainActivity(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);

    }
}