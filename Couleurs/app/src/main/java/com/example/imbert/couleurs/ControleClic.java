package com.example.imbert.couleurs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by imbert on 3/22/18.
 */

public class ControleClic implements AdapterView.OnItemClickListener {
    Activity parent;
    public ControleClic(Activity a) {
        this.parent = a;
    }
    @Override
    public void onItemClick(AdapterView<?> liste, View vue, int positionListe, long idBase) {
        Intent newact = new Intent(this.parent.getApplicationContext(),Delete.class);
        String text =((TextView) vue.findViewById(R.id.nom)).getText().toString();
        newact.putExtra("fordelete",text);
        this.parent.startActivityForResult(newact,1);
    }
}
