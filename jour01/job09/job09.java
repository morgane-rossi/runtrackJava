package jour_un;

import java.util.Scanner;

public class job09 {

	static Scanner entree = new Scanner(System.in);		
	
	public static void main(String[] args) {

		System.out.println("Saisissez votre âge");
		int age = entree.nextInt();
		if (age < 18) {
			System.out.println("Vous êtes mineur");
		}
		else {
			System.out.println("Vous êtes majeur");
		}
	}
}
