package jour_un;

import java.util.Scanner;

public class job02 {
	
	static Scanner entree = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Bonjour, veuillez entrer votre prenom");
		String prenom = entree.nextLine();
		System.out.println("bonjour " + prenom);

	}
}
