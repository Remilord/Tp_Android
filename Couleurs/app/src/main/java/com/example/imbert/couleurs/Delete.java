package com.example.imbert.couleurs;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;

public class Delete extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        Bundle bundle = getIntent().getExtras();
        Button bdelete = (Button)findViewById(R.id.button_supp);
        Button bcancel = (Button)findViewById(R.id.button_cancel);
        bdelete.setOnClickListener(new DeleteListener(this,bundle.getString("fordelete")));
        bcancel.setOnClickListener(new AnnulerListener(this));
    }
}
