package jour_un;

import java.util.Scanner;

public class Job11 {
	
	static Scanner entree = new Scanner(System.in);

	public static int factorielle(int n) {
		if (n == 1) {
			return n ;
		}
		return n * factorielle(n-1);
	}	
	
	public static void main(String[] args) {
	
		System.out.println("Veuillez rentrer un nombre entier positif");
		int nombre = entree.nextInt();
		System.out.println("factorielle de " + nombre + " = " + factorielle(nombre));

	}

}
