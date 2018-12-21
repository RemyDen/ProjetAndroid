package com.example.jeff.Planet2;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.jeff.Planet2.R.drawable;

public class EditAvatarActivity extends Dialog {

   /* public
            new Planete("Mercure", 58, drawable.mercury),
            new Planete("Vénus", 108, drawable.venus),
            new Planete("Terre", 150, drawable.earth),
            new Planete("Saturne", 58, drawable.saturn),
            new Planete("Soleil", 108, drawable.sun),
            new Planete("Uranus", 150, drawable.uranus),
    };*/

    public EditAvatarActivity(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_avatar);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.ok_edit);

        ArrayList<ImageView> m2 = new ArrayList<>();
        m2.add()

        PlaneteAdapter pa = new PlaneteAdapter(this.getBaseContext(), m2);
        ListView lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(pa);
    }

    public void ValidSaisie(View view) {

        Intent it = getIntent();

        TextView T = (TextView) findViewById(R.id.name_input);
        String nName = (String) String.valueOf(T.getText());
        int nDist = 0;

        try {
            TextView T2 = (TextView) findViewById(R.id.distance_input);
            nDist = Integer.parseInt(String.valueOf(T2.getText()));
        } catch (NumberFormatException e) {
            setResult(RESULT_CANCELED, it);

        }
        // A FINIR : POISTIONNER LES EXTRAS

        finish();
    }
}
