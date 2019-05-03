package com.example.nz.edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText,editText2;
    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editTextTwo);
        button1 = (Button) findViewById(R.id.buttonOne);
        button2 = (Button) findViewById(R.id.buttonTwo);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        try {

            String string1 = editText.getText().toString();
            String string2 = editText2.getText().toString();
            double number1 = Double.parseDouble(string1);
            double number2 = Double.parseDouble(string2);

            if (v.getId() == R.id.buttonOne) {
                double add = number1 + number2;
                Toast.makeText(MainActivity.this, "Your Addition is : " + add, Toast.LENGTH_SHORT).show();
            }
            if (v.getId() == R.id.buttonTwo) {
                double sub = number1 - number2;
                Toast.makeText(MainActivity.this, "Your Subtraction is : " + sub, Toast.LENGTH_SHORT).show();
            }

        }catch(Exception e){
            Toast.makeText(MainActivity.this,"Please Enter Number",Toast.LENGTH_SHORT).show();
        }

    }
}
