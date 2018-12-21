package com.example.jeff.Planet2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class EditUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_user);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.ok_edit);

        ImageView btn = findViewById(R.id.avatar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditUserActivity.this, EditAvatarActivity.class);
                startActivityForResult(intent, 0);
            }
        });
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
