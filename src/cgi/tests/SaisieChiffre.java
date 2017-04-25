package cgi.tests;

import java.util.Scanner;

public class SaisieChiffre {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// on demande à saisir un chiffre dans la console
		System.out.println("Saisir un chiffre : ");
		int number = sc.nextInt();
		
		// On affiche la condition 
		if (number > 0) {
			System.out.println("Le résultat est positif");
		}else if(number < 0) {
			System.out.println("Le résultat est négatif");
		}else{
			System.out.println("Le résultat est null");
		}
		sc.close();
	}

};
