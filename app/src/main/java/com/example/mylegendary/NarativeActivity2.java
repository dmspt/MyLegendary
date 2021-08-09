package com.example.mylegendary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class NarativeActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_narative2);

        ImageButton btn_close = findViewById(R.id.btnClose);
        ImageButton btn_back = findViewById(R.id.btnBack);
        ImageButton btn_next = findViewById(R.id.btnNext);
        TextView txt = findViewById(R.id.txtNara);
        TextView txt2 = findViewById(R.id.txtNar2);

        Typeface q = Typeface.createFromAsset(getAssets(), "font/Hansville.ttf");
        txt.setTypeface(q);

        Typeface q2 = Typeface.createFromAsset(getAssets(), "font/Hansville.ttf");
        txt2.setTypeface(q2);

        btn_close.setOnClickListener(view -> finish());

        btn_back.setOnClickListener(view -> finish());

        btn_next.setOnClickListener(view -> {
            Intent i = new Intent(NarativeActivity2.this, NarativeActivity3.class);
            startActivity(i);
        });

    }
}