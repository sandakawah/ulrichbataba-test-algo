package com.test.exercice1;

import java.util.*;

/**
* Classe permettant d'afficher, de maniere itérative, les nombres de 1 à 199 en remplacant les multiples de 3 par FIZZ, 
* les multiples de 5 par BUZZ et les multiples de 3 et 5 par FIZZBUZZ
* 
* @author Ulrich BATABA
* 
* @since 22/06/2022
*/
public class FizzBuzzMutipleNumberIteratif {

/**
* Methode d'affichage recursif
*/
 private static void displayFizzBuzz(int min, int max){
	 for(int i=1;i<=max;i++){
		 if(i%3==0 && i%5!=0){
			 System.out.print("FIZZ  ");
		 } else if(i%3!=0 && i%5==0){
			 System.out.print("BUZZ  ");
		 } else if(i%3==0 && i%5==0){
			 System.out.print("FIZZBUZZ  ");
		 } else {
			 System.out.print(i+"  ");
		 }
		
	 }
 }

/**
* Point d'entrée du programme
*/
 public static void main(String args[]){
	 displayFizzBuzz(1,199);
 }

}