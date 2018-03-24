package com.example.imbert.couleurs;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
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
        Toast.makeText(this.parent, "Clic sur ligne "+(positionListe+1), Toast.LENGTH_SHORT).show();
    }
}
