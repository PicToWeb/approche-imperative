package fr.algorithmie;

import java.util.Arrays;

public class InversionContenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int newLength = array.length;
		int[] arrayCopy = new int[newLength];
		for (int i = 0; i < newLength; i++) {
			arrayCopy[i] = array[newLength - 1 - i];
		}
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(arrayCopy));
	}

}
