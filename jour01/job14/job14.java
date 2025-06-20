package jour_un;

import java.util.Scanner;

public class job14 {
	
	static Scanner entree = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Bonjour, veuillez rentrer un nombre");
		int nombre = entree.nextInt();
		String nbToString = String.valueOf(nombre);
		int tailleStr = nbToString.length();
		for (int i = tailleStr-1 ; i >= 0 ; i--) {
			System.out.print(nbToString.charAt(i));
		}
		System.out.println();
	}

}
