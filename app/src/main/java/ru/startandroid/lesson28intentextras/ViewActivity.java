package ru.startandroid.lesson28intentextras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {

    TextView tvView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        //нахожу view по id
        tvView = findViewById(R.id.tvView);
        //получаем intent
        Intent intent = getIntent();
        //создаём переменные типа string и заносим в них intent
        String fname = intent.getStringExtra("fname");
        String lname = intent.getStringExtra("lname");
        //заносим в tvView заданный текст + текст из ранее инициализированных переменных
        tvView.setText("Your name is :" + fname + lname);
    }
}
