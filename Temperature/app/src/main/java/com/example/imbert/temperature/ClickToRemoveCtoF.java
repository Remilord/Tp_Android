package com.example.imbert.temperature;

import android.view.View;
import android.widget.EditText;

/**
 * Created by RImbert on 25/03/2018.
 */

public class ClickToRemoveCtoF implements View.OnFocusChangeListener {
    private EditText farenheit;
    private ConvertisseurFtoC convertisseurFtoC;
    private ConvertisseurCtoF convertisseurCtoF;
    public ClickToRemoveCtoF(EditText f, ConvertisseurFtoC c, ConvertisseurCtoF convertisseurcf) {
        this.farenheit =f;
        this.convertisseurFtoC = c;
        this.convertisseurCtoF = convertisseurcf;
    }

    @Override
    public void onFocusChange(View view, boolean b) {
        EditText celcus = (EditText)view;
        if(!convertisseurCtoF.isSet()) {
            this.farenheit.removeTextChangedListener(this.convertisseurFtoC);
            celcus.addTextChangedListener(this.convertisseurCtoF);
            convertisseurFtoC.setIt(false);
            convertisseurCtoF.setIt(true);
        }
    }
}
