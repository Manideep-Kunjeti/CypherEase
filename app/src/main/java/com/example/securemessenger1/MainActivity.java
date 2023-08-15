package com.example.securemessenger1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rsa(View view) {
        Intent intent = new Intent( MainActivity.this, RSA.class  );
        startActivity(intent);
    }

    public void des(View view) {
        Intent intent = new Intent( MainActivity.this, DES.class  );
        startActivity(intent);
    }

    public void aes(View view) {
        Intent intent = new Intent( MainActivity.this, AES.class  );
        startActivity(intent);
    }
}