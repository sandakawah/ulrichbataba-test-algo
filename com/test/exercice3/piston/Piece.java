package com.test.exercice3.piston;

/**
 * Classe representant les différentes pièces d'un piston
 *
 * @author Ulrich BATABA
 *
 * @since 23/06/2022
 */
public class Piece {

    private String nom;

    public Piece() {
    }

    public Piece(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}
