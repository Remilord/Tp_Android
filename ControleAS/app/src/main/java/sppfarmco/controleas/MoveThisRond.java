package sppfarmco.controleas;

import android.view.View;

/**
 * Created by RImbert on 27/03/2018.
 */

public class MoveThisRond implements View.OnClickListener {
    private Decorationb decoration;
    public MoveThisRond(Decorationb db) {
        this.decoration = db;
    }
    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button_left) {
            this.decoration.moveRond();
            this.decoration.invalidate();
        }
    }
}
