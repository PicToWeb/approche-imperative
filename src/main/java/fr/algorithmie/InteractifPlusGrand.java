package fr.algorithmie;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int nb;
		int i = 10;
		Integer [] array= new Integer [10];
		while(i>0) {
			System.out.println("Tapez un chiffre (encore " + i + " chiffre à taper) : ");
			nb = scanner.nextInt();
			array[i-1]=nb;
			i--;
		}
		
		int max = Collections.max(Arrays.asList(array));
		 
		 System.out.println("Le nombre max est : " + max);
		 scanner.close();
		
		
	}

}
