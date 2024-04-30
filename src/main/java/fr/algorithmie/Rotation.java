package fr.algorithmie;

import java.util.Arrays;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] entier = { 1, 2, 3, 4, 5 };
		System.out.println("Tableau original : " + Arrays.toString(entier));
		int temp = entier[entier.length-1];


	    for (int i = entier.length-1; i > 0; i--) {
	      entier[i] = entier[i - 1];
	    }

	    entier[0] = temp;

	    System.out.println("Rotation vers la droite : " + Arrays.toString(entier));
	

	}

}
