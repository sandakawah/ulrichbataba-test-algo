package com.test;

import java.util.*;

/**
* Classe permettant de connaître ses chances de gagner au tiercé, quarté, quinté et autres impôts volontaires: deuxieme version, version améliorée
* 
* L'amélioration apportée dans cette version est la réduction du nombre de boucles, qui passent de trois boucles à une boucle, ce qui impacte
* positivement sur la performance du programme
* 
* @author Ulrich BATABA
* 
* @since 22/06/2022
*/
public class GainXYProgramVersionAmelioree {

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
	 
	 long factorielP = 1;
	 long factorielNP = 1;
	 
	 //puisque 1<=p<=n, donc n! = n*(n-1)*(n-2)*...*p*(p-1)*(p-2)*...*2*1 
	 //                         = n*(n-1)*(n-2)*...*(n-p+3)*(n-p+2)*(n-p+1)*(n-p)*(n-p-1)*..*2*1
	 //                         = n*(n-1)*(n-2)*...*(n-p+3)*(n-p+2)*(n-p+1)*(n-p)!
	 //donc n!/(n-p)! = n*(n-1)*(n-2)*...*(n-p+3)*(n-p+2)*(n-p+1)*(n-p)!/(n-p)! 
	 //               = n*(n-1)*(n-2)*...*(n-p+3)*(n-p+2)*(n-p+1) pour i allant de 1 à p
	 //               = (n-p+i)*(n-p+i-1)*(n-p+i-2)*...*(n-p+3)*(n-p+2)*(n-p+1) pour i allant de 1 à p
	 for(int i=1;i<=p;i++){
		 factorielP = factorielP * i;
		 factorielNP = factorielNP * (n-p+i);
	 }
	 
	 System.out.println(String.format("%s %s %s","Dans l’ordre : une chance sur ",factorielNP," de gagner")); 
	 System.out.println(String.format("%s %s %s","Dans le désordre : une chance sur ",(factorielNP/factorielP)," de gagner")); 
	 } catch(InputMismatchException ex){
		 System.out.println("Erreur: Les valeurs entrées doivent être des entiers positifs, avec nombre de chevaux joués plus petit ou égal à celui de chevaux partants"); 
	 }
 }

}