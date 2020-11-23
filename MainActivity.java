package com.example.calculator_d;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final TextView tvRez = findViewById(R.id.tv_rez);
       final EditText edit_number_1 = findViewById(R.id.edit_number_1);
       final EditText edit_number_2 = findViewById(R.id.edit_number_2);


        Button btn_div = findViewById(R.id.btn_div);
        Button btn_sub = findViewById(R.id.btn_sub);
        Button btn_mult = findViewById(R.id.btn_mult);
        Button btn_add  = findViewById(R.id.btn_add);


        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int number1 = Integer.parseInt(edit_number_1.getText().toString());

                int number2 = Integer.parseInt(edit_number_2.getText().toString());

                int rez = number1 + number2;

                tvRez.setText(String.valueOf(rez));


            }
        });
 btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int number1 = Integer.parseInt(edit_number_1.getText().toString());

                int number2 = Integer.parseInt(edit_number_2.getText().toString());

                int rez = number1- number2;

                tvRez.setText(String.valueOf(rez));


            }
        });
 btn_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int number1 = Integer.parseInt(edit_number_1.getText().toString());

                int number2 = Integer.parseInt(edit_number_2.getText().toString());

                int rez = number1 * number2;

                tvRez.setText(String.valueOf(rez));


            }
        });


                    btn_div.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view)
                        { try {

                            int number1 = Integer.parseInt(edit_number_1.getText().toString());

                            int number2 = Integer.parseInt(edit_number_2.getText().toString());

                            int rez = number1 + number2;

                            tvRez.setText(String.valueOf(rez));
                        } catch (Exception ex )
                {
                    Toast.makeText(MainActivity.this,"Divide By Zero" , Toast.LENGTH_SHORT).show();
                }
        }
 });
    }
}



