package com.inti.covidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button stat, voiceToText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stat = (Button) findViewById(R.id.stat2);
        stat.setOnClickListener(this);

        voiceToText = (Button) findViewById(R.id.voiceToSpeech);
        voiceToText.setOnClickListener(this);

        VideoView videoView = findViewById(R.id.video);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        videoView.start();


//        stat.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(MainActivity.this, RetrofitMainActivity.class);
//                startActivity(i);
//            }
//        });
//
//        voiceToText.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(MainActivity.this, voiceToTextActivity.class);
//                startActivity(i);
//            }
//        });



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.stat2:
                startActivity(new Intent(this, RetrofitMainActivity.class));
                break;

            case R.id.voiceToSpeech:
                startActivity(new Intent(this, voiceToTextActivity.class));
                break;
        }
    }
}
