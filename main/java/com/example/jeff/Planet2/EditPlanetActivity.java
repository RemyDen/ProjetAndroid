package com.example.jeff.Planet2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class EditPlanetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_planet);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.ok_edit);
    }

    public void ValidSaisie(View view) {

        Intent it = getIntent();

        TextView T = (TextView) findViewById(R.id.name_input);
        String nName = (String) String.valueOf(T.getText());
        int nDist = 0;

        try {
            TextView T2 = (TextView) findViewById(R.id.distance_input);
            nDist = Integer.parseInt(String.valueOf(T2.getText()));
        } catch (java.lang.NumberFormatException e) {
            setResult(RESULT_CANCELED, it);

        }
        // A FINIR : POISTIONNER LES EXTRAS

        finish();
    }
}
