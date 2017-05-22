package cgi.tests;

import java.util.Scanner;

public class ExoOuiNon {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		char reponse = "X";

		// TODO Auto-generated method stub
		System.out.println("Voulez vous un café O/N ?");
		String reponse = sc.nextLine();
		if (reponse == oui) {
			System.out.println("Un café pour vous");
		}else if (reponse == non) {
			System.out.println("Tant pris pour vous");
		}else{
			System.out.println("saisi incorrecte, nouvel essai ");
		}
		sc.close();

	}

}
