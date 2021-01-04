package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText first,second;
   Button addbtn;
    private Object OnClickAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first = findViewById(R.id.editTextNumber);
        second = findViewById(R.id.editTextNumber2);
        addbtn = findViewById(R.id.add);


        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1 = first.getText().toString();
                String value2 = second.getText().toString();

                int num1 = Integer.parseInt(value1);
                int num2 = Integer.parseInt(value2);
                double sum = num1 + num2;

                Toast.makeText(MainActivity.this, "addtion of " + String.valueOf(sum), Toast.LENGTH_SHORT).show();
            }
        });
       

    }
}