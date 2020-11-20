package com.example.assign;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void loginHandler(View view) {

        EditText editText=findViewById(R.id.name);
        String data = editText.getText().toString();
        Intent intent =new Intent(LoginActivity.this,BasicActivity.class);
        intent.putExtra("name",data);
        startActivity(intent);
    }


}