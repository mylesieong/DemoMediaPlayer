package com.myles.udacity.demomediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.player = MediaPlayer.create(this, R.raw.song);

        final Button playButton = (Button)this.findViewById(R.id.play_button);
        playButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                player.start();
                //Toast.makeText(MainActivity.this, "Play Pressed", Toast.LENGTH_SHORT).show();
            }
        });
        Button pauseButton = (Button)this.findViewById(R.id.pause_button);
        pauseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                player.pause();
                //Toast.makeText(MainActivity.this, "Pause Pressed", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
