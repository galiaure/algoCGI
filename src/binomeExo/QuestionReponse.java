package binomeExo;

import java.util.Scanner;

public class QuestionReponse {
	public static void main(String[] args) {
		System.out.println("Bonjour et bienvenue dans question pour un champion, r�ponse attendu a ou b ou c ou d ");
		Scanner sc = new Scanner (System.in);
		int count = 0;

		//Question 1 
		System.out.println("Question 1: Quel est la capitale de la Mauritanie ? a: Conakry b: Dakar c: Nouakchott d: Lagos  ");
		String rep1 = sc.nextLine();
		if (rep1.compareTo("c") == 0){
			count++;
		}

		//Question 2 
		System.out.println("Question 2: Classez par ordre chonologique les diff�rentes grandes inventions  "
				+ "a: Le sonar "
				+ "b: Microprocesseur "
				+ "c: Stylo � bille "
				+ "d: cong�lation ");
		String rep2 = sc.nextLine();
		if (rep2.compareTo("adcb") == 0){
			count++;
		}else if (rep2.compareTo("a,d,c,b") == 0) {
			count++;
		}

		//Question 3 
		System.out.println("Question 3: Quel pays ne fait pas partie de l'Union Europ�en? "
				+ "a: Su�de b: Danemark c: Norv�ge d: Estonie  ");
		String rep3 = sc.nextLine();
		if (rep3.compareTo("c") == 0){
			count++;
		}

		//Question 4 
		System.out.println("Question 4: Quelle est l'agglom�ration m�tropolitaine la plus peupl�e du monde? "
				+ "a: Shangai b: New York c: Lagos d: Tokyo  ");
		String rep4 = sc.nextLine();
		if (rep4.compareTo("d") == 0){
			count++;
		}

		//Question 5 
		System.out.println("Question 5: Quelle �quipe joue dans la conf�rence Ouest de la NBA ? "
				+ "a: Detroit b: Milwaukee c: Memphis d: Boston  ");
		String rep5 = sc.nextLine();
		if (rep5.compareTo("c") == 0){
			count++;
		}

		//Question 6 
		System.out.println("Question 6: Classe ces buzz du plus au moins �ph�m�re ?"
				+ "a: Ice bucket challenge "
				+ "b: La bible "
				+ "c: Susan Boyle "
				+ "d: Pokemon Go ");
		String rep6 = sc.nextLine();
		if (rep6.compareTo("acdb") == 0){
			count++;
		}

		//Question 7 
		System.out.println("Question 7: Dans quelle maison de Poudlard proviens Sirius Black ?"
				+ "a: Serpentard "
				+ "b: Serdaigle "
				+ "c: Gryffondor "
				+ "d: Pourfsouffle ");
		String rep7 = sc.nextLine();
		if (rep7.compareTo("c") == 0){
			count++;
		}

		//Question 8
		System.out.println("Question 8: Quel Etat n'est pas membre de l'ONU ? a: Les iles Cook b: Somalie c: bleu Cor�e du Nord d: Les iles Tuvalu  ");
		String rep8 = sc.nextLine();
		if (rep8.compareTo("a") == 0){
			count++;
		}
		
		//Question 9
		System.out.println("Question 9: Quel est la couleur du cheval blanc d'henry IV ? a: noir b: blanc c: bleu canard d: rouge  ");
		String rep9 = sc.nextLine();
		if (rep9.compareTo("b") == 0){
			count++;
		}
		
		//Question 10
		System.out.println("Question 10: Classe les du plus au moins dangeureux ?" 
				+ "a: R�v�ler un secret de la NSA "
				+ "b: Manger 5000 fruits et l�gumes par jour "
				+ "c: Un pique-nique � Fukushima "
				+ "d: Vivre en Australie ");
		String rep10 = sc.nextLine();
		if (rep10.compareTo("bcad") == 0){
			count++;
		}
		
		



		//R�sultat
		if(count <2) {
			System.out.println("Vous avez une note de "+count+"/10 Pff try again");
		} else if (count >2 && count < 5){
			System.out.println("Vous avez une note de "+count+"/10 presque !!");
		}else if (count >5 && count <7) {
			System.out.println("Vous avez une note de "+count+"/10 bien jou� !!");
		}else{
			System.out.println("Vous avez une note de "+count+"/10 f�licitation !!");
		}



		sc.close();





	}
}
