package com.myapp.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements ListenerDialog{
    //ViewDialog alert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewDialog alert = new ViewDialog();

        Button dig = findViewById(R.id.dialog);
        dig.setOnClickListener(v->{
            alert.showDialog(MainActivity.this,R.layout.custom_dialogbox_otp,this);
        });
    }

    @Override
    public void showDialog() {
        ViewDialog2 alert= new ViewDialog2();
        alert.showDialog(MainActivity.this,R.layout.custom_dialogbox_otp2);
    }
}