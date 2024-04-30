package fr.algorithmie;

public class AffichageSuite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 0) {
				System.out.println("Pair : " + i);
			}
		}
		for (int i = 1; i <= 10; i++) {

			if (i % 2 != 0) {
				System.out.println("impair : " + i);
			}
		}
		int j = 10;
		while (j > 0) {
			System.out.println(j);
			j--;
		}

		int h = 0;
		while (h < 10) {
			h++;
			if (h % 2 == 0) {
				System.out.println("pair " + h);
				
				continue;
			}
			
		}
		int g = 10;
		while (g>0) {
			g--;
			if (g % 2 != 0) {
				System.out.println("impair " + g);
				
				continue;
			}
			
		}

	}

}
