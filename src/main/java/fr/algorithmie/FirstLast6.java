package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] entier = { 5,8,-9,14,6 };
		boolean test = false;
		
		if((entier.length >=1 ) && (entier[0]==6 || entier[entier.length-1]==6)){
			test=true;
		}
		System.out.println("Résultat : " + test);

	}

}
