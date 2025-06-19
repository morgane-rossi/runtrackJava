package exosThreads;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomtextThread extends Thread {

	static Scanner entree = new Scanner(System.in);
	
	public String start(int i) {
		return run(i);
	}
	
	public String run(int tailleStr) {

		/* StringBuffer est trhreadsafe
		 * contrairement à SgtringBuilder  */
		StringBuffer randomText = new StringBuffer();
		
		int mini = 32;
		int maxi = 126;
		
		for (int c = 0 ; c < tailleStr; c++) {
			Random r = new Random();
			randomText.append((char) (r.nextInt(maxi-mini) + mini));
		}
		return randomText.toString();
	}
	
	
	public static void main(String[] args) {
		
		long beginTime = System.currentTimeMillis();

		System.out.println("Taille de la chaine d caractères ?");
		int tailleStr = entree.nextInt();
		RandomtextThread one = new RandomtextThread();
		RandomtextThread two = new RandomtextThread();
		String s1 = one.start(tailleStr/2);
		String s2 = two.start(tailleStr/2);

		try {
			File sortie = new File("output.txt");
			if(sortie.createNewFile()) {
		        System.out.println("File created: " + sortie.getName());
		      } else {
		        System.out.println("File already exists.");
		      }	
			FileWriter writer = new FileWriter("output.txt");
			String randomText = s1 + s2;
			writer.write(randomText);
			System.out.println(randomText);
			writer.close();
		}
			
		catch(IOException e) {
			e.printStackTrace();
		}

		// fin de exectution
		long endTime = System.currentTimeMillis();
		
		// calculer & afficher delta
		System.out.println("temps execution en secondes: " + ((double) (endTime-beginTime) / (double) 1000  ));
		
	}
}
