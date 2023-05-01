package com.example.yangiliklar24;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar ( ).hide ( );
        new Handler ( ).postDelayed ( new Runnable ( ) {
            @Override
            public void run() {
                Intent intent=new Intent ( SplashActivity.this , MainActivity.class );
                startActivity ( intent );
            }
        } , 2000 );

    }
}