package com.example.myintentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MoveWithDataActivity extends AppCompatActivity {
    public static final String EXTRA_AGE="extra_age";
    public static final String EXTRA_NAME="extra_name";
    TextView hasilMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        hasilMove = findViewById(R.id.data_diterima);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        int age = getIntent().getIntExtra(EXTRA_AGE,0);

        String text = "Name : " +name+",\nYour Age : "+age;
        hasilMove.setText(text);
    }
}
