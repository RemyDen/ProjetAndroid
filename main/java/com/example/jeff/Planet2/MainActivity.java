package com.example.jeff.Planet2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static com.example.jeff.Planet2.R.drawable;
import static com.example.jeff.Planet2.R.id;
import static com.example.jeff.Planet2.R.layout;

public class MainActivity extends Activity {
    public Planete[] initdata = new Planete[]{
            new Planete("Mercure", 58, drawable.mercury),
            new Planete("Vénus", 108, drawable.venus),
            new Planete("Terre", 150, drawable.earth),
            new Planete("Saturne", 58, drawable.saturn),
            new Planete("Soleil", 108, drawable.sun),
            new Planete("Uranus", 150, drawable.uranus),
    };
    private static final int APPEL_ADD_P = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        MySQLiteHelper db = new MySQLiteHelper(this);

        for (Planete planete : initdata) {
            db.addaPlanete(planete);
            System.out.println("Id Planete [" + planete.getIdImage() + "]");
        }
        ArrayList<Planete> m2 = new ArrayList<Planete>(db.getAllPlanetes());

        PlaneteAdapter pa = new PlaneteAdapter(this.getBaseContext(), m2);
        ListView lv = (ListView) findViewById(id.listView);
        lv.setAdapter(pa);
        lv.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ModifyPlanet(view, position);
            }
        });
    }

    public void ModifyPlanet(View v, int pos) {
        Intent intent = new Intent(this, EditPlanetActivity.class);
        startActivityForResult(intent, APPEL_ADD_P);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == Activity.RESULT_CANCELED) return;
        switch (requestCode) {
            case APPEL_ADD_P:
                String nName = data.getStringExtra("NNOM");
                int nDist = data.getIntExtra("NDIST", -1);

                // A FINIR : mettre à jour les données avec les modifications faites

                break;
        }
    }

}
