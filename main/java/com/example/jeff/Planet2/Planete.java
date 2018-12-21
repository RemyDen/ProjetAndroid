package com.example.jeff.Planet2;

import android.graphics.drawable.Drawable;

public class Planete {
    String Nom;
    int Distance;
    int IdImage;
    Drawable image;

    Planete() {
    }

    Planete(String nom, int distance, int idImage) {
        Nom = nom;           // nom de la planète
        Distance = distance; // distance au soleil en Gm
        IdImage = idImage;
    }

    public Planete(String nom, int distance, Drawable image) {
        Nom = nom;
        Distance = distance;
        this.image = image;
    }

    public String toString() {
        return Nom;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public int getDistance() {
        return Distance;
    }

    public void setDistance(int distance) {
        Distance = distance;
    }

    public int getIdImage() {
        return IdImage;
    }

    public void setIdImage(int idImage) {
        this.IdImage = idImage;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }
}
