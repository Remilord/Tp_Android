package com.example.imbert.fleche;

import android.view.View;
import android.widget.ImageView;

/**
 * Created by imbert on 2/12/18.
 */

public class TournerFleche implements View.OnClickListener {
    private ImageView fleche;
    public TournerFleche(ImageView iv) {
        this.fleche = iv;
    }
    @Override
    public void onClick(View v) {
                int idview = v.getId();
                switch (idview) {
                    case R.id.droite:
                        this.fleche.setImageResource(R.drawable.fleche_droite);
                        break;
                    case R.id.gauche:
                        this.fleche.setImageResource(R.drawable.fleche_gauche);
                        break;
                }
    }
}
