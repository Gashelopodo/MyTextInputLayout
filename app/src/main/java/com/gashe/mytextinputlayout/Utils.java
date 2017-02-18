package com.gashe.mytextinputlayout;

import android.support.design.widget.TextInputLayout;
import android.widget.EditText;

/**
 * Created by cice on 18/2/17.
 */

public class Utils {

/*
    public void cleanInput(TextInputLayout element){

        element.setError("");
        for (int i = 0; i < element.getChildCount(); i++){
            EditText editText = (EditText) element.getChildAt(i);
            editText.setText("");
        }


    }
*/

    public void cleanInput(EditText element){
        element.setError("");
    }

}
