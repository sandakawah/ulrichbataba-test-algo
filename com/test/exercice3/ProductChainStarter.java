package com.test.exercice3;

import com.test.exercice3.piston.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;

/**
 * Classe permettant de simuler une chaîne de production qui assemble des pistons
 *
 * @author Ulrich BATABA
 *
 * @since 23/06/2022
 */
public class ProductChainStarter {

    /**
     * Point d'entrée du program
     */
    public static void main(String[] args) {
        System.out.println("Simulation de la chaine de production de 5 pistons\n");
        List<Piece> cartonsDePieces = chargerPieces();

        LinkedBlockingQueue<Tete> mtQueue = new LinkedBlockingQueue<>();
        LinkedBlockingQueue<Jupe> mjQueue = new LinkedBlockingQueue<>();
        LinkedBlockingQueue<Axe> maQueue = new LinkedBlockingQueue<>();

        cartonsDePieces.forEach(piece -> {
            if(piece instanceof Tete){
                System.out.println("Passage de la "+ piece.getNom() +" du piston vers la machine MT");
                mtQueue.add((Tete)piece);
                waitForThreeSeconds();
                System.out.println("Usinage de la "+ piece.getNom() +" au niveau de la machine MT\n");
                waitForThreeSeconds();

            } else if(piece instanceof Jupe){
                System.out.println("Passage de la "+ piece.getNom() +" du piston vers la machine MJ");
                mjQueue.add((Jupe)piece);
                waitForThreeSeconds();
                System.out.println("Usinage de la "+ piece.getNom() +" au niveau de la machine MJ\n");
                waitForThreeSeconds();

            } else if(piece instanceof Axe){
                System.out.println("Passage de l'"+ piece.getNom() +" du piston vers la machine MA");
                maQueue.add((Axe)piece);
                waitForThreeSeconds();
                System.out.println("Usinage de l'"+ piece.getNom() +" au niveau de la machine MA\n");
                waitForThreeSeconds();
            }
        });

        int i=0;
        while(!mtQueue.isEmpty()){
            i++;
            System.out.println("==> Assemblage du piston n°" + i);
            Piston piston = new Piston(mtQueue.poll(),mjQueue.poll(),maQueue.poll());
            System.out.println(piston.toString()+"\n");
            waitForThreeSeconds();
        }

        System.out.println("\n\nTemps necessaire pour monter 100 pistons: ");
        float tempsUsinageTete = 2;
        float tempsUsinageJupe = 3;
        float tempsUsinageAxe = 2.5f;
        float tempsAssemblagePiston = 1;

        float tempsProductionPiston = tempsUsinageTete+tempsUsinageJupe+tempsUsinageAxe+tempsAssemblagePiston;
        //tempsProductionPiston=8.5
        //La chance qu'une machine tombe en panne est faible (25%) mais si elle tombait en panne, il faut 5 à 10 minutes de temps
        //supplementaire pour etre reparée. Si les quatre venaient à tomber en panne, il faut 20 à 40 minutes pour les reparer.
        //La production d'un piston prend donc un temps normal de 8.5 minutes sans panne et 8.5 minutes + 20 à 40 minutes en cas de
        // panne sur les 4 manchines

        //Pour 100 pistons, il faut 850 minutes de temps normal et 850 minutes + 2000 à 4000 minutes en cas de panne

        System.out.println("\n\nPour 100 pistons, il faut 850 minutes de temps normal et 850 minutes + 2000 à 4000 minutes en cas de panne");

    }

    /**
     * Methode permettant d'initialiser les données de simulation
     */
    private static List<Piece> chargerPieces(){
        List<Piece> cartonsDePieces = new ArrayList<>();
        cartonsDePieces.add(new Tete("Tete1"));
        cartonsDePieces.add(new Jupe("Jupe1"));
        cartonsDePieces.add(new Axe("Axe1"));

        cartonsDePieces.add(new Tete("Tete2"));
        cartonsDePieces.add(new Jupe("Jupe2"));
        cartonsDePieces.add(new Axe("Axe2"));

        cartonsDePieces.add(new Tete("Tete3"));
        cartonsDePieces.add(new Jupe("Jupe3"));
        cartonsDePieces.add(new Axe("Axe3"));

        cartonsDePieces.add(new Tete("Tete4"));
        cartonsDePieces.add(new Jupe("Jupe4"));
        cartonsDePieces.add(new Axe("Axe4"));

        cartonsDePieces.add(new Tete("Tete5"));
        cartonsDePieces.add(new Jupe("Jupe5"));
        cartonsDePieces.add(new Axe("Axe5"));

        return cartonsDePieces;
    }

    /**
     * Thread permettant de simuler le temps d'une execution dans la chaine de production
     */
    private static void waitForThreeSeconds(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            java.util.logging.Logger.getLogger(ProductChainStarter.class.getName()).log(Level.SEVERE,ex.getMessage());
        }
    }
}
