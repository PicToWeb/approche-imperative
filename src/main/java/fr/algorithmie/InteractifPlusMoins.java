package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		Scanner scanner = new Scanner(System.in);
		int randomInt = r.nextInt(100) + 1;
		int nb;
		int coups = 0;
		//System.out.println(" Nombre aléatoire : " + randomInt);

		do {
			System.out.println("Essaye de trouver le chiffre aléatoire :  ");
			nb = scanner.nextInt();
			if (nb == randomInt) {
				coups++;
				System.out.println("Bien joué, tu l'as trouvé en " + coups + " coups ! ");
				
				scanner.close();
			} else if (nb > randomInt) {
				System.out.println("Tu es trop haut ! ");
				coups++;
			} else {
				System.out.println("Tu es trop bas ! ");
				coups++;
			}

		} while (nb != randomInt);

	}

}
