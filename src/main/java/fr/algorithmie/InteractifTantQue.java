package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int nb;

		do {
			System.out.println("Tapez un chiffre compris entre 1 et 10");
			nb = scanner.nextInt();
		} while ((nb < 1) || (nb > 10));

		System.out.println(nb);
	}

}
