package com.example.tempratureconvertor;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.*;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Button ctof,ftoc;
    private TextView result;
    private EditText enterTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ctof = findViewById(R.id.ctof);
        ftoc = findViewById(R.id.ftoc);
        result= findViewById(R.id.result);
        enterTemp = findViewById(R.id.enterTemp);

        ctof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(enterTemp.getText().toString());
                double result0 = (temp*1.8) +32;
                result.setText(String.valueOf(result0));
            }
        });
        ftoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(enterTemp.getText().toString());
                double result0 = (temp-32) /1.8;
                result.setText(String.valueOf(result0));
            }
        });
    }
}