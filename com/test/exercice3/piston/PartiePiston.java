package com.test.piston;

/**
 * Classe representant les parties abstraites d'un piston
 *
 * @author Ulrich BATABA
 *
 * @since 23/06/2022
 */
public class PartiePiston {

    private String nom;

    public PartiePiston() {
    }

    public PartiePiston(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}
