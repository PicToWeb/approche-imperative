package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	static int nbr1 = 0;
	static int nbr2 = 1;
	static int nbr3 = 0;

	static void displayFibonacci(int c) {
		if (c > 0) {
			nbr3 = nbr1 + nbr2;
			nbr1 = nbr2;
			nbr2 = nbr3;
			System.out.print(" " + nbr3);
			displayFibonacci(c - 1);
		}
	}

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choisissez le rang :  ");
		int nb = scanner.nextInt();
		// print 0 and 1
		System.out.print(nbr1 + " " + nbr2);
		displayFibonacci(nb - 2);
	}

}
