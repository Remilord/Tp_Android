package com.example.imbert.temperature;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/**
 * Created by RImbert on 25/03/2018.
 */

public class ConvertisseurCtoF implements TextWatcher {
    private EditText celcus;
    private EditText fahrenheit;
    private boolean set;
    public ConvertisseurCtoF(EditText c, EditText f) {
            this.celcus =c;
            this.fahrenheit = f;
            this.set = false;
    }
    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }
    public boolean isSet() {
        return this.set;
    }
    public void setIt(boolean b) {
        this.set = b;
    }
    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        try {
            double value = Double.parseDouble(charSequence.toString());
            double valueconverted = 1.8 * value + 32;
            fahrenheit.setText(valueconverted + "");
        }catch (NumberFormatException nfe) {
            fahrenheit.setText("");
        }
    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}
