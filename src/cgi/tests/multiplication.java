package cgi.tests;

import java.util.Scanner;

public class multiplication {
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner (System.in);
	
		// on demande à saisir un chiffre dans la console
		System.out.println("Saisir un chiffre : ");
		int number = sc.nextInt();
			
		// On affiche la table de multiplication correspondante
		for(int i=0; i<11; i++){
	
			int result = number * i;
			System.out.println(number+" * "+i+" = "+result);	
		}

			
		sc.close();
			
	}
	
}


