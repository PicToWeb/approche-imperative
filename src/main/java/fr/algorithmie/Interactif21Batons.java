package fr.algorithmie;

import java.util.Scanner;

public class Interactif21Batons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numBaton = 21;
		System.out.println("Voulez vous jouer ? Y/N");
		Scanner input = new Scanner(System.in);
		String first = input.nextLine();
		int nombreChoisi = 0;

		while (numBaton > 0) {
			if (first.equalsIgnoreCase("Y")) {
				System.out.println("Il y a " + numBaton + " Batons");
				System.out.println("Combien de batons prenez vous (1 ou 2) ? ");
				nombreChoisi = input.nextInt();

				if (nombreChoisi > 2)
					nombreChoisi = 2;
				else if (nombreChoisi < 1)
					nombreChoisi = 1;

				numBaton -= nombreChoisi;

				if (numBaton <= 0) {
					System.out.println("Perdu");
					break;
				} else {
					if ((numBaton - 2) % 3 == 0 || numBaton - 2 == 0)
						nombreChoisi = 1;
					else
						nombreChoisi = 2;

				}

				System.out.println("L'ordinateur à choisi : " + nombreChoisi + " batôns");
				numBaton -= nombreChoisi;

				if (numBaton <= 0) {
					System.out.println("C'est gagné ! ");
				}
				
			}
			else {
				if ((numBaton -2)%3 ==0 || numBaton -2 ==0)
					nombreChoisi =1;
				else 
					nombreChoisi = 2;

				System.out.println("L'ordinateur à choisi : " + nombreChoisi + " batôns");
				numBaton -= nombreChoisi;
				
				if (numBaton <= 0) {
					System.out.println("C'est gagné ! ");
				}else {
					System.out.println("Il y a " + numBaton + " Batons");
					System.out.println("Combien de batons prenez vous  (1 ou 2) ? ");
					nombreChoisi = input.nextInt();
					
					if (nombreChoisi > 2)
						nombreChoisi = 2;
					else if (nombreChoisi < 1)
						nombreChoisi = 1;

					numBaton -= nombreChoisi;
					
					if (numBaton <= 0) {
						System.out.println("C'est perdu ! ");
					}
					
				}
				
			}

			
			
		}

		input.close();
	}

}
