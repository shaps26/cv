package com.example.shaps.cv_shpas.Model;

/**
 * Created by shaps on 13/04/17.
 */

public class Competence {

    private String nom;
    private String type;

    public Competence(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
