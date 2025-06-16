package jour_un;

import java.util.Scanner;

public class job06 {

	static Scanner entree = new Scanner(System.in);
	
	public static void main(String[] args) {

		int somme = 0 ;
		for (int i = 0 ; i < 5 ; i++)
		{
			System.out.println("Nombre entier ?");
			somme += entree.nextInt();
		}
		System.out.println("Moyenne = " + ((double) somme / 5.0));
	}
}