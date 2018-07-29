package com.example.android.collegetrackingapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t=(EditText)findViewById(R.id.edt);
        Typeface myCustomFont=Typeface.createFromAsset(getAssets(),"fonts/Pacifico.ttf");
        t.setTypeface(myCustomFont);
    }
}
