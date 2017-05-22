package cgi.tests;

public class RecuriveIterative {
	//Iterrative
	public int factorielle1(int n){
		int result = n;
		while(n>1){
			n--;
			result = result*n;
		}
		return result;
	}
	//Recursive
	
	public int factorielle2(int n){
		if(n==1){
			return 1;
		}else{
		return	n*factorielle2(n-1);
		}
	}
}
