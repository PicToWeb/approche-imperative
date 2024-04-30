package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Tapez un chiffre pour connaitre les 10 suivants");
		int nb = scanner.nextInt();
		
		//OPTION2
		int [] data =new int [10];
		//
		
		for (int i = 1; i < 11; i++) {
			//OPTION 2
			data[i-1]=nb+i;
			//FIN OPTION 2
			
			System.out.println("le chiffre suivant est : " + (nb + i));
			
			
			
		}
		//OPTION 2 -> affichage sur une ligne
		System.out.println(Arrays.toString(data));
	}

}
