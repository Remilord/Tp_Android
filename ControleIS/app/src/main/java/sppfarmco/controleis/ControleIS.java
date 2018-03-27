package sppfarmco.controleis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ControleIS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controle_is);
        EditText rouge = (EditText)findViewById(R.id.rouge_edt);
        EditText vert = (EditText)findViewById(R.id.vert_edt);
        EditText bleu = (EditText)findViewById(R.id.bleu_edt);
        View fond = (View)findViewById(R.id.fond);
        ChangementDeTexte cdt = new ChangementDeTexte(vert,rouge,bleu,fond);
        rouge.setOnEditorActionListener(cdt);
        vert.setOnEditorActionListener(cdt);
        bleu.setOnEditorActionListener(cdt);
    }
}
