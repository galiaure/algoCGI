package cgi.tests;

public class RecursiveIterratifTest {
	public static void main(String[] args){
	
	RecuriveIterative ri = new RecuriveIterative();
	
	System.out.println(ri);
	System.out.println("factorielle itérative :"+ri.factorielle1(5));
	System.out.println("factorielle recursive :"+ri.factorielle2(5));
	}
}