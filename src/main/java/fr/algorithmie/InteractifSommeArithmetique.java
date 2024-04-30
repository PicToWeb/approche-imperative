package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Tapez un chiffre pour connaitre la somme de tous les entiers compris entre 1 et votre chiffre");
		int nb = scanner.nextInt();
		int result=0;
		
		for (int i=1;i<=nb;i++) {
			result += i;
		}
		System.out.println("Resultat : " + result);
		scanner.close();
	}

}
