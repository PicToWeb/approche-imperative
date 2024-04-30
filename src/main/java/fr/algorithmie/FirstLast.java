package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] entier = { 5,8,-9,14,5 };
		boolean test = false;
		
		if((entier.length >=1 ) && (entier[0]==entier[entier.length-1])){
			test=true;	
		}
		
		System.out.println("Résultat : " + test);
		
	}

}
