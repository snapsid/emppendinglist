package com.example.employabilitytracking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class after3months1 extends AppCompatActivity {
Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after3months1);


        next=findViewById(R.id.button5);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton b1 =  findViewById(R.id.radioButton4);
                RadioButton b2 = findViewById(R.id.radioButton5);
                RadioButton b3 = findViewById(R.id.radioButton7);
                RadioButton b4 = findViewById(R.id.radioButton8);
                RadioButton b5 = findViewById(R.id.radioButton11);
                RadioButton b6 = findViewById(R.id.radioButton12);
                if (b1.isChecked()) {


                    Intent i = new Intent(after3months1.this, Final.class);
                    startActivity(i);
                } else if (b2.isChecked()) {
                    Intent i = new Intent(after3months1.this, currempno.class);
                    startActivity(i);
                } else if (b3.isChecked()) {

                    Intent i = new Intent(after3months1.this, newJobDet.class);
                    startActivity(i);
                } else if (b4.isChecked()) {
                    Intent i = new Intent(after3months1.this, Final.class);
                    startActivity(i);
                }
                else if (b5.isChecked()) {

                    Intent i = new Intent(after3months1.this, SelfEmpYES.class);
                    startActivity(i);
                } else if (b6.isChecked()) {
                    Intent i = new Intent(after3months1.this, SelfEmpNO.class);
                    startActivity(i);
                }
            }
        });
    }
}
