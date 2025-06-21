package jour_un;

import java.util.Scanner;

public class job05 {
	
	static Scanner entree = new Scanner(System.in);

	public static void main(String[] args) {

		int nombres[] = new int[3];

		for (int i = 0 ; i < 3 ; i++)
		{
	        int nombre = 0;
	        boolean valide = false;


	        while (!valide) {
	            System.out.print("Veuillez rentrer un nombre entier : ");
	            try {
	                nombres[i] = entree.nextInt();
	                valide = true;
	            } catch (Exception e) {
	                System.out.println("Erreur : Ce n'est pas un entier.");
	                entree.nextLine(); // vide le buffer pour éviter une boucle infinie
	            }
	        }		
		}
		
		int maxi = Math.max(nombres[0], nombres[1]);
		maxi = Math.max(maxi, nombres[2]);
		System.out.println("Maximum des trois nombres = " + maxi);
	}
}