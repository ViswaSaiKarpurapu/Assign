package com.example.assign;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

public class SignActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        TextView textView=findViewById(R.id.textres);
        textView.setText("Logined As:\n"+name);

    }

    public void WeatherHandler(View view) {

        Intent sintent = new Intent(SignActivity.this,Main.class) ;


        startActivity(sintent);
    }
}