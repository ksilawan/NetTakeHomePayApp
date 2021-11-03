package com.demo.nettakehomepay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText nameedtxt;
    EditText salaryedtxt;
    Button btngo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nameedtxt = (EditText) findViewById(R.id.nameedtxt);
        salaryedtxt = (EditText) findViewById(R.id.salaryedtxt);
        btngo = (Button) findViewById(R.id.btngo);

        btngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = nameedtxt.getText().toString();
                String salary = salaryedtxt.getText().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Name", name);
                intent.putExtra("Salary", salary);
                startActivity(intent);
            }
        });
    }
}