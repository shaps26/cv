package com.example.shaps.cv_shpas.Model;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.shaps.cv_shpas.R;

import java.util.ArrayList;

/**
 * Created by shaps on 13/04/17.
 */

public class AdapterCompetence extends BaseAdapter{

    private Activity context;
    private ArrayList<Competence> competences;

    public AdapterCompetence(Activity context, ArrayList<Competence> competences) {
        this.context = context;
        this.competences = competences;
    }

    public Activity getContext() {
        return context;
    }

    public void setContext(Activity context) {
        this.context = context;
    }

    public ArrayList<Competence> getCompetences() {
        return competences;
    }

    public void setCompetences(ArrayList<Competence> competences) {
        this.competences = competences;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.adapteur_competence, null);
        TextView textViewNomComptence = (TextView) rowView.findViewById(R.id.adapterNom);
        TextView textViewTypeComptence = (TextView) rowView.findViewById(R.id.adapterType);

        textViewNomComptence.setText(competences.get(position).getNom());
        textViewTypeComptence.setText(competences.get(position).getType());

        return rowView;
    }
}


