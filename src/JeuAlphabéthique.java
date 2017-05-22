import java.util.Scanner;

public class JeuAlphabéthique {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		char alphaB[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		System.out.println("veuillez saisir une lettre: ");
		char lettre = sc.nextLine().charAt(0); 
		int number = (int) Math.round(Math.random()*25);

		do{
			if(lettre < alphaB[number]){
				System.out.println("Vous n'avez pas trouver la bonne lettre. Ressayez");
				lettre = sc.nextLine().charAt(0);	
			}else if (lettre > alphaB[number]){
				System.out.println("Vous n'avez pas trouver la bonne lettre. Ressayez");
				lettre = sc.nextLine().charAt(0);
			}
		}

		while(lettre != alphaB[number]); 
		System.out.println("Félicitation vous avez trouvé la bonne lettre " + alphaB[number] + "!!");

		sc.close();
	}
}
