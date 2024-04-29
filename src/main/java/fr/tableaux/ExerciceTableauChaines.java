package fr.tableaux;

import java.util.Arrays;

public class ExerciceTableauChaines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] villeTableau = { "Paris", "Montpellier", "Nîmes", "Lyon", "Bordeau" };

		System.out.println(Arrays.toString(villeTableau));
		System.out.println(villeTableau.length);
		villeTableau[3] = "Reims";
		System.out.println(Arrays.toString(villeTableau));

		for (int i = 0; i < villeTableau.length; i++) {
			System.out.println("Ville " + (i + 1) + " : " + villeTableau[i]);
		}

	}

}
