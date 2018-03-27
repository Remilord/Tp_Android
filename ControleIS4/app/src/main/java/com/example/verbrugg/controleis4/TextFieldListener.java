package com.example.verbrugg.controleis4;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Nofix on 17/03/2018.
 */

public class TextFieldListener implements TextWatcher {

    private SquareViewContener view;
    public static final int RED = 0;
    public static final int BLUE = 1;
    public static final int GREEN = 2;

    private int colorListened;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor sharedPreferencesEditor;
    public TextFieldListener(SquareViewContener v, int colorToListen, Activity activity, EditText editText){
        this.view = v;
        this.colorListened = colorToListen;
        v.recoverSavedColor(activity);
        sharedPreferences = activity.getSharedPreferences(SquareViewContener.COLOR_PREFERENCES, Context.MODE_PRIVATE);
        sharedPreferencesEditor = sharedPreferences.edit();
        setDefaultColor(colorToListen, editText);
    }
    private void setDefaultColor(int colorListened, EditText editText){
        if(colorListened == RED){

            editText.setText(view.getRed()+"");
        }
        else if (colorListened == BLUE){
            editText.setText(view.getBlue()+"");
        }
        else if (colorListened == GREEN){
            editText.setText(view.getGreen()+"");
        }
    }


    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        Log.i("color listened : "+colorListened, s.toString());
        if(s.toString().equals("")) return;
        if(Integer.parseInt(s.toString()) > 255 || Integer.parseInt(s.toString()) < 0){
            Toast.makeText(view.getContext(), R.string.error_color_value, Toast.LENGTH_SHORT).show();
            return;
        }
        if(colorListened == RED){
            view.reDraw(Integer.parseInt(s.toString()), view.getBlue(), view.getGreen());
            sharedPreferencesEditor.putInt("red", Integer.parseInt(s.toString())).commit();
        }
        else if (colorListened == BLUE){
            view.reDraw(view.getRed(), Integer.parseInt(s.toString()), view.getGreen());
            sharedPreferencesEditor.putInt("blue", Integer.parseInt(s.toString())).commit();
        }
        else if (colorListened == GREEN){
            view.reDraw(view.getRed(), view.getBlue(), Integer.parseInt(s.toString()));
            sharedPreferencesEditor.putInt("green", Integer.parseInt(s.toString())).commit();
        }
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}
