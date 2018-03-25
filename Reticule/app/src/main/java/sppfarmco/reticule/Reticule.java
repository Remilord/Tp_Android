package sppfarmco.reticule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Reticule extends AppCompatActivity {
    private ViewReticule vr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reticule);
        vr = (ViewReticule)findViewById(R.id.vreticule);
        DeplacerReticule dr = new DeplacerReticule(vr);
        vr.setOnTouchListener(dr);
    }
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        vr.setPosition(savedInstanceState.getInt("posx"),savedInstanceState.getInt("posy"));
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("posx",vr.getPositionx());
        savedInstanceState.putInt("posy",vr.getPositiony());
    }

}
