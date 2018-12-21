package com.example.jeff.Planet2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PlaneteAdapter extends ArrayAdapter<Planete> {
    private List<Planete> planeteList;
    private Context context;

    public PlaneteAdapter(Context ctx, List<Planete> planetes) {
        super(ctx, 0, planetes);
        this.planeteList = planetes;
        this.context = ctx;
    }

    @Override
    public View getView(int position, View recup, ViewGroup parent) {

        if (recup == null) {
            // This a new view we inflate the new layout
            LayoutInflater inflater = (LayoutInflater)
                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            recup = inflater.inflate(R.layout.item, parent, false);
        }

        TextView tvName = (TextView) recup.findViewById(R.id.item_nom);
        // A FINIR

        Planete p = this.planeteList.get(position);

        // A FINIR

        return recup;
    }
}
