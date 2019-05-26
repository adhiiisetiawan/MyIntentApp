package com.example.myintentapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnMove, btnMoveWithData, btnDIal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMove = findViewById(R.id.btn_move_activity);
        btnMove.setOnClickListener(this);

        btnMoveWithData = findViewById(R.id.btn_move_activity_data);
        btnMoveWithData.setOnClickListener(this);

        btnDIal = findViewById(R.id.btn_dial_number);
        btnDIal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent (MainActivity.this, move_activity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_move_activity_data:
                Intent moveWithDataIntent = new Intent(MainActivity.this, MoveWithDataActivity.class);
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME,"Adhi Setiwan");
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE,20);
                startActivity(moveWithDataIntent);
                break;
            case R.id.btn_dial_number:
                String phoneNumber = "082331821877";
                Intent dialPhoneIntent =  new Intent(Intent.ACTION_DIAL, Uri.parse("tel : "+phoneNumber));
                startActivity(dialPhoneIntent);
                break;
        }
    }
}
