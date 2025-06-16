package jour_un;

import java.util.Scanner;

public class job04 {
	
	static Scanner entree = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Veuillez renter un nombre");
		int nombre = entree.nextInt();
		System.out.println("Carré du nombre = " + (nombre * nombre));
	}
}