package com.example.viewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         //создание TextView
        TextView textView = new TextView(this);
        // Установка текста в ViewText
        textView.setText("Get happy");

        //Установка высоты текста
        textView.setTextSize(62);

        // установка визуального интерфейса для activity
        setContentView(textView);


    }
}