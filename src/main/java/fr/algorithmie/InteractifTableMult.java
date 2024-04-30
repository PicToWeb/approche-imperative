package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		int nb;

		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Tapez un chiffre compris entre 1 et 10");
			 nb = scanner.nextInt();
			
		} while ((nb < 1) || (nb > 10));
		
		for(int i=0;i<11;i++) {
			int result = nb *i;
			System.out.println(i + " x " + nb + " = " + result);
			
		}
		

	}

}
