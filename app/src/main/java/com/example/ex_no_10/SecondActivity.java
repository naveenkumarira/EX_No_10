package com.example.ex_no_10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView outputText = findViewById(R.id.tv_output_text);
        //String inputMessage = getIntent().getExtras().getString(MainActivity.ARG_INPUT_MESSAGE);
//        if(inputMessage != null) {
//            outputText.setText(inputMessage);
//        } else {
//            outputText.setText("Something went wrong!");
//        }
//
    }
}