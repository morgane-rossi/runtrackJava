package jour3job0;

public class AbsctractFinal {

	public static void main(String[] args) {
		
		A[] tab = new A[3];
		
		/* erreur : "cannot instanciate the type A
		 * la classe A est abstraite
		 * par conséquent on ne peut pas l'instancier  */
		tab[0] = new A();
		
		tab[1] = new B();
		tab[2] = new C();

		
		/*
		 * On a fait appel au constructeur de A en faisant :
		 A[] tab = new A[3];
		 c'est  "new A[3]" qui fait appel au constructeur
		 puis : 
		 tab[1].b = 2
		 or l'attibut b n'est pas défini dans la classe A
		 * */
		tab[1].b = 2 ;
		
		
		/*
		 Définition des attributs de la classe C:
		 l'attribut c est défini comme final
		 dont il ne peut pas être modifié après instanciation
		 * */
		( (C)tab[2] ).c=3;

	}

}
