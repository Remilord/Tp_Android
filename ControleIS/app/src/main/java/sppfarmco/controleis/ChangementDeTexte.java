package sppfarmco.controleis;

import android.graphics.Color;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by RImbert on 26/03/2018.
 */

public class ChangementDeTexte implements TextView.OnEditorActionListener {
    private EditText rouge;
    private EditText vert;
    private EditText bleu;
    private View fond;

    public ChangementDeTexte(EditText v,EditText r,EditText b,View f) {
        this.rouge = r;
        this.bleu = b;
        this.vert = v;
        this.fond = f;
    }
    @Override
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        Log.d("je apsse","la mdr");
        try {
            this.fond.setBackgroundColor(Color.argb(255, Integer.parseInt(this.vert.getText().toString()), Integer.parseInt(this.vert.getText().toString()), Integer.parseInt(this.vert.getText().toString())));
        }catch(NumberFormatException nbfe) {
            this.fond.setBackgroundColor(Color.BLACK);
        }
        return true;
    }
}
