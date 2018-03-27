package sppfarmco.controleas;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;

/**
 * Created by RImbert on 27/03/2018.
 */

public class PrefRond extends PreferenceActivity {
    @Override
    public void onCreate(Bundle savedinstance) {
        super.onCreate(savedinstance);
        this.addPreferencesFromResource(R.xml.preference);
    }
    @Override
    public void onBackPressed() {
        this.setResult(1);
        this.finish();
    }
    @Override
    public void onResume() {
        super.onResume();
    }
    @Override
    public void onPause() {
        super.onPause();
    }
}
