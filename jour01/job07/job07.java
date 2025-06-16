package jour_un;

public class job07 {

	public static void main(String[] args) {

		int compteur = 0 ;
		for (int i = 1 ; i < 101 ; i++)
		{
			compteur += i ;
		}
		System.out.println("Somme des 100 premiers entiers = " + compteur);
	}
}