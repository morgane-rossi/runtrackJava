package exosThreads;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class LongueurChaine {

	static Scanner entree = new Scanner(System.in);

	public static void main(String[] args){
		
		// mesurer temps avant
		long beginTime = System.currentTimeMillis();

		System.out.println("Taille de la chaine d caractères ?");
		int tailleStr = entree.nextInt();

		/* StringBuffer est trhreadsafe
		 * contrairement à SgtringBuilder  */
		StringBuffer randomText = new StringBuffer();

		/* random ASCII character
		 * between 32 and 126 included  */
		int mini = 32;
		int maxi = 126;
		
		for (int c = 0 ; c < tailleStr; c++) {
			Random r = new Random();
			randomText.append((char) (r.nextInt(maxi-mini) + mini));
		}
		System.out.println(randomText.toString());
		
		try {
			File sortie = new File("output.txt");
			if(sortie.createNewFile()) {
		        System.out.println("File created: " + sortie.getName());
		      } else {
		        System.out.println("File already exists.");
		      }	
			FileWriter writer = new FileWriter("output.txt");
			writer.write(randomText.toString());
			writer.close();
		}
			
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
		// fin de exectution
		long endTime = System.currentTimeMillis();
		
		// calculer & afficher delta
		System.out.println("temps execution en secondes: " + ((double) (endTime-beginTime) / (double) 1000 ));

	}
}
