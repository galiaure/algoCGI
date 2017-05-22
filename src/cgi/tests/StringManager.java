package cgi.tests;

public class StringManager {

	public int getNbofVowels(String s){
		int numberOfVowels = 0;
		int numA = 0;
		int numE = 0;
		int numI = 0;
		int numO = 0;
		int numU = 0;
		int numY = 0;
		char[] vowels = {'a','e','i','o','u','y'};
		for (int i=0;i<s.length();i++) {
			for (int j=0; j<vowels.length; j++){
				if(s.charAt(i) == vowels[j]) {
					switch(s){
					case "a":  
						numA++;
						break;
					case "e":  
						numE++;
						break;
					case "i":  
						numI++;
						break;
					case "o":  
						numO++;
						break;
					case "u":  
						numU++;
						break;
					case "y":  
						numY++;
						break;
					}
					System.out.println("Voyelle numéro: "+s.charAt(i));
					numberOfVowels++;
				}
			}
		}
		return numberOfVowels;	
	}
}
