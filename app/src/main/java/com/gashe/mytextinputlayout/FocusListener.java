package com.gashe.mytextinputlayout;

import android.app.Activity;
import android.content.Context;
import android.support.design.widget.TextInputLayout;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by cice on 18/2/17.
 */

public class FocusListener implements View.OnFocusChangeListener {

    private Context context;
    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public FocusListener(Context context) {
        this.context = context;
    }

    public boolean emailValido(String email){

        boolean response = false;

        /*
        // crear tu expresión regular
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        response = matcher.matches();*/

        // expresiones regulares predefinidas
        response = Patterns.EMAIL_ADDRESS.matcher(email).matches();

        return response;

    }

    @Override
    public void onFocusChange(View view, boolean foco) {
        if(!foco){
            EditText dataEmail = (EditText)view;
            String myEmail = dataEmail.getText().toString();

            Activity activity = (Activity)context;
            TextInputLayout titEmail = (TextInputLayout)activity.findViewById(R.id.titEmail);

            if(!emailValido(myEmail)){
                // error
                titEmail.setError("¡Email incorrecto!");
            }else{
                // todo ok
                titEmail.setError("");
            }

        }
    }

}
