package cgi.tests;

public class ExoTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creation du tableau dans une variable
		int tableau[] = {8,7,6,10,89,3,39,10,5,12};
		
		//Affichage du tableau for
		for (int i=0; i < tableau.length; i++ ) {
			System.out.println("La valeur for est "+tableau[i]);
		}
		
		//Affichage du tableau while
		int i = 0;
		while (i < tableau.length) {
			System.out.println("La valeur while est "+tableau[i]);
			i++;
		};
		

	}

}
