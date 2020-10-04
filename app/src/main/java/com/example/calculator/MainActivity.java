package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private EditText num1;
    private EditText num2;
    private TextView answer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         setup();

         add.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                try {
                    Double value1 = Double.parseDouble(num1.getText().toString());
                    Double value2 = Double.parseDouble(num2.getText().toString());

                    double sum = value1 + value2;
                    answer.setText("Your answer is :" + (sum));
                } catch (NumberFormatException e) {
                  answer.setText("YOU ENTERED INVALID NUMBER");
                }


             }


         });





         sub.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 try {
                     Double value1 = Double.parseDouble(num1.getText().toString());
                     Double value2 = Double.parseDouble(num2.getText().toString());

                     double sub = value1 - value2;
                     answer.setText("Your answer is :" + (sub));
                 } catch (NumberFormatException e) {
                     answer.setText("YOU ENTERED INVALID NUMBER");
                 }


             }
         });



        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Double value1 = Double.parseDouble(num1.getText().toString());
                    Double value2 = Double.parseDouble(num2.getText().toString());

                    double mul = value1 * value2;
                    answer.setText("Your answer is :" + (mul));
                } catch (NumberFormatException e) {
                    answer.setText("YOU ENTERED INVALID NUMBER");
                }


            }
        });




        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Double value1 = Double.parseDouble(num1.getText().toString());
                    Double value2 = Double.parseDouble(num2.getText().toString());

                    double div = value1 / value2;
                    answer.setText("Your answer is :" + (div));
                } catch (NumberFormatException e) {
                    answer.setText("YOU ENTERED INVALID NUMBER");
                }


            }
        });










    }


    public void setup(){

        this.add = findViewById(R.id.btnadd);
        this.sub = findViewById(R.id.btnsub);
        this.mul = findViewById(R.id.btnmul);
        this.div =findViewById(R.id.btndiv);

        this.num1 = findViewById(R.id.enternumb1);
        this.num2 = findViewById(R.id.enternumb2);
        this.answer = findViewById(R.id.textanswer);


    }


}