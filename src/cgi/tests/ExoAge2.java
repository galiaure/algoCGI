package cgi.tests;

import java.util.Scanner;

public class ExoAge2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		// on demande à saisir l'age dans la console
		System.out.println("Saisir l'age de votre enfant: ");
		int number = sc.nextInt();
		
		// On affiche la condition 
		switch(number) {
		case 6: System.out.println("Votre enfant est Poussin"); break;
		case 7: System.out.println("Votre enfant est Poussin");	break;
		case 8: System.out.println("Votre enfant est Pupille");	break;
		case 9: System.out.println("Votre enfant est Pupille");	break;
		case 10: System.out.println("Votre enfant est Minime");	break;
		case 11: System.out.println("Votre enfant est Minime"); break;
		default: System.out.println("Votre enfant est Cadet");
		}
	}
}
