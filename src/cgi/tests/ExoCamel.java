package cgi.tests;

import java.util.Scanner;

public class ExoCamel {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// on demande à saisir un chiffre dans la console
		System.out.println("Saisir un texte: ");
		String saisi = sc.nextLine();
		System.out.println("Saisir le format UC/CC: ");
		String caractere = sc.nextLine();
		String strUC = "UC";
		String strCC = "CC";
		
		// Condition
		if (caractere.equals(strUC)) {
			
			System.out.println(saisi.toUpperCase());
			
		}else if(caractere.equals(strCC)) {
	
			String saisiCC = saisi.replaceFirst(".",(saisi.charAt(0)+"").toUpperCase());
	        System.out.println(saisiCC);
			
		}else{

			System.out.println("Je n'est pas compris votre saisis");
		}
		
		sc.close();
	}

}
