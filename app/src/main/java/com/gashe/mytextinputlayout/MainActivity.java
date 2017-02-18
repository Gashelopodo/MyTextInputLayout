package com.gashe.mytextinputlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText myEmail = (EditText)findViewById(R.id.myEmail);
        myEmail.setOnFocusChangeListener(new FocusListener(this));

        Button cleanButton = (Button)findViewById(R.id.cleanInputs);
        cleanButton.setOnClickListener(new buttonListener(this));

    }
}
