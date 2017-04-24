package cgi.tests;

public class ExoNumerique {
	public static void main(String[] args) {
		int num1 = 77;
		num1 = 17;
		
		System.out.println("La valeur de la variable "+"numérique num1: "+num1);
		
		int num2 = 17;
		num2 = 77;
		System.out.println("La valeur de la variable "+"numérique num1: "+num2);
		
		if (num1<num2) {
			System.out.println("ma condition est bonne");
		}else{
			System.out.println("ma condition n'est pas bonne");
		}
	}

}
