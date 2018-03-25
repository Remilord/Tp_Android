package com.example.imbert.desoxyribonucleique;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by RImbert on 24/03/2018.
 */

public class AddTextFromButton implements View.OnClickListener {
    private TextView results;
    public AddTextFromButton(TextView r) {
        this.results = r;
    }
    @Override
    public void onClick(View view) {
        Button b = (Button)view;
        String letter = b.getText().toString();
        this.results.setText(this.results.getText()+letter);
    }
}
