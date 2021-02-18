package edu.jsu.mcis.cs408.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculator = new Calculator(this);
    }

    public void onClick(View v) {
        String button = ((Button) v).getText().toString();       // get input button text
        calculator.process(button);                              // pass input to Calculator for processing
        TextView display = (TextView)findViewById(R.id.display); // acquire reference to display TextView
        display.setText(calculator.getDisplay());                // show updated display buffer from Calculator
    }
}