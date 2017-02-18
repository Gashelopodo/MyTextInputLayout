package com.gashe.mytextinputlayout;

import android.app.Activity;
import android.content.Context;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.EditText;



/**
 * Created by cice on 18/2/17.
 */

public class buttonListener implements View.OnClickListener {

    private Context context;

    public buttonListener(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {

        Activity activity = (Activity)context;
        EditText email = (EditText)activity.findViewById(R.id.myEmail);
        EditText phone = (EditText)activity.findViewById(R.id.myPhone);

        Utils utils = new Utils();

        utils.cleanInput(email);
        utils.cleanInput(phone);


    }
}
