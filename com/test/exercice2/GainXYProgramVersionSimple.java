package com.test.exercice2;

import java.util.*;

/**
* Classe permettant de connaître ses chances de gagner au tiercé, quarté, quinté et autres impôts volontaires: Premiere version
* 
* Cette version est peu performante à cause du nombre de boucles qui s'élève à trois boucles, ce qui peut rendre l'application moins performante
* 
* @author Ulrich BATABA
* 
* @since 22/06/2022
*/
public class GainXYProgramVersionSimple {

/**
* Point d'entrée du programme
*/
 public static void main(String args[]){
	 try{
	 Scanner scanner = new Scanner(System.in);
	 System.out.print("Entrer le nombre de chevaux partants: ");
	 int n = scanner.nextInt();
	 System.out.print("Entrer le nombre de chevaux joués: ");
	 int p = scanner.nextInt();
	 
	 if(n<=0 || p<=0 || n<p){
		throw new InputMismatchException();
	 }
	 
	 long factorielN = 1;
	 long factorielP = 1;
	 long factorielNP = 1;
	 
	 for(int i=2;i<=n;i++){
		 factorielN = factorielN * i;
	 }
	 
	 for(int i=2;i<=p;i++){
		 factorielP = factorielP * i;
	 }
	 
	 int np = n-p;
	 for(int i=2;i<=np;i++){
		 factorielNP = factorielNP * i;
	 }
	 
	 System.out.println(String.format("%s %s %s","Dans l’ordre : une chance sur ",(factorielN/factorielNP)," de gagner")); 
	 System.out.println(String.format("%s %s %s","Dans le désordre : une chance sur ",(factorielN/(factorielP * factorielNP))," de gagner")); 
	 } catch(InputMismatchException ex){
		 System.out.println("Erreur: Les valeurs entrées doivent être des entiers positifs, avec nombre de chevaux joués plus petit ou égal à celui de chevaux partants"); 
	 }
 }

}