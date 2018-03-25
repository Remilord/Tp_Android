package com.example.imbert.couleurs;

import android.content.Intent;
import android.view.View;

/**
 * Created by RImbert on 24/03/2018.
 */

public class AnnulerListener implements View.OnClickListener {
    private Delete activitydelete;
    public AnnulerListener(Delete acd) {
        this.activitydelete = acd;
    }
    @Override
    public void onClick(View view) {
        Intent backact = new Intent(this.activitydelete,Couleurs.class);
        this.activitydelete.setResult(2,backact);
        this.activitydelete.finish();
    }
}
