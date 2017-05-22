package cgi.tests;

import java.util.Scanner;

public class ExoNom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Saisir trois nom dans l'ordre alphabétique");
		String tableau[] = sc.nextLine().split(",");
		
		boolean ordored = true;
		for (int i=1;i<3;i++){
			if (tableau[i].compareTo(tableau[i-1])<0) {
				ordored = false;
				break;
			}
		}
		
		if(ordored){
			System.out.println("Les mots sont dans l'ordre alphabétique");
		}else{
			System.out.println("Les mots ne sont pas dans l'ordre alphabétique");
		}
		
		sc.close();

	}

}
