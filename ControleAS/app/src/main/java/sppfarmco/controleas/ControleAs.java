package sppfarmco.controleas;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;

public class ControleAs extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controle_as);
        ImageButton imbr = (ImageButton)findViewById(R.id.button_left);
        imbr.setOnClickListener(new MoveThisRond((Decorationb)findViewById(R.id.color_view)));
    }
}
