package com.example.imbert.couleurs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by RImbert on 24/03/2018.
 */

public class DeleteListener implements View.OnClickListener {
    private Delete activitydelete;
    private String delete;
    public DeleteListener(Delete actd,String d) {
        this.activitydelete = actd;
        this.delete = d;
    }
    @Override
    public void onClick(View view) {
        Intent backact = new Intent(this.activitydelete,Couleurs.class);
        backact.putExtra("deletethis",this.delete);
        this.activitydelete.setResult(1,backact);
        this.activitydelete.finish();
    }
}
