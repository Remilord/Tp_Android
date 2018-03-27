package com.example.verbrugg.controleis4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SquareViewContener squareViewContener = (SquareViewContener) findViewById(R.id.Square);
        EditText editTextRed = (EditText) findViewById(R.id.red);
        EditText editTextBlue = (EditText) findViewById(R.id.blue);
        EditText editTextGreen = (EditText) findViewById(R.id.green);
        editTextRed.addTextChangedListener(new TextFieldListener(squareViewContener, TextFieldListener.RED, this, editTextRed));
        editTextBlue.addTextChangedListener(new TextFieldListener(squareViewContener, TextFieldListener.BLUE, this, editTextBlue));
        editTextGreen.addTextChangedListener(new TextFieldListener(squareViewContener, TextFieldListener.GREEN, this, editTextGreen));
        squareViewContener.setOnTouchListener(new SquareViewListener(squareViewContener, this));


    }
}
