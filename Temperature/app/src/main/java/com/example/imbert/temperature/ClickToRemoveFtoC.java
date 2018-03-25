package com.example.imbert.temperature;

import android.util.Log;
import android.view.View;
import android.widget.EditText;

/**
 * Created by RImbert on 25/03/2018.
 */

public class ClickToRemoveFtoC implements View.OnFocusChangeListener {
    private EditText celcus;
    private ConvertisseurCtoF convertisseurCtoF;
    private ConvertisseurFtoC convertisseurFtoC;
    public ClickToRemoveFtoC(EditText f, ConvertisseurCtoF c, ConvertisseurFtoC convertisseurfc) {
        this.celcus =f;
        this.convertisseurCtoF = c;
        this.convertisseurFtoC = convertisseurfc;
    }

    @Override
    public void onFocusChange(View view, boolean b) {
        if(!convertisseurFtoC.isSet()) {
            this.celcus.removeTextChangedListener(this.convertisseurCtoF);
            EditText farenheit = (EditText) view;
            farenheit.addTextChangedListener(this.convertisseurFtoC);
            convertisseurFtoC.setIt(true);
            convertisseurCtoF.setIt(false);
        }
    }
}
