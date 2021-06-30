package com.example.analyse_lifecycle_methods_25june;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private String Tag = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(Tag,"OnCreate");
        //finish();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(Tag, "OnRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Tag,"OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(Tag,"OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(Tag,"OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Tag,"OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Tag,"OnDestroy");
    }
}