package com.test.exercice3.piston;

/**
 * Classe representant un piston
 *
 * @author Ulrich BATABA
 *
 * @since 23/06/2022
 */
public class Piston {

    private Tete tetePiston;
    private Jupe jupePiston;
    private Axe axePiston;

    public Piston() {
    }

    public Piston(Tete tetePiston, Jupe jupePiston, Axe axePiston) {
        this.tetePiston = tetePiston;
        this.jupePiston = jupePiston;
        this.axePiston = axePiston;
    }

    public Tete getTetePiston() {
        return tetePiston;
    }

    public void setTetePiston(Tete tetePiston) {
        this.tetePiston = tetePiston;
    }

    public Jupe getJupePiston() {
        return jupePiston;
    }

    public void setJupePiston(Jupe jupePiston) {
        this.jupePiston = jupePiston;
    }

    public Axe getAxePiston() {
        return axePiston;
    }

    public void setAxePiston(Axe axePiston) {
        this.axePiston = axePiston;
    }

    @Override
    public String toString() {
        return "Piston produit: {" +
                "tete=" + tetePiston.getNom() +
                ", jupe=" + jupePiston.getNom() +
                ", axe=" + axePiston.getNom() +
                '}';
    }
}
