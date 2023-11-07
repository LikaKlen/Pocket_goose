package com.example.pocketgoose;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;

public class Settings extends AppCompatActivity {
    ImageButton buttonSet;
    SeekBar seekBar;
    AudioManager audioManager;
    int maxVolume;
    int currentVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        buttonSet= findViewById(R.id.buttonSettings);
        buttonSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
                finish();
            }
        });
        audioManager=(AudioManager) getSystemService(AUDIO_SERVICE);
        maxVolume=audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        currentVolume=audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        seekBar =(SeekBar) findViewById(R.id.volumeSeekBar);
        seekBar.setMax(maxVolume);
        seekBar.setProgress(currentVolume);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



    }
    public void openMainActivity(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);

    }


}