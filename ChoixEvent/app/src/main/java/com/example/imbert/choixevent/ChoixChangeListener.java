package com.example.imbert.choixevent;

import android.view.View;
import android.widget.RadioGroup;

/**
 * Created by imbert on 2/12/18.
 */

public class ChoixChangeListener implements RadioGroup.OnCheckedChangeListener{
    public Forme form;
    public ChoixChangeListener(Forme f) {
        this.form=f;
    }
    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        this.form.setIdChecked(i);
    }
}
