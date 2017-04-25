package cgi.tests;

import java.util.Scanner;

public class ExoAge {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		// on demande à saisir l'age dans la console
		System.out.println("Saisir l'age de votre enfant: ");
		int number = sc.nextInt();
		
		// On affiche la condition 
		if (number >= 6 && number <= 7) {
			System.out.println("Votre enfant est Poussin");
		}else if(number >= 8 && number <= 9) {
			System.out.println("Votre enfant est Pupille");
		}else if(number >= 10 && number <= 11) {
			System.out.println("Votre enfant est Minime");
		}else if(number >= 12) {
			System.out.println("Votre enfant est Cadet");	
		}else{
			System.out.println("Votre enfant est trop jeune");
		}
		sc.close();
	}	
};
