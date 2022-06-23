package com.test.piston;

/**
 * Classe representant un piston
 *
 * @author Ulrich BATABA
 *
 * @since 23/06/2022
 */
public class Piston {

    private TetePiston tetePiston;
    private JupePiston jupePiston;
    private AxePiston axePiston;

    public Piston() {
    }

    public Piston(TetePiston tetePiston, JupePiston jupePiston, AxePiston axePiston) {
        this.tetePiston = tetePiston;
        this.jupePiston = jupePiston;
        this.axePiston = axePiston;
    }

    public TetePiston getTetePiston() {
        return tetePiston;
    }

    public void setTetePiston(TetePiston tetePiston) {
        this.tetePiston = tetePiston;
    }

    public JupePiston getJupePiston() {
        return jupePiston;
    }

    public void setJupePiston(JupePiston jupePiston) {
        this.jupePiston = jupePiston;
    }

    public AxePiston getAxePiston() {
        return axePiston;
    }

    public void setAxePiston(AxePiston axePiston) {
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
