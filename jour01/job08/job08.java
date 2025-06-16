package jour_un;

import java.util.Scanner;

public class job08 {

	static Scanner entree = new Scanner(System.in);	
	
	public static void main(String[] args) {

		System.out.println("Saisissez un entier");
		int entier = entree.nextInt();
		int somme = 0 ;
		for (int i = 1 ; i <= entier ; i++)
		{
			somme += (i * i * i);
		}
		System.out.println("La somme des " + entier + " premiers cubes : " + somme);
	}
}