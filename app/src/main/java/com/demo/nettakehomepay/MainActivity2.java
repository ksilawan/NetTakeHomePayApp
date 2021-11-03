package com.demo.nettakehomepay;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    Button compute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView displayname = (TextView) findViewById(R.id.nametvtxt);
        TextView displaysalary = (TextView) findViewById(R.id.salarytvtxt);
        EditText displaydeduction = (EditText) findViewById(R.id.deductionedtxt);

        compute = (Button) findViewById(R.id.btncompute);

        displayname.setText(getIntent().getStringExtra("Name"));
        displaysalary.setText(getIntent().getStringExtra("Salary"));





    }
}