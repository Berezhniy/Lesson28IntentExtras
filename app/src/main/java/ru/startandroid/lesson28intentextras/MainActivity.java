package ru.startandroid.lesson28intentextras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText etFName;
    EditText etLName;

    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //нахожу элементы по id
        etFName = findViewById(R.id.etFName);
        etLName = findViewById(R.id.etLName);

        btnSubmit = findViewById(R.id.btnSubmit);
        //вешаю на view слушатель
        btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //создаю и инициализирую intent указываю из какой и в какую вью необходимо сделать переход
        Intent intent = new Intent(this, ViewActivity.class);
        //кладу в intent текст из поля etFName в формате String
        intent.putExtra("fname", etFName.getText().toString());
        //кладу в intent текст из поля etLName в формате String
        intent.putExtra("lname", etLName.getText().toString());
        //стартую следующую активити передаваю в неё intent
        startActivity(intent);
    }
}
