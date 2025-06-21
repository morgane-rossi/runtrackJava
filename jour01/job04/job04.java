package jour_un;

import java.util.Scanner;

public class job04 {
	
	static Scanner entree = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Veuillez renter un nombre");
		try {
			int nombre = entree.nextInt();
			System.out.println("Carré du nombre = " + (nombre * nombre));			
		}
		catch(Exception e) {
			System.out.println("Erreur : Veuillez rentrer un nombre entier\nFin du programme");
			System.exit(1);
		}
		entree.close();
	}
}