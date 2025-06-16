package jour_un;

import java.util.Scanner;

public class job05 {
	
	static Scanner entree = new Scanner(System.in);

	public static void main(String[] args) {

		int nombres[] = new int[3];
		System.out.println("Premier nombre ?");
		nombres[0] = entree.nextInt();
		System.out.println("Deuxième nombre ?");
		nombres[1] = entree.nextInt();
		System.out.println("Troisième nombre ?");
		nombres[2] = entree.nextInt();
		
		int maxi = Math.max(nombres[0], nombres[1]);
		maxi = Math.max(maxi, nombres[2]);
		System.out.println("Maximum des trois nombres = " + maxi);
	}
}