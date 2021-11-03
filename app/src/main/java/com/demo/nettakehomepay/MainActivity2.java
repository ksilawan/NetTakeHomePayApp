package com.demo.nettakehomepay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
        TextView displaytotal = (TextView) findViewById(R.id.finalSalary);
        EditText displaydeduction = (EditText) findViewById(R.id.deductionedtxt);

        compute = (Button) findViewById(R.id.btncompute);

        displayname.setText(getIntent().getStringExtra("Name"));
        displaysalary.setText(getIntent().getStringExtra("Salary"));

        compute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float currenttotal = Float.parseFloat(displaysalary.getText().toString());
                float deduction = Float.parseFloat(displaydeduction.getText().toString());
                float finaltotal = currenttotal-deduction;
                displaytotal.setText("Total: " +finaltotal);

            }
        });



    }
}