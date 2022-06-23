package com.test.exercice1;

import java.util.*;

/**
* Classe permettant d'afficher, de maniere recursive, les nombres de 1 à 199 en remplacant les multiples de 3 par FIZZ, 
* les multiples de 5 par BUZZ et les multiples de 3 et 5 par FIZZBUZZ
* 
* @author Ulrich BATABA
* 
* @since 22/06/2022
*/
public class FizzBuzzMutipleNumberRecursif {

/**
* Methode d'affichage recursif
*/
 private static void displayFizzBuzz(int min, int max){
	    if(min%3==0 && min%5!=0){
			 System.out.print("FIZZ  ");
		 } else if(min%3!=0 && min%5==0){
			 System.out.print("BUZZ  ");
		 } else if(min%3==0 && min%5==0){
			 System.out.print("FIZZBUZZ  ");
		 } else {
			 System.out.print(min+"  ");
		 }
		 if(++min<=max){
	       displayFizzBuzz(min,max);
		 }
 }

/**
* Point d'entrée du programme
*/
 public static void main(String args[]){
	 displayFizzBuzz(1,199);
 }

}