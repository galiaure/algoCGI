import java.util.Scanner;

public class test {
	Scanner sc = new Scanner (System.in);
	System.out.println("Saisir une chaine de caractère:");
	String saisi = sc.nextLine();
	int saisiLong = saisi.length();
	char[] tab = new char[saisiLong];
	
	for(int i=0;i< saisiLong;i++){
		tab[i] = saisi.charAt(i);
		System.out.println(tab[i]);
	}
	
	sc.close();

}
}
