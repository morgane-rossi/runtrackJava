package jour_un;

import java.util.Scanner;

public class Job13 {
	
	static Scanner entree = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Nombre entier inférieur ou égal à 9");
		int nombre = entree.nextInt();
		
		for(int i = 0 ; i <= 10 ; i++) {
			System.out.println("Résultat de " + nombre + " * " + i + " = " + (nombre * i));
		}
	}
}
