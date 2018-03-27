package sppfarmco.controleas;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageButton;

public class ControleAs extends Activity {
    private Decorationb decob;
    private SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controle_as);
        ImageButton imbr = (ImageButton)findViewById(R.id.button_right);
        ImageButton imbl = (ImageButton)findViewById(R.id.button_left);
         decob = (Decorationb)findViewById(R.id.color_view);
        MoveThisRond mtr = new MoveThisRond(decob);
        ToucherLigne tl = new ToucherLigne();
        imbr.setOnClickListener(mtr);
        imbl.setOnClickListener(mtr);
        decob.setOnTouchListener(tl);
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        if(preferences.getBoolean("rond",true)) {
            this.decob.auDessus(true);
        }else {
            this.decob.auDessus(false);
        }
        this.decob.invalidate();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode == 1) {
            if(preferences.getBoolean("rond",true)) {
                this.decob.auDessus(true);
            }else {
                this.decob.auDessus(false);
            }
        }
        this.decob.invalidate();
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        decob.moveRondByTouch(savedInstanceState.getInt("pos"));
        decob.invalidate();
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("pos",decob.getActualposition());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        if(item.getItemId() == R.id.opt) {
            Intent pref = new Intent(this,PrefRond.class);
            this.startActivityForResult(pref,1);
            return true;
        }
        return false;
    }
}
