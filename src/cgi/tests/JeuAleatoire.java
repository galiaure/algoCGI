package cgi.tests;

import java.util.Scanner;

public class JeuAleatoire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int number = (int) Math.round(Math.random()*100);
		System.out.println("Saisir un nombre:");
		int numSaisi = sc.nextInt();

		do{
			if(numSaisi < number){
				System.out.println("Votre nombre est trop bas. Ressayer");
				numSaisi = sc.nextInt();	
			}else if(numSaisi > number){
				System.out.println("Votre nombre est trop haut. Ressayer");
				numSaisi = sc.nextInt();
			}
		}

		while(numSaisi != number); 
		System.out.println("Félicitation vous avez trouvé le bon numéro " + number + "!!");

		sc.close();

	}

}
