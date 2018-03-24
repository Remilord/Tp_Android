package com.example.imbert.arcenciel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Arcenciel extends AppCompatActivity {
    private RelativeLayout layoutforcolor;
    private String[] colors;
    private int nbcolor;
    private ChangeColorTouch changecolortouch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int nbcolor = 0;
        colors = new String[9];
        colors[0] = "violet";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arcenciel);
        Selection sel = new Selection(this);
        Button but = (Button)findViewById(R.id.selection);
        layoutforcolor = (RelativeLayout)findViewById(R.id.layoutcolor);
         changecolortouch = new ChangeColorTouch(colors,nbcolor,layoutforcolor,this);
        but.setOnClickListener(sel);
        layoutforcolor.setOnClickListener(changecolortouch);
    }
    @Override
    public void onActivityResult(int requestCode,int resultCode,Intent data) {
        colors = data.getStringArrayExtra("colors");
        nbcolor = data.getIntExtra("nbcolor",0);
        if(nbcolor == 0) {
            colors[0] = "violet";
        }

        changecolortouch.setParams(colors,nbcolor);
        layoutforcolor.setBackgroundColor(getResources().getColor(getResources().getIdentifier(colors[0], "color", getPackageName())));
    }
}
