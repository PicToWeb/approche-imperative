package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] array2 = { -1, 12, 17, 14, 5, -9, 0, 18 };

		int[] sumArray = new int[Math.max(array1.length, array2.length)];
		
		for (int i = 0; i < sumArray.length; i++) {
			int num1 = (i < array1.length) ? array1[i] : 0;  
            int num2 = (i < array2.length) ? array2[i] : 0;  
            sumArray[i] = num1 + num2;  
		}

		System.out.print("Différence des deux tableau : ");
		for (int num : sumArray) {
			System.out.print(num + " ");
		}
	}

}
