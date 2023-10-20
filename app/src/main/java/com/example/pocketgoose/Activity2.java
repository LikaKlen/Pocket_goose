package com.example.pocketgoose;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
public class Activity2 extends AppCompatActivity {
    ImageButton buttonActive2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        buttonActive2= findViewById(R.id.buttonActive2);
        buttonActive2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });
    }
    public void openMainActivity(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);

    }
}