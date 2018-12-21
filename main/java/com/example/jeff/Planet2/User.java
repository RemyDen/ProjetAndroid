package com.example.jeff.Planet2;

import android.graphics.drawable.Drawable;

public class User {
    String Nom;
    String Prenom;
    int IdAvatar;
    String Passwd;

    public User(String nom, String prenom, int idAvatar, String passwd) {
        Nom = nom;
        Prenom = prenom;
        IdAvatar = idAvatar;
        Passwd = passwd;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public int getIdAvatar() {
        return IdAvatar;
    }

    public void setIdAvatar(int idAvatar) {
        IdAvatar = idAvatar;
    }

    public String getPasswd() {
        return Passwd;
    }

    public void setPasswd(String passwd) {
        Passwd = passwd;
    }
}
