package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int [] data = new int [0];
		
		boolean exit = false;
				while (!exit) {
					System.out.println("1. Ajouter un nombre");
					System.out.println("2. Afficher les nombres existants");
					System.out.println("3. Quitter le programme");
					System.out.println("Quel voulez vous faire (1 - 2 - 3) ? ");
					int nb = scanner.nextInt();
				  
				  switch(nb) {
				     case 1:
				       System.out.println("Quel nombre voulez vous ajouter ?");
				       nb = scanner.nextInt();
				       data = Arrays.copyOf(data,data.length+1);
				       data[data.length-1]=nb;
				       break;
				     case 2:
				       System.out.println(Arrays.toString(data));
				       break;
				     case 3:
				       exit = true;
				       scanner.close();
				       break;
				       
				  }
				}
	}

}
