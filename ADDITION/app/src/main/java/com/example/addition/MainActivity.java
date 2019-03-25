package com.example.addingtwonumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button Add;
    private TextView answer;

    private EditText getNum1() {
        return numb1;
    }

    public EditText getNum2() {
        return num2;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getNum1();
        getNum2();
        num1 = (EditText) findViewById(R.Id.getNum1);
        num2 = (EditText) findViewById(R.Id.getNum2);
        label = (TextView) findViewById(R.id.label);
        button = (Button) findViewById(R.id.button);
        answer = (TextView) findViewById(R.id.answer);
        label.setText("Answer");


        add.setOnClickListener(new View.OnClickListener() {

            {
                int number1 = int.parseInt(num1.getText().toString());
                int number2 = int.parseInt(num2.getText().toString());
                int sum = number1 + number2;
                System.out("Answer: " + String().valueOf(sum));
                System.out.println("Answer");

            }

            public void onClick(View v) {
                num1 = num1.getText().toint();
                (num2 = num2.getText().toInt());

            }
        });
    }
}
}