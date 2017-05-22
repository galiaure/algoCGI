package cgi.tests;

public class TabManager {
	public String getTabInString(int [] tab){
		String tabString ="[";
		//Algo
		for (int i=0; i < tab.length; i++){
			if(i< tab.length-1){
				tabString = tabString+tab[i]+",";	
			}else{
				tabString = tabString+tab[i];
			}
			
		}
		
		//[8,9,10,12,52,36]
		return tabString+"]";
	}

}
