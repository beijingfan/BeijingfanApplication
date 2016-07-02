package com.example.fanzhigang.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToastPopularMovie(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Popular Movie Message", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showToastStockHawk(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Stock Hawk Message", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showToastBuildItBigger(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Build It Bigger Message", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showToastMakeYourAppMaterial(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Make Your App Material Message", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showToastGoUBIQuitous(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Go UBIQuitous Message", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void  showToastCapstone(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Capstone Message", Toast.LENGTH_SHORT);
        toast.show();
    }
}
