package fr.algorithmie;

import java.util.Arrays;

public class AffichageInverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element " + (i + 1) + " : " + array[i]);
		}
		
		for (int i = 0; i < array.length; i++) {
			int temp = array[i];
			array[i] = array[array.length - i - 1];
			 array[array.length - i - 1] = temp;
			System.out.println("Element inversé " + (i + 1) + " : " + array[i]);
		}
		int newLength= array.length;
		int []arrayCopy = Arrays.copyOf(array,newLength);
		System.out.println(Arrays.toString(arrayCopy));
		
		
		
	}

}
