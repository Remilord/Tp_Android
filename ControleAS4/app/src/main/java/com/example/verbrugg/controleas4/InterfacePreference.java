package com.example.verbrugg.controleas4;


import android.content.Intent;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceCategory;
import android.preference.PreferenceScreen;

import java.util.ArrayList;

/**
 * Created by RImbert on 24/03/2018.
 */

public class InterfacePreference extends PreferenceActivity {
    private PreferenceScreen startmain;
    @Override
    public void onCreate(Bundle savedinstance) {
        super.onCreate(savedinstance);
        this.addPreferencesFromResource(R.xml.preferences);
         startmain = (PreferenceScreen) findPreference("startmain");

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