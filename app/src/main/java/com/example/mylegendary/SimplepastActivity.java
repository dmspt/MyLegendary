package com.example.mylegendary;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class SimplepastActivity extends AppCompatActivity {

    private YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simplepast);

        ImageButton btn_close = findViewById(R.id.btnClose);
        ImageButton btn_next = findViewById(R.id.btnNext);
        TextView txt = findViewById(R.id.txtSim);
        TextView txt2 = findViewById(R.id.txtSim2);
        TextView txt3 = findViewById(R.id.txtSim3);

        Typeface q = Typeface.createFromAsset(getAssets(), "font/Hansville.ttf");
        txt.setTypeface(q);

        Typeface q2 = Typeface.createFromAsset(getAssets(), "font/Hansville.ttf");
        txt2.setTypeface(q2);

        Typeface q3 = Typeface.createFromAsset(getAssets(), "font/Hansville.ttf");
        txt3.setTypeface(q3);

        youTubePlayerView = findViewById(R.id.ytbPlaysimple);
        youTubePlayerView.isFullScreen();
        getLifecycle().addObserver(youTubePlayerView);

        btn_close.setOnClickListener(view -> finish());

        btn_next.setOnClickListener(view -> {
            Intent i = new Intent(SimplepastActivity.this, SimplepastActivity2.class);
            startActivity(i);
        });

    }
}