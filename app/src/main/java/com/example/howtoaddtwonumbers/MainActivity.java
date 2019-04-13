package com.example.howtoaddtwonumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText Num1;
    EditText Num2;
    EditText Total;
    Button btnAdd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Num1 = (EditText) findViewById(R.id.editText1);
        Num2 = (EditText) findViewById(R.id.editText2);
        Total = (EditText) findViewById(R.id.editText3);
        btnAdd = (Button) findViewById(R.id.button);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Num1.getText().toString().length() == 0) {
                    Num1.setText("0");
                }
                    }
                {
                    if (Num2.getText().toString().length() == 0) {
                        Num2.setText("0");
                }

                int Numb1 = Integer.parseInt(Num1.getText().toString());
                int Numb2 = Integer.parseInt(Num2.getText().toString());

                int Total = Num1 + Num2;
                Total.setText(String.valueOf(sum));


            }
        });


    }
    }