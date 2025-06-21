package ABCDEF;

public class ABCDEF {

	public static void main(String[] args) {
/*
		Dans la méthode main du programme ABCDEF, 
		pour chaque affectation à des variables représentant des objets 
		des classes A, B, C, D, E et F, 
		indiquez si elle est correcte. 
		Si ce n'est pas le cas, expliquez pourquoi
*/
		
		/*
		 * les lignes suivantes ne posent pas de problème
		 * les constructeurs sans arguments existent
		 * les classes enfants héritent sans problèmes des classes des parents
		 * et classes des parents accessibles aux classes enfants 
		 * */
		A a = new A();	//fonctionne
		B b = new B();	//fonctionne
		C c = new C();	//fonctionne
		D d = new D();	//fonctionne

		// mêmes remarques mêmes réflexions ici
		E e = new E();	//fonctionne
		F f = new F();	//fonctionne
		
		/*
		 * Correct
		 * Ici, b est de type B, et B hérite de A. 
		 * Cela signifie qu'un objet de type B est aussi un objet de type A 
		 * (c'est un cas d'upcasting).
			Donc on peut affecter un B à une variable de type A sans problème.
		 * */
		a = b ;

		/*
    	Ici, a est de type A,
    	et on essaie de l'affecter à une variable de type B.
    	Mais pas tous les objets A sont des objets B, 
    	donc Java refuse de faire cela automatiquement.
    	C'est un downcasting, 
    	et Java exige q'on le fasse explicitement 
    	(avec un cast).		 * 
		 * */
//		b = a ;
		
		// on caste, cela fonctionne
		a = (A) b;
		
		// fonctionne
		a = null;
		
		// ne fonctionne pas
		// the left side of an assignment must be a variable
//		null = a ;
		
//		/* même raisonnement que pour "a = b"
		a = d ;
		
		// ne compile pas
		// b et d dérivent tous deux de a
		// ils n'ont pas les mêmes méthodes et les mêmes constructeurs
//		b = d ;

//		/* même raisonnement que pour "a = b"		
		a = e ;			//fonctionne
		d = e ;	//fonctionne
		
		A[] as = new A[10];	//fonctionne
		as[0] = new A();	//fonctionne
		as[1] = new B();	//fonctionne
		
		// fonctionne : D hérite de A et possède un constructeur avec 1 paramètre de type entier
		as[2] = new D(2);	//fonctionne
		
		as[3] = new E();	//fonctionne
		as[4] = new C();	//fonctionne
		as[5] = new D(4);	//fonctionne
		as[6] = new B();	//fonctionne
		
		rechercher(as);
		additionner(as);
	}
	
	private static void rechercher(A[] as) {

		int compteur = 0 ;
		for (int i = 0 ; i < as.length ; i++) {
			if (as[i] instanceof B) {
				compteur++ ;
			}
		}
		System.out.println("Il y a " + compteur + " instances de la classe B");
	}
	
	private static void additionner(A[] as) {

		int somme = 0 ;
		for (int i = 0 ; i < as.length ; i++) {
			if (as[i] instanceof D) {
				somme += ((D) as[i]).getD();
			}
		}
	System.out.println("Somme des variables d : " + somme);
	}

}
