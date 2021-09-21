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
         Bundle extras = getIntent().getExtras();
        if(extras != null) {
            String inputMessage = extras.getString(MainActivity.ARG_INPUT_MESSAGE);
            outputText.setText(inputMessage);
        } else {
            outputText.setText("Something went wrong!");
        }
    }
}