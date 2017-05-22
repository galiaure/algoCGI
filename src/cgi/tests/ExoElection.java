package cgi.tests;

public class ExoElection {
	public static void main(String[] args) {
	/*
	int candidatGauche = 0 ;
	candidatGauche = (int) Math.round(Math.random()*100);
	
	if (candidatGauche > 50){
		System.out.println("il est élu "+candidatGauche+" %");
	}else if (candidatGauche >= 12.5 && candidatGauche < 50){
		System.out.println("il est en ballottage favorable (en tête du premier tour) "+ candidatGauche+" %");
	}else {
		System.out.println("il est en ballottage défavorable (pas en tête du premier tour) "+candidatGauche+" %");
	}
	
	
	int candidatExtremeGauche = 0;
	candidatExtremeGauche = (int) Math.round(Math.random()*100);
	
	if (candidatExtremeGauche > 50){
		System.out.println("il est élu "+candidatExtremeGauche+" %");
	}else if (candidatExtremeGauche >= 12.5 && candidatExtremeGauche < 50){
		System.out.println("il est en ballottage favorable (en tête du premier tour) "+ candidatExtremeGauche+" %");
	}else {
		System.out.println("il est en ballottage défavorable (pas en tête du premier tour) "+candidatExtremeGauche+" %");
	}
	
	
	
	*/
	
	/*int candidatDroite = 0;
	int candidatExtremeDroite = 0;*/
	
	// Nous avons 200 000 votants
	int votants = 100;
	
	// Nous avons 4 candidats avec zéros voix au début
	int candidatGauche = 0 ;
	int candidatExtremeGauche = 0;
	int candidatDroite = 0;
	int candidatExtremeDroite = 0; 
	
	// Les candidats vont voté leur candidat favoris
	candidatGauche = (int) Math.round(Math.random()*25);
	candidatExtremeGauche = (int) Math.round(Math.random()*25);
	candidatDroite = (int) Math.round(Math.random()*25);
	candidatExtremeDroite = (int) Math.round(Math.random()*25);
	int voteBlanc = 100 - (candidatGauche+candidatExtremeGauche+candidatDroite+candidatExtremeDroite);
	
	
	//résultat final
	
	if (candidatGauche > 50){
		System.out.println("il est élu "+candidatGauche+" %");
	}else if (candidatGauche >= 12.5 && candidatGauche < 50){
		System.out.println("il est en ballottage favorable (en tête du premier tour) "+ candidatGauche+" %");
	}else {
		System.out.println("il est en ballottage défavorable (pas en tête du premier tour) "+candidatGauche+" %");
	}
	

	}
}
