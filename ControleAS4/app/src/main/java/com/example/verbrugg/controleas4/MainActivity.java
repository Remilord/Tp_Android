package com.example.verbrugg.controleas4;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity {

    private Vue vue;
    private SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton bouton_droite=(ImageButton) findViewById(R.id.droite);
        ImageButton bouton_gauche=(ImageButton) findViewById(R.id.gauche);
        this.vue=(Vue) findViewById(R.id.vue);
        ControllerBouton cb = new ControllerBouton(bouton_droite, bouton_gauche,this.vue);
        bouton_droite.setOnClickListener(cb);
        bouton_gauche.setOnClickListener(cb);
        ControllerVue cv = new ControllerVue(this.vue);
        this.vue.setOnTouchListener(cv);
        preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        if(preferences.getBoolean("checkbox",true)) {
            System.out.println("true");
            this.vue.setBool(true);
        }else {
            System.out.println("false");
            this.vue.setBool(false);
        }

    }

    @Override
    public void onActivityResult(int resultcode,int requestcode,Intent data) {
        if(preferences.getBoolean("checkbox",true)) {
            System.out.println("true");
            this.vue.setBool(true);
        }else {
            System.out.println("false");
            this.vue.setBool(false);
        }
        this.vue.invalidate();
    }
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        this.vue.setPosRond(savedInstanceState.getInt("pos"));
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("pos",this.vue.getPosRond());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.opt:
                Intent inte = new Intent(this,InterfacePreference.class);
                this.startActivityForResult(inte,1);
                return true;
        }
        return false;

    }
}
