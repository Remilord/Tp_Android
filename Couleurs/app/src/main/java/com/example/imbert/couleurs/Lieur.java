package com.example.imbert.couleurs;

import android.database.Cursor;
import android.widget.SimpleCursorAdapter;
import android.view.View;

/**
 * Created by imbert on 3/22/18.
 */

public class Lieur implements SimpleCursorAdapter.ViewBinder {
    @Override
    public boolean setViewValue(View view, Cursor cursor, int columnIndex) {
        if(view.getId() == R.id.couleur) {
            ((Circle)view).changerCouleur(cursor.getInt(columnIndex));
            return true;
        }
        return false;
    }
}
