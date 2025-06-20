package jour_un;

import java.util.Scanner;

public class job12 {

	static Scanner entree = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("Veuillez rentrer un nombre entier positif");
		int nombre = entree.nextInt();
		System.out.println("Nombres pairs inférieurs ou égaux à " + nombre + " :");
		for (int i = 2 ; i <= nombre ; i++) {
			if(i % 2 == 0) {
				System.out.print("  " + i);
			}
		}
		System.out.println();
	}

}
